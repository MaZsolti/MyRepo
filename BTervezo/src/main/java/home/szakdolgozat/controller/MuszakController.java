package home.szakdolgozat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import home.szakdolgozat.entity.Munkaido;
import home.szakdolgozat.entity.Muszak;
import home.szakdolgozat.service.MunkaidoService;
import home.szakdolgozat.service.MuszakService;

@Controller
public class MuszakController {

	@Autowired
	MuszakService mus;
	@Autowired
	MunkaidoService mis;
		
	@GetMapping("/muszak")
	public String view(Model model) {
		model.addAttribute("muszak", new Muszak());
		List<Muszak> muszakok = mus.muszakLista();
		model.addAttribute("muszakok", muszakok);
		List<Munkaido> munkaidok = mis.munkaidoLista();
		model.addAttribute("munkaidok", munkaidok);
		 
		return "muszak";
	}
	@PostMapping("/muszak")
	public String mentes(@ModelAttribute("muszak") Muszak muszak, Long munkaido_id ) {
		mus.mentes(muszak, munkaido_id );
		
		return "redirect:muszak";
	}
}
