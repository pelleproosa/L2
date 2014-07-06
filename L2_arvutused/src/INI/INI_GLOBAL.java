package INI;

import java.io.FileNotFoundException;

import MAIN.Funktsioonid;



public class INI_GLOBAL {
	public static void start(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] tulem = new String[MAIN.GLOBAL.INI_lines];
	try {
		int i=0;
		tulem=failifuntsioonid.LoeFaili_Aadress_Algus_L6pp(MAIN.GLOBAL.SaveFileName);
		//tulem[0] on ebaoluline
		i++;
		MAIN.GLOBAL.SaveFileName=(MAIN.Funktsioonid.tulemstringist(tulem[i]));
		i++;
		MAIN.GLOBAL.aknanimi=tulem[i];
		i++;
		MAIN.GLOBAL.width=Integer.parseInt(MAIN.Funktsioonid.tulemstringist(tulem[i]));
		i++;
		MAIN.GLOBAL.height=Integer.parseInt(MAIN.Funktsioonid.tulemstringist(tulem[i]));   // i=5
		i++;
		//#Price per 1 item#
		i++;
		MAIN.GLOBAL.yksBssD=Integer.parseInt(MAIN.Funktsioonid.tulemstringist(tulem[i]));
		i++;
		MAIN.GLOBAL.yksssD=Integer.parseInt(MAIN.Funktsioonid.tulemstringist(tulem[i]));
		i++;
		MAIN.GLOBAL.yksCrystalD=Integer.parseInt(MAIN.Funktsioonid.tulemstringist(tulem[i]));
		i++;
		MAIN.GLOBAL.yksSpiritOre=Integer.parseInt(MAIN.Funktsioonid.tulemstringist(tulem[i]));
		i++;
		MAIN.GLOBAL.yksHPpot1=Integer.parseInt(MAIN.Funktsioonid.tulemstringist(tulem[i]));
		i++;
		MAIN.GLOBAL.yksHPpot2=Integer.parseInt(MAIN.Funktsioonid.tulemstringist(tulem[i]));
		i++;
		MAIN.GLOBAL.yksAlarcity=Integer.parseInt(MAIN.Funktsioonid.tulemstringist(tulem[i]));
		i++;
		MAIN.GLOBAL.yksMHaste=Integer.parseInt(MAIN.Funktsioonid.tulemstringist(tulem[i]));
		i++;
		MAIN.GLOBAL.yksHaste=Integer.parseInt(MAIN.Funktsioonid.tulemstringist(tulem[i]));
		
	//	failifuntsioonid.Fail_Kirjuta((MAIN.GLOBAL.SaveFileName), tulem, "rewrite",MAIN.GLOBAL.INI_lines);
	} 
	
		catch (FileNotFoundException e) {
		
		System.out.println("faili ei leia!  INI");
		
		Funktsioonid.TulbadReadstringideks();
		
				
				String Sisu[]={
				"#File "+MAIN.GLOBAL.SaveFileName+"#",
				"#Window#",
				"Window name="+MAIN.GLOBAL.aknanimi,
				"Window width="+MAIN.GLOBAL.width,
				"Window height="+MAIN.GLOBAL.height,
				"#Prices per 1 item#",
				"BssD="+MAIN.GLOBAL.yksBssD,
				"ssD="+MAIN.GLOBAL.yksssD,
				"Crystal D="+MAIN.GLOBAL.yksCrystalD,
				"Spirit Ore="+MAIN.GLOBAL.yksSpiritOre,
				"Healing potion 1="+MAIN.GLOBAL.yksHPpot1,
				"Healing potion 2="+MAIN.GLOBAL.yksHPpot2,
				"Alarcity potion="+MAIN.GLOBAL.yksAlarcity,
				"Magic Haste potion="+MAIN.GLOBAL.yksMHaste,
				"Haste potion="+MAIN.GLOBAL.yksHaste,
				"#END#"
				};

				
				
				
				
				
				
				
				
				
				
		
		failifuntsioonid.Fail_Kirjuta((MAIN.GLOBAL.SaveFileName), Sisu, "append",MAIN.GLOBAL.INI_lines);
		System.out.println("ini global on uue faili kirjutamise edukalt lõpetanud");
	}

	
	}
}
