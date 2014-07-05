package MAIN;

public class GLOBAL {
/*public static int[] minginrjada = new int[3];
	public static String[] mingistringijada = new String[3];
*/	
	public static double cryDReserv = 51;
	public static double spiritReserv = 1;
	public static double soulReserv = 7;
	public static double adenaReserv = 15000;
	public static double BSSDRequested = 11000;
	public static double SSDRequested = 19000;
	
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
	
	
	
	
	
	
	
	
	
	//File
	public static String SaveFileName="L2Calc.ini";
	public static int INI_lines=130;
	public static int yourInputFieldArv=6;
	public static int MinuOutputArv=7;
	public static int labeliteArv=20;
	//Window
	public static String aknanimi="L2 Calc v.1";
	public static int width=850;
	public static int height=350;
	//Columns and Rows in window drawing
    public static double size[][] = {
    	{90, 90, 90, 90, 90, 90, 90, 90, 90, 90}, // Columns selle rea saab ees 0: String tulbad=""+GLOBAL.size[0][..];
    	{30, 30, 30, 30, 30, 30, 30, 30, 30, 30} // Rows     selle rea saab ees 1: String tulbad=""+GLOBAL.size[1][..];
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
    public static String label[] = {btn1, btn2, btn3, btn4, btn5, btn6};        /*seda ei pane INI faili*/
    //Buttons locations(column,row)
    public static String btnlocation_1="6, 2";
    public static String btnlocation_2="7, 2";
    public static String btnlocation_3="6, 3";
    public static String btnlocation_4="7, 3";
    public static String btnlocation_5="4, 8";
    public static String btnlocation_6="6, 8";
    public static String lbllocation_1="9, 8";
    public static String lbl1string="MAIN.GLOBAL.lbl1string";
    public static String[] labellocation={"","0,0","0,1","1,3","0,3","0,4","0,5","0,6","0,7","0,8","0,9",
    									  	 "1,0","2,0","3,0","4,0","5,0","6,0","7,0","8,0","9,0"};
    public static String[] labeltext={"ei kasuta","lbl1","Inventory","lbl3","lbl4","lbl5","Results","Buy","lbl8","lbl9","lbl10","Adena","Soul.O","Spirit.O","Cry.D","lbl15","BSSD","SSD","lbl18","lbl19"};
    		
 
 

//    BSSDRequested
 //   SSDRequested‏
    
	public static String[] inputlocation={"10, 9",
											"1, 1","2, 1","3, 1","4, 1","6, 5",
											"7, 5","4, 8","5, 4","5, 5","5, 6",
											"5, 7","5, 8","5, 9","6, 1","8, 6",
											"8, 7","6, 4","4, 9","6, 6","6, 7",
											"6, 8","6, 9","7, 1","8, 5","8, 9",
											"4, 7","7, 7","7, 6"};
	public static String[] outputlocation={"10, 10",
										   "1, 5","2, 5","3, 5","4, 5","2, 6",
										   "3, 6","4, 6","9, 5","8, 8","2, 4",
										   "2, 5","2, 6","2, 7","2, 8","2, 9",
										   "9, 6","7, 9","3, 4","3, 5","3, 6",
										   "3, 7","3, 8","3, 9","9, 9","7, 8",
										   "6, 9","4, 4","4, 5"};


	public static boolean mingiboolean=false;
}