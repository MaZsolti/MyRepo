package home.szakdolgozat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Munkarend {
	
private Munkarend () {
		
	}
	
	@Id
	@GeneratedValue
	private int id;
	
	private Integer munkarend;
	private String nev;
	@OneToMany(cascade =CascadeType.ALL, mappedBy ="munkarend")
	private List<MTerulet> mteruletek = new ArrayList<MTerulet>();
	
	public List<MTerulet> getMteruletek() {
		return mteruletek;
	}
	public void setMteruletek(List<MTerulet> mteruletek) {
		this.mteruletek = mteruletek;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public Integer getMunkarend() {
		return munkarend;
	}
	public void setMunkarend(Integer munkarend) {
		this.munkarend = munkarend;
	}
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Munkarend [id=" + id + ", munkarend=" + munkarend + ", nev=" + nev + ", mteruletek="
				+ (mteruletek != null ? mteruletek.subList(0, Math.min(mteruletek.size(), maxLen)) : null) + "]";
	}
	
	
}
