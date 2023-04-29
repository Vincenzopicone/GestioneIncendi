package it.vincenzopicone.gestioneincendi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.vincenzopicone.gestioneincendi.model.CentroControlloProxy;
import it.vincenzopicone.gestioneincendi.model.ControlloSonda;
import it.vincenzopicone.gestioneincendi.model.Sonda;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class GestioneIncendiApplication {
	
	private static ControlloSonda controlloSondaRoma;
	private static ControlloSonda controlloSondaMilano;
	private static ControlloSonda controlloSondaNapoli;
	
	private static CentroControlloProxy controlloRoma;
	private static CentroControlloProxy controlloMilano;
	private static CentroControlloProxy controlloNapoli;
	

	public static void main(String[] args) {
		SpringApplication.run(GestioneIncendiApplication.class, args);
		
		Sonda Roma = new Sonda();
		Roma.setId(1l);
		Roma.setLatitude(204658);
		Roma.setLongitude(564738);
		Roma.setSmokeLevel(4);
		
		Sonda Milano = new Sonda();
		Milano.setId(2l);
		Milano.setLatitude(4658);
		Milano.setLongitude(5638);
		Milano.setSmokeLevel(7);
		
		Sonda Napoli = new Sonda();
		Napoli.setId(3l);
		Napoli.setLatitude(2048);
		Napoli.setLongitude(8338);
		Napoli.setSmokeLevel(3);
		
		controlloRoma = new CentroControlloProxy();
		controlloMilano = new CentroControlloProxy();
		controlloNapoli = new CentroControlloProxy();
		
		
		controlloSondaRoma = new ControlloSonda(1l, controlloRoma);
		controlloSondaMilano = new ControlloSonda(1l, controlloMilano);
		controlloSondaNapoli = new ControlloSonda(1l, controlloNapoli);
		
		Roma.addObserver(controlloSondaRoma);
		Milano.addObserver(controlloSondaMilano);
		Napoli.addObserver(controlloSondaNapoli);
		
		
		if(Roma.getSmokeLevel() > Roma.SMOKE_LIMIT) {
			log.info("Allarme incendio Roma");
			controlloSondaRoma.update(Roma);
		}
		
		if(Milano.getSmokeLevel() > Milano.SMOKE_LIMIT) {
			log.info("Allarme incendio Milano");
			controlloSondaMilano.update(Milano);
		}
		
		if(Napoli.getSmokeLevel() > Napoli.SMOKE_LIMIT) {
			log.info("Allarme incendio Napoli");
			controlloSondaNapoli.update(Napoli);
		}
		
		
		
		
	}

}
