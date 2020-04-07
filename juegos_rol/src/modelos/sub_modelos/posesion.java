package modelos.sub_modelos;

public class posesion {
	private String nombre, lugar, descripcion;
	private int cantidad;

	/**
	 * 
	 * @param nombre nombre articulo
	 * @param cantidad cantidad articulos
	 * @param lugar lugar donde esta guardado
	 * @param descripcion descripcion del articulo
	 */
	public posesion(String nombre ,int cantidad, String lugar, String descripcion) {
	
		this.nombre = nombre;
		this.lugar = lugar;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}

	public posesion(String nombre ,int cantidad,  String descripcion) {
		
		this.nombre = nombre;
		this.lugar ="portado";
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}
	public posesion(String nombre , String lugar, String descripcion) {
		
		this.nombre = nombre;
		this.lugar = lugar;
		this.descripcion = descripcion;
		this.cantidad = 1;
	}
	
	public posesion(String nombre , String descripcion) {
		
		this.nombre = nombre;
		this.lugar = "portado";
		this.descripcion = descripcion;
		this.cantidad = 1;
	}
	
	public posesion(String nombre ) {
		
		this.nombre = nombre;
		this.lugar = "portado";
		this.descripcion = "";
		this.cantidad = 1;
	}
	
	public posesion(String nombre ,int cantidad) {
		
		this.nombre = nombre;
		this.lugar ="portado";
		this.descripcion = "";
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
