package home.szakdolgozat.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Muszak {

	public Muszak() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long muszak_id;
	private String szak;
	@ManyToOne(cascade = CascadeType.ALL)
	private Munkaido ido;
	private int tol;
	private int ig;
	public Long getMuszak_id() {
		return muszak_id;
	}
	public void setMuszak_id(Long muszak_id) {
		this.muszak_id = muszak_id;
	}
	public String getSzak() {
		return szak;
	}
	public void setSzak(String szak) {
		this.szak = szak;
	}
	public Munkaido getIdo() {
		return ido;
	}
	public void setIdo(Munkaido ido) {
		this.ido = ido;
	}
	public int getTol() {
		return tol;
	}
	public void setTol(int tol) {
		this.tol = tol;
	}
	public int getIg() {
		return ig;
	}
	public void setIg(int ig) {
		this.ig = ig;
	}
	@Override
	public String toString() {
		return "Muszak [muszak_id=" + muszak_id + ", szak=" + szak + ", ido=" + ido + ", tol=" + tol + ", ig=" + ig
				+ "]";
	}
	
	
}