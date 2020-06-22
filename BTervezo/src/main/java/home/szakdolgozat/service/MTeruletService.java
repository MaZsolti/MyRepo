package home.szakdolgozat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.szakdolgozat.entity.MTerulet;
import home.szakdolgozat.repository.MTeruletRepository;

@Service
public class MTeruletService {
	
	@Autowired
	private MTeruletRepository mtr;
	
	public void mentes(MTerulet mterulet) {
		mtr.save(mterulet);
	}
	public List<MTerulet> munkateruletLista(){
		return (List<MTerulet>)mtr.findAll();
		
	}
}
