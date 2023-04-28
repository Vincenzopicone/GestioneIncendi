package it.vincenzopicone.gestioneincendi.model;

public class CentroControlloFactory {
	
	private static int selezionaCentroControllo = 0;
	
	public static CentroControlloInterface creaCentroControllo() {
		
		switch(selezionaCentroControllo) {
		case 0:
			return new CentroControlloHttp();
		default:
			throw new RuntimeException("Centro controllo non supportato");
		}
	}
	
	public static int getSelectCentroControllo() {
		return selezionaCentroControllo;
	}

	public static void setSelectCentroControllo (int select) {
		selezionaCentroControllo = select;
	}
}
