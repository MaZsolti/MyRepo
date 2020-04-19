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
	
public Munkarend () {
		
	}
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String munkarend;
	private int idotartam;
	
	@OneToMany(cascade =CascadeType.ALL, mappedBy ="munkarend")
	private List<MTerulet> mteruletek = new ArrayList<MTerulet>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMunkarend() {
		return munkarend;
	}

	public void setMunkarend(String munkarend) {
		this.munkarend = munkarend;
	}
	
	

	public int getIdotartam() {
		return idotartam;
	}

	public void setIdotartam(int idotartam) {
		this.idotartam = idotartam;
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
		return "Munkarend [id=" + id + ", munkarend=" + munkarend + ", idotartam=" + idotartam + ", mteruletek="
				+ (mteruletek != null ? mteruletek.subList(0, Math.min(mteruletek.size(), maxLen)) : null) + "]";
	}

	

	
	
	
	
}
