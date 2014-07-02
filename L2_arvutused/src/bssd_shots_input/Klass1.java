package bssd_shots_input;

public class Klass1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Algab programm
	MAIN.GLOBAL.BSSDReal=Math.ceil(MAIN.GLOBAL.BSSDRequested / MAIN.GLOBAL.BSSDOutputAmount) * MAIN.GLOBAL.BSSDOutputAmount;
	MAIN.GLOBAL.BSSDHits = MAIN.GLOBAL.BSSDReal / MAIN.GLOBAL.BSSDOutputAmount;
	MAIN.GLOBAL.cryDKogusOsta = MAIN.GLOBAL.BSSDHits * MAIN.GLOBAL.cryDKuluPerHitBSSD - MAIN.GLOBAL.cryDReserv;
	MAIN.GLOBAL.spiritKogusOsta = MAIN.GLOBAL.BSSDHits * MAIN.GLOBAL.spiritKuluPerHit - MAIN.GLOBAL.spiritReserv;
	
	if(MAIN.GLOBAL.cryDKogusOsta < 0) {
		MAIN.GLOBAL.cryDKogusOsta = 0;
	}
	if(MAIN.GLOBAL.spiritKogusOsta < 0) {
		MAIN.GLOBAL.spiritKogusOsta = 0;
	}
	MAIN.GLOBAL.cryDReservAlguses = MAIN.GLOBAL.cryDReserv;
	MAIN.GLOBAL.spiritReservAlguses = MAIN.GLOBAL.spiritReserv;
	MAIN.GLOBAL.cryDReserv = MAIN.GLOBAL.cryDReserv + MAIN.GLOBAL.cryDKogusOsta - MAIN.GLOBAL.BSSDHits * MAIN.GLOBAL.cryDKuluPerHitBSSD;
	MAIN.GLOBAL.spiritReserv = MAIN.GLOBAL.spiritReserv + MAIN.GLOBAL.spiritKogusOsta - MAIN.GLOBAL.BSSDHits * MAIN.GLOBAL.spiritKuluPerHit;
	
	System.out.println("BSSDREAL;BSSDHITS;CRYDKOGUSOSTA;SPIRITKOGUSOASTA "+MAIN.GLOBAL.BSSDReal+" "+MAIN.GLOBAL.BSSDHits+" "+MAIN.GLOBAL.cryDKogusOsta+" "+MAIN.GLOBAL.spiritKogusOsta);
	
	MAIN.GLOBAL.adenaKulu = MAIN.GLOBAL.cryDKogusOsta * MAIN.GLOBAL.cryDPrice + MAIN.GLOBAL.spiritKogusOsta * MAIN.GLOBAL.spiritPrice;
	MAIN.GLOBAL.adenaReserv = MAIN.GLOBAL.adenaReserv - MAIN.GLOBAL.adenaKulu; 
	
	if(MAIN.GLOBAL.adenaReserv < 0) {
		MAIN.GLOBAL.craftAdenaAssessment = "BAD";
	} else {
		MAIN.GLOBAL.craftAdenaAssessment = "GOOD";
	}
	System.out.println("You need to buy a further "+MAIN.GLOBAL.cryDKogusOsta+" cryD and "+MAIN.GLOBAL.spiritKogusOsta+" spirit.");
	
	if(MAIN.GLOBAL.craftAdenaAssessment == "GOOD") {
		System.out.println("You will have "+MAIN.GLOBAL.adenaReserv+" adena remaining.");
	} else {
		//System.out.println("Craftiks kulub "+MAIN.GLOBAL.adenaKulu+" adenat.");
		MAIN.GLOBAL.adenaReserv = MAIN.GLOBAL.adenaKulu; 
		System.out.println("Craftiks kulub "+MAIN.GLOBAL.adenaReserv+" adenat.");
	}
	System.out.println("You will have "+MAIN.GLOBAL.cryDReserv+" cryD and "+MAIN.GLOBAL.spiritReserv+" spirit remaining.");
	
		 
		
		
	}
	
}