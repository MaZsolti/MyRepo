package home.szakdolgozat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import home.szakdolgozat.entity.Munkakor;

import home.szakdolgozat.service.MunkakorService;

@Controller
public class MunkakorController {
	@Autowired
	MunkakorService mks;

	@GetMapping("munkakor")
	public String view(Model model) {
		model.addAttribute("munkakor", new Munkakor());
		List<Munkakor> munkakorok = mks.munkakorLista();
		model.addAttribute("munkakorok", munkakorok);
		return "munkakor";
	}

	@PostMapping("munkakor")
	public String mentes(@ModelAttribute("munkaido") Munkakor munkakor) {
		mks.mentes(munkakor);
		
		return "redirect:munkakor";
	}

}