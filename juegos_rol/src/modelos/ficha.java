package modelos;

public class ficha {
	private boolean jugador;
	private String nombre, personaje, cronica, juego;

	
	
	public ficha(boolean jugador, String nombre_jug, String nom_personaje, String cronica, String juego) {
	
		this.jugador = jugador;
		this.nombre = nombre_jug;
		this.personaje = nom_personaje;
		this.cronica = cronica;
		this.juego = juego;
	}

	public boolean isJugador() {
		return jugador;
	}

	public void setJugador(boolean jugador) {
		this.jugador = jugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPersonaje() {
		return personaje;
	}

	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}

	public String getCronica() {
		return cronica;
	}

	public void setCronica(String cronica) {
		this.cronica = cronica;
	}

	public String getJuego() {
		return juego;
	}

	public void setJuego(String juego) {
		this.juego = juego;
	}

}
