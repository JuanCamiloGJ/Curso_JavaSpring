package es.pildoras.spring.mvc.validacionespersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String>{

	@Override
	public void initialize(CPostalMadrid elCodigo) {
		// TODO Auto-generated method stub
		prefijoCodigoMadrid=elCodigo.value();
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		
		boolean valCodigo;
		//pregunta si es diferente anull el campo y de serlo almacena un true o false con el metodo startsWtith ya que toma
		//el prefijo y lo evalua de que comience en 28
		if(arg0!=null) valCodigo=arg0.startsWith(prefijoCodigoMadrid);
		//si es null dejaria avanzar
		else valCodigo=true;
		
		return valCodigo;
	}
	private String prefijoCodigoMadrid;
}
