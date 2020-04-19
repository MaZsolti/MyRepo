package home.szakdolgozat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Felhasznalo extends Dolgozo{
	
	private Felhasznalo () {
		
	}

	@Id
	@GeneratedValue
	private Long id;
	
	private String felhasznalonev;
	private String jelszo;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
		return "Felhasznalo [id=" + id + ", felhasznalonev=" + felhasznalonev + ", jelszo=" + jelszo + "]";
	}
	
	
	
	
}
