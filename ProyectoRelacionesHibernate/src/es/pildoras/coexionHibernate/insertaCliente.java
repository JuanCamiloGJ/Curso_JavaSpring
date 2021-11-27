package es.pildoras.coexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class insertaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class).buildSessionFactory();

		Session miSession = miFactory.openSession();
		try {
			// crea obj cliente
			Cliente cliente = new Cliente("Angela", "Meneses", "En La finca");
			DetallesCliente detallesCliente = new DetallesCliente("www.spring.com", "3258467", "mi primer cliente");
			//asosciar los objetos
			cliente.setDetallesCliente(detallesCliente);//se le pasa el objeto al metodo 
			
			//esto guarda la informacion en las dos tablas relacionadas
			// comenzar transacion
			miSession.beginTransaction();
			// guaradar obj BBDD es como un insert, entonces el save es un insert
			miSession.save(cliente);
			// commit// aqui se le indica que lo que se quiere guardar quede, si no seria un
			// rollback
			miSession.getTransaction().commit();

			System.out.println("Registro insertado correctamente en BBDD");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			miFactory.close();
			miSession.close();
		}
	}

}
