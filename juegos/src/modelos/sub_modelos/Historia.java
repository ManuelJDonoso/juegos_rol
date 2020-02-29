package modelos.sub_modelos;

public class Historia {
	private String preludio,objetivos;

	public String getPreludio() {
		return preludio;
	}

	public void setPreludio(String preludio) {
		this.preludio = preludio;
	}

	public String getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}

	public Historia(String preludio, String objetivos) {
	
		this.preludio = preludio;
		this.objetivos = objetivos;
	}
	
	

}
