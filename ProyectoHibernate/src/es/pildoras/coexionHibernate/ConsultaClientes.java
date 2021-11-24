package es.pildoras.coexionHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultaClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 crear session factory, en confugure se le pasa como parametro el archivo de confuguracion de hibernate
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		//                                         //leer archivo de configuracion//Indicar clase con la que se trabaja//indica que construya la sesion                                                                        
		//crear obj session//ahora abrimos la session
		Session miSession= miFactory.openSession();
			
		try {
			//comenzar sesión
			miSession.beginTransaction();
			
			//consulta de clientes
			List<Clientes> misClientes= miSession.createQuery("FROM Clientes").getResultList();
			
			//mostrar los clientes
			
			recorreClientesConsultados(misClientes);
			//consulta: dame los Garcia//se crea un alias 'cl' que utiliza las variables del objeto CLientes en este caso apellidos
			misClientes= miSession.createQuery("FROM Clientes cl WHERE cl.apellidos='Garcia'").getResultList();
			
			recorreClientesConsultados(misClientes);
			
			//muestra los que viven en la finca o los que se llaman juan
			
			misClientes= miSession.createQuery("FROM Clientes cl WHERE cl.nombre='Juan' or cl.direccion='en la finca'").getResultList();
			System.out.println("muestra los que viven en la finca o los que se llaman juan");
			recorreClientesConsultados(misClientes);
			
			
			//commit
			
			miSession.getTransaction().commit();
			
		} finally {
			// TODO: handle finally clause
			miFactory.close();
			miSession.close();
		}
	}

	private static void recorreClientesConsultados(List<Clientes> misClientes) {
		for(Clientes unCliente: misClientes) {
			System.out.println(unCliente);
		}
	}

}
