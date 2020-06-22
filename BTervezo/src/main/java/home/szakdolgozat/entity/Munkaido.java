package home.szakdolgozat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Munkaido {

	public Munkaido() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long munkaido_id;
	
	private Integer idotartam;
	
	@OneToMany(mappedBy = "ido")
	private List<Muszak> muszakok = new ArrayList<Muszak>();

	public Long getMunkaido_id() {
		return munkaido_id;
	}

	public void setMunkaido_id(Long munkaido_id) {
		this.munkaido_id = munkaido_id;
	}

	public Integer getIdotartam() {
		return idotartam;
	}

	public void setIdotartam(Integer idotartam) {
		this.idotartam = idotartam;
	}

	public List<Muszak> getMuszakok() {
		return muszakok;
	}

	public void setMuszakok(List<Muszak> muszakok) {
		this.muszakok = muszakok;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Munkaido [munkaido_id=" + munkaido_id + ", idotartam=" + idotartam + ", muszakok="
				+ (muszakok != null ? muszakok.subList(0, Math.min(muszakok.size(), maxLen)) : null) + "]";
	}

	
}
