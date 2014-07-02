package ssd_adena_input;

public class J2reldused {
	
	public static void start() {
		if(MAIN.GLOBAL.soulReserv / MAIN.GLOBAL.soulKuluPerHit > MAIN.GLOBAL.cryDReserv / MAIN.GLOBAL.cryDKuluPerHitSSD) {
			MAIN.GLOBAL.SSDHits = Math.floor(MAIN.GLOBAL.cryDReserv / MAIN.GLOBAL.cryDKuluPerHitSSD);
		} else {
			MAIN.GLOBAL.SSDHits = Math.floor(MAIN.GLOBAL.soulReserv / MAIN.GLOBAL.soulKuluPerHit);
		}
		MAIN.GLOBAL.SSDShots = MAIN.GLOBAL.SSDHits * MAIN.GLOBAL.SSDOutputAmount;
		MAIN.GLOBAL.cryDJ2rel = MAIN.GLOBAL.cryDReserv - MAIN.GLOBAL.SSDHits * MAIN.GLOBAL.cryDKuluPerHitSSD;
		MAIN.GLOBAL.soulJ2rel = MAIN.GLOBAL.soulReserv - MAIN.GLOBAL.SSDHits * MAIN.GLOBAL.soulKuluPerHit;
	}

}
