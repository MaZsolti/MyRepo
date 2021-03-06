package home.szakdolgozat.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import home.szakdolgozat.entity.MTerulet;
import home.szakdolgozat.service.MTeruletService;

@Controller
public class MunkateruletController {
	
	@Autowired
	private MTeruletService mts;
	
			
	@RequestMapping(method = RequestMethod.GET, value = "munkaterulet")
	public String view(Model model) {
		model.addAttribute("munkaterulet", new MTerulet());
		List<MTerulet> munkateruletek = mts.munkateruletLista();
		model.addAttribute("munkateruletek", munkateruletek);
		return "munkaterulet";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "munkaterulet")
	public String mentes(MTerulet mterulet) {
		mts.mentes(mterulet);
		
		return "redirect:munkaterulet";
	}
	
		
	
	
}
