package INI;




/*
 * SISUKORD
 * 
 * 1)Fail_Kirjuta(String Faili_Nimi, String[] Sisu, String Kirjutamise_Moodus, int sisu_suurus)
 * 	Ilmselt INI fail. Kirjutab sinna "Append" Stringi jada. Kui pole, siis loob selle.
 * 
 * 2)String[] LoeFaili_Aadress_Algus_L6pp(String Read_File_Name)
 * 	Loeb etteantud faili ja väljastab selle sisu tagasi String jadana
 * 
 * 3)kustutafail()
 * 	Kustutab faili MAIN.GLOBAL.SaveFileName
 * 
 * 4)scoreadd(String Score)
 * 	Kirjutab sisseantud stringi faili Score.txt
 * 
 * 5)kustutaini()
 * 	Kustutab faili: L2Calc.ini
 * 
 * 6)LoeFaili_ScoreTXT()
 * 	Loeb faili Score.txt ja omistab selle sisu Listile: MAIN.GLOBAL.objektilistrida
 * 
 * 7)kirjuta_ScoreTXT()
 * 	Kirjutab Listi: MAIN.GLOBAL.objektilistrida faili: Score.txt
 * 
 * 
 *                        Sisendiks anda  :  (String file name, String sisu, String t2psustus(append/rewrite))
 *                        Output gives: Boolean false=error, true=done;
 * 
 * */


import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;


import java.util.Iterator;
import java.util.List;

import MAIN.rida;

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


 static void LoeFaili_ScoreTXT() throws Exception {
	 
	 
	 ObjectInputStream objectInputStream = new ObjectInputStream(
		        new FileInputStream(MAIN.GLOBAL.ProgramRunLocation+MAIN.GLOBAL.ObjectSaveFileName));
		 
		Date date = (Date) objectInputStream.readObject();
		System.out.println("kuupäev      :"+date);
		System.out.println("boolean      :"+objectInputStream.readBoolean());
		System.out.println("float        :"+objectInputStream.readFloat());
		 
		// get the course object
		MAIN.GLOBAL.objektilistrida= (List) objectInputStream.readObject();
		
/*
		ReaList ridadelist = (ReaList) objectInputStream.readObject();
		MAIN.GLOBAL.objektilistrida=ridadelist;
*/		
		
		rida rida1Read = MAIN.GLOBAL.objektilistrida.get(0);
		System.out.println("Chari nimi : "+rida1Read.getCharname());
		System.out.println("Asukoht    : "+rida1Read.getLocationname());
		rida rida2Read = MAIN.GLOBAL.objektilistrida.get(1);
		System.out.println("Chari nimi : "+rida2Read.getCharname());
		System.out.println("Asukoht    : "+rida2Read.getLocationname());
		objectInputStream.close();
	 


}

static void kirjuta_ScoreTXT() throws Exception {
	 
	 
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(
            new FileOutputStream(MAIN.GLOBAL.ProgramRunLocation+MAIN.GLOBAL.ObjectSaveFileName));

objectOutputStream.writeObject(new Date());

objectOutputStream.writeBoolean(true);

objectOutputStream.writeFloat(1.0f);
 



objectOutputStream.writeObject(MAIN.GLOBAL.objektilistrida);
objectOutputStream.flush();
objectOutputStream.close();




}
 



}



