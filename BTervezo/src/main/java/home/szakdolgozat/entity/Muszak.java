package home.szakdolgozat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Muszak {
	
	@Id
	@GeneratedValue
	private int id;
	private String muszak;
	private int tol;
	private int ig;
	
	
	

	Muszak() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMuszak() {
		return muszak;
	}

	public void setMuszak(String muszak) {
		this.muszak = muszak;
	}

	public int getTol() {
		return tol;
	}

	public void setTol(int tol) {
		this.tol = tol;
	}

	public int getIg() {
		return ig;
	}

	public void setIg(int ig) {
		this.ig = ig;
	}

	
	
	
}
