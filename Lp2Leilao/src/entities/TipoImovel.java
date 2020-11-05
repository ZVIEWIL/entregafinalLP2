package entities;

public enum TipoImovel {
	APARTAMENTO("Apartamento"), 
	TERRENO("Terreno"), 
	CASA("Casa"), 
	EDOMERCIAL("Edifício Comercial");
	
	private final String tipoImovel;
	
	// constructor
	private TipoImovel(String tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	
	// public
	public String getTipoImovel() {
		return tipoImovel;
	}
}

