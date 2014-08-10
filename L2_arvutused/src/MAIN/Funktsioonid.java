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
	
	public void kulunudmillisekundidstringiks(double KuvatavAeg) {              seda funktsiooni pole s�steemi integreeritud //GLOBAL.P2evTundMinutSekund[3]
		double p2evad;
		double tunnid;
		double minutid;
		double sekundid;
		DecimalFormatSymbols decimalSymbol = new DecimalFormatSymbols(Locale.getDefault());
        decimalSymbol.setDecimalSeparator('.');
        decimalSymbol.setGroupingSeparator(',');
        DecimalFormat nullkomakohta = new DecimalFormat("###",decimalSymbol);
        DecimalFormat kakskomakohta = new DecimalFormat("#.00",decimalSymbol);
        String s=(kakskomakohta.format(GLOBAL.tulemus)); 
        double tulemus=Double.parseDouble(s);

        p2evad=0;
        tunnid=0;
        minutid=0;
        sekundid=tulemus;
        
		   double j22k=0;     
	        if (KuvatavAeg>86400){                                         // kui sekundeid jagub nii palju, et saab 24h
	        	j22k=sekundid % 86400;
	        	p2evad=Double.parseDouble(nullkomakohta.format(((sekundid-j22k)/86400)));//p�evade t�isarv saadakse sekunditest
	        	sekundid=j22k;
	        			//(GLOBAL.sekundid-(GLOBAL.h24*86400));			   // v�tan sekunditest p�evad maha
	        }
	        if (sekundid>3600){                                         // kui sekundeid jagub nii palju, et saab 1h
	        	j22k=sekundid % 3600;
	        	tunnid=Double.parseDouble(nullkomakohta.format(((sekundid-j22k)/3600)));//tundide t�isarv saadakse sekunditest
	        	sekundid=j22k;
	        			//(GLOBAL.sekundid-(GLOBAL.tunnid*3600));			   // v�tan sekunditest tunnid maha
	        }
	        if (sekundid>60){                                         // kui sekundeid jagub nii palju, et saab 1min
	        	j22k=sekundid % 60;
	        	minutid=Double.parseDouble(nullkomakohta.format(((sekundid-j22k)/60)));//minutite t�isarv saadakse sekunditest
	        	//System.out.println(GLOBAL.minutid);
	        	sekundid=j22k;
	        			//(GLOBAL.sekundid-(GLOBAL.minutid*60));			   // v�tan sekunditest minutid maha
	        }
	        System.out.print("Funktsioonid-kulunudmillisekundidstringiks return v��rtus:");
		System.out.println(/*""+p2evad+"Days "+*/tunnid+"h "+minutid+"min "+sekundid+"sec");
		GLOBAL.P2evTundMinutSekund[0]=""+p2evad;
		GLOBAL.P2evTundMinutSekund[1]=""+tunnid;
		GLOBAL.P2evTundMinutSekund[2]=""+minutid;
		GLOBAL.P2evTundMinutSekund[3]=""+sekundid;
		
	}
	public void muudetudAjastringmillisekunditeks(String muudetudAjastring)   // eeldusel, et string on 0d 0h 0m 0s
	{
		String[] lipuke=new String[4];
		lipuke[0]=" ";
		lipuke[1]="d";
		lipuke[2]="h";
		lipuke[3]="m";
		lipuke[4]="s";
		String jupike1=muudetudAjastring;
		String jupike2="";
		int asukoht1=0;
		int asukoht2=0;
		
		while (true){  // t�hikute eemaldamine

			if(jupike1.indexOf(lipuke[0]) != -1){        			//leidus t�hik
				asukoht2=jupike1.indexOf(lipuke[0]);     			//m�rgistan viimase koha enne tyhikut
				jupike2=jupike1.substring(asukoht1, asukoht2); 		//v�tan stringi kuni t�hikuni
				asukoht1=asukoht2;									//panen lipukesed paika
				asukoht2=jupike1.length();							//m��dan stringi pikkuse
				jupike2=jupike1.substring((asukoht1+1),asukoht2);	//v�tan stringi tagumise osa, j�ttes tyhiku v�lja(algus+1)
				jupike1=jupike1+jupike2;									//liidan jupid kokku ilma tyhikuta
				jupike2=jupike1;									//annan m�lemale sama stringi v��rtuse
				asukoht1=0;											//nullin viimase lipukese

			}else{ 													//ei leidunud tyhikut
				break;
			}			
		}
		
		if(jupike1.indexOf(lipuke[1]) != -1){        			//leidus d              // p�evad
			asukoht2=jupike1.indexOf(lipuke[1]);     			//m�rgistan viimase koha enne d
			jupike2=jupike1.substring(asukoht1, asukoht2); 		//v�tan stringi kuni d
			asukoht1=asukoht2;									//panen lipukesed paika
			asukoht2=jupike1.length();							//m��dan stringi pikkuse
			jupike2=jupike1.substring((asukoht1+1),asukoht2);	//v�tan stringi tagumise osa, j�ttes d v�lja(algus+1)
			jupike1=jupike2;									//annan m�lemale sama stringi v��rtuse
			GLOBAL.P2evTundMinutSekund[0]=jupike2;									
			asukoht1=0;											//nullin viimase lipukese

		}
		
		if(jupike1.indexOf(lipuke[2]) != -1){        			//leidus h            // tunnid
			asukoht2=jupike1.indexOf(lipuke[1]);     			//m�rgistan viimase koha enne h
			jupike2=jupike1.substring(asukoht1, asukoht2); 		//v�tan stringi kuni h
			asukoht1=asukoht2;									//panen lipukesed paika
			asukoht2=jupike1.length();							//m��dan stringi pikkuse
			jupike2=jupike1.substring((asukoht1+1),asukoht2);	//v�tan stringi tagumise osa, j�ttes h v�lja(algus+1)
			jupike1=jupike2;									//annan m�lemale sama stringi v��rtuse
			GLOBAL.P2evTundMinutSekund[1]=jupike2;									
			asukoht1=0;											//nullin viimase lipukese

		}
		
		if(jupike1.indexOf(lipuke[3]) != -1){        			//leidus m             // minutid
			asukoht2=jupike1.indexOf(lipuke[1]);     			//m�rgistan viimase koha enne m
			jupike2=jupike1.substring(asukoht1, asukoht2); 		//v�tan stringi kuni m
			asukoht1=asukoht2;									//panen lipukesed paika
			asukoht2=jupike1.length();							//m��dan stringi pikkuse
			jupike2=jupike1.substring((asukoht1+1),asukoht2);	//v�tan stringi tagumise osa, j�ttes m v�lja(algus+1)
			jupike1=jupike2;									//annan m�lemale sama stringi v��rtuse
			GLOBAL.P2evTundMinutSekund[2]=jupike2;									
			asukoht1=0;											//nullin viimase lipukese

		}
		
		if(jupike1.indexOf(lipuke[4]) != -1){        			//leidus s             // sekundid
			asukoht2=jupike1.indexOf(lipuke[1]);     			//m�rgistan viimase koha enne s
			jupike2=jupike1.substring(asukoht1, asukoht2); 		//v�tan stringi kuni s
			asukoht1=asukoht2;									//panen lipukesed paika
			asukoht2=jupike1.length();							//m��dan stringi pikkuse
			jupike2=jupike1.substring((asukoht1+1),asukoht2);	//v�tan stringi tagumise osa, j�ttes s v�lja(algus+1)
			jupike1=jupike2;									//annan m�lemale sama stringi v��rtuse
			GLOBAL.P2evTundMinutSekund[3]=jupike2;									
			asukoht1=0;											//nullin viimase lipukese

		}
		
		
		
		
		double 
		millisekundid=((Double.parseDouble(GLOBAL.P2evTundMinutSekund[0]))*86400000);
		millisekundid=millisekundid+((Double.parseDouble(GLOBAL.P2evTundMinutSekund[1])*3600000));
		millisekundid=millisekundid+((Double.parseDouble(GLOBAL.P2evTundMinutSekund[2])*60000));
		millisekundid=millisekundid+((Double.parseDouble(GLOBAL.P2evTundMinutSekund[3])*1000));
		
		
		ArvutaPerHUuesti(millisekundid);
		
		
		
	}
	
	
	public void ArvutaPerHUuesti(double uusaeg){ // seda funktsiooni pole integreeritud .... see peaks saama v��rtuse programmi aknas muudatusest
		
		
		GLOBAL.objektadenaperh=GLOBAL.objektadenaprofit/((uusaeg/3600000));						
		GLOBAL.objektancientadenaperh=GLOBAL.objektancientadenaprofit/((uusaeg/3600000));
		
		
	}
	
	
	
	
	
	
	
	public static void time()
	{

		if (!GLOBAL.timerunning){

		GLOBAL.stardiaeg = System.currentTimeMillis();

        GLOBAL.timerunning=true;
		}else{
		GLOBAL.stoppaeg=System.currentTimeMillis();
        GLOBAL.tulemus=(GLOBAL.stoppaeg-GLOBAL.stardiaeg)/1000;				/// tulemus sekundites

        DecimalFormatSymbols decimalSymbol = new DecimalFormatSymbols(Locale.getDefault());
        decimalSymbol.setDecimalSeparator('.');
        decimalSymbol.setGroupingSeparator(',');
        DecimalFormat nullkomakohta = new DecimalFormat("###",decimalSymbol);
        DecimalFormat kakskomakohta = new DecimalFormat("#.00",decimalSymbol);
        String s=(kakskomakohta.format(GLOBAL.tulemus)); 
        GLOBAL.tulemus=Double.parseDouble(s);

        GLOBAL.sekundid=GLOBAL.tulemus;
        GLOBAL.tulemussekundites=GLOBAL.sekundid;
        
        
   double j22k=0;     
        if (GLOBAL.sekundid>86400){                                         // kui sekundeid jagub nii palju, et saab 24h
        	j22k=GLOBAL.sekundid % 86400;
        	GLOBAL.h24=Double.parseDouble(nullkomakohta.format(((GLOBAL.sekundid-j22k)/86400)));//p�evade t�isarv saadakse sekunditest
        	GLOBAL.sekundid=j22k;
        			//(GLOBAL.sekundid-(GLOBAL.h24*86400));			   // v�tan sekunditest p�evad maha
        }
        if (GLOBAL.sekundid>3600){                                         // kui sekundeid jagub nii palju, et saab 1h
        	j22k=GLOBAL.sekundid % 3600;
        	GLOBAL.tunnid=Double.parseDouble(nullkomakohta.format(((GLOBAL.sekundid-j22k)/3600)));//tundide t�isarv saadakse sekunditest
        	GLOBAL.sekundid=j22k;
        			//(GLOBAL.sekundid-(GLOBAL.tunnid*3600));			   // v�tan sekunditest tunnid maha
        }
        if (GLOBAL.sekundid>60){                                         // kui sekundeid jagub nii palju, et saab 1min
        	j22k=GLOBAL.sekundid % 60;
        	GLOBAL.minutid=Double.parseDouble(nullkomakohta.format(((GLOBAL.sekundid-j22k)/60)));//minutite t�isarv saadakse sekunditest
        	//System.out.println(GLOBAL.minutid);
        	GLOBAL.sekundid=j22k;
        			//(GLOBAL.sekundid-(GLOBAL.minutid*60));			   // v�tan sekunditest minutid maha
        }
       System.out.println("sekundeid kulus : "+GLOBAL.sekundid);
        //GLOBAL.tulemus=Long.parseLong(df.format((GLOBAL.tulemus/3600)));     // tulemus tundides
       
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
			//System.out.println("a : "+a);
			double kogukulu=GLOBAL.ssdkulupp+GLOBAL.bssdkulupp+GLOBAL.hppot1kulupp+GLOBAL.hppot2kulupp+GLOBAL.alarcitykulupp+GLOBAL.mhastekulupp+GLOBAL.hastekulupp;
			GLOBAL.kogutulu=Double.parseDouble(nullkomakohta.format(((GLOBAL.adenahiljem-GLOBAL.adenaenne)-kogukulu)));
			
			kogukulu=(kogukulu)/GLOBAL.tulemus;
			//System.out.println(kogukulu);
			kogukulu=kogukulu*3600;
			//System.out.println(kogukulu);
		GLOBAL.tulemus=a;
		GLOBAL.tulemus=Double.parseDouble(kakskomakohta.format((GLOBAL.tulemus)));
		kogukulu=Double.parseDouble(kakskomakohta.format((kogukulu)));
		//System.out.println("kogukulu : "+kogukulu);
		
GLOBAL.tulemus=(GLOBAL.tulemus-(kogukulu));
GLOBAL.tulemus=Double.parseDouble(kakskomakohta.format((GLOBAL.tulemus)));
		GLOBAL.tulemusstring=(nullkomakohta.format((GLOBAL.tulemus)));
		//System.out.println(GLOBAL.tulemusstring);
		}else{
			GLOBAL.tulemusstring="Start/Stop";
		}
		
	}
	

	
	
	
	

	
	
	
}
