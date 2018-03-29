package prbrios.nfcepdf.esquema.nfce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "infProt")
@XmlAccessorType(XmlAccessType.FIELD)
public class InfProt {

	@XmlElement(name="tpAmb")
	private String tpAmb;
	
	@XmlElement(name="verAplic")
	private String verAplic;
	
	@XmlElement(name="chNFe")
	private String chNFe;
	
	@XmlElement(name="dhRecbto")
	private String dhRecbto;
	
	@XmlElement(name="nProt")
	private String nProt;
	
	@XmlElement(name="digVal")
	private String digVal;
	
	@XmlElement(name="cStat")
	private String cStat;
	
	@XmlElement(name="xMotivo")
	private String xMotivo;

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getVerAplic() {
		return verAplic;
	}

	public void setVerAplic(String verAplic) {
		this.verAplic = verAplic;
	}

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

	public String getDhRecbto() {
		return dhRecbto;
	}

	public void setDhRecbto(String dhRecbto) {
		this.dhRecbto = dhRecbto;
	}

	public String getnProt() {
		return nProt;
	}

	public void setnProt(String nProt) {
		this.nProt = nProt;
	}

	public String getDigVal() {
		return digVal;
	}

	public void setDigVal(String digVal) {
		this.digVal = digVal;
	}

	public String getcStat() {
		return cStat;
	}

	public void setcStat(String cStat) {
		this.cStat = cStat;
	}

	public String getxMotivo() {
		return xMotivo;
	}

	public void setxMotivo(String xMotivo) {
		this.xMotivo = xMotivo;
	}

}
