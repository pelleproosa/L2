package MAIN;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import objektid.rida;




public class GLOBAL {
/*public static int[] minginrjada = new int[3];
	public static String[] mingistringijada = new String[3];
*/	
	public static double cryDReserv = 0;
	public static double spiritReserv = 0;
	public static double soulReserv = 0;
	public static double adenaReserv = 0;
	public static double BSSDRequested = 0;
	public static double SSDRequested = 0;
	
	public static double cryDLump = 20;
	public static double spiritLump = 1;
	public static double soulLump = 1;
	public static double cryDPrice = 636;
	public static double spiritPrice = 480;
	public static double soulPrice = 300;
	public static double spiritReservAlguses = 0;
	public static double cryDReservAlguses = 0;
	public static double soulReservAlguses = 0;
	public static double cryDKogusOsta = 0;
	public static double spiritKogusOsta = 0;
	public static double soulKogusOsta = 0;
	public static double cryDJ2rel = 0;
	public static double spiritJ2rel = 0;
	public static double soulJ2rel = 0;	
	public static double BSSDHits = 0;
	public static double SSDHits = 0;
	public static double BSSDShots = 0;
	public static double SSDShots = 0;
	public static double cryDKuluPerHitBSSD = 2;
	public static double spiritKuluPerHit = 8;
	public static double BSSDOutputAmount = 100;
	public static double cryDKuluPerHitSSD = 3;
	public static double soulKuluPerHit = 9;
	public static double SSDOutputAmount = 468;
	public static double BSSDReal = 0;
	public static double SSDReal = 0;
	public static double adenaKulu = 0;
	public static String craftAdenaAssessment = "";	
// hinnadpp
	public static double yksBssD=51.12;
	public static double yksssD=9.85;
	public static double yksHPpot1=396;
	public static double yksHPpot2=0;
	public static double yksAlarcity=2880;
	public static double yksMHaste=2880;
	public static double yksHaste=1560;
	public static double yksSpiritOre=0;
	public static double yksCrystalD=636;
	public static double yksbluess=3;
	public static double yksgreenss=5;
	public static double yksredss=10;
	//////// objekt
	
	
	public static rida objektrida;
	
	public static List <rida> objektilistrida=new ArrayList<>();
	//public static CDList[] jada=new CDList[10];
	public static CDList cd;
	public static List <CDList> jada=new ArrayList<>();
	

	public static int objektreanumber=0;
	public static String objektcharname="";
	public static String objektlocname="";
	public static int objektadenaprofit=0;
	public static int objektancientadenaprofit=0;
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");             ///date to string
	public static String objektdate = sdf.format(new Date()); 
	public static String objektKuvatavAeg="";
	public static String[] P2evTundMinutSekund=new String [3];
	public static double objektspenttimeinseconds=0;
	public static double objektadenaperh=0;
	public static double objektancientadenaperh=0;

	
	static String[] Tabelirida1={"4, 11","5, 11","6, 11","7, 11","8, 11","9, 11","10, 11","11, 11"}; //output 10 .. 13. input 30 .. 33
	static String[] Tabelirida2={"4, 12","5, 12","6, 12","7, 12","8, 12","9, 12","10, 12","11, 12"}; //output 14 .. 17. input 43 .. 46
	static String[] Tabelirida3={"4, 13","5, 13","6, 13","7, 13","8, 13","9, 13","10, 13","11, 13"}; //out 18 .. 21 in 47 .. 50
	static String[] Tabelirida4={"4, 14","5, 14","6, 14","7, 14","8, 14","9, 14","10, 14","11, 14"}; //o 22 .. 25. i 51 .. 54
	static String[] Tabelirida5={"4, 15","5, 15","6, 15","7, 15","8, 15","9, 15","10, 15","11, 15"}; //outputlocation 26 .. 29 inputlocation 55 .. 58
	static String[] Tabelirida6={"4, 16","5, 16","6, 16","7, 16","8, 16","9, 16","10, 16","11, 16"}; // input 59 .. 66
	static String[] Tabelirida7={"4, 17","5, 17","6, 17","7, 17","8, 17","9, 17","10, 17","11, 17"}; // input 67 .. 74
	static String[] Tabelirida8={"4, 18","5, 18","6, 18","7, 18","8, 18","9, 18","10, 18","11, 18"}; // input 75 .. 82
	static String[] Tabelirida9={"4, 19","5, 19","6, 19","7, 19","8, 19","9, 19","10, 19","11, 19"}; // input 83 .. 90
	

