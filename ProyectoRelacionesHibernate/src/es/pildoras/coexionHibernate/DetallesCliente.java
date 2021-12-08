package es.pildoras.coexionHibernate;

import javax.persistence.*;

@Entity // dice que va agenerar una entidad
@Table(name = "detalles_cliente") // a raiz de esta tabla en la bbdd por ello se nombra
public class DetallesCliente {

	public DetallesCliente() {

	}

	public DetallesCliente(String web, String tfno, String comentarios) {

		this.web = web;
		this.tfno = tfno;
		this.comentarios = comentarios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getTfno() {
		return tfno;
	}

	public void setTfno(String tfno) {
		this.tfno = tfno;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Cliente getElCliente() {
		return elCliente;
	}

	public void setElCliente(Cliente elCliente) {
		this.elCliente = elCliente;
	}
	
	
	@Override
	public String toString() {
		return "DetallesCliente [id=" + id + ", web=" + web + ", tfno=" + tfno + ", comentarios=" + comentarios + "]";
	}


	@Id // se especifica que es PK
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id") // aqui se especifica que esta variable hace referencia a la columna id de
							// nuestra bbdd
	private int id;
	@Column(name = "web")
	private String web;
	@Column(name = "tfno")
	private String tfno;
	@Column(name = "comentarios")
	private String comentarios;

	// conexion bilateral
	@OneToOne(mappedBy="detallesCliente", cascade=CascadeType.ALL)//elmappedBy hace referencia al datodetallesCliente creado en la clase cliente
	private Cliente elCliente;
}
