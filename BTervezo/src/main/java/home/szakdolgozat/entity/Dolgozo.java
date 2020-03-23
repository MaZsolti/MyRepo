package home.szakdolgozat.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dolgozo {

	@Id
	@GeneratedValue
	private int id;

	private String nev;
	private Munkakor munkakor;
	private Munkaido munkaido;
	
	@OneToMany
	private List<Muszak> muszakok;
	private boolean tulora = true;
	private boolean hetvege = false;
	private int szabadsag;
	private int felhasznaltSzabadfsag;
	private int kivehetoSzabadság;
	private int jogosultsag;
	
	
	
	public int getJogosultsag() {
		return jogosultsag;
	}
	public void setJogosultsag(int jogosultsag) {
		this.jogosultsag = jogosultsag;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public Munkakor getMunkakor() {
		return munkakor;
	}
	public void setMunkakor(Munkakor munkakor) {
		this.munkakor = munkakor;
	}
	public Munkaido getMunkaido() {
		return munkaido;
	}
	public void setMunkaido(Munkaido munkaido) {
		this.munkaido = munkaido;
	}
	public List<Muszak> getMuszakok() {
		return muszakok;
	}
	public void setMuszakok(List<Muszak> muszakok) {
		this.muszakok = muszakok;
	}
	public boolean isTulora() {
		return tulora;
	}
	public void setTulora(boolean tulora) {
		this.tulora = tulora;
	}
	public boolean isHetvege() {
		return hetvege;
	}
	public void setHetvege(boolean hetvege) {
		this.hetvege = hetvege;
	}
	public int getSzabadsag() {
		return szabadsag;
	}
	public void setSzabadsag(int szabadsag) {
		this.szabadsag = szabadsag;
	}
	public int getFelhasznaltSzabadfsag() {
		return felhasznaltSzabadfsag;
	}
	public void setFelhasznaltSzabadfsag(int felhasznaltSzabadfsag) {
		this.felhasznaltSzabadfsag = felhasznaltSzabadfsag;
	}
	public int getKivehetoSzabadság() {
		return kivehetoSzabadság;
	}
	public void setKivehetoSzabadság(int kivehetoSzabadság) {
		this.kivehetoSzabadság = kivehetoSzabadság;
	}
	
	
}
