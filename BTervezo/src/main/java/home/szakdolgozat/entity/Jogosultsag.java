package home.szakdolgozat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Jogosultsag {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long jog_id;
	
	private Integer jogok;
	
	@OneToMany(cascade =CascadeType.ALL, mappedBy ="jogosultsag")
	private List<Dolgozo> dolgozok = new ArrayList<Dolgozo>();

	public Long getJog_id() {
		return jog_id;
	}

	public void setJog_id(Long jog_id) {
		this.jog_id = jog_id;
	}

	public Integer getJogok() {
		return jogok;
	}

	public void setJogok(Integer jogok) {
		this.jogok = jogok;
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
		return "Jogosultsag [jog_id=" + jog_id + ", jogok=" + jogok + ", dolgozok="
				+ (dolgozok != null ? dolgozok.subList(0, Math.min(dolgozok.size(), maxLen)) : null) + "]";
	}

	
}
