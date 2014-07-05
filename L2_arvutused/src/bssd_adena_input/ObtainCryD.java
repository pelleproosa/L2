package bssd_adena_input;

public class ObtainCryD {
	
	public static void start() {
		double lollus = ( MAIN.GLOBAL.spiritReserv / MAIN.GLOBAL.spiritKuluPerHit ) / (MAIN.GLOBAL.cryDReserv / MAIN.GLOBAL.cryDKuluPerHitBSSD);
		/*
		System.out.println("See on lollus: "+lollus);
		System.out.println("See on spiritReserv: "+MAIN.GLOBAL.spiritReserv);
		System.out.println("See on spiritKuluPerHit: "+MAIN.GLOBAL.spiritKuluPerHit);
		System.out.println("See on cryDReserv: "+MAIN.GLOBAL.cryDReserv);
		System.out.println("See on cryDKuluPerHit: "+MAIN.GLOBAL.cryDKuluPerHitBSSD);
		*/
		while (MAIN.GLOBAL.spiritReserv / MAIN.GLOBAL.spiritKuluPerHit > MAIN.GLOBAL.cryDReserv / MAIN.GLOBAL.cryDKuluPerHitBSSD) { 
			//see on cryD ostmine spiriti liia korral
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
