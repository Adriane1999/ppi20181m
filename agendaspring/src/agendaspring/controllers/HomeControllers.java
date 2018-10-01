package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {
		
	@RequestMapping("/")
	public void home() {
		System.out.println("chamou o meu controller");
	}

}
