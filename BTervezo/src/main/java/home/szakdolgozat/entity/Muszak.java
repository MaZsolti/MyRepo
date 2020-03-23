package home.szakdolgozat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Muszak {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int muszak;
	private String nev;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMuszak() {
		return muszak;
	}

	public void setMuszak(int muszak) {
		this.muszak = muszak;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}
	
	
}
