package prbrios.nfcepdf.esquema.nfce;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pag")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pag {

	@XmlElement(name = "tPag")
	private String tPag;

	@XmlElement(name = "vPag")
	private Double vPag;

	@XmlElement(name = "detPag")
	private List<DetPag> detPag;

	@XmlElement(name = "vTroco")
	private Double vTroco;

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

	public List<DetPag> getDetPag() {
		return detPag;
	}

	public void setDetPag(List<DetPag> detPag) {
		this.detPag = detPag;
	}

	public Double getvTroco() {
		return vTroco;
	}

	public void setvTroco(Double vTroco) {
		this.vTroco = vTroco;
	}

}
