package prbrios.nfcepdf;

import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

public class NFCePDFImpressao {

	public void imprimir(String arquivo) throws NFCePDFException {
		
		if(!this.isPdf(arquivo))
			throw new NFCePDFException("Formato do arquivo \u00e9 inválido.");
		
		PDDocument documento = null;
		try {
			documento = PDDocument.load(new File(arquivo));
    		PrintService servico = PrintServiceLookup.lookupDefaultPrintService();
    		PrinterJob job = PrinterJob.getPrinterJob();
    		job.setPageable(new PDFPageable(documento));
    		job.setPrintService(servico);
    		job.print();
    	}catch(Exception e) {
    		throw new NFCePDFException("Ocorreu um erro ao relizar a impress\u00e3o. " + e.getMessage());
    	}finally {
    		try {
				documento.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private boolean isPdf(String arquivo) throws NFCePDFException {
		try {
			return new File(arquivo).getName().endsWith(".pdf");
		}catch(Exception e) {
			throw new NFCePDFException(e.getMessage());
		}
	}
	
	public void imprimirAvulso(String texto, String css) throws NFCePDFException {
		try {
			Path path = Paths.get(System.getProperty("java.io.tmpdir"), System.currentTimeMillis() + ".pdf");
			String html = new NFCePDFGeradorHtml().gerarHtmlDeTexto(texto, css);
			NFCePDFGeradorPdf pdf = new NFCePDFGeradorPdf();
			pdf.criarPdf(html, path.toString());
			this.imprimir(path.toString());
		}catch(Exception e) {
			throw new NFCePDFException(e.getMessage());
		}
	}
	
}
