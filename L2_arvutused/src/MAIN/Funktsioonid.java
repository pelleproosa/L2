package MAIN;

import java.sql.Date;
import java.text.SimpleDateFormat;



public class Funktsioonid {

	
	public static void TulbadReadDoubleJadasse(String text1, String text2) { // Window tulbad/read
		
		String lipuke[]={"{", " ", ",", "}"};
		
		String a="";
		String b="";
		int asukoht1=0;
		int asukoht2=0;
		int tulpRidaLugeja=0;
		double[] column = new double[10];
		double[] row = new double[10];

		boolean tulp=true;
		boolean rida=false;
		
		boolean loetud=false;
		a=text1;
		asukoht1=0;
		b=a;

		
		while(loetud==false){

						while (true){

							if(b.indexOf(lipuke[1]) != -1){        //leidus tühik
								asukoht2=b.indexOf(lipuke[1]);     //märgistan viimase koha enne tyhikut
								b=b.substring(asukoht1, asukoht2); //võtan stringi kuni tühikuni
								asukoht1=asukoht2;					//panen lipukesed paika
								asukoht2=a.length();					//
								a=a.substring((asukoht1+1),asukoht2);
								b=b+a;
								a=b;
								asukoht1=0;

							}else{ 
								break;
							}			

						}

		asukoht1=0;
		
		
		while (true){

					if(b.indexOf(lipuke[2]) != -1){        	//leidus koma
						asukoht2=b.indexOf(lipuke[2]);     	//märgistan viimase koha enne koma
						b=b.substring((asukoht1+1), asukoht2); 	//võtan stringi peale loogilist kuni komani
					//	System.out.println("#"+b+"#");
	           
						if(tulp){column[tulpRidaLugeja]=Double.parseDouble(b);     tulpRidaLugeja++;a=a.substring((asukoht2+1),a.length());/*System.out.println(column[(tulpRidaLugeja-1)]+" # "+a);*/}
						if(rida){row[tulpRidaLugeja]=Double.parseDouble(b);     tulpRidaLugeja++;a=a.substring((asukoht2+1),a.length());/*System.out.println(row[(tulpRidaLugeja-1)]+" # "+a);*/}
	           
	         
	          
						a="{"+a;
						asukoht1=0;					//panen lipukesed paika
						asukoht2=a.length();					//
	           
						b=a;
					}else{                          // koma ei leidnud
					//	System.out.println("else");
						if((a.length())>2){ 						// Sisu on rohkem kui kaks loogilist sulgu {}
						//	System.out.println("a>2");
							b=a;
							asukoht2=((b.length())-1);
							b=b.substring(1,asukoht2);
							a=b;
							if(tulp){ if(tulpRidaLugeja==9){tulp=false; rida=true;  column[tulpRidaLugeja]=Double.parseDouble(b);/*System.out.println("tulp==false, kümnes väärtus="+column[tulpRidaLugeja]);*/tulpRidaLugeja=0;a=text2;b=a;break;}} 
							if(rida){ if(tulpRidaLugeja==9){rida=false;}  row[tulpRidaLugeja]=Double.parseDouble(b);}

						}
						break;

					}			
			}

		if((!tulp)&(!rida)){loetud=true;/*System.out.println("loetud==true");*/break;}

		}

		double c[][]={
				{column[0],column[1],column[2],column[3],column[4],column[5],column[6],column[7],column[8],column[9]},
					  {row[0],row[1],row[2],row[3],row[4],row[5],row[6],row[7],row[8],row[9]}
		};
		GLOBAL.size=c;                //omistasin väärtuse Globalisse tagasi

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
		
		long yourmilliseconds = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");

        Date resultdate = new Date(yourmilliseconds);
        System.out.println(sdf.format(resultdate));
	}
}
