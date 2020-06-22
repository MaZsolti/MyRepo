package home.szakdolgozat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import home.szakdolgozat.entity.Munkaido;
import home.szakdolgozat.service.MunkaidoService;

@Controller
public class MunkaidoController {

	@Autowired
	MunkaidoService mis;

	@GetMapping("munkaido")
	public String view(Model model) {
		model.addAttribute("munkaido", new Munkaido());
		List<Munkaido> munkaidok = mis.munkaidoLista();
		model.addAttribute("munkaidok", munkaidok);
		return "munkaido";
	}

	@PostMapping("munkaido")
	public String mentes(@ModelAttribute("munkaido") Munkaido munkaido) {
		mis.mentes(munkaido);

		return "redirect:munkaido";
	}
	
//	@RequestMapping(value = "munkaido_modositasa/{munkaido_id}", method = {RequestMethod.PUT, RequestMethod.GET, RequestMethod.POST})
//	public ModelAndView showEditProductPage(@PathVariable("munkaido_id") Long munkaido_id) {
//	    ModelAndView mav = new ModelAndView("munkaido_modositasa");
//	    Munkaido munkaido = mis.szerkeszt(munkaido_id);
//	    mav.addObject("munkaido", munkaido);
//	    
//	    return mav;
//	}
	
		
	@RequestMapping(value = "munkaido_modositasa/{munkaido_id}", method = { RequestMethod.PUT, RequestMethod.GET, RequestMethod.POST })
	public String updatePage(@PathVariable("munkaido_id") Long munkaido_id, Model model) {
	Munkaido munkaido = mis.szerkeszt(munkaido_id);
	model.addAttribute("munkaido", munkaido);
	return "munkaido_modositasa";
	}

	@RequestMapping(value = "{munkaido_id}", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String torles(Model model, @PathVariable("munkaido_id") Long munkaido_id) {
		mis.torles(munkaido_id);
		return "redirect:munkaido";

	}
}
