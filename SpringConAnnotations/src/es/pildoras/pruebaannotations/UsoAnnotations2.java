package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//leer xml de configuracion
		
			//ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		//leer el class de configuraci�n
		
			AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//pedir bean al contenedor
		
		Empleados Antonio= contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados Lucia= contexto.getBean("comercialExperimentado", Empleados.class);
		
		//apuntan al mismo objeto en memoria
		
		if(Antonio==Lucia) {
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		}else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		}
		//cerrar contexto
		contexto.close();
	}

}