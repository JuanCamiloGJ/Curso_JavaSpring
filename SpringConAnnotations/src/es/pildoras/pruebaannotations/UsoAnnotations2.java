package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//leer xml de configuracion
		
			//ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		//leer el class de configuración
		
			AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//pedir bean al contenedor
		
		Empleados pedro= contexto.getBean("directorFinanciero", Empleados.class);
		//apuntan al mismo objeto en memoria
		System.out.println("Informe de pedro:");
		System.out.println(pedro.getInforme());
		System.out.println(pedro.getTareas());
	DirectorFinanciero pedro2= contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println("Casteado: "+((DirectorFinanciero)pedro).getEmail());
		
		System.out.println("Sin casteo: "+pedro2.getEmail());
		//cerrar contexto
		contexto.close();
	
	}
}

