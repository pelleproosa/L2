package MAIN;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;



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

							if(b.indexOf(lipuke[1]) != -1){        //leidus t�hik
								asukoht2=b.indexOf(lipuke[1]);     //m�rgistan viimase koha enne tyhikut
								b=b.substring(asukoht1, asukoht2); //v�tan stringi kuni t�hikuni
								asukoht1=asukoht2;					//panen lipukesed paika
								asukoht2=a.length();				//m��dan stringi pikkuse
								a=a.substring((asukoht1+1),asukoht2);//v�tan stringi tagumise osa, j�ttes tyhiku v�lja(algus+1)
								b=b+a;									//liidan jupid kokku ilma tyhikuta
								a=b;									//annan m�lemale sama stringi v��rtuse
								asukoht1=0;								//nullin viimase lipukese

							}else{ 									//ei leidunud tyhikut
								break;
							}			

						}


		asukoht2=asukoht1=0;
		
		while (true){

					if(b.indexOf(lipuke[0]) != -1){        	//leidus v�rdusm�rk
						asukoht1=(b.indexOf(lipuke[0]));     	//m�rgistan v�rdusm�rgi koha
						asukoht2=b.length();
						b=b.substring((asukoht1+1), asukoht2); 	//v�tan stringi peale v�rdust
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
			//System.out.println("Start");
		GLOBAL.stardiaeg = System.currentTimeMillis();
       // SimpleDateFormat sdf = new SimpleDateFormat("dd MMM,yyyy HH:mm");
		//SimpleDateFormat startformaat = new SimpleDateFormat("HH:mm:ss");

        //Date resultdate = new Date(GLOBAL.stardiaeg);
        //GLOBAL.stardiaegstring=""+(startformaat.format(resultdate));
        //System.out.println(GLOBAL.stardiaegstring);
        GLOBAL.timerunning=true;
        //System.out.println("Start done");
		}else{
			//System.out.println("Stopp");
		GLOBAL.stoppaeg=System.currentTimeMillis();
		//GLOBAL.stoppaeg=
		//SimpleDateFormat stoppformaat = new SimpleDateFormat("HH:mm:ss");
        //Date resultdate = new Date(stoppaeg);
        //GLOBAL.stoppaegstring=""+(stoppformaat.format(resultdate));
        //System.out.println(GLOBAL.stoppaegstring);
        GLOBAL.tulemus=(GLOBAL.stoppaeg-GLOBAL.stardiaeg)/1000;				/// tulemus sekundites

        DecimalFormatSymbols decimalSymbol = new DecimalFormatSymbols(Locale.getDefault());
        decimalSymbol.setDecimalSeparator('.');
        decimalSymbol.setGroupingSeparator(',');
        DecimalFormat nullkomakohta = new DecimalFormat("###",decimalSymbol);
        DecimalFormat kakskomakohta = new DecimalFormat("#.00",decimalSymbol);
        String s=(kakskomakohta.format(GLOBAL.tulemus)); 
        GLOBAL.tulemus=Double.parseDouble(s);

        GLOBAL.sekundid=GLOBAL.tulemus;
        
        
        
        if (GLOBAL.sekundid>86400){                                         // kui sekundeid jagub nii palju, et saab 24h
        	GLOBAL.h24=Double.parseDouble(nullkomakohta.format((GLOBAL.sekundid/86400)));//p�evade t�isarv saadakse sekunditest
        	GLOBAL.sekundid=(GLOBAL.sekundid-(GLOBAL.h24*86400));			   // v�tan sekunditest p�evad maha
        }
        if (GLOBAL.sekundid>3600){                                         // kui sekundeid jagub nii palju, et saab 1h
        	GLOBAL.tunnid=Double.parseDouble(nullkomakohta.format((GLOBAL.sekundid/3600)));//tundide t�isarv saadakse sekunditest
        	GLOBAL.sekundid=(GLOBAL.sekundid-(GLOBAL.tunnid*3600));			   // v�tan sekunditest tunnid maha
        }
        if (GLOBAL.sekundid>60){                                         // kui sekundeid jagub nii palju, et saab 1min
        	GLOBAL.minutid=Double.parseDouble(nullkomakohta.format((GLOBAL.sekundid/60)));//minutite t�isarv saadakse sekunditest
        	GLOBAL.sekundid=(GLOBAL.sekundid-(GLOBAL.minutid*60));			   // v�tan sekunditest minutid maha
        }
       System.out.println("sekundeid kulus : "+GLOBAL.tulemus);
        //GLOBAL.tulemus=Long.parseLong(df.format((GLOBAL.tulemus/3600)));     // tulemus tundides
        //GLOBAL.tulemus=(GLOBAL.tulemus/3600);     // tulemus tundides
        
        
        
        
        
       // System.out.println("Spent time is : "+GLOBAL.h24+" Days and "+GLOBAL.tunnid+"h "+GLOBAL.minutid+"min "+GLOBAL.sekundid+"sek");

       GLOBAL.ajavahemikpp=((int)(GLOBAL.h24)+"d "+(int)GLOBAL.tunnid+"h "+(int)GLOBAL.minutid+"m "+(int)GLOBAL.sekundid+"s");
        
        
        GLOBAL.timerunning=false;
		}
	}
	public static void profitcalc(){    // v�tab  Funktsioonid.time(); omistatud GLOBAL.adenaenne ja Global.tulemus. V�tab juurde uue Global.adenahiljem ja v�ljastab arvutatud tulu kulusid arvestamata.
		if(GLOBAL.tulemus>0){
			
			//System.out.println("Calculate sees"+GLOBAL.tulemus);
			
			
			DecimalFormatSymbols decimalSymbol = new DecimalFormatSymbols(Locale.getDefault());
	        decimalSymbol.setDecimalSeparator('.');
	        decimalSymbol.setGroupingSeparator(',');
	        DecimalFormat nullkomakohta = new DecimalFormat("###",decimalSymbol);
	        DecimalFormat kakskomakohta = new DecimalFormat("#.00",decimalSymbol);
			
			
			double a=(GLOBAL.adenahiljem-GLOBAL.adenaenne)/GLOBAL.tulemus;
			a=a*3600;
			double kogukulu=GLOBAL.ssdkulupp+GLOBAL.bssdkulupp+GLOBAL.hppot1kulupp+GLOBAL.hppot2kulupp+GLOBAL.alarcitykulupp+GLOBAL.mhastekulupp+GLOBAL.hastekulupp;
			System.out.println("kogukulu : "+kogukulu);
			kogukulu=(kogukulu)/GLOBAL.tulemus;
			//System.out.println(kogukulu);
			kogukulu=kogukulu*3600;
			//System.out.println(kogukulu);
		GLOBAL.tulemus=a;
		GLOBAL.tulemus=Double.parseDouble(kakskomakohta.format((GLOBAL.tulemus)));
		kogukulu=Double.parseDouble(kakskomakohta.format((kogukulu)));
		System.out.println(GLOBAL.tulemus);
		
GLOBAL.tulemus=(GLOBAL.tulemus-(kogukulu));
GLOBAL.tulemus=Double.parseDouble(kakskomakohta.format((GLOBAL.tulemus)));
		GLOBAL.tulemusstring=(nullkomakohta.format((GLOBAL.tulemus)));
		}else{
			GLOBAL.tulemusstring="Start/Stop";
		}
		
	}
}