	//public static String tabelirida1jada[]=tabelirida1.getTabelirida();
	
	//tabelirida1jada=tabelirida1.getTabelirida();



	
	
	
	
	
	
	
	//File
	public static String SaveFileName="L2Calc.ini";
	public static String ObjectSaveFileName="ObjectsSave.obj";
	public static String DesktopLocation=(System.getProperty("user.home")+"\\Desktop\\");
	public static String ProgramRunLocation=(System.getProperty("user.dir")+"\\");
	
	public static int INI_lines=16;
	public static int yourInputFieldArv=90;
	public static int MinuOutputArv=33;
	public static int labeliteArv=35;
	//Window
	public static String aknanimi="L2 Calc v.5";
	public static int width=1450;
	public static int height=700;
	//Columns and Rows in window drawing
    public static double size[][] = {
    	{90, 90, 90, 90, 90, 200, 90, 90, 90, 90, 90, 20,90,90,90}, // Columns selle rea saab ees 0: String tulbad=""+GLOBAL.size[0][..];
    	{30, 30, 30, 30, 30, 30, 30, 30, 30, 30,
    	 30, 30, 30, 30, 30, 30, 30, 30, 30, 30,
    	 30, 30, 30} // Rows     selle rea saab ees 1: String tulbad=""+GLOBAL.size[1][..];
    								};
    public static String tulbadFunktsioonist="";
    public static String readFunktsioonist="";
    public static boolean displaylocations=true;
    public static String locationskirjefailis="Display locations=false";
    //Buttons
    public static String btn1="Mats->BSSD";
    public static String btn2="Mats->SSD";
    public static String btn3="BSSD->Mats";
    public static String btn4="SSD->Mats";
    public static String btn5="Result->Inv";
    public static String btn6="Clear All";
    public static String btn7="Start/Stop";
    public static String btn8="Calculate";
    public static String btn9="Save/Recalc";
    public static String btn10="Reset Calc.ini";
    public static String btn11="Delete";
    public static String btn12="Up";
    public static String btn13="Down";
    public static String btn14="Cancel";
    public static String btn15="Show currently spent time";
    
    public static String label[] = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15};        /*seda ei pane INI faili*/
    //Buttons locations(column,row)
    public static String btnlocation_1="6, 2";
    public static String btnlocation_2="7, 2";
    public static String btnlocation_3="6, 3";
    public static String btnlocation_4="7, 3";
    public static String btnlocation_5="4, 5";
    public static String btnlocation_6="5, 5";
    public static String btnlocation_7="2, 9";
    public static String btnlocation_8="4, 9";
    public static String btnlocation_9="12, 15";
    public static String btnlocation_10="7, 9";
    public static String btnlocation_11="13, 15";
    public static String btnlocation_12="12, 14";
    public static String btnlocation_13="12, 16";
    public static String btnlocation_14="14, 15";
    public static String btnlocation_15="5, 8";
    
    public static String lbllocation_1="9, 8";
    public static String lbl1string="MAIN.GLOBAL.lbl1string";
    public static String[] labellocation={"","1,8","0,1","3,8","9,10","2,7",
    										 "0,3","0,4","0,9","3,7","0,12",			//10
    									  	 "1,0","2,0","3,0","4,0","0,13",
    									  	 "6,0","7,0","0,10","0,11","2,8",			//20
    									  	 "10,10","0,14","0,15","0,16","11,10",
    									  	 "6, 10","8, 10","4, 10","5, 10","5, 9",	//30
    									  	 "0, 17","0, 18","0, 19","7,10"};
    public static String[] labeltext={"ei kasuta","Before Start","Inventory","After Stop","Adena/h","PROFIT ",
    											  "Results","Buy","Adena INPUT","CALCULATOR","HP pot.1",						//10
    											  "Adena","Soul.O","Spirit.O","Cry.D","HP pot.2",
    											  "BSSD","SSD","Spiritshots","SoulShots","1 item Price",						//20
    											  "AncientAdena/h","Alarcity pot","M. Haste","Haste","Nr",
    											  "Adena","Time","Char name", "Location","SCORE.TXT",					//30
    											  "Blue stone","Green stone","Red stone","Ancient Adena"};				
    		
 
 

