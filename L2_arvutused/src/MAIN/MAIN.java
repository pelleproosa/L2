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
	public static void main(String[] args) throws Exception {

		
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
		System.out.println("T�� k�ib paketis 'objektid': eesm�rk 1) luua objekt, mis on rida failist. 2) objektide arraylist");
		System.out.println("Programmi k�ivitades peaks kuvama failist salvestused");
		System.out.println("kui vajutada 'calculate', kuvab kahte viimast rida �leval ja loodavat rida keskel(nagu oleks faili l�pus)");
	INI_GLOBAL.start(args); 
	tabel.start(args);

	}

}
