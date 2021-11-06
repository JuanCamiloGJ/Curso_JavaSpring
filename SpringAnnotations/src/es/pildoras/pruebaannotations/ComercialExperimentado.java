package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

//no tiene que concidir con el nombre de la clase
@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, y vender más!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el comercial.";
	}

}
