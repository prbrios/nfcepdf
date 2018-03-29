package prbrios.nfcepdf.esquema.nfce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "protNFe")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProtNFe {

	@XmlElement(name="infProt")
	private InfProt infProt;

	public InfProt getInfProt() {
		return infProt;
	}

	public void setInfProt(InfProt infProt) {
		this.infProt = infProt;
	}

}
