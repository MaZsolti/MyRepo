package home.szakdolgozat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.szakdolgozat.entity.Munkaido;
import home.szakdolgozat.repository.MunkaidoRepository;

@Service
public class MunkaidoService {

	@Autowired
	private MunkaidoRepository mir;

	public List<Munkaido> munkaidoLista() {
		return mir.findAll();
	}

	public void mentes(Munkaido munkaido) {
		mir.save(munkaido);

	}
	
	public Munkaido szerkeszt(Long munkaido_id) {
		Optional<Munkaido> optional = mir.findById(munkaido_id);
		Munkaido munkaido = null;
		if (optional.isPresent()) {
			munkaido = optional.get();
		} else {
			throw new RuntimeException("Nem találom a munkaidő azonosítóját ::" + munkaido_id);
		}
		return munkaido;
		
	}

	public void torles(Long munkaido_id) {
		mir.deleteById(munkaido_id);
	}

	

}
