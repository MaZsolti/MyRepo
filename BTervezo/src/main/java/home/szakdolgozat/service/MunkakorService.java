package home.szakdolgozat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.szakdolgozat.entity.Munkakor;
import home.szakdolgozat.repository.MunkakorRepository;

@Service
public class MunkakorService {
	
	@Autowired
	private MunkakorRepository mr;
	
	public void mentes(Munkakor munkakor) {
		mr.save(munkakor);
	}
	public List<Munkakor> munkakorLista(){
		return (List<Munkakor>)mr.findAll();
		
	}
	
}
