package modelos.sub_modelos;

public class Trasfondo {
private int valor;
private String nombre,descripcion, descripcion_espandida="";
public int getValor() {
	return valor;
}
public void setValor(int valor) {
	this.valor = valor;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public String getDescripcion_espandida() {
	return descripcion_espandida;
}
public void setDescripcion_espandida(String descripcion_espandida) {
	this.descripcion_espandida = descripcion_espandida;
}
public Trasfondo(int valor, String nombre, String descripcion) {

	this.valor = valor;
	this.nombre = nombre;
	this.descripcion = descripcion;
}


}
