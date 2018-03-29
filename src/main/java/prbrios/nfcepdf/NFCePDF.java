package prbrios.nfcepdf;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import prbrios.nfcepdf.esquema.nfce.NfeProc;

public class NFCePDF {

	private String saida;
	private String xml;

	public NFCePDF(String xml, String saida) {
		this.xml = xml;
		this.saida = this.defineDiretorioArquivo("AUT", saida);
	}

	public NfeProc transformaXmlEmObjeto(String xmlCFe) throws Exception {
		try {
			xmlCFe = xmlCFe.replace("xmlns", "xmlns_");
			InputStream stream = new ByteArrayInputStream(xmlCFe.getBytes(StandardCharsets.UTF_8.name()));
			JAXBContext context = JAXBContext.newInstance(NfeProc.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			return (NfeProc) unmarshaller.unmarshal(stream);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	private String defineDiretorioArquivo(String prefixo, String diretorioOutput) {

		if (diretorioOutput == null)
			diretorioOutput = System.getProperty("java.io.tmpdir");
		else if (!new File(diretorioOutput).isDirectory())
			diretorioOutput = System.getProperty("java.io.tmpdir");

		Path path = Paths.get(diretorioOutput, (prefixo == null ? "" : prefixo) + System.currentTimeMillis() + ".pdf");
		this.saida = path.toString();
		return path.toString();
	}

	public void gerarPdfAutorizacao() throws NFCePDFException {
		try {

			this.saida = this.defineDiretorioArquivo("AUT", this.saida);

			NfeProc nfeProd = this.transformaXmlEmObjeto(this.xml);
			
			String html = new NFCePDFGeradorHtml(nfeProd).toString();
			NFCePDFGeradorPdf g = new NFCePDFGeradorPdf();
			g.criarPdf(html, this.saida);

		} catch (Exception e) {
			throw new NFCePDFException(e.getMessage());
		}
	}

	public String getSaida() {
		return saida;
	}

	public static void main(String[] args) throws Exception {

		 
		
		
		
		//NfeProc t = o.objetoCFe("");
		//System.out.println(t);
	}
}
