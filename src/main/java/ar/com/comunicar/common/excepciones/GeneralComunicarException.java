package ar.com.comunicar.common.excepciones;

/**
 * Clase que representa una excepcion
 *
 */
public class GeneralComunicarException extends Exception {

	private static final long serialVersionUID = 5609401156630852490L;
	
	private String mensaje;
	
	public GeneralComunicarException(String mensaje){
		this.mensaje = mensaje;
	}
	
	@Override
	public String getMessage() {
		return "Ha ocurrido un error: " + this.mensaje;
	}
}