package modelos.sub_modelos;

import java.util.ArrayList;

public class Atributos {
	private int ValorFisico, ValorSociales, ValorMentales;

	private ArrayList<atributo> fisicos = new ArrayList<atributo>();
	private ArrayList<atributo> sociales = new ArrayList<atributo>();
	private ArrayList<atributo> mentales = new ArrayList<atributo>();

	public int getValorFisico() {
		return ValorFisico;
	}

	public int getValorSociales() {
		return ValorSociales;
	}

	public int getValorMentales() {
		return ValorMentales;
	}

	public void calFisico() {
		ValorFisico = 0;
		for (atributo e : fisicos) {
			ValorFisico = +e.getValor();
		}

	}

	public void calsociales() {
		ValorSociales = 0;
		for (atributo e : sociales) {
			ValorSociales = +e.getValor();
		}
	}

	public void calMentales() {
		ValorMentales = 0;
		for (atributo e : mentales) {
			ValorMentales = +e.getValor();

		}
	}

}
