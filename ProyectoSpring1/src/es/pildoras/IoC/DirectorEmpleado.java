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

}
