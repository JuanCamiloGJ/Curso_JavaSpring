package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cargar xml de configuración
		
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		//obtencion del bean
		
		Empleados Juan = contexto.getBean("miDirectorEmpleado", Empleados.class);
		System.out.println(Juan.getInforme());
		//cerrar contexto
		contexto.close();
	}

}
