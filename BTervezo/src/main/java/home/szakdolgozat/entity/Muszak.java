package home.szakdolgozat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Muszak {
	
private Muszak () {
		
	}
	
	@Id
	@GeneratedValue
	private int id;
	private String muszak;
	private int tol;
	private int ig;
	
	@ManyToMany
	private List<MTerulet> mteruletek = new ArrayList<MTerulet>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMuszak() {
		return muszak;
	}

	public void setMuszak(String muszak) {
		this.muszak = muszak;
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

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Muszak [id=" + id + ", muszak=" + muszak + ", tol=" + tol + ", ig=" + ig + ", mteruletek="
				+ (mteruletek != null ? mteruletek.subList(0, Math.min(mteruletek.size(), maxLen)) : null) + "]";
	}
	
	
}
