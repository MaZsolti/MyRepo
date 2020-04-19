package home.szakdolgozat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import home.szakdolgozat.entity.Munkarend;
import home.szakdolgozat.service.MunkarendService;

@Controller
public class MunkarendController {

	@Autowired
	private MunkarendService mrs;

	@GetMapping("munkarend")
	public String view(Model model) {
		model.addAttribute("munkarend", new Munkarend());
		return "munkarend";
	}
	@PostMapping("munkarend")
	public String mentes(@ModelAttribute("munkarend") Munkarend munkarend) {
		mrs.mentes(munkarend);
		
		return "redirect:munkarend";
	}
}