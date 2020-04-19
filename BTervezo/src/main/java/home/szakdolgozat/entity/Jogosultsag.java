package home.szakdolgozat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Jogosultsag {

	@Id
	@GeneratedValue
	private Long id;
	
	private Integer jogogultsag;
	
	@OneToMany(cascade =CascadeType.ALL, mappedBy ="jogosultsag")
	private List<Dolgozo> dolgozok = new ArrayList<Dolgozo>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getJogogultsag() {
		return jogogultsag;
	}

	public void setJogogultsag(Integer jogogultsag) {
		this.jogogultsag = jogogultsag;
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
		return "Jogosultsag [id=" + id + ", jogogultsag=" + jogogultsag + ", dolgozok="
				+ (dolgozok != null ? dolgozok.subList(0, Math.min(dolgozok.size(), maxLen)) : null) + "]";
	}
	
	
	
}
