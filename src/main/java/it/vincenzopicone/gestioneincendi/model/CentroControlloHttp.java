package it.vincenzopicone.gestioneincendi.model;

public class CentroControlloHttp implements CentroControlloInterface {

	private ComunicazioneHttp comHttp;
	private static final String url = "http://host/alarm";
	
	public CentroControlloHttp () {
		this.comHttp = new ComunicazioneHttp(url);
	}
	
	@Override
	public void rilevatore(InfoSonda info) {
		
		comHttp.sendGet(info.getIdSonda(), info.getLatitude(), info.getLongitude(), info.getSmokeLevel());
		
	}

}
