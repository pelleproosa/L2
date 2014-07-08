package MAIN;

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
	
	
	
	
	
	
	
	//File
	public static String SaveFileName="L2Calc.ini";
	public static int INI_lines=16;
	public static int yourInputFieldArv=42;
	public static int MinuOutputArv=33;
	public static int labeliteArv=34;
	//Window
	public static String aknanimi="L2 Calc v.5";
	public static int width=1050;
	public static int height=700;
	//Columns and Rows in window drawing
    public static double size[][] = {
    	{90, 90, 90, 90, 90, 200, 90, 90, 90, 90, 90, 90}, // Columns selle rea saab ees 0: String tulbad=""+GLOBAL.size[0][..];
    	{30, 30, 30, 30, 30, 30, 30, 30, 30, 30,
    	 30, 30, 30, 30, 30, 30, 30, 30, 30, 30} // Rows     selle rea saab ees 1: String tulbad=""+GLOBAL.size[1][..];
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
    public static String btn9="Save";
    public static String btn10="Reset Calc.ini";
    public static String btn11="Delete";
    public static String btn12="Up";
    public static String btn13="Down";
    public static String btn14="Edit";
    
    public static String label[] = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14};        /*seda ei pane INI faili*/
    //Buttons locations(column,row)
    public static String btnlocation_1="6, 2";
    public static String btnlocation_2="7, 2";
    public static String btnlocation_3="6, 3";
    public static String btnlocation_4="7, 3";
    public static String btnlocation_5="4, 5";
    public static String btnlocation_6="5, 5";
    public static String btnlocation_7="2, 9";
    public static String btnlocation_8="4, 9";
    public static String btnlocation_9="8, 12";
    public static String btnlocation_10="7, 9";
    public static String btnlocation_11="9, 12";
    public static String btnlocation_12="8, 16";
    public static String btnlocation_13="8, 18";
    public static String btnlocation_14="8, 17";
    
    public static String lbllocation_1="9, 8";
    public static String lbl1string="MAIN.GLOBAL.lbl1string";
    public static String[] labellocation={"","1,8","0,1","3,8","6,8","2,7",
    										 "0,3","0,4","0,9","3,7","0,12",			//10
    									  	 "1,0","2,0","3,0","4,0","0,13",
    									  	 "6,0","7,0","0,10","0,11","2,8",			//20
    									  	 "5,8","0,14","0,15","0,16","5,10",
    									  	 "6, 11","7, 11","4, 11","5, 11","5, 14",	//30
    									  	 "0, 17","0, 18","0, 19"};
    public static String[] labeltext={"ei kasuta","Before Start","Inventory","After Stop","Adena/h","PROFIT ",
    											  "Results","Buy","Adena INPUT","CALCULATOR","HP pot.1",						//10
    											  "Adena","Soul.O","Spirit.O","Cry.D","HP pot.2",
    											  "BSSD","SSD","Spiritshots","SoulShots","1 item Price",						//20
    											  "Spent time","Alarcity pot","M. Haste","Haste","SAVE RESULT TO 'Score.txt'",
    											  "adena/h","Average from","Char name", "Location","SCORE.TXT",					//30
    											  "Blue stone","Green stone","Red stone"};				
    		
 
 

//    BSSDRequested
 //   SSDRequested‏
    
	public static String[] inputlocation={"10, 9",
											"1, 1","2, 1","3, 1","4, 1","6, 4",
											"7, 4","1, 9","3, 9","1, 10","2, 10",		//10
											"3, 10","1, 11","2, 11","3, 11","1, 12",
											"2, 12","3, 12","1, 13","2, 13","3, 13",	//20
											"1, 14","2, 14","3, 14","1, 15","2, 15",
											"3, 15","1, 16","2, 16","3,16","4, 12",		//30
											"5, 12","6, 12","7, 12","1, 17","2, 17",
											"3, 17","1, 18","2, 18","3, 18","1, 19",	//40
											"2, 19","3, 19"};
	public static String[] outputlocation={"10, 10",
										   "1, 3","2, 3","3, 3","4, 3","2, 4",
										   "3, 4","4, 4","6, 9","5, 9","4, 15",			//10
										   "5, 15","6, 15","7, 15","4, 16","5, 16",
										   "6, 16","7, 16","4, 17","5, 17","6, 17",		//20
										   "7, 17",",4, 18","5, 18","6, 18","7, 18",
										   "4, 19","5, 19","6, 19","7, 19","",			//30
										   "","",""};

// Timer
	public static double stardiaeg=0;
	public static String stardiaegstring="";
	public static double stoppaeg=0;
	public static String stoppaegstring="";
	public static double tulemus=0;
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

	
}