package home.szakdolgozat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.szakdolgozat.entity.Munkaido;
import home.szakdolgozat.repository.MunkaidoRepository;

@Service
public class MunkaidoService {

	@Autowired
	private MunkaidoRepository mir;
	
	public List<Munkaido> munkaidoLista () {
		return mir.findAll();
	}
	public void mentes(Munkaido munkaido) {
		mir.save(munkaido);

	}

	

}
