package INI;




/*
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


import java.util.List;


import objektid.ReaList;
import objektid.rida;

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
	}																												//Fail_Kirjuta lıpp








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


 static void LoeFaili_ScoreTXT() throws Exception {
	 
	 
	 ObjectInputStream objectInputStream = new ObjectInputStream(
		        new FileInputStream(MAIN.GLOBAL.ProgramRunLocation+MAIN.GLOBAL.ObjectSaveFileName));
		 
		// start getting the objects out in the order in which they were written
		Date date = (Date) objectInputStream.readObject();
		System.out.println("kuup‰ev      :"+date);
		System.out.println("boolean      :"+objectInputStream.readBoolean());
		System.out.println("float        :"+objectInputStream.readFloat());
		 
		// get the course object
		ReaList ridadelist = (ReaList) objectInputStream.readObject();
		System.out.println("kursus       :"+ridadelist.getName());
		rida rida1Read = ridadelist.getridadelist().get(0);
		System.out.println("tudeng1 vanus: "+rida1Read.getAge());
		System.out.println("tudeng1 nimi : "+rida1Read.getName());
		rida rida2Read = ridadelist.getridadelist().get(1);
		System.out.println("tudeng2 vanus: "+rida2Read.getAge());
		System.out.println("tudeng2 nimi : "+rida2Read.getName());
		objectInputStream.close();
	 


}

static void kirjuta_ScoreTXT() throws Exception {
	 
	 
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(
            new FileOutputStream(MAIN.GLOBAL.ProgramRunLocation+MAIN.GLOBAL.ObjectSaveFileName));
//write a date
objectOutputStream.writeObject(new Date());
//write a boolean
objectOutputStream.writeBoolean(true);
//write a float
objectOutputStream.writeFloat(1.0f);
//the other primitive types and objects can be saved as well

//create two students objects and add them in a list. create a course
//object and add the list of students to a list
rida rida1 = new rida();
rida1.setAge(30);
rida1.setName("rida1");

rida rida2 = new rida();
rida2.setAge(31);
rida2.setName("rida2");

ReaList ridadelist = new ReaList();
ridadelist.setName("Java IO");
List<rida> realist = new ArrayList<>();
realist.add(rida1);
realist.add(rida2);
ridadelist.setridadelist(realist);
objectOutputStream.writeObject(ridadelist);
objectOutputStream.flush();
objectOutputStream.close();

}
 
public void KirjutaReadTabelisse(){
	
	
	
	System.out.println("siin kirjutatakse viie rea v‰‰rtused viiele global reale...failifuntsioonid.kirjutareadtabelisse");
	
	
	
	
}




}

