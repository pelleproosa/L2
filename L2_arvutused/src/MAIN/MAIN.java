/**
 * 
 */
package MAIN;



import Graafiline_osa.tabel;
import INI.INI_GLOBAL;

/**
 * @author Pele
 *
 */ 
public class MAIN { 

	/**
	 * @param args
	 * @throws Exception 
	 */
	
	public static void main(String[] args) {
		
		
		
		GLOBAL.objektrida=new rida("", "", 0, 0, "", 0, 0, "");
		Funktsioonid.LisaLoodavRidaListi( GLOBAL.objektrida,GLOBAL.objektcharname, GLOBAL.objektlocname, GLOBAL.objektadenaprofit, GLOBAL.objektancientadenaprofit, GLOBAL.objektdate, GLOBAL.objektadenaprofit, GLOBAL.objektancientadenaprofitperh, GLOBAL.objektKuvatavAeg);
		
			
		objektid.KasutajaAsendaja.omistaobjektid();
		rida b=GLOBAL.objektilistrida.get(1);
		rida c=GLOBAL.objektilistrida.get(2);
		b.setAdenaprofit(100);
		String nimi=b.getCharname();
		b.printout();
		c.printout();
		System.out.println();
		System.out.println("Albumi Nimi Get abil          : "+nimi);
		nimi=c.getCharname();
		System.out.println("Teise albumi nimi             : "+nimi);
		GLOBAL.objektilistrida.get(1).setCharname("Uus nimi");
		System.out.println("Teise albumi nimi muudetuna   : "+GLOBAL.objektilistrida.get(1).getCharname());

		System.exit(0);
		
		
		GLOBAL.SaveFileName=System.getProperty("user.dir")+"\\"+"L2Calc.ini";
		
	//	System.out.println(System.getProperty("user.dir")+"\\"+"L2Calc.ini");
		// System.out.println(System.getProperty("user.home")+"\\Desktop\\");
		System.out.println("Graafiline..'tabel' nupp 'calculate' peab liigutama AFTER v��rtused BEFORE tulpa ja AFTER nullima(j�rgmiseks ts�kliks)");
		System.out.println("nupp 'Show currently spent time' on tegemata");
		System.out.println("nupp 'up' on tegemata");
		System.out.println("nupp 'down' on tegemata");
		System.out.println("nupp 'save/recalc' on �mber seadistamata");
		System.out.println("nupp 'cancel' on tegemata");
		System.out.println("nupp 'delete' on tegemata");
		System.out.println("T�� k�ib paketis 'objektid': eesm�rk 1) luua objekt, mis on rida failist. 2) objektide arraylist ... tehtud, kuid programmiga sidumata");
		System.out.println("Programmi k�ivitades peaks kuvama failist salvestused");
		System.out.println("kui vajutada 'calculate', kuvab kahte viimast rida �leval ja loodavat rida keskel(nagu oleks faili l�pus)");
		System.out.println("Luua funktsioon: stringist(0d 1h 6m 50s) sekundid");
		System.out.println("funktsioon INI.failifuntsioonid.KirjutaReadTabelisse(failiread,failiread,feiliread,failiread,failiread); on sidumata");
		
		
		
		try {
			INI_GLOBAL.start(args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		objektid.start.start(null);
	tabel.start(args);

	}

}
