package prbrios.nfcepdf.esquema.nfce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NFe")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFe {

	@XmlElement(name = "infNFe")
	private InfNFe infNFe;

	@XmlElement(name = "infNFeSupl")
	private InfNFeSupl infNFeSupl;

	@XmlElement(name = "Signature")
	private Signature signature;

	public InfNFe getInfNFe() {
		return infNFe;
	}

	public void setInfNFe(InfNFe infNFe) {
		this.infNFe = infNFe;
	}

	public InfNFeSupl getInfNFeSupl() {
		return infNFeSupl;
	}

	public void setInfNFeSupl(InfNFeSupl infNFeSupl) {
		this.infNFeSupl = infNFeSupl;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}
