package ssd_shots_input;

public class Klass1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Algab programm
	MAIN.GLOBAL.SSDReal=Math.ceil(MAIN.GLOBAL.SSDRequested / MAIN.GLOBAL.SSDOutputAmount) * MAIN.GLOBAL.SSDOutputAmount;
	MAIN.GLOBAL.SSDHits = MAIN.GLOBAL.SSDReal / MAIN.GLOBAL.SSDOutputAmount;
	MAIN.GLOBAL.cryDKogusOsta = MAIN.GLOBAL.SSDHits * MAIN.GLOBAL.cryDKuluPerHitSSD - MAIN.GLOBAL.cryDReserv;
	MAIN.GLOBAL.soulKogusOsta = MAIN.GLOBAL.SSDHits * MAIN.GLOBAL.soulKuluPerHit - MAIN.GLOBAL.soulReserv;
	
	if(MAIN.GLOBAL.cryDKogusOsta < 0) {
		MAIN.GLOBAL.cryDKogusOsta = 0;
	}
	if(MAIN.GLOBAL.soulKogusOsta < 0) {
		MAIN.GLOBAL.soulKogusOsta = 0;
	}
	MAIN.GLOBAL.cryDReservAlguses = MAIN.GLOBAL.cryDReserv;
	MAIN.GLOBAL.soulReservAlguses = MAIN.GLOBAL.soulReserv;
	MAIN.GLOBAL.cryDReserv = MAIN.GLOBAL.cryDReserv + MAIN.GLOBAL.cryDKogusOsta - MAIN.GLOBAL.SSDHits * MAIN.GLOBAL.cryDKuluPerHitSSD;
	MAIN.GLOBAL.soulReserv = MAIN.GLOBAL.soulReserv + MAIN.GLOBAL.soulKogusOsta - MAIN.GLOBAL.SSDHits * MAIN.GLOBAL.soulKuluPerHit;
	
	System.out.println("SSDREAL;SSDHITS;CRYDKOGUSOSTA;soulKOGUSOASTA "+MAIN.GLOBAL.SSDReal+" "+MAIN.GLOBAL.SSDHits+" "+MAIN.GLOBAL.cryDKogusOsta+" "+MAIN.GLOBAL.soulKogusOsta);
	
	MAIN.GLOBAL.adenaKulu = MAIN.GLOBAL.cryDKogusOsta * MAIN.GLOBAL.cryDPrice + MAIN.GLOBAL.soulKogusOsta * MAIN.GLOBAL.soulPrice;
	MAIN.GLOBAL.adenaReserv = MAIN.GLOBAL.adenaReserv - MAIN.GLOBAL.adenaKulu; 
	
	if(MAIN.GLOBAL.adenaReserv < 0) {
		MAIN.GLOBAL.craftAdenaAssessment = "BAD";
	} else {
		MAIN.GLOBAL.craftAdenaAssessment = "GOOD";
	}
	System.out.println("You need to buy a further "+MAIN.GLOBAL.cryDKogusOsta+" cryD and "+MAIN.GLOBAL.soulKogusOsta+" soul.");

	if(MAIN.GLOBAL.craftAdenaAssessment == "GOOD") {
		System.out.println("You will have "+MAIN.GLOBAL.adenaReserv+" adena remaining.");
	} else {
		//System.out.println("Craft will consume "+MAIN.GLOBAL.adenaKulu+" adena.");
		MAIN.GLOBAL.adenaReserv = MAIN.GLOBAL.adenaKulu; 
		System.out.println("Craftiks kulub "+MAIN.GLOBAL.adenaReserv+" adenat.");
	}
	System.out.println("You will have "+MAIN.GLOBAL.cryDReserv+" cryD and "+MAIN.GLOBAL.soulReserv+" soul remaining.");
	}
	
		 
		
		
	}
	



