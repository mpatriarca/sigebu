package ar.com.comunicar.common.dto;

import java.io.Serializable;

public class CandidatoDTO implements Serializable {

	private static final long serialVersionUID = -4008543053104809575L;

	private String apellido;
	private String dni;
	private String estado;
	private Boolean entrevistado = false;

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Boolean getEntrevistado() {
		return entrevistado;
	}

	public void setEntrevistado(Boolean entrevistado) {
		this.entrevistado = entrevistado;
	}

}
