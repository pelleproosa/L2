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
	public static void LooCD(CDList a,String aa, String b, String c, String d){
		
		a.setartistName(aa);
		a.setalbumTitle(b);
		a.setlabel(c);
		a.setyearOfRelease(d);
		a.printout();

		GLOBAL.jada.add(a);

		
		
	}
	public static void main(String[] args) {
		
		
		
		GLOBAL.cd=new CDList("","","","");
		
		LooCD(GLOBAL.cd,"MIKI","Glaabu, Nipi ja Tige Kala","Peat�kk 3","1970");	
		objektid.KasutajaAsendaja.omistaobjektid();
		CDList b=GLOBAL.jada.get(0);
		CDList c=GLOBAL.jada.get(1);
		b.setyearOfRelease("1500");
		String nimi=b.getalbumTitle();
		b.printout();
		c.printout();
		System.out.println();
		System.out.println("Albumi Nimi Get abil          : "+nimi);
		nimi=c.getalbumTitle();
		System.out.println("Teise albumi nimi             : "+nimi);
		GLOBAL.jada.get(1).setalbumTitle("Uus nimi");
		System.out.println("Teise albumi nimi muudetuna   : "+GLOBAL.jada.get(1).getalbumTitle());

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
