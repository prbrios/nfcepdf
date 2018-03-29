package prbrios.nfcepdf.esquema.nfce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ide")
@XmlAccessorType(XmlAccessType.FIELD)
public class Ide {

	@XmlElement(name = "cUF")
	private String cUF;

	@XmlElement(name = "cNF")
	private String cNF;

	@XmlElement(name = "natOp")
	private String natOp;

	@XmlElement(name = "indPag")
	private String indPag;

	@XmlElement(name = "mod")
	private String mod;

	@XmlElement(name = "serie")
	private String serie;

	@XmlElement(name = "nNF")
	private String nNF;

	@XmlElement(name = "dhEmi")
	private String dhEmi;

	@XmlElement(name = "tpNF")
	private String tpNF;

	@XmlElement(name = "idDest")
	private String idDest;

	@XmlElement(name = "cMunFG")
	private String cMunFG;

	@XmlElement(name = "tpImp")
	private String tpImp;

	@XmlElement(name = "tpEmis")
	private String tpEmis;

	@XmlElement(name = "cDV")
	private String cDV;

	@XmlElement(name = "tpAmb")
	private String tpAmb;

	@XmlElement(name = "finNFe")
	private String finNFe;

	@XmlElement(name = "indFinal")
	private String indFinal;

	@XmlElement(name = "indPres")
	private String indPres;

	@XmlElement(name = "procEmi")
	private String procEmi;

	@XmlElement(name = "verProc")
	private String verProc;

	public String getcUF() {
		return cUF;
	}

	public void setcUF(String cUF) {
		this.cUF = cUF;
	}

	public String getcNF() {
		return cNF;
	}

	public void setcNF(String cNF) {
		this.cNF = cNF;
	}

	public String getNatOp() {
		return natOp;
	}

	public void setNatOp(String natOp) {
		this.natOp = natOp;
	}

	public String getIndPag() {
		return indPag;
	}

	public void setIndPag(String indPag) {
		this.indPag = indPag;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getnNF() {
		return nNF;
	}

	public void setnNF(String nNF) {
		this.nNF = nNF;
	}

	public String getDhEmi() {
		return dhEmi;
	}

	public void setDhEmi(String dhEmi) {
		this.dhEmi = dhEmi;
	}

	public String getTpNF() {
		return tpNF;
	}

	public void setTpNF(String tpNF) {
		this.tpNF = tpNF;
	}

	public String getIdDest() {
		return idDest;
	}

	public void setIdDest(String idDest) {
		this.idDest = idDest;
	}

	public String getcMunFG() {
		return cMunFG;
	}

	public void setcMunFG(String cMunFG) {
		this.cMunFG = cMunFG;
	}

	public String getTpImp() {
		return tpImp;
	}

	public void setTpImp(String tpImp) {
		this.tpImp = tpImp;
	}

	public String getTpEmis() {
		return tpEmis;
	}

	public void setTpEmis(String tpEmis) {
		this.tpEmis = tpEmis;
	}

	public String getcDV() {
		return cDV;
	}

	public void setcDV(String cDV) {
		this.cDV = cDV;
	}

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getFinNFe() {
		return finNFe;
	}

	public void setFinNFe(String finNFe) {
		this.finNFe = finNFe;
	}

	public String getIndFinal() {
		return indFinal;
	}

	public void setIndFinal(String indFinal) {
		this.indFinal = indFinal;
	}

	public String getIndPres() {
		return indPres;
	}

	public void setIndPres(String indPres) {
		this.indPres = indPres;
	}

	public String getProcEmi() {
		return procEmi;
	}

	public void setProcEmi(String procEmi) {
		this.procEmi = procEmi;
	}

	public String getVerProc() {
		return verProc;
	}

	public void setVerProc(String verProc) {
		this.verProc = verProc;
	}

}
