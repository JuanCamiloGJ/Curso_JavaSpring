package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

//no tiene que concidir con el nombre de la clase
@Component

public class ComercialExperimentado implements Empleados, InitializingBean, DisposableBean{


	

	@Override
	public String getTareas() {
		
		return "Vender, y vender más!";
	}

	@Override
	public String getInforme() {
		
		//return "Informe generado por el comercial.";
		return nuevoInforme.getInformeFinanciero();
	}

	@Autowired
	@Qualifier("informeFinancieroTrim2")
	private CreacionInformeFinanciero nuevoInforme;

	
	
	
	@Override
	
	//reemplaza el metodo init
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ejecutando antes de la destruccion");
	}
	//reemplaza el metodo destroy
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ejecutado tras creacion de bean");
	}


	
}
