package modelos.sub_modelos;

import java.util.ArrayList;


public class Posesiones {
	private ArrayList<posesion> portado = new ArrayList<posesion>();
	private ArrayList<posesion> poseido = new ArrayList<posesion>();
	private ArrayList<posesion> aux = new ArrayList<posesion>();

	public posesion getPosesionPortadoIndex(int posicion) {
		return portado.get(posicion - 1);
	}

	public posesion getPosesionPoseidoIndex(int posicion) {
		return poseido.get(posicion - 1);
	}

	public posesion getaux(int posicion) {
		return aux.get(posicion-1);
	}
	
	// TODO comprobar
 	public void busquedasNombre(String palabra) {
		String p = palabra;
		String p2, p3;
		aux.clear();
		boolean com = false;

		int i = p.length();
		for (posesion e : portado) {
			p2 = e.getNombre();

			int j = 0, k = p2.length();
			for (int z = i; z > e.getNombre().length(); z++) {

				p3 = p2.substring(j, k);
				com = p.equalsIgnoreCase(p3);
				
				if (com) {
					aux.add(e);
				}
				j++;
				k++;
			}

		}
	}

	public void addPosesionPortado(String nombre) {
		portado.add(new posesion(nombre));
	}

	public void addPosesionPortado(String nombre, int cantidad) {
		portado.add(new posesion(nombre, cantidad));
	}

	public void addPosesionPortado(String nombre, String descripcion) {
		portado.add(new posesion(nombre, descripcion));
	}

	public void addPosesionPortado(String nombre, int cantidad, String descripcion) {
		portado.add(new posesion(nombre, cantidad, descripcion));
	}

	public void addPosesionPoseido(String nombre, int cantidad, String lugar, String descripcion) {
		poseido.add(new posesion(nombre, cantidad, lugar, descripcion));
	}

	public void addPosesionPoseido(String nombre, String lugar, String descripcion) {
		poseido.add(new posesion(nombre, lugar, descripcion));
	}

}
