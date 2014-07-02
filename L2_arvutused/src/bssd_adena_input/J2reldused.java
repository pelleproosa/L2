package bssd_adena_input;

public class J2reldused {
	
	public static void start() {
		if(MAIN.GLOBAL.spiritReserv / MAIN.GLOBAL.spiritKuluPerHit > MAIN.GLOBAL.cryDReserv / MAIN.GLOBAL.cryDKuluPerHitBSSD) {
			MAIN.GLOBAL.BSSDHits = Math.floor(MAIN.GLOBAL.cryDReserv / MAIN.GLOBAL.cryDKuluPerHitBSSD);
		} else {
			MAIN.GLOBAL.BSSDHits = Math.floor(MAIN.GLOBAL.spiritReserv / MAIN.GLOBAL.spiritKuluPerHit);
		}
		MAIN.GLOBAL.BSSDShots = MAIN.GLOBAL.BSSDHits * MAIN.GLOBAL.BSSDOutputAmount;
		MAIN.GLOBAL.cryDJ2rel = MAIN.GLOBAL.cryDReserv - MAIN.GLOBAL.BSSDHits * MAIN.GLOBAL.cryDKuluPerHitBSSD;
		MAIN.GLOBAL.spiritJ2rel = MAIN.GLOBAL.spiritReserv - MAIN.GLOBAL.BSSDHits * MAIN.GLOBAL.spiritKuluPerHit;
	}

}
