package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorPage {
	
	
	@RequestMapping
	public String muestraPagina() {
		
		System.out.println("jre 11");
		return "paginaEjemplo";
		
	}
	
}
