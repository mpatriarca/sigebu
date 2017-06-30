package ar.com.comunicar.common.dto;

import java.io.Serializable;
import java.util.List;

import ar.com.comunicar.common.candidato.ExperienciaLaboral;
import ar.com.comunicar.common.candidato.FormacionAlcanzada;
import ar.com.comunicar.common.candidato.FormacionEn;

public class BusquedaCandidatoDTO implements Serializable {

	private static final long serialVersionUID = -5826518007856127360L;

	private List<ExperienciaLaboral> experienciaLaboral;
	private List<FormacionAlcanzada> formacionAlcanzada;
	private List<FormacionEn> formacionEn;
	private String codigoPostal;
	
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public String getCodigoPostal() {
		return codigoPostal;
	}

	public List<ExperienciaLaboral> getExperienciaLaboral() {
		return experienciaLaboral;
	}

	public void setExperienciaLaboral(
			List<ExperienciaLaboral> experienciaLaboral) {
		this.experienciaLaboral = experienciaLaboral;
	}

	public void setFormacionAlcanzada(
			List<FormacionAlcanzada> formacionAlcanzada) {
		this.formacionAlcanzada = formacionAlcanzada;
	}

	public List<FormacionAlcanzada> getFormacionAlcanzada() {
		return formacionAlcanzada;
	}

	public List<FormacionEn> getFormacionEn() {
		return formacionEn;
	}

	public void setFormacionEn(List<FormacionEn> formacionEn) {
		this.formacionEn = formacionEn;
	}

}
