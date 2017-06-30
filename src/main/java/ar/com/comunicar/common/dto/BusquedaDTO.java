package ar.com.comunicar.common.dto;

import java.io.Serializable;
import java.util.Date;

public class BusquedaDTO implements Serializable {

	private static final long serialVersionUID = 3023018418824984530L;
	private String nombre;
	private Long clienteId;
	private Date fechaInicio;
	private Date fechaFin;
	private String estado;
	
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
