package ssd_adena_input;

public class ObtainCryD {
	
	public static void start() {
		double lollus = ( MAIN.GLOBAL.soulReserv / MAIN.GLOBAL.soulKuluPerHit ) / (MAIN.GLOBAL.cryDReserv / MAIN.GLOBAL.cryDKuluPerHitSSD);
		/*
		System.out.println("See on lollus: "+lollus);
		System.out.println("See on soulReserv: "+MAIN.GLOBAL.soulReserv);
		System.out.println("See on soulKuluPerHit: "+MAIN.GLOBAL.soulKuluPerHit);
		System.out.println("See on cryDReserv: "+MAIN.GLOBAL.cryDReserv);
		System.out.println("See on cryDKuluPerHit: "+MAIN.GLOBAL.cryDKuluPerHitSSD);
		*/
		while (MAIN.GLOBAL.soulReserv / MAIN.GLOBAL.soulKuluPerHit > MAIN.GLOBAL.cryDReserv / MAIN.GLOBAL.cryDKuluPerHitSSD) { 
			//see on cryD ostmine souli liia korral
			double ostmine=Buy.start( MAIN.GLOBAL.cryDPrice, MAIN.GLOBAL.cryDLump, MAIN.GLOBAL.adenaReserv);
			MAIN.GLOBAL.cryDKogusOsta=MAIN.GLOBAL.cryDKogusOsta+ostmine;
			MAIN.GLOBAL.cryDReserv=MAIN.GLOBAL.cryDReserv+ostmine;
			MAIN.GLOBAL.adenaReserv=MAIN.GLOBAL.adenaReserv-ostmine*MAIN.GLOBAL.cryDPrice;
			/*
			System.out.println("Osteti "+MAIN.GLOBAL.cryDKogusOsta+" kristalli.");
			System.out.println("Reservis on pärast ostu "+MAIN.GLOBAL.cryDReserv+" kristalli.");
			System.out.println("Adena pärast ostu on j2rel "+MAIN.GLOBAL.adenaReserv);
			System.out.println();
			*/
			if(ostmine==0) {
				break;
			}
		}
	}

}
