package prbrios.nfcepdf.esquema.nfce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pag")
@XmlAccessorType(XmlAccessType.FIELD)
public class DetPag {

	@XmlElement(name="tPag")
	private String tPag;
	
	@XmlElement(name="vPag")
	private Double vPag;

	public String gettPag() {
		return tPag;
	}

	public void settPag(String tPag) {
		this.tPag = tPag;
	}

	public Double getvPag() {
		return vPag;
	}

	public void setvPag(Double vPag) {
		this.vPag = vPag;
	}
	
}
