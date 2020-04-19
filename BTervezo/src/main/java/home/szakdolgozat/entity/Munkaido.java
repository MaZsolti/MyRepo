package home.szakdolgozat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Munkaido {

	public Munkaido() {
		
	}
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Integer munkaido;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "munkaido")
	private List<Dolgozo> dolgozok = new ArrayList<Dolgozo>();

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getMunkaido() {
		return munkaido;
	}

	public void setMunkaido(int munkaido) {
		this.munkaido = munkaido;
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
		return "Munkaido [id=" + id + ", munkaido=" + munkaido + ", dolgozok="
				+ (dolgozok != null ? dolgozok.subList(0, Math.min(dolgozok.size(), maxLen)) : null) + "]";
	}

	

	
	
	
	
}
