package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	// CREACIÓN DE OBJETOS DE TIPO EMPLEAADO
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
		SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pablo=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		System.out.println("Email: "+Maria.getEmail());
		System.out.println(Maria.getNombreEmpresa());
		System.out.println("Email Pablo: "+Pablo.getEmail());
		
		System.out.println("====================================================================");
		DirectorEmpleado Juan = contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println("Email Juan: "+Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
		
		
		
		contexto.close();
	}

}
