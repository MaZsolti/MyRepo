package home.szakdolgozat.entity;

import javax.persistence.Entity;

@Entity
public class Felhasznalo extends Dolgozo{
	
	private Felhasznalo () {
		
	}
		
	private String felhasznalonev;
	private String jelszo;
	public String getFelhasznalonev() {
		return felhasznalonev;
	}
	public void setFelhasznalonev(String felhasznalonev) {
		this.felhasznalonev = felhasznalonev;
	}
	public String getJelszo() {
		return jelszo;
	}
	public void setJelszo(String jelszo) {
		this.jelszo = jelszo;
	}
	@Override
	public String toString() {
		return "Felhasznalo [felhasznalonev=" + felhasznalonev + ", jelszo=" + jelszo + "]";
	}
	
	
	
		
}
