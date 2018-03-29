package prbrios.nfcepdf.esquema.nfce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "emit")
@XmlAccessorType(XmlAccessType.FIELD)
public class Emit {

	@XmlElement(name="CNPJ")
	private String cnpj;
	
	@XmlElement(name="xNome")
	private String xNome;
	
	@XmlElement(name="xFant")
	private String xFant;
	
	@XmlElement(name="enderEmit")
	private EnderEmit enderEmit;
	
	@XmlElement(name="IE")
	private String ie;
	
	@XmlElement(name="CRT")
	private String crt;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cNPJ) {
		cnpj = cNPJ;
	}

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public String getxFant() {
		return xFant;
	}

	public void setxFant(String xFant) {
		this.xFant = xFant;
	}

	public EnderEmit getEnderEmit() {
		return enderEmit;
	}

	public void setEnderEmit(EnderEmit enderEmit) {
		this.enderEmit = enderEmit;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getCrt() {
		return crt;
	}

	public void setCrt(String crt) {
		this.crt = crt;
	}

}
