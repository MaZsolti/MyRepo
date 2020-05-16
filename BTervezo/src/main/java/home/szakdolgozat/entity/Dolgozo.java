package home.szakdolgozat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Dolgozo {
	
	public Dolgozo () {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String vezeteknev;
	private String keresztnev;
	@ManyToOne
	private Jogosultsag jogosultsag;
	@ManyToOne 
	private Munkakor munkakor;
	@ManyToOne
	private Munkaido munkaido;
	
	@ManyToMany
	private List<Muszak> muszakok = new ArrayList<Muszak>();
	private boolean tulora;
	private boolean hetvege;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Dolgozo [id=" + id + ", vezeteknev=" + vezeteknev + ", keresztnev=" + keresztnev + ", jogosultsag="
				+ jogosultsag + ", munkakor=" + munkakor + ", munkaido=" + munkaido + ", muszakok="
				+ (muszakok != null ? muszakok.subList(0, Math.min(muszakok.size(), maxLen)) : null) + ", tulora="
				+ tulora + ", hetvege=" + hetvege + "]";
	}
	
	
	
	
	
	
	

}
