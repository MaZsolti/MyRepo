package home.szakdolgozat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import home.szakdolgozat.entity.MTerulet;
import home.szakdolgozat.entity.Munkakor;
import home.szakdolgozat.entity.Munkarend;
import home.szakdolgozat.entity.Muszak;
import home.szakdolgozat.service.MTeruletService;
import home.szakdolgozat.service.MunkakorService;
import home.szakdolgozat.service.MunkarendService;
import home.szakdolgozat.service.MuszakService;

@Controller
public class MunkateruletController {
	
	@Autowired
	private MTeruletService mts;
	
	@Autowired
	private MunkarendService mrs;
	
	@Autowired
	private MuszakService ms;
	
	@Autowired
	private MunkakorService mks;
	
	
	@RequestMapping(method = RequestMethod.GET, value = "munkaterulet")
	public String view(Model model) {
		model.addAttribute("munkaterulet", new MTerulet());
		
		List<Munkarend> munkarendek = mrs.munkarendLista();
		model.addAttribute("munkarendek", munkarendek);
		
		List<Muszak> muszakok = ms.muszakLista();
		model.addAttribute("muszakok", muszakok);
		
		List<Munkakor> munkakorok = mks.munkakorLista();
		model.addAttribute("munkakorok", munkakorok);
		
		return "munkaterulet";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "munkaterulet")
	public String mentes(MTerulet mterulet, Long munkarend_id) {
		mts.mentes(mterulet, munkarend_id);
		
		return "redirect:munkaterulet";
	}
	
		
	
	
}
