package it.vincenzopicone.gestioneincendi.model;
import org.slf4j.*;


public class ComunicazioneHttp extends CanaleComunicazione{
	
	private static final Logger Logger = LoggerFactory.getLogger(ComunicazioneHttp.class);
	private String urlNotifica;
	
	public ComunicazioneHttp (String url) {
		this.urlNotifica = url;
	}
	
	public void sendGet(Long idSonda, double latitude, double longitude, int smokeLevel) {
		Logger.info("Allarme sonda: {} - lat: {} lon: {} - Livello fumo: {}", idSonda, latitude, longitude, smokeLevel);
		
		String url = urlNotifica + "?=idsonda=" + idSonda + "&lat=" + latitude + "&lon=" + longitude + "&smokelevel=" + smokeLevel;
		Logger.info("Call: {}", url);
	}

}
