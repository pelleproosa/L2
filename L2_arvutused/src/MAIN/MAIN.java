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
		rida reake=new rida("Antonius", "Giran", 0, 0, "", 0, 0, "");
		GLOBAL.realistike=new realistobjekt(GLOBAL.objektilistrida);
		
			
		Funktsioonid.LisaLoodavRidaListi( GLOBAL.objektrida,GLOBAL.objektcharname, GLOBAL.objektlocname, GLOBAL.objektadenaprofit, GLOBAL.objektancientadenaprofit, GLOBAL.objektdate, GLOBAL.objektadenaprofit, GLOBAL.objektancientadenaprofitperh, GLOBAL.objektKuvatavAeg);
		Funktsioonid.YleKirjutaRidaListi(reake, 0);
		
		
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
		//GLOBAL.objektilistrida.get(1).setCharname("Uus nimi");
		//System.out.println("Teise albumi nimi muudetuna   : "+GLOBAL.objektilistrida.get(1).getCharname());
		try {
			System.out.print("Kirjutan objektide Listi faili...");
			INI.failifuntsioonid.kirjuta_ScoreTXT();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Score.txt kirjutamisel error");
			e1.printStackTrace();
		}System.out.println("ok");
		
		
		try {
			System.out.print("Loen objektide Listi failist...");
			INI.failifuntsioonid.LoeFaili_ScoreTXT();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}System.out.println("ok");
		GLOBAL.objektridadearv=GLOBAL.objektilistrida.size();
		System.out.println("Objektide arv listis: "+GLOBAL.objektilistrida.size());
		
		System.out.println("tulem   : "+GLOBAL.objektilistrida.get(0).getCharname());
		System.out.println("tulem   : "+GLOBAL.objektilistrida.get(1).getCharname());
		System.out.println("tulem   : "+GLOBAL.objektilistrida.get(2).getCharname());
		
		
	//	System.exit(0);
		
		
		GLOBAL.SaveFileName=System.getProperty("user.dir")+"\\"+"L2Calc.ini";
		
	//	System.out.println(System.getProperty("user.dir")+"\\"+"L2Calc.ini");
		// System.out.println(System.getProperty("user.home")+"\\Desktop\\");
		System.out.println("Graafiline..'tabel' nupp 'calculate' peab liigutama AFTER väärtused BEFORE tulpa ja AFTER nullima(järgmiseks tsükliks)");
		System.out.println("nupp 'Show currently spent time' on tegemata");
		System.out.println("nupp 'up' on tegemata");
		System.out.println("nupp 'down' on tegemata");
		System.out.println("nupp 'save/recalc' on ümber seadistamata");
		System.out.println("nupp 'cancel' on tegemata");
		System.out.println("nupp 'delete' on tegemata");
		System.out.println("Töö käib paketis 'objektid': eesmärk 1) luua objekt, mis on rida failist. 2) objektide arraylist ... tehtud, kuid programmiga sidumata");
		System.out.println("Programmi käivitades peaks kuvama failist salvestused");
		System.out.println("kui vajutada 'calculate', kuvab kahte viimast rida üleval ja loodavat rida keskel(nagu oleks faili lõpus)");
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
