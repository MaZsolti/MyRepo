package home.szakdolgozat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Felhasznalo extends Dolgozo{
	
	@Id
	@GeneratedValue
	private int id;
	
	private String nev;
	private String felhaszanlonev;
	private String jelszo;

	
	
	public Felhasznalo() {
		
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

	public String getFelhaszanlonev() {
		return felhaszanlonev;
	}

	public void setFelhaszanlonev(String felhaszanlonev) {
		this.felhaszanlonev = felhaszanlonev;
	}

	public String getJelszo() {
		return jelszo;
	}

	public void setJelszo(String jelszo) {
		this.jelszo = jelszo;
	}

	
	
	
}
