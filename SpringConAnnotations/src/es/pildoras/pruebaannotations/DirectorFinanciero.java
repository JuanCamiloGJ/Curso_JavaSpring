package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class DirectorFinanciero implements Empleados {
	
	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y direccion de las operaciones financieras  de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	
	
	
	
	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	private CreacionInformeFinanciero informeFinanciero;
}
