package home.szakdolgozat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Munkarend {
	
public Munkarend () {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String mrend;
	
	@ManyToOne
	private Munkaido mido;
	
	@OneToMany(cascade =CascadeType.ALL, mappedBy ="munkarend")
	private List<MTerulet> mteruletek = new ArrayList<MTerulet>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMrend() {
		return mrend;
	}

	public void setMrend(String mrend) {
		this.mrend = mrend;
	}

	public Munkaido getMido() {
		return mido;
	}

	public void setMido(Munkaido mido) {
		this.mido = mido;
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
		return "Munkarend [id=" + id + ", mrend=" + mrend + ", mido=" + mido + ", mteruletek="
				+ (mteruletek != null ? mteruletek.subList(0, Math.min(mteruletek.size(), maxLen)) : null) + "]";
	}

	
	
	

}

	

	

	

	
	
	
	

