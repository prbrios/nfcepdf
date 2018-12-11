package prbrios.nfcepdf.esquema.nfce;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "infNFe")
@XmlAccessorType(XmlAccessType.FIELD)
public class InfNFe {

	@XmlAttribute(name = "Id")
	private String id;

	@XmlAttribute(name = "versao")
	private String versao;

	@XmlElement(name="ide")
	private Ide ide;

	@XmlElement(name="emit")
	private Emit emit;

	@XmlElement(name="dest")
	private Dest dest;

	@XmlElement(name="det")
	private List<Det> det;

	@XmlElement(name="total")
	private Total total;

	@XmlElement(name="transp")
	private Transp transp;

	@XmlElement(name="pag")
	private Pag pag;

	@XmlElement(name="infAdic")
	private InfAdic infAdic;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public Ide getIde() {
		return ide;
	}

	public void setIde(Ide ide) {
		this.ide = ide;
	}

	public Emit getEmit() {
		return emit;
	}

	public void setEmit(Emit emit) {
		this.emit = emit;
	}

	public Dest getDest() {
		return dest;
	}

	public void setDest(Dest dest) {
		this.dest = dest;
	}

	public List<Det> getDet() {
		return det;
	}

	public void setDet(List<Det> det) {
		this.det = det;
	}

	public Total getTotal() {
		return total;
	}

	public void setTotal(Total total) {
		this.total = total;
	}

	public Transp getTransp() {
		return transp;
	}

	public void setTransp(Transp transp) {
		this.transp = transp;
	}

	public Pag getPag() {
		return pag;
	}

	public void setPag(Pag pag) {
		this.pag = pag;
	}

	public InfAdic getInfAdic() {
		return infAdic;
	}

	public void setInfAdic(InfAdic infAdic) {
		this.infAdic = infAdic;
	}

}
