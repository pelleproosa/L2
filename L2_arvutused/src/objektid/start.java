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
		MAIN.GLOBAL.objektrida.setAdenaprofitperH(MAIN.GLOBAL.objektadenaperh);
		MAIN.GLOBAL.objektrida.setAncientAdenaprofitperH(MAIN.GLOBAL.objektancientadenaperh);
		MAIN.GLOBAL.objektrida.setDate(MAIN.GLOBAL.objektdate);
		MAIN.GLOBAL.objektrida.setKuvatavAeg(MAIN.GLOBAL.objektKuvatavAeg);

		//MAIN.GLOBAL.objektilistrida.add(MAIN.GLOBAL.objektrida);
		System.out.println("objektid.start      objekti lisamine jadasse tegemata");
		

		
	}

	/**
	 * Pelle meetod
	 * @param args 
	 */
	public static void start(String[] args) {
		
		
		
		
		KasutajaAsendaja.omistaobjektid(); /// kustutada, kui programm töötab
		
		

	}

}
