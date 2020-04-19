package home.szakdolgozat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.szakdolgozat.entity.Munkaido;
import home.szakdolgozat.repository.MunkaidoRepository;

@Service
public class MunkaidoService {

	@Autowired
	private MunkaidoRepository mir;

	public void mentes(Munkaido munkaido) {
		mir.save(munkaido);

	}

	

}
