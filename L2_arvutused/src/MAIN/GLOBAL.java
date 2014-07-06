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
	public static double yksHPpot1=0;
	public static double yksHPpot2=0;
	public static double yksAlarcity=0;
	public static double yksMHaste=0;
	public static double yksHaste=0;
	public static double yksSpiritOre=0;
	public static double yksCrystalD=0;
	
	
	
	
	
	
	
	//File
	public static String SaveFileName="L2Calc.ini";
	public static int INI_lines=16;
	public static int yourInputFieldArv=29;
	public static int MinuOutputArv=9;
	public static int labeliteArv=25;
	//Window
	public static String aknanimi="L2 Calc v.1";
	public static int width=850;
	public static int height=700;
	//Columns and Rows in window drawing
    public static double size[][] = {
    	{90, 90, 90, 90, 90, 110, 90, 90, 90, 90}, // Columns selle rea saab ees 0: String tulbad=""+GLOBAL.size[0][..];
    	{30, 30, 30, 30, 30, 30, 30, 30, 30, 30,
    	 30, 30, 30, 30, 30, 30, 30, 30, 30, 30} // Rows     selle rea saab ees 1: String tulbad=""+GLOBAL.size[1][..];
    								};
    public static String tulbadFunktsioonist="";
    public static String readFunktsioonist="";
    public static boolean displaylocations=false;
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
    public static String label[] = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8};        /*seda ei pane INI faili*/
    //Buttons locations(column,row)
    public static String btnlocation_1="6, 2";
    public static String btnlocation_2="7, 2";
    public static String btnlocation_3="6, 3";
    public static String btnlocation_4="7, 3";
    public static String btnlocation_5="4, 5";
    public static String btnlocation_6="5, 5";
    public static String btnlocation_7="2, 9";
    public static String btnlocation_8="4, 9";
    public static String lbllocation_1="9, 8";
    public static String lbl1string="MAIN.GLOBAL.lbl1string";
    public static String[] labellocation={"","1,8","0,1","3,8","6,8","2,7",
    										 "0,3","0,4","0,9","3,7","0,12",
    									  	 "1,0","2,0","3,0","4,0","0,13",
    									  	 "6,0","7,0","0,10","0,11","2,8",
    									  	 "5,8","0,14","0,15","0,16"};
    public static String[] labeltext={"ei kasuta","Before Start","Inventory","After Stop","Adena/h","PROFIT ",
    											  "Results","Buy","Adena INPUT","CALCULATOR","HP pot.1",
    											  "Adena","Soul.O","Spirit.O","Cry.D","HP pot.2",
    											  "BSSD","SSD","SoulShots","Spiritshots","1 item Price",
    											  "Spent time","Alarcity pot","M. Haste","Haste"};
    		
 
 

//    BSSDRequested
 //   SSDRequested‏
    
	public static String[] inputlocation={"10, 9",
											"1, 1","2, 1","3, 1","4, 1","6, 4",
											"7, 4","1, 9","3, 9","1, 10","2, 10",
											"3, 10","1, 11","2, 11","3, 11","1, 12",
											"2, 12","3, 12","1, 13","2, 13","3, 13",
											"1, 14","2, 14","3, 14","1, 15","2, 15",
											"3, 15","1, 16","2, 16","3,16"};
	public static String[] outputlocation={"10, 10",
										   "1, 3","2, 3","3, 3","4, 3","2, 4",
										   "3, 4","4, 4","6, 9","5, 9","2, 4",
										   "2, 5","2, 6","2, 7","2, 8","2, 9",
										   "9, 6","7, 9","3, 4","3, 5","3, 6",
										   "3, 7","3, 8","3, 9","9, 9","7, 8",
										   "6, 9","4, 4","4, 5"};

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