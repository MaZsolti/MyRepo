package home.szakdolgozat.entity;

import java.util.List;

import javax.persistence.CascadeType;
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
	private Long id;
	
	private Integer idotartam;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "munkaido")
	private List<Dolgozo> dolgozok;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "mido")
	private List<Munkarend> munkarendek;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIdotartam() {
		return idotartam;
	}

	public void setIdotartam(Integer idotartam) {
		this.idotartam = idotartam;
	}

	public List<Dolgozo> getDolgozok() {
		return dolgozok;
	}

	public void setDolgozok(List<Dolgozo> dolgozok) {
		this.dolgozok = dolgozok;
	}

	public List<Munkarend> getMunkarendek() {
		return munkarendek;
	}

	public void setMunkarendek(List<Munkarend> munkarendek) {
		this.munkarendek = munkarendek;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Munkaido [id=" + id + ", idotartam=" + idotartam + ", dolgozok="
				+ (dolgozok != null ? dolgozok.subList(0, Math.min(dolgozok.size(), maxLen)) : null) + ", munkarendek="
				+ (munkarendek != null ? munkarendek.subList(0, Math.min(munkarendek.size(), maxLen)) : null) + "]";
	}

	
	
	
	
}
