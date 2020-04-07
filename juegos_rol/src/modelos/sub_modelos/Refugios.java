package modelos.sub_modelos;

public class Refugios {
	
	private String localizacion, descripcion;

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Refugios(String localizacion, String descripcion) {
		
		this.localizacion = localizacion;
		this.descripcion = descripcion;
	}

	public Refugios(String localizacion) {
		
		this.localizacion = localizacion;
	}
	

}
