package modelos.sub_modelos;

import java.util.ArrayList;

public class atributo {
	int valor = 0;
	String nombre;
	ArrayList<String> eq = new ArrayList<String>();

	public void addeq(String eq) {
		this.eq.add(eq);
	}

	public String geteq(int valor) {
		return eq.get(valor - 1);

	}

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

	public atributo(int valor, String nombre) {

		this.valor = valor;
		this.nombre = nombre;
	}

}
