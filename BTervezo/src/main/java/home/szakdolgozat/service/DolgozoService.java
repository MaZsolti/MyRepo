package home.szakdolgozat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.szakdolgozat.entity.Dolgozo;
import home.szakdolgozat.repository.DolgozoRepository;

@Service
public class DolgozoService {
	
	@Autowired
	private DolgozoRepository dr;
	
	public void mentes(Dolgozo dolgozo) {
		dr.save(dolgozo);
	}
}
