package home.szakdolgozat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import home.szakdolgozat.entity.Munkaido;
import home.szakdolgozat.service.MunkaidoService;

@Controller
public class MunkaidoController {
	
	@Autowired
	MunkaidoService mis;
	
	@GetMapping("munkaido")
	public String view(Model model) {
		model.addAttribute("munkaido", new Munkaido());
		return "munkaido";
	}
	@PostMapping("munkaido")
	public String mentes(@ModelAttribute("munkaido") Munkaido munkaido) {
		mis.mentes(munkaido);
		
		return "redirect:munkaido";
	}
}
