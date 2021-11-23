package es.pildoras.coexionHibernate;

import javax.persistence.*;

@Entity //dice que va agenerar una entidad
@Table(name="clientes")//a raiz de esta tabla en la bbdd por ello se nombra
public class Clientes {
	
	
	
	public Clientes() {
		
	}
	
	
	
	public Clientes(String nombre, String apellidos, String direccion) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ "]";
	}




	@Id // se especifica que es PK
	@Column(name="id")//aqui se especifica que esta variable hace referencia a la columna id de nuestra bbdd
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="direccion")
	private String direccion;
}
