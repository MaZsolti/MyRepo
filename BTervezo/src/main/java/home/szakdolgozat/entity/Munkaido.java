package home.szakdolgozat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Munkaido {

	@Id
	@GeneratedValue
	private int id;
	
	private String munkaidoNev;
	private Double munkaido;
	
	public String getMunkaidoNev() {
		return munkaidoNev;
	}

	public void setMunkaidoNev(String munkaidoNev) {
		this.munkaidoNev = munkaidoNev;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getMunkaido() {
		return munkaido;
	}

	public void setMunkaido(Double munkaido) {
		this.munkaido = munkaido;
	}
	
	
}
