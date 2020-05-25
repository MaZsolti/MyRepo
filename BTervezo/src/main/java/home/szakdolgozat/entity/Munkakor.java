package home.szakdolgozat.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Munkakor {
	
	public Munkakor() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String mukor;
	
	@ManyToMany
	private List<MTerulet> mteruletek = new ArrayList<MTerulet>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "munkakor")
	private List<Dolgozo> dolgozok = new ArrayList<Dolgozo>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMukor() {
		return mukor;
	}

	public void setMukor(String mukor) {
		this.mukor = mukor;
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
		return "Munkakor [id=" + id + ", mukor=" + mukor + ", mteruletek="
				+ (mteruletek != null ? mteruletek.subList(0, Math.min(mteruletek.size(), maxLen)) : null)
				+ ", dolgozok=" + (dolgozok != null ? dolgozok.subList(0, Math.min(dolgozok.size(), maxLen)) : null)
				+ "]";
	}

	
	

}