//    BSSDRequested
 //   SSDRequested‏
    
	public static String[] inputlocation={"10, 9",
											"1, 1","2, 1","3, 1","4, 1","6, 4",
											"7, 4","1, 9","3, 9","1, 10","2, 10",		//10
											"3, 10","1, 11","2, 11","3, 11","1, 12",
											"2, 12","3, 12","1, 13","2, 13","3, 13",	//20
											"1, 14","2, 14","3, 14","1, 15","2, 15",
											"3, 15","1, 16","2, 16","3,16",Tabelirida1[4],		//30
											Tabelirida1[5],Tabelirida1[6],Tabelirida1[7],"1, 17","2, 17",
											"3, 17","1, 18","2, 18","3, 18","1, 19",	//40
											"2, 19","3, 19",Tabelirida2[4],Tabelirida2[5],Tabelirida2[6],
											Tabelirida2[7],Tabelirida3[4],Tabelirida3[5],Tabelirida3[6],Tabelirida3[7],		//50
											Tabelirida4[4],Tabelirida4[5],Tabelirida4[6],Tabelirida4[7],Tabelirida5[4],
											Tabelirida5[5],Tabelirida5[6],Tabelirida5[7],Tabelirida6[0],Tabelirida6[1],      	//60
											Tabelirida6[2],Tabelirida6[3],Tabelirida6[4],Tabelirida6[5],Tabelirida6[6],
											Tabelirida6[7],Tabelirida7[0],Tabelirida7[1],Tabelirida7[2],Tabelirida7[3],		//70
											Tabelirida7[4],Tabelirida7[5],Tabelirida7[6],Tabelirida7[7],Tabelirida8[0],
											Tabelirida8[1],Tabelirida8[2],Tabelirida8[3],Tabelirida8[4],Tabelirida8[5],			//80
											Tabelirida8[6],Tabelirida8[7],Tabelirida9[0],Tabelirida9[1],Tabelirida9[2],
											Tabelirida9[3],Tabelirida9[4],Tabelirida9[5],Tabelirida9[6],Tabelirida9[7]};		//90
	public static String[] outputlocation={"10, 10",
										   "1, 3","2, 3","3, 3","4, 3","2, 4",
										   "3, 4","4, 4","6, 9","5, 9",Tabelirida1[0],	//10
										   Tabelirida1[1],Tabelirida1[2],Tabelirida1[3],Tabelirida2[0],Tabelirida2[1],
										   Tabelirida2[2],Tabelirida2[3],Tabelirida3[0],Tabelirida3[1],Tabelirida3[2],		//20
										   Tabelirida3[3],Tabelirida4[0],Tabelirida4[1],Tabelirida4[2],Tabelirida4[3],
										   Tabelirida5[0],Tabelirida5[1],Tabelirida5[2],Tabelirida5[3],"",			//30
										   "","",""};

// Timer
	public static double stardiaeg=0;
	public static String stardiaegstring="";
	public static double stoppaeg=0;
	public static String stoppaegstring="";
	public static double tulemus=0;
	public static double tulemussekundites=0;
	public static String tulemusstring="";
	public static boolean timerunning=false;
	public static double sekundid=0;
	public static double minutid=0;
	public static double tunnid=0;
	public static double h24=0;
	public static double adenaenne=0;
	public static double adenahiljem=0;
	public static String ajavahemikpp="";
	public static double ssdkulupp=0;
	public static double bssdkulupp=0;
	public static double hppot1kulupp=0;
	public static double hppot2kulupp=0;
	public static double alarcitykulupp=0;
	public static double mhastekulupp=0;
	public static double hastekulupp=0;
	public static double bluesspp=0;
	public static double greensspp=0;
	public static double redsspp=0;
	public static double stonesAAvaluepp=0;
	public static double kogutulu=0;
	

	
	
}