package home.szakdolgozat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MTerulet {

	public MTerulet() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long munkaterulet_id;

	private String munkaterulet;

	@OneToMany(mappedBy = "munkaterulet")
	private List<Dolgozo> dolgozok = new ArrayList<Dolgozo>();

	public Long getMunkaterulet_id() {
		return munkaterulet_id;
	}

	public void setMunkaterulet_id(Long munkaterulet_id) {
		this.munkaterulet_id = munkaterulet_id;
	}

	public String getMunkaterulet() {
		return munkaterulet;
	}

	public void setMunkaterulet(String munkaterulet) {
		this.munkaterulet = munkaterulet;
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
		return "MTerulet [munkaterulet_id=" + munkaterulet_id + ", munkaterulet=" + munkaterulet + ", dolgozok="
				+ (dolgozok != null ? dolgozok.subList(0, Math.min(dolgozok.size(), maxLen)) : null) + "]";
	}

	

}
