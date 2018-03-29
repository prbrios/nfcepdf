package prbrios.nfcepdf.esquema.nfce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "prod")
@XmlAccessorType(XmlAccessType.FIELD)
public class Prod {

	@XmlElement(name="cProd")
	private String cProd;
	
	@XmlElement(name="CEAN")
	private String cEAN;
	
	@XmlElement(name="xProd")
	private String xProd;
	
	@XmlElement(name="NCM")
	private String ncm;
	
	@XmlElement(name="CEST")
	private String cest;
	
	@XmlElement(name="CFOP")
	private String cfop;
	
	@XmlElement(name="uCom")
	private String uCom;
	
	@XmlElement(name="qCom")
	private Double qCom;
	
	@XmlElement(name="vUnCom")
	private Double vUnCom;
	
	@XmlElement(name="vProd")
	private Double vProd;
	
	@XmlElement(name="cEANTrib")
	private String cEANTrib;
	
	@XmlElement(name="uTrib")
	private String uTrib;
	
	@XmlElement(name="qTrib")
	private Double qTrib;
	
	@XmlElement(name="vUnTrib")
	private Double vUnTrib;
	
	@XmlElement(name="indTot")
	private String indTot;

	public String getcProd() {
		return cProd;
	}

	public void setcProd(String cProd) {
		this.cProd = cProd;
	}

	public String getcEAN() {
		return cEAN;
	}

	public void setcEAN(String cEAN) {
		this.cEAN = cEAN;
	}

	public String getxProd() {
		return xProd;
	}

	public void setxProd(String xProd) {
		this.xProd = xProd;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getCest() {
		return cest;
	}

	public void setCest(String cest) {
		this.cest = cest;
	}

	public String getCfop() {
		return cfop;
	}

	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	public String getuCom() {
		return uCom;
	}

	public void setuCom(String uCom) {
		this.uCom = uCom;
	}

	public Double getqCom() {
		return qCom;
	}

	public void setqCom(Double qCom) {
		this.qCom = qCom;
	}

	public Double getvUnCom() {
		return vUnCom;
	}

	public void setvUnCom(Double vUnCom) {
		this.vUnCom = vUnCom;
	}

	public Double getvProd() {
		return vProd;
	}

	public void setvProd(Double vProd) {
		this.vProd = vProd;
	}

	public String getcEANTrib() {
		return cEANTrib;
	}

	public void setcEANTrib(String cEANTrib) {
		this.cEANTrib = cEANTrib;
	}

	public String getuTrib() {
		return uTrib;
	}

	public void setuTrib(String uTrib) {
		this.uTrib = uTrib;
	}

	public Double getqTrib() {
		return qTrib;
	}

	public void setqTrib(Double qTrib) {
		this.qTrib = qTrib;
	}

	public Double getvUnTrib() {
		return vUnTrib;
	}

	public void setvUnTrib(Double vUnTrib) {
		this.vUnTrib = vUnTrib;
	}

	public String getIndTot() {
		return indTot;
	}

	public void setIndTot(String indTot) {
		this.indTot = indTot;
	}

}
