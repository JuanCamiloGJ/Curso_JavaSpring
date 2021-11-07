package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	
	//definir el bean para InformeFinancieroDtoCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {// será el ID del bean inyectado
		
		return new InformeFinancieroDtoCompras();
		
	}
	//definir el bean para DirectorRFinanciero e inyectar dependencias

	@Bean //el nombre de este metodo es el nombre del bean 
	public Empleados directorFinanciero() {
		
		return new DirectorFinanciero(new InformeFinancieroDtoCompras());
	
	}
	
}
