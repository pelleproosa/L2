package Graafiline_osa;


/*
 * Siin Luuakse aken ja komponendid selles.
 * V‰‰rtused vıetakse GLOBAL-ist.
 */


import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.JTextField;
import javax.swing.SwingConstants;







import javax.swing.border.Border;

import MAIN.Funktsioonid;
import MAIN.GLOBAL;
import MAIN.rida;
import layout.TableLayout;

public class tabel implements Serializable{
public static final JTextField[] yourInputField= new JTextField[(MAIN.GLOBAL.yourInputFieldArv+1)];
public static final  JTextField[] MinuOutput=new JTextField[(MAIN.GLOBAL.MinuOutputArv+1)];
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
        //labelid[25].setForeground(Color.BLUE);
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



      
        
        
        
        
        
        
        
        for (int i = 1; i < (MAIN.GLOBAL.yourInputFieldArv+1); i++)
        {
        	yourInputField[i] = new JTextField();
        	if(MAIN.GLOBAL.displaylocations){
        	yourInputField[i].setText(""+i+" # "+MAIN.GLOBAL.inputlocation[i]);
        	}

          frame.add(yourInputField[i],MAIN.GLOBAL.inputlocation[i]);
          
      //    System.out.println("i="+i+" Asukoht="+MAIN.GLOBAL.inputlocation[i]);
         // yourInputField[i].setText("0");
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
        int algus=43;
        int end=83;
        while(algus<end){
        	yourInputField[algus].setEditable(false);	
        	algus++;
        }

        
        
        
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
        MinuOutput[9].setVisible(false);
       
        Border punaneraam = BorderFactory.createLineBorder(Color.RED, 1);

        yourInputField[83].setBorder(punaneraam);
        yourInputField[83].setBackground(Color.WHITE);
        yourInputField[84].setBorder(punaneraam);
        yourInputField[84].setBackground(Color.WHITE);
        yourInputField[85].setBorder(punaneraam);
        yourInputField[85].setBackground(Color.WHITE);
        yourInputField[86].setBorder(punaneraam);
        yourInputField[86].setBackground(Color.WHITE);
        yourInputField[87].setBorder(punaneraam);
        yourInputField[87].setBackground(Color.WHITE);
        yourInputField[88].setBorder(punaneraam);
       // yourInputField[88].setBackground(Color.WHITE);
        yourInputField[88].setEditable(false);
        yourInputField[89].setBorder(punaneraam);
       // yourInputField[89].setBackground(Color.WHITE);
        yourInputField[89].setEditable(false);
        yourInputField[90].setBorder(punaneraam);
       // yourInputField[90].setBackground(Color.WHITE);
        yourInputField[90].setEditable(false);

        yourInputField[55].setEditable(false);
        
 /*      
// Vıtan failist loetud Listist viimased viis liiget(rida ehk objekti) ja kirjutan need v‰lja
        try{
        	int ii=MAIN.GLOBAL.objektilistrida.size();
        if(ii>0){
        	System.out.println(ii);
        	
        	MinuOutput[26].setText(MAIN.GLOBAL.objektilistrida.get(ii).getCharname());
        	MinuOutput[27].setText(MAIN.GLOBAL.objektilistrida.get(ii).getLocationname());
        	MinuOutput[28].setText(""+(MAIN.GLOBAL.objektilistrida.get(ii).getAdenaprofit()));
            MinuOutput[29].setText(""+(MAIN.GLOBAL.objektilistrida.get(ii).getAncientadenaprofit()));
        	yourInputField[55].setText(MAIN.GLOBAL.objektilistrida.get(ii).getKuvatavAeg());
        	yourInputField[56].setText(""+MAIN.GLOBAL.objektilistrida.get(ii).getAdenaprofitperH());
        	yourInputField[57].setText(""+MAIN.GLOBAL.objektilistrida.get(ii).getAncientAdenaprofitperH());
        	yourInputField[58].setText(""+ii);
        	ii--;
        	if(ii>0){
        	MinuOutput[22].setText(MAIN.GLOBAL.objektilistrida.get(ii).getCharname());
        	MinuOutput[23].setText(MAIN.GLOBAL.objektilistrida.get(ii).getLocationname());
        	MinuOutput[24].setText(""+(MAIN.GLOBAL.objektilistrida.get(ii).getAdenaprofit()));
            MinuOutput[25].setText(""+(MAIN.GLOBAL.objektilistrida.get(ii).getAncientadenaprofit()));
        	yourInputField[51].setText(MAIN.GLOBAL.objektilistrida.get(ii).getKuvatavAeg());
        	yourInputField[52].setText(""+MAIN.GLOBAL.objektilistrida.get(ii).getAdenaprofitperH());
        	yourInputField[53].setText(""+MAIN.GLOBAL.objektilistrida.get(ii).getAncientAdenaprofitperH());
        	yourInputField[54].setText(""+ii);
        	}
        	ii--;
        	if(ii>0){
        	MinuOutput[18].setText(MAIN.GLOBAL.objektilistrida.get(ii).getCharname());
        	MinuOutput[19].setText(MAIN.GLOBAL.objektilistrida.get(ii).getLocationname());
        	MinuOutput[20].setText(""+(MAIN.GLOBAL.objektilistrida.get(ii).getAdenaprofit()));
            MinuOutput[21].setText(""+(MAIN.GLOBAL.objektilistrida.get(ii).getAncientadenaprofit()));
        	yourInputField[47].setText(MAIN.GLOBAL.objektilistrida.get(ii).getKuvatavAeg());
        	yourInputField[48].setText(""+MAIN.GLOBAL.objektilistrida.get(ii).getAdenaprofitperH());
        	yourInputField[49].setText(""+MAIN.GLOBAL.objektilistrida.get(ii).getAncientAdenaprofitperH());
        	yourInputField[50].setText(""+ii);
        	}
        	ii--;
        	if(ii>0){
        	
        	
        	MinuOutput[14].setText(MAIN.GLOBAL.objektilistrida.get(ii).getCharname());
        	MinuOutput[15].setText(MAIN.GLOBAL.objektilistrida.get(ii).getLocationname());
        	MinuOutput[16].setText(""+(MAIN.GLOBAL.objektilistrida.get(ii).getAdenaprofit()));
            MinuOutput[17].setText(""+(MAIN.GLOBAL.objektilistrida.get(ii).getAncientadenaprofit()));
        	yourInputField[43].setText(MAIN.GLOBAL.objektilistrida.get(ii).getKuvatavAeg());
        	yourInputField[44].setText(""+MAIN.GLOBAL.objektilistrida.get(ii).getAdenaprofitperH());
        	yourInputField[45].setText(""+MAIN.GLOBAL.objektilistrida.get(ii).getAncientAdenaprofitperH());
        	yourInputField[46].setText(""+ii);
        	}
        	ii--;
        	if(ii>0){
        	MinuOutput[10].setText(MAIN.GLOBAL.objektilistrida.get(ii).getCharname());
        	MinuOutput[11].setText(MAIN.GLOBAL.objektilistrida.get(ii).getLocationname());
        	MinuOutput[12].setText(""+(MAIN.GLOBAL.objektilistrida.get(ii).getAdenaprofit()));
            MinuOutput[13].setText(""+(MAIN.GLOBAL.objektilistrida.get(ii).getAncientadenaprofit()));
        	yourInputField[30].setText(MAIN.GLOBAL.objektilistrida.get(ii).getKuvatavAeg());
        	yourInputField[31].setText(""+MAIN.GLOBAL.objektilistrida.get(ii).getAdenaprofitperH());
        	yourInputField[32].setText(""+MAIN.GLOBAL.objektilistrida.get(ii).getAncientAdenaprofitperH());
        	yourInputField[33].setText(""+ii);
        	}
        }
        }catch(Exception e){
        	System.out.println("ERROR!    Vist ei ole Listist midagi vıtta  (tabel)");
        }
        
    */    
        


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
     
        
 LeiaViimaneRida(GLOBAL.objektilistrida);
 System.out.println("GLOBAL.objektridadearv :"+GLOBAL.objektridadearv);
 GLOBAL.objektridadearv--;
 GLOBAL.objektRidaFookuses=GLOBAL.objektridadearv;
 OtsustaKuvamine(GLOBAL.objektridadearv,GLOBAL.objektridadearv);
        
     
        
        
        
        
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
        	        //MinuOutput[9].setText(MAIN.GLOBAL.ajavahemikpp);
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
        	        		if(x==11){MAIN.GLOBAL.ssdkulupp=(i1*i2)-(i3*i2);//System.out.println("ssd: "+MAIN.GLOBAL.ssdkulupp);
        	        		}
        	        		
        	        		//System.out.println("i1="+i1+" i2="+i2+" i3="+i3);//System.exit(0);
        	        		if(x==14){MAIN.GLOBAL.bssdkulupp=((i1*i2)-(i3*i2));//System.out.println("bssd: "+MAIN.GLOBAL.bssdkulupp);
        	        		}
        	        		
        	        		if(x==17){MAIN.GLOBAL.hppot1kulupp=(i1*i2)-(i3*i2);//System.out.println("hp1: "+MAIN.GLOBAL.hppot1kulupp);
        	        		}
        	        		
        	        		if(x==20){MAIN.GLOBAL.hppot2kulupp=(i1*i2)-(i3*i2);//System.out.println("hp2: "+MAIN.GLOBAL.hppot2kulupp);
        	        		}
        	        		if(x==23){MAIN.GLOBAL.alarcitykulupp=(i1*i2)-(i3*i2);//System.out.println("alarcity: "+MAIN.GLOBAL.alarcitykulupp);
        	        		}
        	        		if(x==26){MAIN.GLOBAL.mhastekulupp=(i1*i2)-(i3*i2);//System.out.println("mhaste: "+MAIN.GLOBAL.mhastekulupp);
        	        		}
        	        		if(x==27){MAIN.GLOBAL.hastekulupp=(i1*i2)-(i3*i2);//System.out.println("haste: "+MAIN.GLOBAL.hastekulupp);
        	        		}
        	        		
        	        		x++;
        	        	}	
        	        	catch(Exception e1){
        	        		yourInputField[x].setText("Number!");
        	        		
        	        	}
        	        	if(x>27){break;}
        	        	}
        	        	
        	        	
        	        	
        	        	Funktsioonid.profitcalc();
        	        		
        	        MinuOutput[8].setText(""+MAIN.GLOBAL.tulemusstring);
        	        MinuOutput[20].setText(""+(int)GLOBAL.kogutulu);
        	
        	        yourInputField[32].setText("32"+GLOBAL.tulemusstring);

        	        yourInputField[33].setText("33"+GLOBAL.ajavahemikpp);
        	        GLOBAL.stonesAAvaluepp=((Double.parseDouble(yourInputField[36].getText())-Double.parseDouble(yourInputField[34].getText()))*Double.parseDouble(yourInputField[35].getText()));
        	        GLOBAL.stonesAAvaluepp=GLOBAL.stonesAAvaluepp+((Double.parseDouble(yourInputField[39].getText())-Double.parseDouble(yourInputField[37].getText()))*Double.parseDouble(yourInputField[38].getText()));
        	        GLOBAL.stonesAAvaluepp=GLOBAL.stonesAAvaluepp+((Double.parseDouble(yourInputField[42].getText())-Double.parseDouble(yourInputField[40].getText()))*Double.parseDouble(yourInputField[41].getText()));
        	        
        	        MinuOutput[21].setText(""+(int)GLOBAL.stonesAAvaluepp);	
        	        }else{
        	        	if(MAIN.GLOBAL.timerunning){
        	        	MinuOutput[8].setText("Time running");
        	        	}
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
		        	        
		        	        
		        	       /* 
		        	        MinuOutput[26].setText(MAIN.GLOBAL.objektilistrida.get(i).getCharname());
		                	MinuOutput[27].setText(MAIN.GLOBAL.objektilistrida.get(i).getLocationname());
		                	MinuOutput[28].setText(""+(MAIN.GLOBAL.objektilistrida.get(i).getAdenaprofit()));
		                    MinuOutput[29].setText(""+(MAIN.GLOBAL.objektilistrida.get(i).getAncientadenaprofit()));
		                	yourInputField[55].setText(MAIN.GLOBAL.objektilistrida.get(i).getKuvatavAeg());
		                	yourInputField[56].setText(""+MAIN.GLOBAL.objektilistrida.get(i).getAdenaprofitperH());
		                	yourInputField[57].setText(""+MAIN.GLOBAL.objektilistrida.get(i).getAncientAdenaprofitperH());
		        	        
		        	        */
		        	        
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
							System.out.println("Nupp reset calc juhtus mingi jama k‰ivitades INI.INI_GLOBAL.start");
						}
        	        	

        	        }}	
        		); 

        button[11].addActionListener(             // Up
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
        	        	
        	        		if(MAIN.GLOBAL.objektRidaFookuses>0){
        	        			if(MAIN.GLOBAL.objektRidaFookuses==8){rida reake=new rida("peida", "rida", 0, 0, "", 0, 0, 0);joonistarida1(reake,0);}
        	        			if(MAIN.GLOBAL.objektRidaFookuses==7){rida reake=new rida("peida", "rida", 0, 0, "", 0, 0, 0);joonistarida2(reake,0);}
        	        			if(MAIN.GLOBAL.objektRidaFookuses==6){rida reake=new rida("peida", "rida", 0, 0, "", 0, 0, 0);joonistarida3(reake,0);}
        	        			if(MAIN.GLOBAL.objektRidaFookuses==5){rida reake=new rida("peida", "rida", 0, 0, "", 0, 0, 0);joonistarida4(reake,0);}
        	        			if(MAIN.GLOBAL.objektRidaFookuses==4){rida reake=new rida("peida", "rida", 0, 0, "", 0, 0, 0);joonistarida5(reake,0);}
        	        			if(MAIN.GLOBAL.objektRidaFookuses==3){rida reake=new rida("peida", "rida", 0, 0, "", 0, 0, 0);joonistarida6(reake,0);}
        	        			if(MAIN.GLOBAL.objektRidaFookuses==2){rida reake=new rida("peida", "rida", 0, 0, "", 0, 0, 0);joonistarida7(reake,0);}
        	        			if(MAIN.GLOBAL.objektRidaFookuses==1){rida reake=new rida("peida", "rida", 0, 0, "", 0, 0, 0);joonistarida8(reake,0);}
        	        		MAIN.GLOBAL.objektRidaFookuses--;
        	        		}
        	        		
        	        		System.out.println("button11 Up. ridadearv :"+GLOBAL.objektridadearv+" fookuses: "+MAIN.GLOBAL.objektRidaFookuses);
        	        		 OtsustaKuvamine(GLOBAL.objektridadearv,MAIN.GLOBAL.objektRidaFookuses);
						
        	        	

        	        	

        	        }}	
        		);
        button[12].addActionListener(             // Down
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
        	        	
        	        		if(MAIN.GLOBAL.objektridadearv>MAIN.GLOBAL.objektRidaFookuses){MAIN.GLOBAL.objektRidaFookuses++;}
        	        		
        	        		System.out.println("button12 Down. ridadearv :"+GLOBAL.objektridadearv+" fookuses: "+MAIN.GLOBAL.objektRidaFookuses);
        	        		 OtsustaKuvamine(GLOBAL.objektridadearv,MAIN.GLOBAL.objektRidaFookuses);
						
        	        	

        	        	

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
    
///////Tabeli ridade v‰‰rtused aknasse(9)///////
    // RIDA 5 //
  
//double ancientadenaprofitperh, String kuvatavaeg)
    
    
    
    
	
	
	
	 
    
    
    static void joonistarida1(rida sisu1,int reanr){//output 10 .. 13. input 30 .. 33
    	if((sisu1.getCharname().equalsIgnoreCase("peida"))&&(sisu1.getLocationname().equalsIgnoreCase("rida"))){
    		MinuOutput[10].setText("");
    		MinuOutput[11].setText("");
    		MinuOutput[12].setText("");
    		MinuOutput[13].setText("");
    		yourInputField[30].setText("");
    		yourInputField[31].setText("");
    		yourInputField[32].setText("");
    		yourInputField[33].setText("");
    	}else{
    		MinuOutput[10].setText(sisu1.getCharname());
    		MinuOutput[11].setText(sisu1.getLocationname());
    		MinuOutput[12].setText(""+sisu1.getAdenaprofit());
    		MinuOutput[13].setText(""+sisu1.getAncientadenaprofit());
    	
    		yourInputField[30].setText(sisu1.getKuvatavAeg());
    		yourInputField[31].setText(""+sisu1.getAdenaprofitperH());
    		yourInputField[32].setText(""+sisu1.getAncientAdenaprofitperH());
    		yourInputField[33].setText(""+(sisu1.getReanr()+1));
    	}
    	
    }
    static void joonistarida2(rida sisu2,int reanr){//output 14 .. 17. input 43 .. 46
    	if((sisu2.getCharname().equalsIgnoreCase("peida"))&&(sisu2.getLocationname().equalsIgnoreCase("rida"))){
    		MinuOutput[14].setText("");
    		MinuOutput[15].setText("");
    		MinuOutput[16].setText("");
    		MinuOutput[17].setText("");
    		yourInputField[43].setText("");
    		yourInputField[44].setText("");
    		yourInputField[45].setText("");
    		yourInputField[46].setText("");
    	}else{
    	
    	MinuOutput[14].setText(sisu2.getCharname());
    	MinuOutput[15].setText(sisu2.getLocationname());
    	MinuOutput[16].setText(""+sisu2.getAdenaprofit());
    	MinuOutput[17].setText(""+sisu2.getAncientadenaprofit());
    	
    	yourInputField[43].setText(sisu2.getKuvatavAeg());
    	yourInputField[44].setText(""+sisu2.getAdenaprofitperH());
    	yourInputField[45].setText(""+sisu2.getAncientAdenaprofitperH());
    	yourInputField[46].setText(""+(sisu2.getReanr()+1));
    	}
    }
    static void joonistarida3(rida sisu3,int reanr){//out 18 .. 21 in 47 .. 50
    	if((sisu3.getCharname().equalsIgnoreCase("peida"))&&(sisu3.getLocationname().equalsIgnoreCase("rida"))){
    		MinuOutput[18].setText("");
    		MinuOutput[19].setText("");
    		MinuOutput[20].setText("");
    		MinuOutput[21].setText("");
    		yourInputField[47].setText("");
    		yourInputField[48].setText("");
    		yourInputField[49].setText("");
    		yourInputField[50].setText("");
    	}else{
    	MinuOutput[18].setText(sisu3.getCharname());
    	MinuOutput[19].setText(sisu3.getLocationname());
    	MinuOutput[20].setText(""+sisu3.getAdenaprofit());
    	MinuOutput[21].setText(""+sisu3.getAncientadenaprofit());
    	
    	yourInputField[47].setText(sisu3.getKuvatavAeg());
    	yourInputField[48].setText(""+sisu3.getAdenaprofitperH());
    	yourInputField[49].setText(""+sisu3.getAncientAdenaprofitperH());
    	yourInputField[50].setText(""+(sisu3.getReanr()+1));
    	}
    }
    static void joonistarida4(rida sisu4,int reanr){//o 22 .. 25. i 51 .. 54
    	if((sisu4.getCharname().equalsIgnoreCase("peida"))&&(sisu4.getLocationname().equalsIgnoreCase("rida"))){
    		MinuOutput[22].setText("");
    		MinuOutput[23].setText("");
    		MinuOutput[24].setText("");
    		MinuOutput[25].setText("");
    		yourInputField[51].setText("");
    		yourInputField[52].setText("");
    		yourInputField[53].setText("");
    		yourInputField[54].setText("");
    	}else{
    	MinuOutput[22].setText(sisu4.getCharname());
    	MinuOutput[23].setText(sisu4.getLocationname());
    	MinuOutput[24].setText(""+sisu4.getAdenaprofit());
    	MinuOutput[25].setText(""+sisu4.getAncientadenaprofit());
    	
    	yourInputField[51].setText(sisu4.getKuvatavAeg());
    	yourInputField[52].setText(""+sisu4.getAdenaprofitperH());
    	yourInputField[53].setText(""+sisu4.getAncientAdenaprofitperH());
    	yourInputField[54].setText(""+(sisu4.getReanr()+1));
    	}
    }
    static void joonistarida5(rida sisu5,int reanr){//outputlocation 26 .. 29 inputlocation 55 .. 58
    	if((sisu5.getCharname().equalsIgnoreCase("peida"))&&(sisu5.getLocationname().equalsIgnoreCase("rida"))){
    		MinuOutput[26].setText("");
    		MinuOutput[27].setText("");
    		MinuOutput[28].setText("");
    		MinuOutput[29].setText("");
    		yourInputField[55].setText("");
    		yourInputField[56].setText("");
    		yourInputField[57].setText("");
    		yourInputField[58].setText("");
    	}else{
    	MinuOutput[26].setText(sisu5.getCharname());
    	MinuOutput[27].setText(sisu5.getLocationname());
    	MinuOutput[28].setText(""+sisu5.getAdenaprofit());
    	MinuOutput[29].setText(""+sisu5.getAncientadenaprofit());
    	
    	yourInputField[55].setText(sisu5.getKuvatavAeg());
    	yourInputField[56].setText(""+sisu5.getAdenaprofitperH());
    	yourInputField[57].setText(""+sisu5.getAncientAdenaprofitperH());
    	yourInputField[58].setText(""+(sisu5.getReanr()+1));
    	}
    }
    static void joonistarida6(rida sisu6,int reanr){
    	if((sisu6.getCharname().equalsIgnoreCase("peida"))&&(sisu6.getLocationname().equalsIgnoreCase("rida"))){
        	yourInputField[59].setText("");
        	yourInputField[60].setText("");
        	yourInputField[61].setText("");
        	yourInputField[62].setText("");
        	yourInputField[63].setText("");
        	yourInputField[64].setText("");
        	yourInputField[65].setText("");
        	yourInputField[66].setText("");
    	}else{
    	yourInputField[59].setText(sisu6.getCharname());
    	yourInputField[60].setText(sisu6.getLocationname());
    	yourInputField[61].setText(""+sisu6.getAdenaprofit());
    	yourInputField[62].setText(""+sisu6.getAncientadenaprofit());
    	yourInputField[63].setText(sisu6.getKuvatavAeg());
    	yourInputField[64].setText(""+sisu6.getAdenaprofitperH());
    	yourInputField[65].setText(""+sisu6.getAncientAdenaprofitperH());
    	yourInputField[66].setText(""+(sisu6.getReanr()+1));
    	}
    }
    static void joonistarida7(rida sisu7,int reanr){
    	if((sisu7.getCharname().equalsIgnoreCase("peida"))&&(sisu7.getLocationname().equalsIgnoreCase("rida"))){
    		yourInputField[67].setText("");
        	yourInputField[68].setText("");
        	yourInputField[69].setText("");
        	yourInputField[70].setText("");
        	yourInputField[71].setText("");
        	yourInputField[72].setText("");
        	yourInputField[73].setText("");
        	yourInputField[74].setText("");
    	}else{
    	yourInputField[67].setText(sisu7.getCharname());
    	yourInputField[68].setText(sisu7.getLocationname());
    	yourInputField[69].setText(""+sisu7.getAdenaprofit());
    	yourInputField[70].setText(""+sisu7.getAncientadenaprofit());
    	yourInputField[71].setText(sisu7.getKuvatavAeg());
    	yourInputField[72].setText(""+sisu7.getAdenaprofitperH());
    	yourInputField[73].setText(""+sisu7.getAncientAdenaprofitperH());
    	yourInputField[74].setText(""+(sisu7.getReanr()+1));
    	}
    }
    static void joonistarida8(rida sisu8,int reanr){
    	if((sisu8.getCharname().equalsIgnoreCase("peida"))&&(sisu8.getLocationname().equalsIgnoreCase("rida"))){
    		yourInputField[75].setText("");
        	yourInputField[76].setText("");
        	yourInputField[77].setText("");
        	yourInputField[78].setText("");
        	yourInputField[79].setText("");
        	yourInputField[80].setText("");
        	yourInputField[81].setText("");
        	yourInputField[82].setText("");
    	}else{
    	yourInputField[75].setText(sisu8.getCharname());
    	yourInputField[76].setText(sisu8.getLocationname());
    	yourInputField[77].setText(""+sisu8.getAdenaprofit());
    	yourInputField[78].setText(""+sisu8.getAncientadenaprofit());
    	yourInputField[79].setText(sisu8.getKuvatavAeg());
    	yourInputField[80].setText(""+sisu8.getAdenaprofitperH());
    	yourInputField[81].setText(""+sisu8.getAncientAdenaprofitperH());
    	yourInputField[82].setText(""+(sisu8.getReanr()+1));
    	
    }}
    static void joonistarida9(rida sisu9,int reanr){
    	
    	yourInputField[83].setText(sisu9.getCharname());
    	yourInputField[84].setText(sisu9.getLocationname());
    	yourInputField[85].setText(""+sisu9.getAdenaprofit());
    	yourInputField[86].setText(""+sisu9.getAncientadenaprofit());
    	yourInputField[87].setText(sisu9.getKuvatavAeg());
    	yourInputField[88].setText(""+sisu9.getAdenaprofitperH());
    	yourInputField[89].setText(""+sisu9.getAncientAdenaprofitperH());
    	yourInputField[90].setText(""+(sisu9.getReanr()+1));
    	
    }
    
    static void LeiaViimaneRida(List <rida> realist){
    	GLOBAL.objektridadearv=realist.size();
    }
    static void ValiAntudRidaListist(int valik){
    	GLOBAL.objektrida=GLOBAL.objektilistrida.get(valik);
    	
    }
    static void OtsustaKuvamine(int ridadearv,int RidaFookuses){
    	//kuvab alt ¸les(tagant ettepoole, palju mahub ehk X<=9 rida) igale reale vaja oma v‰‰rtused lugeda
    	
    	if((ridadearv>=RidaFookuses)&&(ridadearv>0)){ //Kontroll, kas soovitav rida j‰‰b olemasolevasse piirkonda 
    		int reanr=RidaFookuses;
    			if (RidaFookuses<9){}
    			if(reanr>=0){joonistarida9(MAIN.GLOBAL.objektilistrida.get(reanr),reanr);reanr--;}
    			if(reanr>=0){joonistarida8(MAIN.GLOBAL.objektilistrida.get(reanr),reanr);reanr--;}
    			if(reanr>=0){joonistarida7(MAIN.GLOBAL.objektilistrida.get(reanr),reanr);reanr--;}
    			if(reanr>=0){joonistarida6(MAIN.GLOBAL.objektilistrida.get(reanr),reanr);reanr--;}
    			if(reanr>=0){joonistarida5(MAIN.GLOBAL.objektilistrida.get(reanr),reanr);reanr--;}
    			if(reanr>=0){joonistarida4(MAIN.GLOBAL.objektilistrida.get(reanr),reanr);reanr--;}
    			if(reanr>=0){joonistarida3(MAIN.GLOBAL.objektilistrida.get(reanr),reanr);reanr--;}
    			if(reanr>=0){joonistarida2(MAIN.GLOBAL.objektilistrida.get(reanr),reanr);reanr--;}
    			if(reanr>=0){joonistarida1(MAIN.GLOBAL.objektilistrida.get(reanr),reanr);reanr--;}
    		
    		
    		
    		
    		
    	}
    }
    
    
}