package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el Secretario: "+ informeNuevo.getInforme();
	}
	
	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}


	private CreacionInformes informeNuevo;
}
