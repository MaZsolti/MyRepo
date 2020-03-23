package home.szakdolgozat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Munkarend {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int munkarend;
	private String nev;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMunkarend() {
		return munkarend;
	}
	public void setMunkarend(int munkarend) {
		this.munkarend = munkarend;
	}
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}

	
	
}
