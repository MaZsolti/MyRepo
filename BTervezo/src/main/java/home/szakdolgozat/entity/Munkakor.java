package home.szakdolgozat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Munkakor {

	public Munkakor() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long munkakor_id;

	private String mukor;

	@OneToMany(mappedBy = "munkakor")
	private List<Dolgozo> dolgozok = new ArrayList<Dolgozo>();

	public Long getMunkakor_id() {
		return munkakor_id;
	}

	public void setMunkakor_id(Long munkakor_id) {
		this.munkakor_id = munkakor_id;
	}

	public String getMukor() {
		return mukor;
	}

	public void setMukor(String mukor) {
		this.mukor = mukor;
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
		return "Munkakor [munkakor_id=" + munkakor_id + ", mukor=" + mukor + ", dolgozok="
				+ (dolgozok != null ? dolgozok.subList(0, Math.min(dolgozok.size(), maxLen)) : null) + "]";
	}

	
}
