package prbrios.nfcepdf.esquema.nfce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ICMSTot")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICMSTot {

	@XmlElement(name="vBC")
	private Double vBC;
	
	@XmlElement(name="vICMS")
	private Double vICMS;
	
	@XmlElement(name="vICMSDeson")
	private Double vICMSDeson;
	
	@XmlElement(name="vBCST")
	private Double vBCST;
	
	@XmlElement(name="vST")
	private Double vST;
	
	@XmlElement(name="vProd")
	private Double vProd;
	
	@XmlElement(name="vFrete")
	private Double vFrete;
	
	@XmlElement(name="vSeg")
	private Double vSeg;
	
	@XmlElement(name="vDesc")
	private Double vDesc;
	
	@XmlElement(name="vII")
	private Double vII;
	
	@XmlElement(name="vIPI")
	private Double vIPI;
	
	@XmlElement(name="vPIS")
	private Double vPIS;
	
	@XmlElement(name="vCOFINS")
	private Double vCOFINS;
	
	@XmlElement(name="vOutro")
	private Double vOutro;
	
	@XmlElement(name="vNF")
	private Double vNF;
	
	@XmlElement(name="vTotTrib")
	private Double vTotTrib;

	public Double getvBC() {
		return vBC;
	}

	public void setvBC(Double vBC) {
		this.vBC = vBC;
	}

	public Double getvICMS() {
		return vICMS;
	}

	public void setvICMS(Double vICMS) {
		this.vICMS = vICMS;
	}

	public Double getvICMSDeson() {
		return vICMSDeson;
	}

	public void setvICMSDeson(Double vICMSDeson) {
		this.vICMSDeson = vICMSDeson;
	}

	public Double getvBCST() {
		return vBCST;
	}

	public void setvBCST(Double vBCST) {
		this.vBCST = vBCST;
	}

	public Double getvST() {
		return vST;
	}

	public void setvST(Double vST) {
		this.vST = vST;
	}

	public Double getvProd() {
		return vProd;
	}

	public void setvProd(Double vProd) {
		this.vProd = vProd;
	}

	public Double getvFrete() {
		return vFrete;
	}

	public void setvFrete(Double vFrete) {
		this.vFrete = vFrete;
	}

	public Double getvSeg() {
		return vSeg;
	}

	public void setvSeg(Double vSeg) {
		this.vSeg = vSeg;
	}

	public Double getvDesc() {
		return vDesc;
	}

	public void setvDesc(Double vDesc) {
		this.vDesc = vDesc;
	}

	public Double getvII() {
		return vII;
	}

	public void setvII(Double vII) {
		this.vII = vII;
	}

	public Double getvIPI() {
		return vIPI;
	}

	public void setvIPI(Double vIPI) {
		this.vIPI = vIPI;
	}

	public Double getvPIS() {
		return vPIS;
	}

	public void setvPIS(Double vPIS) {
		this.vPIS = vPIS;
	}

	public Double getvCOFINS() {
		return vCOFINS;
	}

	public void setvCOFINS(Double vCOFINS) {
		this.vCOFINS = vCOFINS;
	}

	public Double getvOutro() {
		return vOutro;
	}

	public void setvOutro(Double vOutro) {
		this.vOutro = vOutro;
	}

	public Double getvNF() {
		return vNF;
	}

	public void setvNF(Double vNF) {
		this.vNF = vNF;
	}

	public Double getvTotTrib() {
		return vTotTrib;
	}

	public void setvTotTrib(Double vTotTrib) {
		this.vTotTrib = vTotTrib;
	}

}
