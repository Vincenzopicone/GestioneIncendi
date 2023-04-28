package it.vincenzopicone.gestioneincendi.model;

public class CentroControlloProxy implements CentroControlloInterface {
	
	private CentroControlloInterface cenConInt;
	public CentroControlloProxy () {
		cenConInt = CentroControlloFactory.creaCentroControllo();
	}
	
	@Override
	public void rilevatore(InfoSonda info) {
		cenConInt.rilevatore(info);
		
	}

	

}
