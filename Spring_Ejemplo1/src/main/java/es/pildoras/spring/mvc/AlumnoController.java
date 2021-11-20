package es.pildoras.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	//este metodo se encarga de recortar los espacios en blanco que pueden ir de más en los campos de texto
	@InitBinder //indicamos que es el metodo intermedio
	public void miBinder(WebDataBinder binder) {//siempre debe recibir como parametro este objeto
		StringTrimmerEditor recortaEspaciosBlanco= new StringTrimmerEditor(true);//hay dos constructores revisar api spring
		// queremos que trebaje en la clase string y el objeto trimmer editor
		binder.registerCustomEditor(String.class, recortaEspaciosBlanco);
	
	}
	
	
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {
		
		Alumno elAlumno=new Alumno();
		modelo.addAttribute("elAlumno", elAlumno);
		
		
		return "alumnoRegistroFormulario";
		
	}
	@RequestMapping("/procesarFormulario")//recibe como parametro el modelo, y para ello utilizamos
	//la etiqueta que se muestra con el nombre identificativo con el fin de recuperar esa informacion.
	public String procesarFormulario(@Valid @ModelAttribute("elAlumno")Alumno elAlumno, BindingResult resultadoValidacion) {//y esa información se guarda en el objeto alumno.
		
		if(resultadoValidacion.hasErrors()) {
			return "alumnoRegistroFormulario";
		}else {
		
		return "confirmacionRegistroAlumno";
		}
	}
}
