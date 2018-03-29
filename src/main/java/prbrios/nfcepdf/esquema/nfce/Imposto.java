package prbrios.nfcepdf.esquema.nfce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "imposto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Imposto {

	@XmlElement(name="vTotTrib")
	private String vTotTrib;

	public String getvTotTrib() {
		return vTotTrib;
	}

	public void setvTotTrib(String vTotTrib) {
		this.vTotTrib = vTotTrib;
	}
	
	//TODO adicionar o restante dos atributos referentes a impostos

}
