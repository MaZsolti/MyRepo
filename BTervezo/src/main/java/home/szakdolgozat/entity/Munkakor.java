package home.szakdolgozat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Munkakor {

	@Id
	@GeneratedValue
	private int id;
	
	private String munkakor;

	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	private String getMunkakor() {
		return munkakor;
	}

	private void setMunkakor(String munkakor) {
		this.munkakor = munkakor;
	}
	
	
}
