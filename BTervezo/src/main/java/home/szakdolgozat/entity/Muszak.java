package home.szakdolgozat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Muszak {

	public Muszak() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String szak;
	private int tol;
	private int ig;

	@ManyToMany
	private List<MTerulet> mteruletek = new ArrayList<MTerulet>();
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "muszakok")
	private List<Dolgozo> dolgozok = new ArrayList<Dolgozo>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSzak() {
		return szak;
	}
	public void setSzak(String szak) {
		this.szak = szak;
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
	public List<MTerulet> getMteruletek() {
		return mteruletek;
	}
	public void setMteruletek(List<MTerulet> mteruletek) {
		this.mteruletek = mteruletek;
	}
	public List<Dolgozo> getDolgozok() {
		return dolgozok;
	}
	public void setDolgozok(List<Dolgozo> dolgozok) {
		this.dolgozok = dolgozok;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Muszak [id=" + id + ", szak=" + szak + ", tol=" + tol + ", ig=" + ig + ", mteruletek="
				+ (mteruletek != null ? mteruletek.subList(0, Math.min(mteruletek.size(), maxLen)) : null)
				+ ", dolgozok=" + (dolgozok != null ? dolgozok.subList(0, Math.min(dolgozok.size(), maxLen)) : null)
				+ "]";
	}

}