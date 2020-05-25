package home.szakdolgozat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import home.szakdolgozat.entity.Munkaido;
import home.szakdolgozat.entity.Munkarend;
import home.szakdolgozat.service.MunkaidoService;
import home.szakdolgozat.service.MunkarendService;

@Controller
public class MunkarendController {

	@Autowired
	private MunkarendService mrs;
	
	@Autowired
	private MunkaidoService mis;
	
	

	@GetMapping("munkarend")
	public String view(Model model) {
		model.addAttribute("munkarend", new Munkarend());
	List<Munkaido> munkaidok = mis.munkaidoLista();
	
		model.addAttribute("munkaidok", munkaidok);
				return "munkarend";
	}
	@PostMapping("munkarend")
	public String mentes(@ModelAttribute("munkarend") Munkarend munkarend, Long mido_id) {
		mrs.mentes(munkarend, mido_id);
		
		return "redirect:munkarend";
	}
}