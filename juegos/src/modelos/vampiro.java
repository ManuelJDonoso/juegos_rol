package modelos;

import java.util.ArrayList;

import modelos.sub_modelos.Clan;
import modelos.sub_modelos.Generacion;
import modelos.sub_modelos.Rituales;
import modelos.sub_modelos.Terrenos_Ali;
import modelos.sub_modelos.Vinculo;
import modelos.sub_modelos.nat_con;

public class vampiro {
//TODO a partir de aqui
	Clan clan;
	
	Generacion generacion;
	
	String sire;
	
	ArrayList<Vinculo>Vinculo_a;
	
	ArrayList<Vinculo>Vinculos;
	
	Rituales rituales;
	
	nat_con naturaleza, conducta;
	
	Terrenos_Ali TerrenosALimentacion;
}
