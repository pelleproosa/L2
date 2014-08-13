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
	static void LooCD(CDList a,String aa, String b, String c, String d){
		
		a.setartistName("MIKI");
		a.setalbumTitle("Glaabu, Nipi ja Tige Kala");
		a.setlabel("Peatükk 3");
		a.setyearOfRelease("1970");
		a.printout();

		GLOBAL.jada.add(a);

		
		
	}
	public static void main(String[] args) {
		
		
		
		GLOBAL.cd=new CDList("","","","");
		
		LooCD(GLOBAL.cd,"","","","");	
		
		CDList b=GLOBAL.jada.get(0);
		b.setyearOfRelease("1500");
		String nimi=b.getalbumTitle();
		b.printout();
		System.out.println();
		System.out.println("Albumi Nimi Get abil: "+nimi);

		System.exit(0);
		
		
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
