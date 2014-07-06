package MAIN;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;



public class Funktsioonid {

	
	public static String tulemstringist(String text1) { // Window tulbad/read
		
		String lipuke[]={"=", " "};
		
		String a="";
		String b="";
		int asukoht1=0;
		int asukoht2=0;
		int tulpRidaLugeja=0;
		int tulem=0;
		boolean loetud=false;
		a=text1;
		asukoht1=0;
		b=a;

		


						while (true){

							if(b.indexOf(lipuke[1]) != -1){        //leidus tühik
								asukoht2=b.indexOf(lipuke[1]);     //märgistan viimase koha enne tyhikut
								b=b.substring(asukoht1, asukoht2); //võtan stringi kuni tühikuni
								asukoht1=asukoht2;					//panen lipukesed paika
								asukoht2=a.length();				//mõõdan stringi pikkuse
								a=a.substring((asukoht1+1),asukoht2);//võtan stringi tagumise osa, jättes tyhiku välja(algus+1)
								b=b+a;									//liidan jupid kokku ilma tyhikuta
								a=b;									//annan mõlemale sama stringi väärtuse
								asukoht1=0;								//nullin viimase lipukese

							}else{ 									//ei leidunud tyhikut
								break;
							}			

						}


		asukoht2=asukoht1=0;
		
		while (true){

					if(b.indexOf(lipuke[0]) != -1){        	//leidus võrdusmärk
						asukoht1=(b.indexOf(lipuke[0]));     	//märgistan võrdusmärgi koha
						asukoht2=b.length();
						b=b.substring((asukoht1+1), asukoht2); 	//võtan stringi peale võrdust
						break;
					}else{
						break;

					}			
			}
		
		
		
		
		
		
		
		



		



		return b;

	}
	
	public static void TulbadReadstringideks()
	{
		String tulbad="{"+(int)GLOBAL.size[0][0]+
					  ", "+(int)GLOBAL.size[0][1]+
					  ", "+(int)GLOBAL.size[0][2]+
					  ", "+(int)GLOBAL.size[0][3]+
					  ", "+(int)GLOBAL.size[0][4]+
					  ", "+(int)GLOBAL.size[0][5]+
					  ", "+(int)GLOBAL.size[0][6]+
					  ", "+(int)GLOBAL.size[0][7]+
					  ", "+(int)GLOBAL.size[0][8]+
					  ", "+(int)GLOBAL.size[0][9]+"}";
		String read="{"+(int)GLOBAL.size[1][0]+
					", "+(int)GLOBAL.size[1][1]+
					", "+(int)GLOBAL.size[1][2]+
					", "+(int)GLOBAL.size[1][3]+
					", "+(int)GLOBAL.size[1][4]+
					", "+(int)GLOBAL.size[1][5]+
					", "+(int)GLOBAL.size[1][6]+
					", "+(int)GLOBAL.size[1][7]+
					", "+(int)GLOBAL.size[1][8]+
					", "+(int)GLOBAL.size[1][9]+"}";
		GLOBAL.tulbadFunktsioonist=tulbad;
		GLOBAL.readFunktsioonist=read;
	}
	
	public static void time()
	{

		if (!GLOBAL.timerunning){
			System.out.println("Start");
		GLOBAL.stardiaeg = System.currentTimeMillis();
       // SimpleDateFormat sdf = new SimpleDateFormat("dd MMM,yyyy HH:mm");
		SimpleDateFormat startformaat = new SimpleDateFormat("HH:mm:ss");

        Date resultdate = new Date(GLOBAL.stardiaeg);
        GLOBAL.stardiaegstring=""+(startformaat.format(resultdate));
        //System.out.println(GLOBAL.stardiaegstring);
        GLOBAL.timerunning=true;
        //System.out.println("Start done");
		}else{
			System.out.println("Stopp");
		GLOBAL.stoppaeg=System.currentTimeMillis();
		SimpleDateFormat stoppformaat = new SimpleDateFormat("HH:mm:ss");
        Date resultdate = new Date(GLOBAL.stoppaeg);
        GLOBAL.stoppaegstring=""+(stoppformaat.format(resultdate));
        //System.out.println(GLOBAL.stoppaegstring);
        GLOBAL.tulemus=(GLOBAL.stoppaeg-GLOBAL.stardiaeg)/1000;				/// tulemus sekundites
        DecimalFormat df = new DecimalFormat("000000");
        GLOBAL.tulemus=Long.parseLong(df.format(GLOBAL.tulemus));       
        GLOBAL.sekundid=(int)GLOBAL.tulemus;
        
        
        
        if (GLOBAL.sekundid>86400){                                         // kui sekundeid jagub nii palju, et saab 24h
        	GLOBAL.h24=Integer.parseInt(df.format((GLOBAL.sekundid/86400)));//päevade täisarv saadakse sekunditest
        	GLOBAL.sekundid=(GLOBAL.sekundid-(GLOBAL.h24*86400));			   // võtan sekunditest päevad maha
        }
        if (GLOBAL.sekundid>3600){                                         // kui sekundeid jagub nii palju, et saab 1h
        	GLOBAL.tunnid=Integer.parseInt(df.format((GLOBAL.sekundid/3600)));//tundide täisarv saadakse sekunditest
        	GLOBAL.sekundid=(GLOBAL.sekundid-(GLOBAL.tunnid*3600));			   // võtan sekunditest tunnid maha
        }
        if (GLOBAL.sekundid>60){                                         // kui sekundeid jagub nii palju, et saab 1min
        	GLOBAL.minutid=Integer.parseInt(df.format((GLOBAL.sekundid/60)));//minutite täisarv saadakse sekunditest
        	GLOBAL.sekundid=(GLOBAL.sekundid-(GLOBAL.minutid*60));			   // võtan sekunditest minutid maha
        }
       //System.out.println(GLOBAL.tulemus);
        //GLOBAL.tulemus=Long.parseLong(df.format((GLOBAL.tulemus/3600)));     // tulemus tundides
        //GLOBAL.tulemus=(GLOBAL.tulemus/3600);     // tulemus tundides
        
        
        
        
        
        System.out.println("Spent time is : "+GLOBAL.h24+" Days and "+GLOBAL.tunnid+"h "+GLOBAL.minutid+"min "+GLOBAL.sekundid+"sek");
       
        
        
        GLOBAL.timerunning=false;
		}
	}
	public static void profitcalc(){    // võtab  Funktsioonid.time(); omistatud GLOBAL.adenaenne ja Global.tulemus. Võtab juurde uue Global.adenahiljem ja väljastab arvutatud tulu kulusid arvestamata.
		if(GLOBAL.adenahiljem>0){
			
			System.out.println("Calculate sees"+GLOBAL.tulemus);
			DecimalFormat df = new DecimalFormat("000000");
		GLOBAL.tulemus=(Long.parseLong(df.format(3600*((((long)(GLOBAL.adenahiljem-GLOBAL.adenaenne))/GLOBAL.tulemus)))));       
		GLOBAL.tulemusstring=(""+GLOBAL.tulemus);
		}
		
	}
}
