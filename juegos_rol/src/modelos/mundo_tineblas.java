package modelos;

import java.util.ArrayList;

import modelos.sub_modelos.Atributos;
import modelos.sub_modelos.Combate;
import modelos.sub_modelos.Descripcion;
import modelos.sub_modelos.Experiencia;
import modelos.sub_modelos.Fuerza_voluntad;
import modelos.sub_modelos.Habilidades;
import modelos.sub_modelos.Historia;
import modelos.sub_modelos.Meritos_Defectos;
import modelos.sub_modelos.Posesiones;
import modelos.sub_modelos.Refugios;
import modelos.sub_modelos.Salud;
import modelos.sub_modelos.Sendas;
import modelos.sub_modelos.Trasfondos;

public class mundo_tineblas extends ficha{



	String Concepto;

	Atributos atributos;

	Habilidades habilidades;



	Descripcion descripcion;
	


	Historia historia;

	ArrayList<Refugios> refugio;

	Posesiones posesiones;

	Trasfondos trasfondo;
//TODO completar a partir de aqui
	Combate combate;

	Experiencia Exp;

	Sendas senda;

	Meritos_Defectos meritos_defectos;

	Fuerza_voluntad F_V;

	Salud salud;

	public mundo_tineblas(boolean jugador, String nombre_jug, String nom_personaje, String cronica, String juego,
			String concepto, Atributos atributos, Habilidades habilidades, Descripcion descripcion, Historia historia,
			ArrayList<Refugios> refugio, Posesiones posesiones, Trasfondos trasfondo, Combate combate, Experiencia exp,
			Sendas senda, Meritos_Defectos meritos_defectos, Fuerza_voluntad f_V, Salud salud) {
		super(jugador, nombre_jug, nom_personaje, cronica, juego);
		Concepto = concepto;
		this.atributos = atributos;
		this.habilidades = habilidades;
		this.descripcion = descripcion;
		this.historia = historia;
		this.refugio = refugio;
		this.posesiones = posesiones;
		this.trasfondo = trasfondo;
		this.combate = combate;
		Exp = exp;
		this.senda = senda;
		this.meritos_defectos = meritos_defectos;
		F_V = f_V;
		this.salud = salud;
	}

	
	
}
