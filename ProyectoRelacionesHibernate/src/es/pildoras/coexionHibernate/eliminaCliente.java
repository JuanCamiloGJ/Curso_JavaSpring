package es.pildoras.coexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class eliminaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class).buildSessionFactory();

		Session miSession = miFactory.openSession();
		try {

			// comenzar transacion
			miSession.beginTransaction();

			// obtener el cliente que vamos a eliminar.
			Cliente elCliente = miSession.get(Cliente.class, 2);// almacenamos el cliente con id 2 en nuestro objeto
																// cliente mapeado
			// si no encuentra al cliente se almacena null

			if (elCliente != null) {
				// indicamos que borre el objeto cliente
				System.out.println("voy a eliminarr al cliente " + elCliente.getNombre());
				miSession.delete(elCliente);
			}

			// rollback
			miSession.getTransaction().commit();

			if (elCliente != null)
				System.out.println("Registro eliminado correctamente en BBDD");
			else
				System.out.println("Nada que eliminar");
				
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			miFactory.close();
			miSession.close();
		}
	}

}
