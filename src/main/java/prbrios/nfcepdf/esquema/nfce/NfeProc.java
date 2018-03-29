package prbrios.nfcepdf.esquema.nfce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "nfeProc")
@XmlAccessorType(XmlAccessType.FIELD)
public class NfeProc {

	@XmlAttribute(name = "versao")
	private String versao;

	@XmlElement(name="NFe")
	private NFe nfe;

	@XmlElement(name="protNFe")
	private ProtNFe protNFe;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public NFe getNfe() {
		return nfe;
	}

	public void setNfe(NFe nfe) {
		this.nfe = nfe;
	}

	public ProtNFe getProtNFe() {
		return protNFe;
	}

	public void setProtNFe(ProtNFe protNFe) {
		this.protNFe = protNFe;
	}

}
