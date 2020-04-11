package home.szakdolgozat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.szakdolgozat.entity.Munkarend;
import home.szakdolgozat.repository.MunkarendRepository;

@Service
public class MunkarendService {
	
	@Autowired
	private MunkarendRepository mrr;
	
	public void mentes(Munkarend munkarend) {
		mrr.save(munkarend);
	}
	public List<Munkarend> osszesMunkarend(){
		return (List<Munkarend>) mrr.findAll();
	}
}
