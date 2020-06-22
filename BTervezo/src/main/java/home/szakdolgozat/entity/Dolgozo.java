package home.szakdolgozat.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Dolgozo {

	public Dolgozo() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dolgozo_id;

	private String vezeteknev;
	private String keresztnev;
	@ManyToOne
	private Jogosultsag jogosultsag;
	@ManyToOne(cascade = CascadeType.ALL)
	private Munkakor munkakor;
	@ManyToOne(cascade = CascadeType.ALL)
	private MTerulet munkaterulet;
	public Long getDolgozo_id() {
		return dolgozo_id;
	}
	public void setDolgozo_id(Long dolgozo_id) {
		this.dolgozo_id = dolgozo_id;
	}
	public String getVezeteknev() {
		return vezeteknev;
	}
	public void setVezeteknev(String vezeteknev) {
		this.vezeteknev = vezeteknev;
	}
	public String getKeresztnev() {
		return keresztnev;
	}
	public void setKeresztnev(String keresztnev) {
		this.keresztnev = keresztnev;
	}
	public Jogosultsag getJogosultsag() {
		return jogosultsag;
	}
	public void setJogosultsag(Jogosultsag jogosultsag) {
		this.jogosultsag = jogosultsag;
	}
	public Munkakor getMunkakor() {
		return munkakor;
	}
	public void setMunkakor(Munkakor munkakor) {
		this.munkakor = munkakor;
	}
	public MTerulet getMunkaterulet() {
		return munkaterulet;
	}
	public void setMunkaterulet(MTerulet munkaterulet) {
		this.munkaterulet = munkaterulet;
	}
	@Override
	public String toString() {
		return "Dolgozo [dolgozo_id=" + dolgozo_id + ", vezeteknev=" + vezeteknev + ", keresztnev=" + keresztnev
				+ ", jogosultsag=" + jogosultsag + ", munkakor=" + munkakor + ", munkaterulet=" + munkaterulet + "]";
	}

	

}
