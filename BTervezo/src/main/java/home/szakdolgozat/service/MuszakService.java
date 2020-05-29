package home.szakdolgozat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.szakdolgozat.entity.Muszak;
import home.szakdolgozat.repository.MuszakRepository;

@Service
public class MuszakService {

	@Autowired
	private MuszakRepository mr;
	
	public void mentes(Muszak muszak) {
		mr.save(muszak);
	}
	
	public List<Muszak> muszakLista(){
		return (List<Muszak>)mr.findAll();
	}
	
	
}
