package prbrios.nfcepdf;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

import prbrios.nfcepdf.esquema.nfce.Det;
import prbrios.nfcepdf.esquema.nfce.EnderDest;
import prbrios.nfcepdf.esquema.nfce.NFe;
import prbrios.nfcepdf.esquema.nfce.NfeProc;
import prbrios.nfcepdf.esquema.nfce.Pag;

public class NFCePDFGeradorHtml {

	public NFCePDFGeradorHtml(NfeProc nfeProc) {
		
		NFe nfe = nfeProc.getNfe();
		
		this.html = new StringBuilder();
		this.html.append("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">");
		this.html.append("<head>");
		this.html.append("<title>.</title>");
		this.html.append("<meta charset=\"utf-8\"/>");
		this.html.append("<style type=\"text/css\">");
		this.html.append(this.css());
		this.html.append("</style>");
		this.html.append("</head>");
		this.html.append("<body>");
		this.html.append("<table>");
		this.html.append(this.cabecalho(nfe));
		this.html.append(this.extrato(nfe));
		this.html.append(this.itens(nfe));
		this.html.append(this.total(nfe));
		this.html.append(this.pagamento(nfe));
		this.html.append(this.tributos(nfe));
		this.html.append(this.autorizacao(nfe));
		this.html.append(this.consumidor(nfe));
		this.html.append(this.qrcode(nfeProc));
		this.html.append(this.observacoes(nfe));
		this.html.append("</table>");
		this.html.append("</body>");
		this.html.append("</html>");
	}
	
	private Object tributos(NFe nfe) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"200pt\">");
		if(nfe.getInfNFe().getTotal().getIcmsTot().getvTotTrib() != null) {
			sb.append("Valor aproximado dos tributos conforme Lei Federal 12.741/2012 R&#36; " + this.formataNumero(nfe.getInfNFe().getTotal().getIcmsTot().getvTotTrib().toString()) + "<br/>");
		}
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}

	private StringBuilder html;
	private String qrcode = null;
	
	private String css() {
		StringBuilder sb = new StringBuilder();
		sb.append("table{width: 200pt;}");
		sb.append("table tr td{padding:2px;font-family:Arial;font-size:10px;}");
		sb.append(".cabecalho{font-weight:normal;text-align:center;}");
		sb.append(".sep{border-bottom: solid 1px black;}");
		sb.append(".sep-top{border-top: solid 1px black;}");
		sb.append(".extrato{font-weight:bold;text-align:center;}");
		sb.append(".monospace{font-family: courier;}");
		sb.append(".itens{font-weight:bold;font-size:9px;}");
		sb.append(".total{font-weight:bold;font-size:12px;}");
		sb.append(".chave{font-size:9px;text-align: center;}");
		sb.append(".direita{text-align:right}");
		sb.append(".100pt{width:100pt;}");
		sb.append(".200pt{width:200pt;}");
		return sb.toString();
	}
	
	private String cabecalho(NFe nfe) {
		
		String endereco 
			= String.format(
					"%s, %s, %s, %s, %s", 
					nfe.getInfNFe().getEmit().getEnderEmit().getxLgr(),
					nfe.getInfNFe().getEmit().getEnderEmit().getNro() == null ? "s/n" : nfe.getInfNFe().getEmit().getEnderEmit().getNro(),
					nfe.getInfNFe().getEmit().getEnderEmit().getxBairro(),
					nfe.getInfNFe().getEmit().getEnderEmit().getxMun(),
					nfe.getInfNFe().getEmit().getEnderEmit().getUf()
		);
		
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"cabecalho 200pt sep\">");
		sb.append(nfe.getInfNFe().getEmit().getxNome() + "<br/>");
		sb.append("CNPJ: " + this.formataCNPJouCPF(nfe.getInfNFe().getEmit().getCnpj()) + " IE: " + nfe.getInfNFe().getEmit().getIe() + "<br/>");
		sb.append(endereco);
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}
	
	private String extrato(NFe nfe) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"extrato 200pt sep\">");
		sb.append("DANFE NFC-e Documento Auxiliar da Nota Fiscal de Consumidor Eletr&ocirc;nica<br/>");
		sb.append("N&atilde;o permite aproveitamento de cr&eacute;dito de ICMS");
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}
	
	private String consumidor(NFe cfe) {
		
		if(cfe.getInfNFe().getDest() == null)
			return "";
		
		EnderDest enderDest = enderDest = cfe.getInfNFe().getDest().getEnderDest();
		
		String dadosConsumidor = "N&atilde;o informado";
		if(cfe.getInfNFe().getDest() != null) {
			if(cfe.getInfNFe().getDest().getCpf() != null)
				dadosConsumidor = this.formataCNPJouCPF(cfe.getInfNFe().getDest().getCpf());
			else if(cfe.getInfNFe().getDest().getCnpj() != null)
				dadosConsumidor = this.formataCNPJouCPF(cfe.getInfNFe().getDest().getCnpj());
		}
		
		if(cfe.getInfNFe().getDest().getxNome() != null)
			dadosConsumidor += " - " + cfe.getInfNFe().getDest().getxNome(); 
		
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"200pt sep\">");
		sb.append( String.format("CONSUMIDOR: %s", dadosConsumidor));
		if(enderDest != null) {
			sb.append(
				String.format(" - %s, %s - %s - %s - %s", 
					enderDest.getxLgr() != null ? enderDest.getxLgr() : "", 
					enderDest.getNro() != null ? enderDest.getNro() : "",
					enderDest.getxBairro() != null ? enderDest.getxBairro() : "",
					enderDest.getxMun() != null ? enderDest.getxMun() : "",
					enderDest.getUf() != null ? enderDest.getUf() : ""
				) 
			);
		}
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}
	
	private String itens(NFe nfe) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"itens monospace 200pt\">");
		sb.append("#   COD        DESCRI&Ccedil;&Atilde;O<br/>");
		sb.append("QTD  UND &times; Vl Uni R&#36; Vl It R&#36;<br/>");
		sb.append("-------------------------------------------<br/>");
		
		for(Det det : nfe.getInfNFe().getDet()) {
			
			String nItem = String.format("%-4s", String.format("%03d", Integer.parseInt(det.getnItem().toString())));
        	String xProd = String.format("%-100s", det.getProd().getxProd()).substring(0,40).trim();
        	String cProd = String.format("%-100s", det.getProd().getcProd()).substring(0,11);
        	String qCom = this.formataNumero(det.getProd().getqCom().toString());
        	String uCom = det.getProd().getuCom();
        	String vUnCom = this.formataNumero(det.getProd().getvUnCom().toString());
        	String vProd = this.formataNumero(det.getProd().getvProd().toString());

        	sb.append(String.format("%1$s %2$s %3$s", nItem, cProd, xProd) + "<br/>");
        	sb.append(String.format("%1$s %2$s &times; %3$s %4$s", qCom, uCom, vUnCom, vProd));
        	sb.append("<br/>");
		}

		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}

	private String total(NFe nfe) {

		StringBuilder sb = new StringBuilder();
		
		sb.append("<tr>");
		sb.append("<td class=\"100pt\">");
		sb.append("QTD TOTAL ITENS");
		sb.append("</td>");
		sb.append("<td class=\"direita 100pt\">");
		sb.append(nfe.getInfNFe().getDet().size());
		sb.append("</td>");
		sb.append("</tr>");
		
		sb.append("<tr>");
		sb.append("<td class=\"100pt\">");
		sb.append("VALOR TOTAL R&#36;");
		sb.append("</td>");
		sb.append("<td class=\"direita 100pt\">");
		sb.append(this.formataNumero(nfe.getInfNFe().getTotal().getIcmsTot().getvNF().toString()));
		sb.append("</td>");
		sb.append("</tr>");
		
		sb.append("<tr>");
		sb.append("<td class=\"100pt\">");
		sb.append("FORMA PAGAMENTO");
		sb.append("</td>");
		sb.append("<td class=\"direita 100pt\">");
		sb.append("VALOR PAGO R&#36;");
		sb.append("</td>");
		sb.append("</tr>");
		String meioPagamento = "Outros";
		
		for(Pag pag : nfe.getInfNFe().getPag()) {
			
			if(pag.gettPag().equals("01")) 
				meioPagamento = "Dinheiro";
			else if(pag.gettPag().equals("02")) 
				meioPagamento = "Cheque";
			else if(pag.gettPag().equals("03")) 
				meioPagamento = "Cart&atilde;o Cr&eacute;dito";
			else if(pag.gettPag().equals("04")) 
				meioPagamento = "Cart&atilde;o D&eacute;bito";
			else if(pag.gettPag().equals("05")) 
				meioPagamento = "Cr&eacute;dito Loja";
			else if(pag.gettPag().equals("10")) 
				meioPagamento = "Vale Alimenta&ccedil;&atilde;o";
			else if(pag.gettPag().equals("11")) 
				meioPagamento = "Vale Refei&ccedil;&atilde;o";
			else if(pag.gettPag().equals("12")) 
				meioPagamento = "Vale Presente";
			else if(pag.gettPag().equals("13")) 
				meioPagamento = "Vale Combust&iacute;vel";
			
			sb.append("<tr>");
			sb.append("<td>");
			sb.append(meioPagamento);
			sb.append("</td>");
			sb.append("<td class=\"direita\">");
			sb.append(this.formataNumero(pag.getvPag().toString()));
			sb.append("</td>");
			sb.append("</tr>");
			
		}
		
		return sb.toString();
	}
	
	private String desconto(NFe cfe) {
		
		//NumberFormat nf = new DecimalFormat ("#,##0.00", new DecimalFormatSymbols (new Locale ("pt", "BR")));
		//double valor = 78945;
		//System.out.println (nf.format (valor / 100));
		
		StringBuilder sb = new StringBuilder();
		if(cfe.getInfNFe().getTotal().getIcmsTot().getvDesc()!=null) {
			Double totVprod = 0.00;
			for(Det det : cfe.getInfNFe().getDet()) {
				totVprod += det.getProd().getvProd();
			}
			if(totVprod > 0) {
				sb.append("<tr>");
				sb.append("<td class=\"100pt\">");
				sb.append("Total bruto R&#36;");
				sb.append("</td>");
				sb.append("<td class=\"direita 100pt\">");
				sb.append(this.formataNumero(totVprod.toString()));
				sb.append("</td>");
				sb.append("</tr>");
			}
			if(!cfe.getInfNFe().getTotal().getIcmsTot().getvDesc().equals("0.00")) {
				sb.append("<tr>");
				sb.append("<td class=\"100pt\">");
				sb.append("Total desconto R&#36;");
				sb.append("</td>");
				sb.append("<td class=\"direita 100pt\">");
				sb.append(this.formataNumero(cfe.getInfNFe().getTotal().getIcmsTot().getvDesc().toString()));
				sb.append("</td>");
				sb.append("</tr>");
			}
		}
		return sb.toString();
	}

	private String pagamento(NFe nfe) {
		
		StringBuilder sb = new StringBuilder();
		
		

		
		/*
		for(MP mp : nfe.getInfCFe().getPgto().getMp()) {
			String meioPagamento = "Outros";
			
			if(mp.getcMP().equals("01")) {
	    		meioPagamento = "Dinheiro";
	    	}else if(mp.getcMP().equals("02")) {
	    		meioPagamento = "Cheque";
	    	}else if(mp.getcMP().equals("03") || mp.getcMP().equals("04")) {
	    		meioPagamento = "Cart&atilde;o";
	    	}
			
			sb.append("<tr>");
			sb.append("<td>");
			sb.append(meioPagamento);
			sb.append("</td>");
			sb.append("<td class=\"direita\">");
			sb.append(this.formataNumero(mp.getvMP()));
			sb.append("</td>");
			sb.append("</tr>");
		}
		*/
		return sb.toString();
	}
	
	private String observacoes(NFe nfe) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"200pt\">");
		if(nfe.getInfNFe().getInfAdic() != null) {
			sb.append(nfe.getInfNFe().getInfAdic().getInfCpl().replace("|", "<br/>"));
		}
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}
	
	private String autorizacao(NFe nfe) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"extrato 200pt\">");
		sb.append(String.format("N&uacute;mero: %s, S&eacute;rie: %s, Emiss&atilde;o: %s", 
				nfe.getInfNFe().getIde().getnNF(), nfe.getInfNFe().getIde().getSerie(), 
				this.formataData(nfe.getInfNFe().getIde().getDhEmi())));
		sb.append("<br/>");
		//sb.append(String.format("Consulte pela chave de acesso em %s", this.getURLServicoSEFAZ(nfe.getInfNFe().getIde().getcUF())));		
		//sb.append("<br/>");	
		sb.append(nfe.getInfNFe().getId().substring(3));
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}
	
	private Object getURLServicoSEFAZ(String getcUF) {
		//TODO obter os 
		return "... ...";
	}

	private String chave(NFe nfe) {
		String chave = nfe.getInfNFe().getId().substring(3);
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"chave 200pt\">");
		sb.append(chave);
		sb.append("</td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"chave 200pt\">");
		sb.append("<barcode type=\"CODE128_UCC\" value=\"" + chave.substring(0, 22) + "\"/>");
		sb.append("</td>");
		sb.append("</tr>");		
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"chave 200pt\">");
		sb.append("<barcode type=\"CODE128_UCC\" value=\"" + chave.substring(22) + "\"/>");
		sb.append("</td>");
		sb.append("</tr>");
		
		return sb.toString();
	}
	
	private String qrcode(NfeProc nfeProc) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" align=\"center\" class=\"200pt\">");
		sb.append(String.format("Protocolo de Autoriza&ccedil;&atilde;o: %s<br/>", nfeProc.getProtNFe().getInfProt().getnProt()));
		sb.append(String.format("Data de Autoriza&ccedil;&atilde;o: %s<br/>",this.formataData(nfeProc.getProtNFe().getInfProt().getDhRecbto())));
		sb.append("</td>");
		sb.append("</tr>");
		
		if(nfeProc.getNfe().getInfNFeSupl().getQrCode() != null) {
			sb.append("<tr>");
			sb.append("<td colspan=\"2\" align=\"center\" class=\"200pt\">");
			sb.append("<qrcode value=\"" + nfeProc.getNfe().getInfNFeSupl().getQrCode() + "\"/>");
			sb.append("</td>");
			sb.append("</tr>");
		}
		return sb.toString();
	}
	
	private String formataData(String dEmi) {
		
		String dia = dEmi.substring(8, 10);
		String mes = dEmi.substring(5, 7);
		String ano = dEmi.substring(0, 4);
		String hora = dEmi.substring(11,13);
		String min = dEmi.substring(14,16);
		String seg = dEmi.substring(17,19);
		return String.format("%s/%s/%s %s:%s:%s", dia, mes, ano, hora, min, seg);
	}
	
	public NFCePDFGeradorHtml(){
		
	}
	
	/**
	 * Converte um texto em html
	 * @param texto
	 * @return
	 */
	public String gerarHtmlDeTexto(String texto, String css) {
		StringBuilder sb = new StringBuilder();
		sb.append("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">");
		sb.append("<head>");
		sb.append("<title>.</title>");
		sb.append("<meta charset=\"utf-8\"/>");
		sb.append("<style type=\"text/css\">");
		sb.append("table {width:200pt;}");
		sb.append(css);
		sb.append(".200pt{width:200pt;}");
		sb.append("</style>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<table>");
		sb.append("<tr>");
		sb.append("<td class=\"200pt\">");
		sb.append(texto);
		sb.append("</td>");
		sb.append("</tr>");
		sb.append("</table>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return this.html.toString();
	}
	
	private String formataCNPJouCPF(String arg) {
		if(arg.length() == 11) {
			return arg.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
		}else if(arg.length() == 14) {
			return arg.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
		}
		
		return arg;
	}
	
	private String formataNumero(String valor) {
		DecimalFormat formatter = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
		DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();
		symbols.setCurrencySymbol("");
		formatter.setDecimalFormatSymbols(symbols);
		return formatter.format(Double.parseDouble(valor));
	}

}
