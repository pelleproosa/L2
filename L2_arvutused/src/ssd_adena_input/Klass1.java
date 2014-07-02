package ssd_adena_input;

public class Klass1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Algab programm ja faas 1
		MAIN.GLOBAL.soulReservAlguses = MAIN.GLOBAL.soulReserv;
		MAIN.GLOBAL.cryDReservAlguses = MAIN.GLOBAL.cryDReserv;
		ObtainCryD.start();
		
		//Algab faas 2
		ObtainSoul.start();
		
		//Algab faas 3
		ObtainBoth.start();
		
		//Algab tulemuste korrastamine
		J2reldused.start();
		FixUnhealthySurplus.start();
		
		//Kokkuvõte
		System.out.println("Tuleb osta "+MAIN.GLOBAL.cryDKogusOsta+" kristalli ja "+MAIN.GLOBAL.soulKogusOsta+ "kivikest");
		
		System.out.println("CryD enne crafti: "+MAIN.GLOBAL.cryDReserv);
		System.out.println("Soul enne crafti: "+MAIN.GLOBAL.soulReserv);
		
		System.out.println("Toimub hunnik crafte: "+MAIN.GLOBAL.SSDHits);
		System.out.println("Craftitakse hunnik shotte: "+MAIN.GLOBAL.SSDShots);
		System.out.println("Adena järel pärast crafti: "+MAIN.GLOBAL.adenaReserv);

		System.out.println("CryD järel pärast crafti: "+MAIN.GLOBAL.cryDJ2rel);
		System.out.println("Soul järel pärast crafti: "+MAIN.GLOBAL.soulJ2rel);
		
	}
	
}