package ar.com.comunicar.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class FechaUtil {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");

	public static FechaUtil getInstance() {
		return new FechaUtil();
	}

	private FechaUtil() {
	}

	public Date getFechaActual() {
		return new Date(System.currentTimeMillis());
	}
	
	public String getFechaActualConFormato() {
		return sdf.format(getFechaActual());
	}

	public Integer getAnioFechaActual() {
		Date fechaHoy = new Date(System.currentTimeMillis());
		Calendar cal = Calendar.getInstance();
		cal.setTime(fechaHoy);
		int anio = cal.get(Calendar.YEAR);
		return anio;
	}

	
	public Integer getEjercicio(Date fecha) {		
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		return cal.get(Calendar.YEAR);
	}

	public String getFechaConFormato(Date fecha){
		if (fecha != null)
			return sdf.format(fecha);
		else
			return StringUtils.EMPTY;
	}
}
