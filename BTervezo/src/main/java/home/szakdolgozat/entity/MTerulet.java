package home.szakdolgozat.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MTerulet {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String munkaterulet;
	private Munkarend munkarend;
	private List<Muszak> muszakok;
	private List<Munkakor> munkakorok;
	
	public MTerulet() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMunkaterulet() {
		return munkaterulet;
	}

	public void setMunkaterulet(String munkaterulet) {
		this.munkaterulet = munkaterulet;
	}

	public Munkarend getMunkarend() {
		return munkarend;
	}

	public void setMunkarend(Munkarend munkarend) {
		this.munkarend = munkarend;
	}

	public List<Muszak> getMuszakok() {
		return muszakok;
	}

	public void setMuszakok(List<Muszak> muszakok) {
		this.muszakok = muszakok;
	}

	public List<Munkakor> getMunkakorok() {
		return munkakorok;
	}

	public void setMunkakorok(List<Munkakor> munkakorok) {
		this.munkakorok = munkakorok;
	}
	
	
	
	
	
}
