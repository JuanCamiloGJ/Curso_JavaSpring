package es.pildoras.coexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObtenerCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class).buildSessionFactory();

		Session miSession = miFactory.openSession();
		try {

			// comenzar transacion
			miSession.beginTransaction();
			//obtener obj detalles cliente
			// obtener el detallescliente que vamos a encontrar.
			DetallesCliente detallesDeCliente = miSession.get(DetallesCliente.class, 3);// almacenamos el detallescliente con id 1 en nuestro objeto
																
			System.out.println(detallesDeCliente);
			
			System.out.println(detallesDeCliente.getElCliente());//obtenemos el objeto cliente mediente el metodo que hicimos en detallescliente
			//ahora borramos:
			
			System.out.println("ahora vamos a eliminar en cascada");
			//el session es el que hace todo el trabajo
			miSession.delete(detallesDeCliente);
			// rollback
			miSession.getTransaction().commit();

			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			miFactory.close();
			miSession.close();
		}
	}

}
