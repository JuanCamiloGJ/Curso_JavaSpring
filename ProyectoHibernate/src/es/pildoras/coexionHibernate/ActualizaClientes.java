package es.pildoras.coexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ActualizaClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 crear session factory, en confugure se le pasa como parametro el archivo de confuguracion de hibernate
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		//                                         //leer archivo de configuracion//Indicar clase con la que se trabaja//indica que construya la sesion                                                                        
		//crear obj session//ahora abrimos la session
		Session miSession= miFactory.openSession();
		try {
			
			
			//comenzar transacion
			miSession.beginTransaction();
			//con HQL 
			miSession.createQuery("DELETE Clientes where direccion ='En La Finca'").executeUpdate();
			
			
			//commit// aqui se le indica que lo que se quiere guardar quede, si no seria un rollback
			miSession.getTransaction().commit();
			
			System.out.println("Registro Eliminado correctamente en BBDD");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			miFactory.close();
			miSession.close();
		}
	
	}

}
