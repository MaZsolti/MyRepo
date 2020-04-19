package home.szakdolgozat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import home.szakdolgozat.entity.Muszak;
import home.szakdolgozat.service.MuszakService;

@Controller
public class MuszakController {

	@Autowired
	MuszakService mus;
	
	@GetMapping("/muszak")
	public String view(Model model) {
		model.addAttribute("muszak", new Muszak());
		return "muszak";
	}
	@PostMapping("/muszak")
	public String mentes(@ModelAttribute("muszak") Muszak muszak) {
		mus.mentes(muszak);
		
		return "redirect:muszak";
	}
}
