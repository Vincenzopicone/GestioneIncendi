package it.vincenzopicone.gestioneincendi.model;
import org.slf4j.*;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Comunicazione extends CanaleComunicazione{
	
	private static final Logger Logger = LoggerFactory.getLogger(Comunicazione.class);

	public void sendInfo(Long idSonda, double latitude, double longitude, int fumo) {
		Logger.info("La sonda: " + idSonda + " Lat:" +  latitude + " Long" + longitude + " Livello fumo: " + fumo);

	}

}
