package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;


public class InformeFinancieroDtoCompras implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Informe financiero del departamento de compras a�o 2018";
	}

}
