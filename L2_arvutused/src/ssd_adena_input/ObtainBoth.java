package ssd_adena_input;

public class ObtainBoth {
	
	public static void start() {
		while (MAIN.GLOBAL.adenaReserv >= MAIN.GLOBAL.cryDPrice * MAIN.GLOBAL.cryDLump + MAIN.GLOBAL.soulPrice * MAIN.GLOBAL.cryDKuluPerHitSSD) {
			//System.out.println("Otsustati lammutada veel kindaid ja osta kivikesi juurde");
			MAIN.GLOBAL.cryDKogusOsta=MAIN.GLOBAL.cryDKogusOsta+MAIN.GLOBAL.cryDLump;
			MAIN.GLOBAL.cryDReserv=MAIN.GLOBAL.cryDReserv+MAIN.GLOBAL.cryDLump;
			MAIN.GLOBAL.adenaReserv=MAIN.GLOBAL.adenaReserv-MAIN.GLOBAL.cryDLump*MAIN.GLOBAL.cryDPrice;
			
			while (MAIN.GLOBAL.soulReserv / MAIN.GLOBAL.soulKuluPerHit < MAIN.GLOBAL.cryDReserv / MAIN.GLOBAL.cryDKuluPerHitSSD) { 
				//see on souli ostmine cryD liia korral
				double ostmine=Buy.start( MAIN.GLOBAL.soulPrice, MAIN.GLOBAL.soulLump, MAIN.GLOBAL.adenaReserv);
				MAIN.GLOBAL.soulKogusOsta=MAIN.GLOBAL.soulKogusOsta+ostmine;
				MAIN.GLOBAL.soulReserv=MAIN.GLOBAL.soulReserv+ostmine;
				MAIN.GLOBAL.adenaReserv=MAIN.GLOBAL.adenaReserv-ostmine*MAIN.GLOBAL.soulPrice;
				/*
				System.out.println("Osta tuleb "+MAIN.GLOBAL.soulKogusOsta+" kivikest.");
				System.out.println("Reservis on p�rast ostu "+MAIN.GLOBAL.soulReserv+" kivikest.");
				System.out.println("Adena p�rast ostu on j2rel "+MAIN.GLOBAL.adenaReserv);
				System.out.println();
				*/
				if(ostmine==0) {
					break;
				}
			}
		}
	}

}