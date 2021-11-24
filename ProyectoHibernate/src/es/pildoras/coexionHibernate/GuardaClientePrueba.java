package es.pildoras.coexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GuardaClientePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 crear session factory, en confugure se le pasa como parametro el archivo de confuguracion de hibernate
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		//                                         //leer archivo de configuracion//Indicar clase con la que se trabaja//indica que construya la sesion                                                                        
		//crear obj session//ahora abrimos la session
		Session miSession= miFactory.openSession();
		try {
			//crea obj clientes
			Clientes cliente= new Clientes("Angela", "Meneses", "En La finca");
			//comenzar transacion
			miSession.beginTransaction();
			//guaradar obj BBDD es como un insert, entonces el save es un insert
			miSession.save(cliente);
			//commit// aqui se le indica que lo que se quiere guardar quede, si no seria un rollback
			miSession.getTransaction().commit();
			
			System.out.println("Registro insertado correctamente en BBDD");
			
			//Lectura de registro
			//iniciamos una nueva transaccion ya que la anterior se cierra al hacer el commit
			miSession.beginTransaction();
			// se obtiene el ID del objeto cliente
			System.out.println("Lectura del registro con ID: "+cliente.getId());
			//se crea un nuevo objeto cliente, para drescatar la información (SELECT de SQL)
			Clientes clienteInsertado= miSession.get(Clientes.class, cliente.getId());//sele pide la clase y el ID
			
			System.out.println("Registro: "+ clienteInsertado);
			
			miSession.getTransaction().commit();
			
			System.out.println("Terminado!");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			miFactory.close();
			miSession.close();
		}
	
	}

}
