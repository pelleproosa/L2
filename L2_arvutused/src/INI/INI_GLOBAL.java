package INI;

import java.io.FileNotFoundException;

import MAIN.Funktsioonid;



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
		MAIN.GLOBAL.btn1=tulem[11]; //System.out.println(tulem[11]);System.exit(0);
		MAIN.GLOBAL.btn2=tulem[12];
		MAIN.GLOBAL.btn3=tulem[13];
		MAIN.GLOBAL.btn4=tulem[14];
		MAIN.GLOBAL.label[0] =MAIN.GLOBAL.btn1;
		MAIN.GLOBAL.label[1] =MAIN.GLOBAL.btn2; 
		MAIN.GLOBAL.label[2]=MAIN.GLOBAL.btn3;
		MAIN.GLOBAL.label[3] = MAIN.GLOBAL.btn4;
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
		MAIN.GLOBAL.outputlocation[1]=tulem[59];
		MAIN.GLOBAL.outputlocation[2]=tulem[60];
		MAIN.GLOBAL.outputlocation[3]=tulem[61];
		MAIN.GLOBAL.outputlocation[4]=tulem[62];
		MAIN.GLOBAL.outputlocation[5]=tulem[63];
		MAIN.GLOBAL.outputlocation[6]=tulem[64];
		MAIN.GLOBAL.outputlocation[7]=tulem[65];
		MAIN.GLOBAL.outputlocation[8]=tulem[66];
		MAIN.GLOBAL.outputlocation[9]=tulem[67];
		MAIN.GLOBAL.outputlocation[10]=tulem[68];
		MAIN.GLOBAL.outputlocation[11]=tulem[69];
		MAIN.GLOBAL.outputlocation[12]=tulem[70];
		MAIN.GLOBAL.outputlocation[13]=tulem[71];
		MAIN.GLOBAL.outputlocation[14]=tulem[72];
		MAIN.GLOBAL.outputlocation[15]=tulem[73];
		MAIN.GLOBAL.outputlocation[16]=tulem[74];
		MAIN.GLOBAL.outputlocation[17]=tulem[75];
		MAIN.GLOBAL.outputlocation[18]=tulem[76];
		MAIN.GLOBAL.outputlocation[19]=tulem[77];
		MAIN.GLOBAL.outputlocation[20]=tulem[78];
		MAIN.GLOBAL.outputlocation[21]=tulem[79];
		MAIN.GLOBAL.outputlocation[22]=tulem[80];
		MAIN.GLOBAL.outputlocation[23]=tulem[81];
		MAIN.GLOBAL.outputlocation[24]=tulem[82];
		MAIN.GLOBAL.outputlocation[25]=tulem[83];
		MAIN.GLOBAL.outputlocation[26]=tulem[84];
		MAIN.GLOBAL.outputlocation[27]=tulem[85];
		MAIN.GLOBAL.outputlocation[28]=tulem[86];
		MAIN.GLOBAL.locationskirjefailis=tulem[87];
		MAIN.GLOBAL.displaylocations=(MAIN.GLOBAL.locationskirjefailis.toLowerCase().contains("true"));
		MAIN.GLOBAL.labellocation[1]=tulem[88];
		MAIN.GLOBAL.labellocation[2]=tulem[89];
		MAIN.GLOBAL.labellocation[3]=tulem[90];
		MAIN.GLOBAL.labellocation[4]=tulem[91];
		MAIN.GLOBAL.labellocation[5]=tulem[92];
		MAIN.GLOBAL.labellocation[6]=tulem[93];
		MAIN.GLOBAL.labellocation[7]=tulem[94];
		MAIN.GLOBAL.labellocation[8]=tulem[95];
		MAIN.GLOBAL.labellocation[9]=tulem[96];
		MAIN.GLOBAL.labellocation[10]=tulem[97];
		MAIN.GLOBAL.labellocation[11]=tulem[98];
		MAIN.GLOBAL.labellocation[12]=tulem[99];
		MAIN.GLOBAL.labellocation[13]=tulem[100];
		MAIN.GLOBAL.labellocation[14]=tulem[101];
		MAIN.GLOBAL.labellocation[15]=tulem[102];
		MAIN.GLOBAL.labellocation[16]=tulem[103];
		MAIN.GLOBAL.labellocation[17]=tulem[104];
		MAIN.GLOBAL.labellocation[18]=tulem[105];
		MAIN.GLOBAL.labellocation[19]=tulem[106];
		MAIN.GLOBAL.labeltext[1]=tulem[107];
		MAIN.GLOBAL.labeltext[2]=tulem[108];
		MAIN.GLOBAL.labeltext[3]=tulem[109];
		MAIN.GLOBAL.labeltext[4]=tulem[110];
		MAIN.GLOBAL.labeltext[5]=tulem[111];
		MAIN.GLOBAL.labeltext[6]=tulem[112];
		MAIN.GLOBAL.labeltext[7]=tulem[113];
		MAIN.GLOBAL.labeltext[8]=tulem[114];
		MAIN.GLOBAL.labeltext[9]=tulem[115];
		MAIN.GLOBAL.labeltext[10]=tulem[116];
		MAIN.GLOBAL.labeltext[11]=tulem[117];
		MAIN.GLOBAL.labeltext[12]=tulem[118];
		MAIN.GLOBAL.labeltext[13]=tulem[119];
		MAIN.GLOBAL.labeltext[14]=tulem[120];
		MAIN.GLOBAL.labeltext[15]=tulem[121];
		MAIN.GLOBAL.labeltext[16]=tulem[122];
		MAIN.GLOBAL.labeltext[17]=tulem[123];
		MAIN.GLOBAL.labeltext[18]=tulem[124];
		MAIN.GLOBAL.labeltext[19]=tulem[125];
		
		//	tulem[49]="tagasi kirjutatud";
	//	failifuntsioonid.Fail_Kirjuta((MAIN.GLOBAL.SaveFileName), tulem, "rewrite",MAIN.GLOBAL.INI_lines);
	} 
	
		catch (FileNotFoundException e) {
		
		System.out.println("faili ei leia!  INI");
		
		Funktsioonid.TulbadReadstringideks();
		
				
				String Sisu[]={
				"#File:/ name / nr of lines here /",
				MAIN.GLOBAL.SaveFileName,
				""+MAIN.GLOBAL.INI_lines,
				"#Window:/ name / width / height /",
				MAIN.GLOBAL.aknanimi,
				""+MAIN.GLOBAL.width,
				""+MAIN.GLOBAL.height,
				"#Items positions:/ Columns / Rows /",  /*siin peab kirjutama juurde, et loeks jada failist sisse*/
				MAIN.GLOBAL.tulbadFunktsioonist,
				MAIN.GLOBAL.readFunktsioonist,
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

				MAIN.GLOBAL.outputlocation[1],
				MAIN.GLOBAL.outputlocation[2],
				MAIN.GLOBAL.outputlocation[3],
				MAIN.GLOBAL.outputlocation[4],
				MAIN.GLOBAL.outputlocation[5],
				MAIN.GLOBAL.outputlocation[6],
				MAIN.GLOBAL.outputlocation[7],
				MAIN.GLOBAL.outputlocation[8],
				MAIN.GLOBAL.outputlocation[9],
				MAIN.GLOBAL.outputlocation[10],
				MAIN.GLOBAL.outputlocation[11],
				MAIN.GLOBAL.outputlocation[12],
				MAIN.GLOBAL.outputlocation[13],
				MAIN.GLOBAL.outputlocation[14],
				MAIN.GLOBAL.outputlocation[15],
				MAIN.GLOBAL.outputlocation[16],
				MAIN.GLOBAL.outputlocation[17],
				MAIN.GLOBAL.outputlocation[18],
				MAIN.GLOBAL.outputlocation[19],
				MAIN.GLOBAL.outputlocation[20],
				MAIN.GLOBAL.outputlocation[21],
				MAIN.GLOBAL.outputlocation[22],
				MAIN.GLOBAL.outputlocation[23],
				MAIN.GLOBAL.outputlocation[24],
				MAIN.GLOBAL.outputlocation[25],
				MAIN.GLOBAL.outputlocation[26],
				MAIN.GLOBAL.outputlocation[27],
				MAIN.GLOBAL.outputlocation[28],
				MAIN.GLOBAL.locationskirjefailis,
				MAIN.GLOBAL.labellocation[1],
				MAIN.GLOBAL.labellocation[2],
				MAIN.GLOBAL.labellocation[3],
				MAIN.GLOBAL.labellocation[4],
				MAIN.GLOBAL.labellocation[5],
				MAIN.GLOBAL.labellocation[6],
				MAIN.GLOBAL.labellocation[7],
				MAIN.GLOBAL.labellocation[8],
				MAIN.GLOBAL.labellocation[9],
				MAIN.GLOBAL.labellocation[10],
				MAIN.GLOBAL.labellocation[11],
				MAIN.GLOBAL.labellocation[12],
				MAIN.GLOBAL.labellocation[13],
				MAIN.GLOBAL.labellocation[14],
				MAIN.GLOBAL.labellocation[15],
				MAIN.GLOBAL.labellocation[16],
				MAIN.GLOBAL.labellocation[17],
				MAIN.GLOBAL.labellocation[18],
				MAIN.GLOBAL.labellocation[19],
				MAIN.GLOBAL.labeltext[1],
				MAIN.GLOBAL.labeltext[2],
				MAIN.GLOBAL.labeltext[3],
				MAIN.GLOBAL.labeltext[4],
				MAIN.GLOBAL.labeltext[5],
				MAIN.GLOBAL.labeltext[6],
				MAIN.GLOBAL.labeltext[7],
				MAIN.GLOBAL.labeltext[8],
				MAIN.GLOBAL.labeltext[9],
				MAIN.GLOBAL.labeltext[10],
				MAIN.GLOBAL.labeltext[11],
				MAIN.GLOBAL.labeltext[12],
				MAIN.GLOBAL.labeltext[13],
				MAIN.GLOBAL.labeltext[14],
				MAIN.GLOBAL.labeltext[15],
				MAIN.GLOBAL.labeltext[16],
				MAIN.GLOBAL.labeltext[17],
				MAIN.GLOBAL.labeltext[18],
				MAIN.GLOBAL.labeltext[19],
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
