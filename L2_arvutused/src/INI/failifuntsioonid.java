package INI;




/*
 *                        Sisendiks anda  :  (String file name, String sisu, String t2psustus(append/rewrite))
 *                        Output gives: Boolean false=error, true=done;
 * 
 * */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class failifuntsioonid
{


	public static boolean Fail_Kirjuta(String Faili_Nimi, String[] Sisu, String Kirjutamise_Moodus, int sisu_suurus) throws Exception //Fail_Kirjuta algus
	{

	boolean moodus=true;
	
	File f=new File(Faili_Nimi);
		if (!f.exists())
		{
			if ( !f.createNewFile() ) 
			{
				return false;
			}
		}
		if (Kirjutamise_Moodus.equalsIgnoreCase("append"))
		{
			moodus=true;
		}else
		{
			moodus=false;
		}
		BufferedWriter output;
		output = new BufferedWriter(new FileWriter(Faili_Nimi,moodus));
		
		int i=0;
while (i<sisu_suurus){
	output.write(Sisu[i]);
	output.newLine();
	i++;
}

	        output.close();
	        
	        
	        return true;
	}																												//Fail_Kirjuta lõpp








	public static String[] LoeFaili_Aadress_Algus_L6pp(String Read_File_Name) throws Exception {
		// Construct BufferedReader from FileReader
		BufferedReader br = new BufferedReader(new FileReader(Read_File_Name));
	 
		String[] line = new String[MAIN.GLOBAL.INI_lines];
		String rida= null;
		int i=0;
		while ((rida = br.readLine()) != null) {
			line[i]=rida;
			//System.out.println(i+"  "+line[i]);
			i++;
		}
	 
		br.close();
		
		return line;

	}
	public static void kustutafail()
	{
		try{
			 
    		File file = new File(MAIN.GLOBAL.SaveFileName);
 
    		if(file.delete()){
    		//	System.out.println(file.getName() + " is deleted!");
    		}else{
    		//	System.out.println("Delete operation is failed.");
    		}
 
    	}catch(Exception e){
    		System.out.println("Mingi jama faili kustutamisega... failifuntsioonid");
    		//e.printStackTrace();
 
    	}
	}
public static void peitu()
{
	
}
public static void scoreadd(String Score) throws IOException
{
	boolean olemas=false;
	File f=new File(System.getProperty("user.dir")+"\\"+"Score.txt");
	if (!f.exists())
	{
		if ( !f.createNewFile() ) 
		{
		
		}
	}else
	{
	olemas=true;	
	}
	

	BufferedWriter output;
	output = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"\\"+"Score.txt",true));
	
if(olemas){output.newLine();}
output.write(Score);



        output.close();
	
	
	
	
	
}



public static void kustutaini() throws IOException
{
	boolean olemas=false;
	File ini=new File(System.getProperty("user.dir")+"\\"+"L2Calc.ini");

	
	try{
		 
		

		if(ini.delete()){
			//System.out.println(ini.getName() + " is deleted!");
		}else{
			System.out.println("Delete operation failed.");
		}

	}catch(Exception e){

		e.printStackTrace();

	}




     
	
	
	
	
	
}









}

