package INI;

import java.io.FileNotFoundException;



public class INI_GLOBAL {
	public static void start(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] tulem = new String[MAIN.GLOBAL.INI_lines];
	try {
		tulem=failifuntsioonid.LoeFaili_Aadress_Algus_L6pp(MAIN.GLOBAL.SaveFileName);
		//tulem[0] on ebaoluline
		MAIN.GLOBAL.SaveFileName=tulem[1];
		MAIN.GLOBAL.INI_lines=Integer.parseInt(tulem[2]);
		//tulem[3] on ebaoluline
		MAIN.GLOBAL.aknanimi=tulem[4];
		MAIN.GLOBAL.width=Integer.parseInt(tulem[5]);
		MAIN.GLOBAL.height=Integer.parseInt(tulem[6]);
		MAIN.Funktsioonid.TulbadReadDoubleJadasse(tulem[8],tulem[9]); //sisestab 8 ja 9 funtsioonis.
		MAIN.GLOBAL.btn1=tulem[11];
		MAIN.GLOBAL.btn2=tulem[12];
		MAIN.GLOBAL.btn3=tulem[13];
		MAIN.GLOBAL.btn4=tulem[14];
		MAIN.GLOBAL.lbl1string=tulem[15];
		// ... vaba ruum uutele komponentidele
		MAIN.GLOBAL.btnlocation_1=tulem[26];
		MAIN.GLOBAL.btnlocation_2=tulem[27];
		MAIN.GLOBAL.btnlocation_3=tulem[28]; 
		MAIN.GLOBAL.btnlocation_4=tulem[29];
		MAIN.GLOBAL.lbllocation_1=tulem[30];
		MAIN.GLOBAL.inputlocation[1]=tulem[31];
		MAIN.GLOBAL.inputlocation[2]=tulem[32];
		MAIN.GLOBAL.inputlocation[3]=tulem[33];
		MAIN.GLOBAL.inputlocation[4]=tulem[34];
		MAIN.GLOBAL.inputlocation[5]=tulem[35];
		MAIN.GLOBAL.inputlocation[6]=tulem[36];
		MAIN.GLOBAL.inputlocation[7]=tulem[37];
		MAIN.GLOBAL.inputlocation[8]=tulem[38];
		MAIN.GLOBAL.inputlocation[9]=tulem[39];
		MAIN.GLOBAL.inputlocation[10]=tulem[40];
		MAIN.GLOBAL.inputlocation[11]=tulem[41];
		MAIN.GLOBAL.inputlocation[12]=tulem[42];
		MAIN.GLOBAL.inputlocation[13]=tulem[43];
		MAIN.GLOBAL.inputlocation[14]=tulem[44];
		MAIN.GLOBAL.inputlocation[15]=tulem[45];
		MAIN.GLOBAL.inputlocation[16]=tulem[46];
		MAIN.GLOBAL.inputlocation[17]=tulem[47];
		MAIN.GLOBAL.inputlocation[18]=tulem[48];
		MAIN.GLOBAL.inputlocation[19]=tulem[49];
		MAIN.GLOBAL.inputlocation[20]=tulem[50];
		MAIN.GLOBAL.inputlocation[21]=tulem[51];
		MAIN.GLOBAL.inputlocation[22]=tulem[52];
		MAIN.GLOBAL.inputlocation[23]=tulem[53];
		MAIN.GLOBAL.inputlocation[24]=tulem[54];
		MAIN.GLOBAL.inputlocation[25]=tulem[55];
		MAIN.GLOBAL.inputlocation[26]=tulem[56];
		MAIN.GLOBAL.inputlocation[27]=tulem[57];
		MAIN.GLOBAL.inputlocation[28]=tulem[58];
		MAIN.GLOBAL.outputlocation_1=tulem[59];
		MAIN.GLOBAL.outputlocation_2=tulem[60];
		MAIN.GLOBAL.outputlocation_3=tulem[61];
		MAIN.GLOBAL.outputlocation_4=tulem[62];
		MAIN.GLOBAL.outputlocation_5=tulem[63];
		MAIN.GLOBAL.outputlocation_6=tulem[64];
		MAIN.GLOBAL.outputlocation_7=tulem[65];
		MAIN.GLOBAL.outputlocation_8=tulem[66];
		MAIN.GLOBAL.outputlocation_9=tulem[67];
		MAIN.GLOBAL.outputlocation_10=tulem[68];
		MAIN.GLOBAL.outputlocation_11=tulem[69];
		MAIN.GLOBAL.outputlocation_12=tulem[70];
		MAIN.GLOBAL.outputlocation_13=tulem[71];
		MAIN.GLOBAL.outputlocation_14=tulem[72];
		MAIN.GLOBAL.outputlocation_15=tulem[73];
		MAIN.GLOBAL.outputlocation_16=tulem[74];
		MAIN.GLOBAL.outputlocation_17=tulem[75];
		MAIN.GLOBAL.outputlocation_18=tulem[76];
		MAIN.GLOBAL.outputlocation_19=tulem[77];
		MAIN.GLOBAL.outputlocation_20=tulem[78];
		MAIN.GLOBAL.outputlocation_21=tulem[79];
		MAIN.GLOBAL.outputlocation_22=tulem[80];
		MAIN.GLOBAL.outputlocation_23=tulem[81];
		MAIN.GLOBAL.outputlocation_24=tulem[82];
		MAIN.GLOBAL.outputlocation_25=tulem[83];
		MAIN.GLOBAL.outputlocation_26=tulem[84];
		MAIN.GLOBAL.outputlocation_27=tulem[85];
		MAIN.GLOBAL.outputlocation_28=tulem[86];
		
		//	tulem[49]="tagasi kirjutatud";
	//	failifuntsioonid.Fail_Kirjuta((MAIN.GLOBAL.SaveFileName), tulem, "rewrite",MAIN.GLOBAL.INI_lines);
	} 
	
