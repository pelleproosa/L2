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
	

	
	
	
	static void LooRidaLisaListi()			// Lõppu	/// see käivitub nupuvajutusest .... ennem lisada väljade väärtused globalisse ka
	{
		
		MAIN.GLOBAL.objektrida.setCharname(MAIN.GLOBAL.objektcharname);
		MAIN.GLOBAL.objektrida.setLocationname(MAIN.GLOBAL.objektlocname);
		MAIN.GLOBAL.objektrida.setAdenaprofit(MAIN.GLOBAL.objektadenaprofit);
		MAIN.GLOBAL.objektrida.setAncientadenaprofit(MAIN.GLOBAL.objektancientadenaprofit);
		MAIN.GLOBAL.objektrida.setSpenttimemilliseconds(MAIN.GLOBAL.objektspenttimeinseconds);
		MAIN.GLOBAL.objektrida.setDate(MAIN.GLOBAL.objektdate);

		MAIN.GLOBAL.objektilistrida.add(MAIN.GLOBAL.objektrida);
		

		
	}

	/**
	 * Pelle meetod
	 * @param args 
	 */
	public static void start(String[] args) {
		
		
		
		
		KasutajaAsendaja.omistaobjektid(null); /// kustutada, kui programm töötab
		
		

	}

}
