package es.pildoras.spring.mvc.validacionespersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
//se establece la clase donde esta la logica de validaci�n
@Constraint(validatedBy=CPostalMadridValidacion.class)//futura clase que contendra la logica de la validaci�n
@Target({ElementType.METHOD, ElementType.FIELD})// a que se le va a aplicar la validaci�n, Metodos o campos
@Retention(RetentionPolicy.RUNTIME) // chequea la anotaci�n en tiempo de ejecuci�n
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
 