		catch (FileNotFoundException e) {
		
		System.out.println("faili ei leia!  INI");
		
		
		
				
				String Sisu[]={
				"#File:/ name / nr of lines here /",
				MAIN.GLOBAL.SaveFileName,
				""+MAIN.GLOBAL.INI_lines,
				"#Window:/ name / width / height /",
				MAIN.GLOBAL.aknanimi,
				""+MAIN.GLOBAL.width,
				""+MAIN.GLOBAL.height,
				"#Items positions:/ Columns / Rows /",  /*siin peab kirjutama juurde, et loeks jada failist sisse*/
				"{10, 75, 75, 75, 75, 200, 75, 75, 75, 75}",
				"{10, 75, 75, 75, 75, 75, 75, 75, 75, 75}",
				"#Components:/ 1..4 buttons names / 5 label1 text value /",
				MAIN.GLOBAL.btn1,
				MAIN.GLOBAL.btn2,
				MAIN.GLOBAL.btn3,
				MAIN.GLOBAL.btn4,
				"MAIN.GLOBAL.lbl1string",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"#Components locations in window(column, row):/ buttons 1..4 / label 5 / input1, output1 /",
				MAIN.GLOBAL.btnlocation_1,
				MAIN.GLOBAL.btnlocation_2,
				MAIN.GLOBAL.btnlocation_3,
				MAIN.GLOBAL.btnlocation_4,
				MAIN.GLOBAL.lbllocation_1,
				MAIN.GLOBAL.inputlocation[1],
				MAIN.GLOBAL.inputlocation[2],
				MAIN.GLOBAL.inputlocation[3],
				MAIN.GLOBAL.inputlocation[4],
				MAIN.GLOBAL.inputlocation[5],
				MAIN.GLOBAL.inputlocation[6],
				MAIN.GLOBAL.inputlocation[7],
				MAIN.GLOBAL.inputlocation[8],
				MAIN.GLOBAL.inputlocation[9],
				MAIN.GLOBAL.inputlocation[10],
				MAIN.GLOBAL.inputlocation[11],
				MAIN.GLOBAL.inputlocation[12],
				MAIN.GLOBAL.inputlocation[13],
				MAIN.GLOBAL.inputlocation[14],
				MAIN.GLOBAL.inputlocation[15],
				MAIN.GLOBAL.inputlocation[16],
				MAIN.GLOBAL.inputlocation[17],
				MAIN.GLOBAL.inputlocation[18],
				MAIN.GLOBAL.inputlocation[19],
				MAIN.GLOBAL.inputlocation[20],
				MAIN.GLOBAL.inputlocation[21],
				MAIN.GLOBAL.inputlocation[22],
				MAIN.GLOBAL.inputlocation[23],
				MAIN.GLOBAL.inputlocation[24],
				MAIN.GLOBAL.inputlocation[25],
				MAIN.GLOBAL.inputlocation[26],
				MAIN.GLOBAL.inputlocation[27],
				MAIN.GLOBAL.inputlocation[28],
		/*		MAIN.GLOBAL.inputlocation_1,
				MAIN.GLOBAL.inputlocation_2,
				MAIN.GLOBAL.inputlocation_3,
				MAIN.GLOBAL.inputlocation_4,
				MAIN.GLOBAL.inputlocation_5,
				MAIN.GLOBAL.inputlocation_6,
				MAIN.GLOBAL.inputlocation_7,
				MAIN.GLOBAL.inputlocation_8,
				MAIN.GLOBAL.inputlocation_9,
				MAIN.GLOBAL.inputlocation_10,
				MAIN.GLOBAL.inputlocation_11,
				MAIN.GLOBAL.inputlocation_12,
				MAIN.GLOBAL.inputlocation_13,
				MAIN.GLOBAL.inputlocation_14,
				MAIN.GLOBAL.inputlocation_15,
				MAIN.GLOBAL.inputlocation_16,
				MAIN.GLOBAL.inputlocation_17,
				MAIN.GLOBAL.inputlocation_18,
				MAIN.GLOBAL.inputlocation_19,
				MAIN.GLOBAL.inputlocation_20,
				MAIN.GLOBAL.inputlocation_21,
				MAIN.GLOBAL.inputlocation_22,
				MAIN.GLOBAL.inputlocation_23,
				MAIN.GLOBAL.inputlocation_24,
				MAIN.GLOBAL.inputlocation_25,
				MAIN.GLOBAL.inputlocation_26,
				MAIN.GLOBAL.inputlocation_27,
				MAIN.GLOBAL.inputlocation_28,*/
				MAIN.GLOBAL.outputlocation_1,
				MAIN.GLOBAL.outputlocation_2,
				MAIN.GLOBAL.outputlocation_3,
				MAIN.GLOBAL.outputlocation_4,
				MAIN.GLOBAL.outputlocation_5,
				MAIN.GLOBAL.outputlocation_6,
				MAIN.GLOBAL.outputlocation_7,
				MAIN.GLOBAL.outputlocation_8,
				MAIN.GLOBAL.outputlocation_9,
				MAIN.GLOBAL.outputlocation_10,
				MAIN.GLOBAL.outputlocation_11,
				MAIN.GLOBAL.outputlocation_12,
				MAIN.GLOBAL.outputlocation_13,
				MAIN.GLOBAL.outputlocation_14,
				MAIN.GLOBAL.outputlocation_15,
				MAIN.GLOBAL.outputlocation_16,
				MAIN.GLOBAL.outputlocation_17,
				MAIN.GLOBAL.outputlocation_18,
				MAIN.GLOBAL.outputlocation_19,
				MAIN.GLOBAL.outputlocation_20,
				MAIN.GLOBAL.outputlocation_21,
				MAIN.GLOBAL.outputlocation_22,
				MAIN.GLOBAL.outputlocation_23,
				MAIN.GLOBAL.outputlocation_24,
				MAIN.GLOBAL.outputlocation_25,
				MAIN.GLOBAL.outputlocation_26,
				MAIN.GLOBAL.outputlocation_27,
				MAIN.GLOBAL.outputlocation_28,
				"",
				"",
				"",
				"",
				"",
				"",
				"", //// hõivatud akna komponentidele
				"Yet not used variables",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"#END#",
				};
		
		
		failifuntsioonid.Fail_Kirjuta((MAIN.GLOBAL.SaveFileName), Sisu, "append",MAIN.GLOBAL.INI_lines);
		System.out.println("ini global on uue faili kirjutamise edukalt lõpetanud");
	}

	}
}
