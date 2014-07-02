package bssd_adena_input;

public class ObtainBoth {
	
	public static void start() {
		while (MAIN.GLOBAL.adenaReserv >= MAIN.GLOBAL.cryDPrice * MAIN.GLOBAL.cryDLump + MAIN.GLOBAL.spiritPrice * MAIN.GLOBAL.cryDKuluPerHitBSSD) {
			System.out.println("Otsustati lammutada veel kindaid ja osta kivikesi juurde");
			MAIN.GLOBAL.cryDKogusOsta=MAIN.GLOBAL.cryDKogusOsta+MAIN.GLOBAL.cryDLump;
			MAIN.GLOBAL.cryDReserv=MAIN.GLOBAL.cryDReserv+MAIN.GLOBAL.cryDLump;
			MAIN.GLOBAL.adenaReserv=MAIN.GLOBAL.adenaReserv-MAIN.GLOBAL.cryDLump*MAIN.GLOBAL.cryDPrice;
			
			while (MAIN.GLOBAL.spiritReserv / MAIN.GLOBAL.spiritKuluPerHit < MAIN.GLOBAL.cryDReserv / MAIN.GLOBAL.cryDKuluPerHitBSSD) { 
				//see on spiriti ostmine cryD liia korral
				double ostmine=Buy.start( MAIN.GLOBAL.spiritPrice, MAIN.GLOBAL.spiritLump, MAIN.GLOBAL.adenaReserv);
				MAIN.GLOBAL.spiritKogusOsta=MAIN.GLOBAL.spiritKogusOsta+ostmine;
				MAIN.GLOBAL.spiritReserv=MAIN.GLOBAL.spiritReserv+ostmine;
				MAIN.GLOBAL.adenaReserv=MAIN.GLOBAL.adenaReserv-ostmine*MAIN.GLOBAL.spiritPrice;
				System.out.println("Osta tuleb "+MAIN.GLOBAL.spiritKogusOsta+" kivikest.");
				System.out.println("Reservis on pärast ostu "+MAIN.GLOBAL.spiritReserv+" kivikest.");
				System.out.println("Adena pärast ostu on j2rel "+MAIN.GLOBAL.adenaReserv);
				System.out.println();
				if(ostmine==0) {
					break;
				}
			}
		}
	}

}