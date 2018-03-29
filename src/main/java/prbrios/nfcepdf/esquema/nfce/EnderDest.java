package prbrios.nfcepdf.esquema.nfce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "enderDest")
@XmlAccessorType(XmlAccessType.FIELD)
public class EnderDest {

	@XmlElement(name="xLgr")
	private String xLgr;
	
	@XmlElement(name="nro")
	private String nro;
	
	@XmlElement(name="xBairro")
	private String xBairro;
	
	@XmlElement(name="cMun")
	private String cMun;
	
	@XmlElement(name="xMun")
	private String xMun;
	
	@XmlElement(name="UF")
	private String uf;
	
	@XmlElement(name="CEP")
	private String cep;
	
	@XmlElement(name="cPais")
	private String cPais;
	
	@XmlElement(name="xPais")
	private String xPais;

	public String getxLgr() {
		return xLgr;
	}

	public void setxLgr(String xLgr) {
		this.xLgr = xLgr;
	}

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		this.nro = nro;
	}

	public String getxBairro() {
		return xBairro;
	}

	public void setxBairro(String xBairro) {
		this.xBairro = xBairro;
	}

	public String getcMun() {
		return cMun;
	}

	public void setcMun(String cMun) {
		this.cMun = cMun;
	}

	public String getxMun() {
		return xMun;
	}

	public void setxMun(String xMun) {
		this.xMun = xMun;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getcPais() {
		return cPais;
	}

	public void setcPais(String cPais) {
		this.cPais = cPais;
	}

	public String getxPais() {
		return xPais;
	}

	public void setxPais(String xPais) {
		this.xPais = xPais;
	}

}
