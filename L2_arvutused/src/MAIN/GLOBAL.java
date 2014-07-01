package MAIN;

public class GLOBAL {
public static int[] minginrjada = new int[3];
	public static String[] mingistringijada = new String[3];
	public static int ChrystalD=0;
	public static int craft_kogus_SSD=0;
	public static int craft_kogus_BSSD=0;
	public static int ChrystalC=0;
	public static int craft_kogus_SSC=0;
	public static int craft_kogus_BSSC=0;
	public static int ChrystalB=0;
	public static int craft_kogus_SSB=0;
	public static int craft_kogus_BSSB=0;
	public static int ChrystalA=0;
	public static int craft_kogus_SSA=0;
	public static int craft_kogus_BSSA=0;
	public static int ChrystalS=0;
	public static int craft_kogus_SSS=0;
	public static int craft_kogus_BSSS=0;
	public static int soul_ore=0;
	public static int spirit_ore=0;
	//File
	public static String SaveFileName="L2Calc.ini";
	public static int INI_lines=130;
	public static int yourInputFieldArv=28;
	public static int MinuOutputArv=28;
	public static int labeliteArv=20;
	//Window
	public static String aknanimi="Sisu muutmine MAIN.GLOBAL...";
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
    public static String btn1="Adena->BSSD";
    public static String btn2="Adena->SSD";
    public static String btn3="BSSD->Mats";
    public static String btn4="SSD->Mats";
    public static String btn5="result->inv";
    public static String btn6="clear input";
    public static String label[] = {btn1, btn2, btn3, btn4, btn5, btn6};        /*seda ei pane INI faili*/
    //Buttons locations(column,row)
    public static String btnlocation_1="4, 3";
    public static String btnlocation_2="6, 3";
    public static String btnlocation_3="8, 3";
    public static String btnlocation_4="2, 3";
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
											"8, 7","2, 1","4, 7","4, 8","4, 9",
											"7, 7","4, 1","5, 4","5, 5","5, 6",
											"5, 7","5, 8","5, 9","6, 1","8, 6",
											"1, 1","6, 4","6, 5","6, 6","6, 7",
											"6, 8","6, 9","7, 1","8, 5","8, 9",
											"3, 1","7, 5","7, 6"};
	public static String[] outputlocation={"10, 10",
										   "4, 6","1, 5","1, 4","1, 6","1, 7",
										   "1, 8","1, 9","9, 5","8, 8","2, 4",
										   "2, 5","2, 6","2, 7","2, 8","2, 9",
										   "9, 6","7, 9","3, 4","3, 5","3, 6",
										   "3, 7","3, 8","3, 9","9, 9","7, 8",
										   "6, 9","4, 4","4, 5"};


	public static boolean mingiboolean=false;
}