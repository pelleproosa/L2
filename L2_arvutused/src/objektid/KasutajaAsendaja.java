package objektid;

public class KasutajaAsendaja {

	public static void omistaobjektid(String[] args) {
		
		MAIN.GLOBAL.objektrida.setCharname("Bem");
		MAIN.GLOBAL.objektrida.setLocationname("Execution Grounds");
		MAIN.GLOBAL.objektrida.setAdenaprofit(1000);
		MAIN.GLOBAL.objektrida.setAncientadenaprofit(555);
		MAIN.GLOBAL.objektrida.setSpenttimemilliseconds(3960);
		MAIN.GLOBAL.objektrida.setDate("31-08-1982 10:20:56");

		MAIN.GLOBAL.objektilistrida.add(MAIN.GLOBAL.objektrida);
		
		MAIN.GLOBAL.objektrida.setCharname("Monster");
		MAIN.GLOBAL.objektrida.setLocationname("Heretics");
		MAIN.GLOBAL.objektrida.setAdenaprofit(2000);
		MAIN.GLOBAL.objektrida.setAncientadenaprofit(777);
		MAIN.GLOBAL.objektrida.setSpenttimemilliseconds(4349640);
		MAIN.GLOBAL.objektrida.setDate("28-10-1972 01:15:77");

		MAIN.GLOBAL.objektilistrida.add(MAIN.GLOBAL.objektrida);
		
		

	}

}
