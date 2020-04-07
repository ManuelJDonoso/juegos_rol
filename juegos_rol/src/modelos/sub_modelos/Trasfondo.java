package modelos.sub_modelos;

public class Trasfondo {
private int valor;
private String nombre,descripcion;
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

public Trasfondo(int valor, String nombre, String descripcion) {

	this.valor = valor;
	this.nombre = nombre;
	this.descripcion = descripcion;
}

    @Override
    public String toString() {
        return nombre ;
    }


}
