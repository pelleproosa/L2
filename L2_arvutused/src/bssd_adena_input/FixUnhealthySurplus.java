package bssd_adena_input;

public class FixUnhealthySurplus {
	public static void start() {
		double remainder = MAIN.GLOBAL.spiritJ2rel % MAIN.GLOBAL.spiritKuluPerHit;
		System.out.println("jääk on "+remainder);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		if(remainder > 0) {
			if(MAIN.GLOBAL.spiritReserv == MAIN.GLOBAL.spiritReservAlguses) {} else {				
				MAIN.GLOBAL.spiritReserv = MAIN.GLOBAL.spiritReserv - remainder;
				MAIN.GLOBAL.adenaReserv = MAIN.GLOBAL.adenaReserv + MAIN.GLOBAL.spiritPrice * remainder;
				MAIN.GLOBAL.spiritJ2rel = MAIN.GLOBAL.spiritJ2rel - remainder;
				MAIN.GLOBAL.spiritKogusOsta = MAIN.GLOBAL.spiritKogusOsta - remainder;  
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
