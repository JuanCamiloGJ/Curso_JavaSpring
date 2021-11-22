package es.pildoras.spring.mvc.validacionespersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
//se establece la clase donde esta la logica de validación
@Constraint(validatedBy=CPostalMadridValidacion.class)//futura clase que contendra la logica de la validación
@Target({ElementType.METHOD, ElementType.FIELD})// a que se le va a aplicar la validación, Metodos o campos
@Retention(RetentionPolicy.RUNTIME) // chequea la anotación en tiempo de ejecución
public @interface CPostalMadrid {
	//definir el c postal por defecto
		public String value() default "28";
	//definir el mensaje de error
		public String message() default "El codigo postal debe comenzar por 28";
	//definir los grupos
		Class<?>[] groups() default{};
	//definir los payloads
		Class<? extends Payload>[] payload() default {};
}
 