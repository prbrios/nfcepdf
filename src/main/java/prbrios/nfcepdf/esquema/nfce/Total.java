package prbrios.nfcepdf.esquema.nfce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "total")
@XmlAccessorType(XmlAccessType.FIELD)
public class Total {

	@XmlElement(name="ICMSTot")
	private ICMSTot icmsTot;

	public ICMSTot getIcmsTot() {
		return icmsTot;
	}

	public void setIcmsTot(ICMSTot icmsTot) {
		this.icmsTot = icmsTot;
	}

}
