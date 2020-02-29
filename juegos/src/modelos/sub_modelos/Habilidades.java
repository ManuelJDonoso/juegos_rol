package modelos.sub_modelos;

import java.util.ArrayList;

public class Habilidades {
	private int ValorTalentos, ValorTecnicas, ValorMentales;
	private ArrayList<habilidad> talentos = new ArrayList<habilidad>();
	private ArrayList<habilidad> tecnicas = new ArrayList<habilidad>();
	private ArrayList<habilidad> mentales = new ArrayList<habilidad>();

	public int getValorTalentos() {
		return ValorTalentos;
	}

	public int getValorTecnicas() {
		return ValorTecnicas;
	}

	public int getValorMentales() {
		return ValorMentales;
	}

	public void calTalentos() {
		ValorTalentos = 0;

		for (habilidad e : talentos) {
			ValorTalentos = +e.getValor();
		}
	}

	public void calTecnicas() {
		ValorTalentos = 0;

		for (habilidad e : tecnicas) {
			ValorTecnicas = +e.getValor();
		}
	}

	public void calSociales() {
		ValorTalentos = 0;

		for (habilidad e : mentales) {
			ValorMentales = +e.getValor();
		}
	}
}
