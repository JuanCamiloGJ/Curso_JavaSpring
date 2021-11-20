package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/secundario")
public class TirarControlador {
	@RequestMapping("/otroProcesoFormulario")
	// public String otroProcesoFormulario(HttpServletRequest request, Model modelo)
	// {
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
		// String nombre = request.getParameter("nombreAlumno");

		nombre += " ";

		String mensajefinal = "¿Quien es el mejor alumno? " + nombre;

		// agregando info al modelo

		modelo.addAttribute("mensajeClaro", mensajefinal);

		return "HolaAlumnosSpring";

	}
}
