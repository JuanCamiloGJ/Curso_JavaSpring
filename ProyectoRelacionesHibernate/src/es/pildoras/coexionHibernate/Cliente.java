package es.pildoras.coexionHibernate;

import javax.persistence.*;

@Entity // dice que va agenerar una entidad
@Table(name = "cliente") // a raiz de esta tabla en la bbdd por ello se nombra
public class Cliente {

	public Cliente() {

	}

	public Cliente(String nombre, String apellido, String direccion) {

		this.nombre = nombre;
		this.apellido = apellido;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public DetallesCliente getDetallesCliente() {
		return detallesCliente;
	}

	public void setDetallesCliente(DetallesCliente detallesCliente) {
		this.detallesCliente = detallesCliente;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// recordemos que es un union unilateral ya no bilateral entonces
	// primero creamos un campo más de tipo DetallesCliente
	@OneToOne(cascade = CascadeType.ALL) // se establece que es uno a uno y el tipo de cascada
	@JoinColumn(name = "id") // luego se especifica mediante el join la columna relacionada como foranea
	private DetallesCliente detallesCliente;

	@Id // se especifica que es PK
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id") // aqui se especifica que esta variable hace referencia a la columna id de
							// nuestra bbdd
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "direccion")
	private String direccion;
}
