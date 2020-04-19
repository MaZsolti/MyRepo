package home.szakdolgozat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import home.szakdolgozat.entity.Dolgozo;
import home.szakdolgozat.service.DolgozoService;

@Controller
public class DolgozoController {
	
	@Autowired
	private DolgozoService ds;
	
	@RequestMapping(method = RequestMethod.GET, value = "dolgozo")
	public String view() {
		return "dolgozo";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "dolgozo")
	public String mentes(Dolgozo dolgozo) {
		ds.mentes(dolgozo);
		
		return "redirect:dolgozo";
	}
}
