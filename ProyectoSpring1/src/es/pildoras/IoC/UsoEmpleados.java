package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	// CREACI�N DE OBJETOS DE TIPO EMPLEAADO
		Empleados empleado1= new DirectorEmpleado();
		
		//USO OBJETOS CREADOS
		System.out.println(empleado1.getTareas());
		*/
		
		
		//1. Cargar archivo XML
		
		//ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//2 Pedir el Bean
		
		//Empleados Juan=contexto.getBean("miEmpleado", Empleados.class);
		
		//3 Utilizar el Bean
		
		/*System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		*/
		//4. cerrar xml
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleados Maria=contexto.getBean("miSecretarioEmpleado", Empleados.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		contexto.close();
	}

}
