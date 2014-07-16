package Graafiline_osa;





import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.JTextField;
import javax.swing.SwingConstants;







import javax.swing.border.Border;
import javax.swing.text.Caret;

import MAIN.Funktsioonid;
import MAIN.GLOBAL;
import layout.TableLayout;

public class tabel {

    public static void start(final String args[]) {
    	
        JFrame frame = new JFrame(MAIN.GLOBAL.aknanimi);
        frame.setSize((MAIN.GLOBAL.width), (MAIN.GLOBAL.height));
        frame.setLayout(new TableLayout(MAIN.GLOBAL.size));
        String[] label=MAIN.GLOBAL.label;
        
        final JButton button[] = new JButton[label.length];
        for (int i = 0; i < label.length; i++) {
            button[i] = new JButton(label[i]);
            button[i].setMargin(new Insets(0,0,0,0));
            button[i].setFont(new Font("Arial", Font.BOLD, 12));
            button[i].setText(label[i]);
        }
        
        
        

        
        final JLabel[] labelid=new JLabel[(MAIN.GLOBAL.labeliteArv+1)];
        for (int i = 1; i < (MAIN.GLOBAL.labeliteArv); i++)
        {
        	//System.out.println(i);
        	labelid[i]=new JLabel(MAIN.GLOBAL.labeltext[i]);
        	frame.add(labelid[i],MAIN.GLOBAL.labellocation[i]);
        	
        	}
       labelid[1].setHorizontalAlignment(SwingConstants.CENTER);
       labelid[3].setHorizontalAlignment(SwingConstants.CENTER);
       labelid[4].setHorizontalAlignment(SwingConstants.CENTER);

       labelid[5].setHorizontalAlignment(SwingConstants.RIGHT);
       labelid[5].setForeground(Color.RED);

        labelid[9].setForeground(Color.RED);

        labelid[16].setHorizontalAlignment(SwingConstants.CENTER);
        labelid[17].setHorizontalAlignment(SwingConstants.CENTER);
        labelid[20].setHorizontalAlignment(SwingConstants.CENTER);
        labelid[21].setHorizontalAlignment(SwingConstants.CENTER);
//        labelid[25].setVisible(false);
        labelid[25].setHorizontalAlignment(SwingConstants.CENTER);
        labelid[25].setForeground(Color.BLUE);
//        labelid[26].setVisible(false);
        labelid[26].setHorizontalAlignment(SwingConstants.CENTER);
//        labelid[27].setVisible(false);
        labelid[27].setHorizontalAlignment(SwingConstants.CENTER);
//        labelid[28].setVisible(false);
        labelid[28].setHorizontalAlignment(SwingConstants.CENTER);
//        labelid[29].setVisible(false);
        labelid[29].setHorizontalAlignment(SwingConstants.CENTER);
        labelid[30].setHorizontalAlignment(SwingConstants.CENTER);
        labelid[30].setForeground(Color.MAGENTA);
        labelid[31].setForeground(Color.BLUE);
        labelid[32].setForeground(Color.decode("0x006400"));
        labelid[33].setForeground(Color.RED);



      
        
        
        
        
        
        final JTextField[] yourInputField= new JTextField[(MAIN.GLOBAL.yourInputFieldArv+1)];
        
        for (int i = 1; i < (MAIN.GLOBAL.yourInputFieldArv+1); i++)
        {
        	yourInputField[i] = new JTextField();
        	if(MAIN.GLOBAL.displaylocations){
        	yourInputField[i].setText(""+i+" # "+MAIN.GLOBAL.inputlocation[i]);
        	}

          frame.add(yourInputField[i],MAIN.GLOBAL.inputlocation[i]);
          
      //    System.out.println("i="+i+" Asukoht="+MAIN.GLOBAL.inputlocation[i]);
          yourInputField[i].setText("0");
        }
        yourInputField[10].setText(""+GLOBAL.yksBssD);
        yourInputField[13].setText(""+GLOBAL.yksssD);
        yourInputField[16].setText(""+GLOBAL.yksHPpot1);
        yourInputField[19].setText(""+GLOBAL.yksHPpot2);
        yourInputField[22].setText(""+GLOBAL.yksAlarcity);
        yourInputField[25].setText(""+GLOBAL.yksMHaste);
        yourInputField[28].setText(""+GLOBAL.yksHaste);
        yourInputField[35].setText(""+GLOBAL.yksbluess);
        yourInputField[38].setText(""+GLOBAL.yksgreenss);
        yourInputField[41].setText(""+GLOBAL.yksredss);
        yourInputField[35].setEditable(false);
        yourInputField[38].setEditable(false);
        yourInputField[41].setEditable(false);
        yourInputField[30].setEditable(false);
        yourInputField[31].setEditable(false);
        yourInputField[32].setEditable(false);
        yourInputField[33].setEditable(false);
        //yourInputField[34].setEditable(false);
       yourInputField[43].setEditable(false);
       yourInputField[44].setEditable(false);
       yourInputField[45].setEditable(false);
       yourInputField[46].setEditable(false);
       yourInputField[48].setEditable(false);
       yourInputField[49].setEditable(false);
       yourInputField[50].setEditable(false);
       yourInputField[51].setEditable(false);
       yourInputField[52].setEditable(false);
       yourInputField[53].setEditable(false);
       yourInputField[54].setEditable(false);
       yourInputField[55].setEditable(false);
       yourInputField[56].setEditable(false);
       yourInputField[57].setEditable(false);
       yourInputField[58].setEditable(false);
        
        
        
        yourInputField[7].setBackground(Color.GREEN);
        yourInputField[9].setBackground(Color.GREEN);
        yourInputField[12].setBackground(Color.GREEN);
        yourInputField[15].setBackground(Color.GREEN);
        yourInputField[18].setBackground(Color.GREEN);
        yourInputField[21].setBackground(Color.GREEN);
        yourInputField[24].setBackground(Color.GREEN);
        yourInputField[27].setBackground(Color.GREEN);
        yourInputField[34].setBackground(Color.BLUE);
        yourInputField[34].setForeground(Color.WHITE);
        yourInputField[37].setBackground(Color.decode("0x006400"));
        yourInputField[37].setForeground(Color.WHITE);
        yourInputField[40].setBackground(Color.RED);
        yourInputField[40].setForeground(Color.WHITE);
        
        yourInputField[8].setBackground(Color.ORANGE);
    	yourInputField[11].setBackground(Color.ORANGE);
        yourInputField[14].setBackground(Color.ORANGE);
        yourInputField[17].setBackground(Color.ORANGE);
        yourInputField[20].setBackground(Color.ORANGE);
        yourInputField[23].setBackground(Color.ORANGE);
        yourInputField[26].setBackground(Color.ORANGE);
        yourInputField[29].setBackground(Color.ORANGE);
        yourInputField[36].setBackground(Color.BLUE);
        yourInputField[36].setForeground(Color.WHITE);
        yourInputField[39].setBackground(Color.decode("0x006400"));
        yourInputField[39].setForeground(Color.WHITE);
        yourInputField[42].setBackground(Color.RED);
        yourInputField[42].setForeground(Color.WHITE);
        
//        yourInputField[30].setVisible(false);
//        yourInputField[31].setVisible(false);
//        yourInputField[32].setVisible(false);
//        yourInputField[33].setVisible(false);
        yourInputField[35].setBackground(Color.BLUE);
        yourInputField[35].setForeground(Color.WHITE);
        yourInputField[38].setBackground(Color.decode("0x006400"));
        yourInputField[38].setForeground(Color.WHITE);
        yourInputField[41].setBackground(Color.RED);
        yourInputField[41].setForeground(Color.WHITE);
        yourInputField[30].setText("30");
        yourInputField[31].setText("31");
        yourInputField[32].setText("32");
        yourInputField[33].setText("33");
        
        
        
        
        
        
        
        
        
        
        
        
       final  JTextField[] MinuOutput=new JTextField[(MAIN.GLOBAL.MinuOutputArv+1)];

        int i = 0;
        for (i = 1; i < (MAIN.GLOBAL.MinuOutputArv+1); i++)
        {
        	MinuOutput[i] = new JTextField();
        	if (i==1){
        	//	MinuOutput[i].setBackground(Color.GREEN);
        	//	MinuOutput[i].setText("kuku");
        		MinuOutput[i].setEditable(false);
        		frame.add(MinuOutput[i], MAIN.GLOBAL.outputlocation[i]);
        		
        	}else{
        		if(MAIN.GLOBAL.displaylocations){
        	  MinuOutput[i].setText(""+i+" # "+MAIN.GLOBAL.outputlocation[i]);
        		}
        	  MinuOutput[i].setEditable(false);}
        	frame.add(MinuOutput[i], MAIN.GLOBAL.outputlocation[i]);
        }
        MinuOutput[1].setForeground(Color.GREEN);
        MinuOutput[1].setCaretColor(Color.GREEN);
        MinuOutput[1].setBackground(Color.darkGray);
        MinuOutput[8].setForeground(Color.GREEN);
        MinuOutput[8].setCaretColor(Color.GREEN);
        MinuOutput[8].setBackground(Color.darkGray);
        MinuOutput[18].setForeground(Color.BLUE);
        MinuOutput[19].setForeground(Color.BLUE);
        MinuOutput[20].setForeground(Color.BLUE);
        MinuOutput[21].setForeground(Color.BLUE);
        Border punaneraam = BorderFactory.createLineBorder(Color.RED, 1);

        MinuOutput[18].setBorder(punaneraam);
        MinuOutput[19].setBorder(punaneraam);
        MinuOutput[20].setBorder(punaneraam);
        MinuOutput[21].setBorder(punaneraam);
        yourInputField[47].setBorder(punaneraam);
        yourInputField[48].setBorder(punaneraam);
        yourInputField[49].setBorder(punaneraam);
        yourInputField[50].setBorder(punaneraam);
        MinuOutput[18].setBackground(Color.WHITE);
        MinuOutput[19].setBackground(Color.WHITE);
        MinuOutput[20].setBackground(Color.WHITE);
        MinuOutput[21].setBackground(Color.WHITE);
       
        		


        frame.add(button[0], MAIN.GLOBAL.btnlocation_1);
        frame.add(button[1], MAIN.GLOBAL.btnlocation_2);
        frame.add(button[2], MAIN.GLOBAL.btnlocation_3);
        frame.add(button[3], MAIN.GLOBAL.btnlocation_4);
        frame.add(button[4], MAIN.GLOBAL.btnlocation_5);
        frame.add(button[5], MAIN.GLOBAL.btnlocation_6);
        frame.add(button[6], MAIN.GLOBAL.btnlocation_7);
        frame.add(button[7], MAIN.GLOBAL.btnlocation_8);
        frame.add(button[8], MAIN.GLOBAL.btnlocation_9);
        frame.add(button[9], MAIN.GLOBAL.btnlocation_10);
        frame.add(button[10], MAIN.GLOBAL.btnlocation_11);
        frame.add(button[11], MAIN.GLOBAL.btnlocation_12);
        frame.add(button[12], MAIN.GLOBAL.btnlocation_13);
        frame.add(button[13], MAIN.GLOBAL.btnlocation_14);
        frame.add(button[14], MAIN.GLOBAL.btnlocation_15);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////  ALGAVAD NUPPUDE INITSIALISEERIMISED JNE                 //////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   //     button[8].setVisible(false);
    //    button[10].setVisible(false);
        /*        button[0].addActionListener(
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
        	        	failifuntsioonid.kustutafail();
        	        	try {
							INI_GLOBAL.start(args);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							
						}
        	        	
        	        	
        	            String str=yourInputField[1].getText();
        	            MinuOutput[7].setText(str);
        	        
        	        }
        	        
        	        
        	        
        	        
        	    }	
        		
        		
        		);
 */       
        button[2].addActionListener(             // BSSD  -MATS
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
int i=0;
        	        	
        	        	String str[]=new String[5];
        	        	str[0]=yourInputField[1].getText();
        	        	str[1]=yourInputField[2].getText();
        	        	str[2]=yourInputField[3].getText();
        	        	str[3]=yourInputField[4].getText();
        	        	str[4]=yourInputField[5].getText();
        	            try{
        	            	
        	            	System.out.println("bssd mats");
        	            	MAIN.GLOBAL.adenaReserv=Double.parseDouble(str[i]);
        	            	i++;
        	            	MAIN.GLOBAL.soulReserv=Double.parseDouble(str[i]);
        	            	i++;
        	            	MAIN.GLOBAL.spiritReserv=Double.parseDouble(str[i]);
        	            	i++;
        	            	MAIN.GLOBAL.cryDReserv=Double.parseDouble(str[i]);
        	            	i++;
        	            	MAIN.GLOBAL.BSSDRequested=Double.parseDouble(str[i]);
        	      
        	        	bssd_shots_input.Klass1.main(null);	
            	        MinuOutput[7].setText(""+(int)MAIN.GLOBAL.cryDKogusOsta);
            	        MinuOutput[5].setText(""+(int)MAIN.GLOBAL.soulKogusOsta);
            	       MinuOutput[6].setText(""+(int)MAIN.GLOBAL.spiritKogusOsta);
            	        MinuOutput[1].setText(""+(int)MAIN.GLOBAL.adenaReserv);
            	        MinuOutput[3].setText(""+(int)MAIN.GLOBAL.spiritReserv);
            	        MinuOutput[4].setText(""+(int)MAIN.GLOBAL.cryDJ2rel);
            	        yourInputField[5].setText(""+(int)MAIN.GLOBAL.BSSDReal);
            	       MinuOutput[2].setText(""+(int)MAIN.GLOBAL.soulJ2rel);
           	        
            	        }
        	            catch(Exception e1){
        	            	if (i==0){yourInputField[1].setText("Number!");}
        	            	if (i==1){yourInputField[2].setText("Number!");}
        	            	if (i==2){yourInputField[3].setText("Number!");}
        	            	if (i==3){yourInputField[4].setText("Number!");}
        	            	if (i==4){yourInputField[5].setText("Number!");}
        	            };
        	        }}	
        		);    
        button[3].addActionListener(  //SSD-MATS
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
int i=0;
        	        	
        	        	String str[]=new String[5];
        	        	str[0]=yourInputField[1].getText();
        	        	str[1]=yourInputField[2].getText();
        	        	str[2]=yourInputField[3].getText();
        	        	str[3]=yourInputField[4].getText();
        	        	str[4]=yourInputField[6].getText();
        	            try{
        	            	
        	            	MAIN.GLOBAL.adenaReserv=Double.parseDouble(str[i]);
        	            	i++;
        	            	MAIN.GLOBAL.soulReserv=Double.parseDouble(str[i]);
        	            	i++;
        	            	MAIN.GLOBAL.spiritReserv=Double.parseDouble(str[i]);
        	            	i++;
        	            	MAIN.GLOBAL.cryDReserv=Double.parseDouble(str[i]);
        	            	i++;
        	            	MAIN.GLOBAL.SSDRequested=Double.parseDouble(str[i]);
        	      
        	        	ssd_shots_input.Klass1.main(null);	
            	        MinuOutput[7].setText(""+(int)MAIN.GLOBAL.cryDKogusOsta);
            	        MinuOutput[5].setText(""+(int)MAIN.GLOBAL.soulKogusOsta);
            	       MinuOutput[6].setText(""+(int)MAIN.GLOBAL.spiritKogusOsta);
            	        MinuOutput[1].setText(""+(int)MAIN.GLOBAL.adenaReserv);
            	        MinuOutput[3].setText(""+(int)MAIN.GLOBAL.spiritReserv);
            	        MinuOutput[4].setText(""+(int)MAIN.GLOBAL.cryDJ2rel);
            	        yourInputField[6].setText(""+(int)MAIN.GLOBAL.SSDReal);
            	       MinuOutput[2].setText(""+(int)MAIN.GLOBAL.soulJ2rel);
        	        
        	        }
    	            catch(Exception e1){
    	            	if (i==0){yourInputField[1].setText("Number!");}
    	            	if (i==1){yourInputField[2].setText("Number!");}
    	            	if (i==2){yourInputField[3].setText("Number!");}
    	            	if (i==3){yourInputField[4].setText("Number!");}
    	            	if (i==4){yourInputField[6].setText("Number!");}
    	            };
    	        }}	
    		);
        button[0].addActionListener(   ///MATS BSSD
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {

int i=0;
        	        	
        	        	String str[]=new String[4];
        	        	str[0]=yourInputField[1].getText();
        	        	str[1]=yourInputField[2].getText();
        	        	str[2]=yourInputField[3].getText();
        	        	str[3]=yourInputField[4].getText();
        	        	
        	            try{
        	            	
        	            	MAIN.GLOBAL.adenaReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.soulReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.spiritReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.cryDReserv=Double.parseDouble(str[i]);
        	        bssd_adena_input.Klass1.main(null);	
        	        MinuOutput[7].setText(""+(int)MAIN.GLOBAL.cryDKogusOsta);
        	        MinuOutput[5].setText(""+(int)MAIN.GLOBAL.soulKogusOsta);
        	        MinuOutput[6].setText(""+(int)MAIN.GLOBAL.spiritKogusOsta);
        	        MinuOutput[1].setText(""+(int)MAIN.GLOBAL.adenaReserv);
        	        MinuOutput[3].setText(""+(int)MAIN.GLOBAL.spiritJ2rel);
        	        MinuOutput[4].setText(""+(int)MAIN.GLOBAL.cryDJ2rel);
        	        yourInputField[5].setText(""+(int)MAIN.GLOBAL.BSSDShots);
           	       MinuOutput[2].setText(""+(int)MAIN.GLOBAL.soulReserv);
        	            }
        	            catch(Exception e1){
        	            	if (i==0){yourInputField[1].setText("Number!");}
        	            	if (i==1){yourInputField[2].setText("Number!");}
        	            	if (i==2){yourInputField[3].setText("Number!");}
        	            	if (i==3){yourInputField[4].setText("Number!");}

        	            };
        	        }}	
        		);
        button[1].addActionListener(   ///Mats-SSD
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
        	        	
        	        	int i=0;
        	        	
        	        	String str[]=new String[4];
        	        	str[0]=yourInputField[1].getText();
        	        	str[1]=yourInputField[2].getText();
        	        	str[2]=yourInputField[3].getText();
        	        	str[3]=yourInputField[4].getText();
        	        	

        	            try{
        	            	
        	            	MAIN.GLOBAL.adenaReserv=Double.parseDouble(str[0]);
        	            	i++;
        	            	MAIN.GLOBAL.soulReserv=Double.parseDouble(str[1]);
        	            	i++;
        	            	MAIN.GLOBAL.spiritReserv=Double.parseDouble(str[2]);
        	            	i++;
        	            	MAIN.GLOBAL.cryDReserv=Double.parseDouble(str[3]);
        	            	i++;
        	            	//MAIN.GLOBAL.BSSDRequested=Double.parseDouble(str[4]);
        	        ssd_adena_input.Klass1.main(null);	
        	        MinuOutput[7].setText(""+(int)MAIN.GLOBAL.cryDKogusOsta);
        	        MinuOutput[5].setText(""+(int)MAIN.GLOBAL.soulKogusOsta);
        	        MinuOutput[6].setText(""+(int)MAIN.GLOBAL.spiritKogusOsta);
        	        MinuOutput[1].setText(""+(int)MAIN.GLOBAL.adenaReserv);
        	        MinuOutput[3].setText(""+(int)MAIN.GLOBAL.spiritJ2rel);
        	        MinuOutput[4].setText(""+(int)MAIN.GLOBAL.cryDJ2rel);
        	        yourInputField[6].setText(""+(int)MAIN.GLOBAL.SSDShots);
        	        MinuOutput[2].setText(""+(int)MAIN.GLOBAL.soulReserv);
    	            }
        	            catch(Exception e1){
        	            	if (i==0){yourInputField[1].setText("Number!");}
        	            	if (i==1){yourInputField[2].setText("Number!");}
        	            	if (i==2){yourInputField[3].setText("Number!");}
        	            	if (i==3){yourInputField[4].setText("Number!");}
        	            	
        	            	
        	            };
        	        }}	
        		);
        
        
        
        
        
       
       
       
       
       
        button[5].addActionListener(   ///CLEAR
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
 
        	           
        	        MAIN.GLOBAL.adenaReserv=0;MAIN.GLOBAL.soulReserv=0;MAIN.GLOBAL.spiritReserv=0;MAIN.GLOBAL.cryDReserv=0;
        	        bssd_adena_input.Klass1.main(null);	
        	        MinuOutput[1].setText("");
        	        MinuOutput[2].setText("");
        	        MinuOutput[3].setText("");
        	        MinuOutput[4].setText("");
        	        MinuOutput[5].setText("");
        	        MinuOutput[6].setText("");
        	        MinuOutput[7].setText("");
        	        MinuOutput[8].setText("");
        	        MinuOutput[9].setText("");
        	        yourInputField[1].setText("0");
        	        yourInputField[2].setText("0");
        	        yourInputField[3].setText("0");
        	        yourInputField[4].setText("0");
        	        yourInputField[5].setText("0");
        	        yourInputField[6].setText("0");
        	        yourInputField[7].setText("0");
        	        yourInputField[8].setText("0");
        	        yourInputField[9].setText("0");
        	        yourInputField[11].setText("0");
        	        yourInputField[12].setText("0");
        	        yourInputField[14].setText("0");
        	        yourInputField[15].setText("0");
        	        yourInputField[17].setText("0");
        	        yourInputField[18].setText("0");
        	        yourInputField[20].setText("0");
        	        yourInputField[21].setText("0");
        	        yourInputField[23].setText("0");
        	        yourInputField[24].setText("0");
        	        yourInputField[26].setText("0");
        	        yourInputField[27].setText("0");
        	        yourInputField[29].setText("0");
	            	
	            	MAIN.GLOBAL.BSSDShots=0;
	            	MAIN.GLOBAL.SSDShots=0;
	            	MAIN.GLOBAL.spiritJ2rel=0;
        	        MAIN.GLOBAL.cryDJ2rel=0;
        	        
        	        
        	        MAIN.GLOBAL.cryDKogusOsta=0;
        	        MAIN.GLOBAL.soulKogusOsta=0;
        	        MAIN.GLOBAL.spiritKogusOsta=0;
        	        MAIN.GLOBAL.adenaReserv=0;
        	        MAIN.GLOBAL.spiritJ2rel=0;
        	        MAIN.GLOBAL.cryDJ2rel=0;
        	        
        	        
        	        
    	            }
        	      
        	        }	
        		);
       
        button[4].addActionListener(   ///Result -> inv
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
 
        	           
        	        MAIN.GLOBAL.adenaReserv=0;MAIN.GLOBAL.soulReserv=0;MAIN.GLOBAL.spiritReserv=0;MAIN.GLOBAL.cryDReserv=0;
        	        bssd_adena_input.Klass1.main(null);	

        	        yourInputField[1].setText(MinuOutput[1].getText());
        	        yourInputField[2].setText(MinuOutput[2].getText());
        	        yourInputField[3].setText(MinuOutput[3].getText());
        	        yourInputField[4].setText(MinuOutput[4].getText());
        	        MinuOutput[1].setText("");
        	        MinuOutput[2].setText("");
        	        MinuOutput[3].setText("");
        	        MinuOutput[4].setText("");
        	        MinuOutput[5].setText("");
        	        MinuOutput[6].setText("");
        	        MinuOutput[7].setText("");
        	        yourInputField[5].setText("");
        	        yourInputField[6].setText("");

    	            }
        	      
        	        }	
        		);
        button[6].addActionListener(             // start/stop
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
        	        	
        	        	
        	        	
        	        	
        	        	
        	        Funktsioonid.time();
        	        MinuOutput[9].setText(MAIN.GLOBAL.ajavahemikpp);
        	        if(MAIN.GLOBAL.timerunning==true)
        	        	{
        	        	yourInputField[7].setBackground(Color.ORANGE);
        	        	yourInputField[9].setBackground(Color.ORANGE);
        	            yourInputField[12].setBackground(Color.ORANGE);
        	            yourInputField[15].setBackground(Color.ORANGE);
        	            yourInputField[18].setBackground(Color.ORANGE);
        	            yourInputField[21].setBackground(Color.ORANGE);
        	            yourInputField[24].setBackground(Color.ORANGE);
        	            yourInputField[27].setBackground(Color.ORANGE);

        	        	MAIN.GLOBAL.tulemusstring="Time running";
        	        	MinuOutput[8].setText(MAIN.GLOBAL.tulemusstring);
        	        	
        	        	
        	        	}else
        	        		{
        	        		yourInputField[8].setBackground(Color.GREEN);
        	            	yourInputField[11].setBackground(Color.GREEN);
        	                yourInputField[14].setBackground(Color.GREEN);
        	                yourInputField[17].setBackground(Color.GREEN);
        	                yourInputField[20].setBackground(Color.GREEN);
        	                yourInputField[23].setBackground(Color.GREEN);
        	                yourInputField[26].setBackground(Color.GREEN);
        	                yourInputField[29].setBackground(Color.GREEN);

        	        		MAIN.GLOBAL.tulemusstring="Time stopped";
        	        		MinuOutput[8].setText(MAIN.GLOBAL.tulemusstring);
        	        		yourInputField[47].setText(GLOBAL.ajavahemikpp);
        	        		System.out.println(GLOBAL.ajavahemikpp);
        	        		}
        	        }}	
        		);    
        button[7].addActionListener(             // CALCULATE
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
        	       // System.out.println("nupp 8");
        	        if((MAIN.GLOBAL.timerunning==false)&(MAIN.GLOBAL.tulemus>0)){
        	        	yourInputField[8].setBackground(Color.ORANGE);
        	        	yourInputField[11].setBackground(Color.ORANGE);
        	            yourInputField[14].setBackground(Color.ORANGE);
        	            yourInputField[17].setBackground(Color.ORANGE);
        	            yourInputField[20].setBackground(Color.ORANGE);
        	            yourInputField[23].setBackground(Color.ORANGE);
        	            yourInputField[26].setBackground(Color.ORANGE);
        	            yourInputField[29].setBackground(Color.ORANGE);

        	        	MAIN.GLOBAL.adenaenne=Integer.parseInt(yourInputField[7].getText());
        	        	MAIN.GLOBAL.adenahiljem=Integer.parseInt(yourInputField[8].getText());
        	        	
        	        	int x=9;
        	        	
        	        	while (true){
        	        		
        	        	try{              //kulu arvutus
        	        	double i1=0;
        	        	double i2=0;
        	        	double i3=0;
        	        		i1=Double.parseDouble(yourInputField[x].getText());
        	        		x++;
        	        		i2=Double.parseDouble(yourInputField[x].getText());
        	        		x++;
        	        		i3=Double.parseDouble(yourInputField[x].getText());
        	        		if(x==11){MAIN.GLOBAL.ssdkulupp=(i1*i2)-(i3*i2);System.out.println(MAIN.GLOBAL.ssdkulupp);}
        	        		//System.out.println("i1="+i1+" i2="+i2+" i3="+i3);//System.exit(0);
        	        		if(x==14){MAIN.GLOBAL.bssdkulupp=((i1*i2)-(i3*i2));System.out.println(MAIN.GLOBAL.bssdkulupp);}
        	        		if(x==17){MAIN.GLOBAL.hppot1kulupp=(i1*i2)-(i3*i2);System.out.println(MAIN.GLOBAL.hppot1kulupp);}
        	        		if(x==20){MAIN.GLOBAL.hppot2kulupp=(i1*i2)-(i3*i2);System.out.println(MAIN.GLOBAL.hppot2kulupp);}
        	        		if(x==23){MAIN.GLOBAL.alarcitykulupp=(i1*i2)-(i3*i2);System.out.println(MAIN.GLOBAL.alarcitykulupp);}
        	        		if(x==26){MAIN.GLOBAL.mhastekulupp=(i1*i2)-(i3*i2);System.out.println(MAIN.GLOBAL.mhastekulupp);}
        	        		if(x==26){MAIN.GLOBAL.hastekulupp=(i1*i2)-(i3*i2);System.out.println(MAIN.GLOBAL.hastekulupp);}
        	        		x++;
        	        	}	
        	        	catch(Exception e1){
        	        		yourInputField[x].setText("Number!");
        	        		
        	        	}
        	        	if(x>25){break;}
        	        	}
        	        	
        	        	
        	        	
        	        	Funktsioonid.profitcalc();
        	        		
        	        MinuOutput[8].setText("8"+MAIN.GLOBAL.tulemusstring);
        	        MinuOutput[20].setText(""+(int)GLOBAL.kogutulu);
        	
        	        yourInputField[32].setText("32"+GLOBAL.tulemusstring);

        	        yourInputField[33].setText("33"+GLOBAL.ajavahemikpp);
        	        GLOBAL.stonesAAvaluepp=((Double.parseDouble(yourInputField[36].getText())-Double.parseDouble(yourInputField[34].getText()))*Double.parseDouble(yourInputField[35].getText()));
        	        GLOBAL.stonesAAvaluepp=GLOBAL.stonesAAvaluepp+((Double.parseDouble(yourInputField[39].getText())-Double.parseDouble(yourInputField[37].getText()))*Double.parseDouble(yourInputField[38].getText()));
        	        GLOBAL.stonesAAvaluepp=GLOBAL.stonesAAvaluepp+((Double.parseDouble(yourInputField[42].getText())-Double.parseDouble(yourInputField[40].getText()))*Double.parseDouble(yourInputField[41].getText()));
        	        
        	        MinuOutput[21].setText(""+(int)GLOBAL.stonesAAvaluepp);	
        	        }else{
        	        	MinuOutput[8].setText("Time running");
        	        }
        	        }}	
        		);    
        button[8].addActionListener(             // save
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
        	        	String s=yourInputField[30].getText()+"#/#"+yourInputField[31].getText()+"#/#"+yourInputField[32].getText()+"#/#"+yourInputField[33].getText();
        	        	try {
							INI.failifuntsioonid.scoreadd(s);
		        	        labelid[25].setText("Saved to 'Score.txt'");
		        	     //   yourInputField[30].setVisible(false);
		        	     //   yourInputField[31].setVisible(false);
		        	     //   yourInputField[32].setVisible(false);
		        	     //   yourInputField[33].setVisible(false);
		        	     //   button[8].setVisible(false);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
        	        }}	
        		);
        
        button[9].addActionListener(             // Reset Calc.ini
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
        	        	
        	        	try {
							INI.failifuntsioonid.kustutaini();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							System.out.println("Nupp reset calc ei saanud Calc.ini kustutamisega hakkama");
						}
        	        	
        	        	try {
							INI.INI_GLOBAL.start(args);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							System.out.println("Nupp reset calc juhtus mingi jama käivitades INI.INI_GLOBAL.start");
						}
        	        	

        	        }}	
        		);    
        
      /*
        yourInputField[1].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	        	
        	        	
        	            String str=yourInputField[1].getText();
        	            try{
        	            	double a=Double.parseDouble(str);
        	            
        	            	MAIN.GLOBAL.adenaReserv=a;
        	            
        	            
        	            }
        	            catch(Exception e1){
        	            	yourInputField[1].setText("Number!"); 
        	            };
        	            
        	            
        	            
        	        //    MinuOutput[7].setText(str);
        	            
        	            
        	            
        	        }
        	    }
        	);
       */
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}