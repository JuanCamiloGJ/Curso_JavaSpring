package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {
		
		Alumno elAlumno=new Alumno();
		modelo.addAttribute("elAlumno", elAlumno);
		
		
		return "alumnoRegistroFormulario";
		
	}
	@RequestMapping("/procesarFormulario")//recibe como parametro el modelo, y para ello utilizamos
	//la etiqueta que se muestra con el nombre identificativo con el fin de recuperar esa informacion.
	public String procesarFormulario(@ModelAttribute("elAlumno")Alumno elAlumno) {//y esa información se guarda en el objeto alumno.
		
		
		
		return "confirmacionRegistroAlumno";
		
	}
}
