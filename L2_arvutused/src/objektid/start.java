/**
 * Pelle fail
 */
package objektid;

/**
 *
 */
public class start {

	/**
	 * Pelle konstruktor
	 */
	
	static void LooRida(failiread a,int reanumber, String charname, String locname, double adena, double AncientAdena, String time, double SpentTimeInSeconds){
		
		
		MAIN.GLOBAL.GlobalReaNumber=MAIN.GLOBAL.GlobalScoreTxtRead.size();
		a.reanumber=reanumber;
		a.CharName=charname;
		a.LocationName=locname;
		a.EarnedAdena=adena;
		a.EarnedAncientAdena=AncientAdena;
		a.time=time;
		a.SpentTimeInSeconds=SpentTimeInSeconds;
		

		MAIN.GLOBAL.GlobalScoreTxtRead.add(a);     ///////////////// objekt lisatakse objektide jadasse
		
	}

	/**
	 * Pelle meetod
	 * @param args 
	 */
	public static void start(String[] args) {
		
		
		failiread a=MAIN.GLOBAL.rida;
		
		KasutajaAsendaja.omistaglobalid(null); /// kustutada, kui programm töötab
		
		LooRida(
				a,
				MAIN.GLOBAL.objektreanumber,
				MAIN.GLOBAL.objektcharname,
				MAIN.GLOBAL.objektlocname,
				MAIN.GLOBAL.objektadena,
				MAIN.GLOBAL.objektancientadena,
				MAIN.GLOBAL.objekttime,
				MAIN.GLOBAL.objektspenttimeinseconds
				);	

	}

}
