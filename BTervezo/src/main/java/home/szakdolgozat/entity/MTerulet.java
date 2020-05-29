package home.szakdolgozat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class MTerulet {

	public MTerulet() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String munkaterulet;
	@ManyToOne
	private Munkarend munkarend;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "mteruletek")
	private List<Muszak> muszakok = new ArrayList<Muszak>();

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "mteruletek")
	private List<Munkakor> munkakorok = new ArrayList<Munkakor>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	@Override
	public String toString() {
		final int maxLen = 10;
		return "MTerulet [id=" + id + ", munkaterulet=" + munkaterulet + ", munkarend=" + munkarend + ", muszakok="
				+ (muszakok != null ? muszakok.subList(0, Math.min(muszakok.size(), maxLen)) : null) + ", munkakorok="
				+ (munkakorok != null ? munkakorok.subList(0, Math.min(munkakorok.size(), maxLen)) : null) + "]";
	}

	
	

	
	
	}


