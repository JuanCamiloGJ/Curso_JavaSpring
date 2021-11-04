package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		
		//cargar del XML de configuración
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
	
		//petición de beans al contenedor Spring
		
		SecretarioEmpleado Maria= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		SecretarioEmpleado Pedro= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
	
		SecretarioEmpleado Manolo= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		SecretarioEmpleado Ana= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		SecretarioEmpleado Juan= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		//nos debe dar la misma direccion de memoria
		System.out.println(Maria);
		System.out.println(Pedro);
		System.out.println(Manolo);
		System.out.println(Ana);
		System.out.println(Juan);
		
		if(Maria==Pedro) System.out.println("Apunta al mismo objeto");
		else System.out.println("No se trata del mismo objeto");
		
	
	}
	


}
