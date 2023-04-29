package it.vincenzopicone.gestioneincendi.model;

import lombok.Data;


@Data

public class CentroControlloFactory {
	
	public static CentroControlloInterface creaCentroControllo() {
		return new CentroControllo();
	}
	
}
