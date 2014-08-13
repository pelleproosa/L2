package objektid;



public class KasutajaAsendaja {


	static void omistaobjektid() {
		CDList[] cd=MAIN.GLOBAL.jada;
		cd[0].setalbumTitle("Pealkiri");
		cd[0].setartistName("Totu Cool");
		cd[0].setlabel("Nimetu");
		cd[0].setyearOfRelease("1977");
		cd[0].printout();
		System.exit(0);
		
		//MAIN.GLOBAL.jada[0].setartistname("");
		rida reake=MAIN.GLOBAL.objektrida;
		reake.setCharname("Bem");
		reake.setLocationname("Execution Grounds");
		reake.setAdenaprofit(1000);
		reake.setAncientadenaprofit(555);
		reake.setKuvatavAeg("0d 10h 20m 56s");
		reake.setDate("31-08-1982");

		MAIN.GLOBAL.objektilistrida.add(reake);
		
		reake.setCharname("Monster");
		reake.setLocationname("Heretics");
		reake.setAdenaprofit(2000);
		reake.setAncientadenaprofit(777);
		reake.setKuvatavAeg("0d 1h 15m 77s");
		reake.setDate("28-10-1972");

		MAIN.GLOBAL.objektilistrida.add(reake);
		
		

	}

}
