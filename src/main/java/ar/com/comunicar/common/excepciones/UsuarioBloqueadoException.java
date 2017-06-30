package ar.com.comunicar.common.excepciones;


public class UsuarioBloqueadoException extends RuntimeException {

	private static final long serialVersionUID = 2469219917876858065L;
	
	public UsuarioBloqueadoException(){
		
	}

	@Override
	public String getMessage() {
		return "El usuario ha sido bloqueado, consulte al administrador.";
	}
}
