package ssd_adena_input;

public class FixUnhealthySurplus {
	public static void start() {
		double remainder = MAIN.GLOBAL.soulJ2rel % MAIN.GLOBAL.soulKuluPerHit;
		System.out.println("jääk on "+remainder);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		if(remainder > 0) {
			if(MAIN.GLOBAL.soulReserv == MAIN.GLOBAL.soulReservAlguses) {} else {				
				MAIN.GLOBAL.soulReserv = MAIN.GLOBAL.soulReserv - remainder;
				MAIN.GLOBAL.adenaReserv = MAIN.GLOBAL.adenaReserv + MAIN.GLOBAL.soulPrice * remainder;
				MAIN.GLOBAL.soulJ2rel = MAIN.GLOBAL.soulJ2rel - remainder;
				MAIN.GLOBAL.soulKogusOsta = MAIN.GLOBAL.soulKogusOsta - remainder;  
			}
		}
		if(MAIN.GLOBAL.cryDJ2rel == MAIN.GLOBAL.cryDLump) {
			if(MAIN.GLOBAL.cryDReserv == MAIN.GLOBAL.cryDReservAlguses) {} else {
				MAIN.GLOBAL.cryDReserv = MAIN.GLOBAL.cryDReserv - MAIN.GLOBAL.cryDLump;
				MAIN.GLOBAL.adenaReserv = MAIN.GLOBAL.adenaReserv + MAIN.GLOBAL.cryDPrice * MAIN.GLOBAL.cryDLump;
				MAIN.GLOBAL.cryDJ2rel = MAIN.GLOBAL.cryDJ2rel - MAIN.GLOBAL.cryDLump;
				MAIN.GLOBAL.cryDKogusOsta = MAIN.GLOBAL.cryDKogusOsta - MAIN.GLOBAL.cryDLump; 
			}
		}
	}

}
