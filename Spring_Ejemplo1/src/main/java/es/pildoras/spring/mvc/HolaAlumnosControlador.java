package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HolaAlumnosControlador {
	//peticion
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { // propociona el formulario
		
		
		return "HolaAlumnosFormulario";
		
	}
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
		
		
	}
	@RequestMapping("/otroProcesoFormulario")
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		
		String nombre= request.getParameter("nombreAlumno");
		
		nombre+= " es el mejor alumno.";
		
		String mensajefinal="¿Quien es el mejor alumno? "+ nombre;
		
		//agregando info al modelo
		
		modelo.addAttribute("mensajeClaro", mensajefinal);
		
		
		return "HolaAlumnosSpring";
		
	}
}
