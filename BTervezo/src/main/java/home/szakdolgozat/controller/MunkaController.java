package home.szakdolgozat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import home.szakdolgozat.entity.MTerulet;
import home.szakdolgozat.entity.Munkarend;
import home.szakdolgozat.entity.Muszak;
import home.szakdolgozat.service.MTeruletService;
import home.szakdolgozat.service.MunkarendService;
import home.szakdolgozat.service.MuszakService;

@Controller
public class MunkaController {
	
	@Autowired
	private MTeruletService mts;
	@Autowired
	private MunkarendService mrs;
	@Autowired
	private MuszakService ms;
	
	@RequestMapping(method = RequestMethod.GET, value = "munka")
	public String view() {
		return "munka";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "munka")
	public String mentes(MTerulet mterulet) {
		mts.mentes(mterulet);
		
		return "redirect:munka";
	}
	
		
	@RequestMapping(method = RequestMethod.POST, value = "munka")
	public String mentes(Munkarend mrend) {
		mrs.mentes(mrend);
		
		return "redirect:munka";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "munka")
	public String mentes(Muszak mszak) {
		ms.mentes(mszak);
		
		return "redirect:munka";
	}
	
}
