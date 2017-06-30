package ar.com.comunicar.common.utils;

import java.io.File;

import ar.com.comunicar.common.excepciones.ArchivoComunicarException;

public class ArchivoUtil {

	public static ArchivoUtil getInstance() {
		return new ArchivoUtil();
	}

	private ArchivoUtil() {
	}

	public boolean crearDirectorio(String pathArchivo, String nombreArchivo)
			throws ArchivoComunicarException {
		File ruta = new File(pathArchivo);
		File archivo = new File(ruta, nombreArchivo);
		// se comprueba si el fichero existe o no
		if (!archivo.exists()) {
			// se comprueba si la ruta existe o no
			if (!ruta.exists()) {
				// se crea la ruta. Si se ha creado correctamente
				if (!ruta.mkdir()) {
					throw new ArchivoComunicarException(
							"No se ha podido crear el directorio en el servidor");
				} else {
					return true;
				}
			}
		} else { // el fichero existe.
			return archivo.delete();
		}
		return true;
	}

	public boolean eliminarArchivo(String pathArchivo, String nombreArchivo)
			throws ArchivoComunicarException {
		try {
			File archivo = new File(pathArchivo);
			if (archivo.exists()) {
				return archivo.delete();
			} else {
				throw new ArchivoComunicarException(
						"No se encontro el archivo a eliminar.");
			}
		} catch (Exception e) {
			throw new ArchivoComunicarException("No se puede borrar el archivo.");
		}
	}

}
