package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	//creación de campo tipo CreaciónInforme(interfaz)
	
	private CreacionInformes informeNuevo;
	//creación de ocnstructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo=informeNuevo;
	}
	
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: "+ informeNuevo.getInforme();
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	
	//método init. Ejcutar tareas antes de que el bean este disponible
	public void metodoInicial() {
		
		System.out.println("Dentro del metodo init. aqui irian las tareas a ejecutar "
				+ "antes de que elbean este listo");
		
		
	}
	//meétodo destroy. ejecutar tareas despúes de que el bean haya sido utilizado
	
	public void metodoFinal() {
		
		System.out.println("Dentro del metodo destroy. aqui irian las tareas a ejecutar "
				+ "después de utilizar el bean");
		
		
	}
	
	
	private String email;
	private String nombreEmpresa;
}
