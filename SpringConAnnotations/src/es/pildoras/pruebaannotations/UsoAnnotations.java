package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leer xml de configuracion
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pedir bean al contenedor 
		
		Empleados Antonio= contexto.getBean("ComercialExperimentado", Empleados.class);
		
		//usar beaan
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		//cerrar el contexto
		contexto.close();
	}

}
