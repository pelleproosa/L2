package Graafiline_osa;





import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.JTextField;
import javax.swing.SwingConstants;







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
        
        JButton button[] = new JButton[label.length];
        for (int i = 0; i < label.length; i++) {
            button[i] = new JButton(label[i]);
            button[i].setMargin(new Insets(0,0,0,0));
            button[i].setFont(new Font("Arial", Font.BOLD, 12));
            button[i].setText(label[i]);
        }
        
        
        

        
        JLabel[] labelid=new JLabel[(MAIN.GLOBAL.labeliteArv+1)];
        for (int i = 1; i < (MAIN.GLOBAL.labeliteArv); i++)
        {
        	//System.out.println(i);
        	labelid[i]=new JLabel(MAIN.GLOBAL.labeltext[i]);
        	frame.add(labelid[i],MAIN.GLOBAL.labellocation[i]);
        	
        	}
       labelid[1].setHorizontalAlignment(SwingConstants.CENTER);
       labelid[3].setHorizontalAlignment(SwingConstants.CENTER);
       labelid[4].setHorizontalAlignment(SwingConstants.CENTER);
       //frame.add(new JLabel("<html>Text color: <font color='red'>red</font></html>"));
       labelid[5].setForeground(Color.RED);
       // labelid[8].setVisible(false);
        labelid[9].setVisible(false);
        labelid[10].setVisible(false);
        labelid[15].setVisible(false);
        labelid[16].setHorizontalAlignment(SwingConstants.CENTER);
        labelid[17].setHorizontalAlignment(SwingConstants.CENTER);
        labelid[18].setVisible(false);
        labelid[19].setVisible(false);


      
        
        
        
        
        
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


        frame.add(button[0], MAIN.GLOBAL.btnlocation_1);
        frame.add(button[1], MAIN.GLOBAL.btnlocation_2);
        frame.add(button[2], MAIN.GLOBAL.btnlocation_3);
        frame.add(button[3], MAIN.GLOBAL.btnlocation_4);
        frame.add(button[4], MAIN.GLOBAL.btnlocation_5);
        frame.add(button[5], MAIN.GLOBAL.btnlocation_6);
        frame.add(button[6], MAIN.GLOBAL.btnlocation_7);
        frame.add(button[7], MAIN.GLOBAL.btnlocation_8);
        
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
        	            	MAIN.GLOBAL.BSSDRequested=Double.parseDouble(str[4]);
        	        ssd_adena_input.Klass1.main(null);	
        	        MinuOutput[7].setText(""+(int)MAIN.GLOBAL.cryDKogusOsta);
        	        MinuOutput[5].setText(""+(int)MAIN.GLOBAL.soulKogusOsta);
        	        MinuOutput[6].setText(""+(int)MAIN.GLOBAL.spiritKogusOsta);
        	        MinuOutput[1].setText(""+(int)MAIN.GLOBAL.adenaReserv);
        	        MinuOutput[3].setText(""+(int)MAIN.GLOBAL.spiritJ2rel);
        	        MinuOutput[4].setText(""+(int)MAIN.GLOBAL.cryDJ2rel);
        	        yourInputField[5].setText(""+(int)MAIN.GLOBAL.SSDShots);
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
        	        yourInputField[1].setText("0");
        	        yourInputField[2].setText("0");
        	        yourInputField[3].setText("0");
        	        yourInputField[4].setText("0");
        	        yourInputField[5].setText("0");
        	        yourInputField[6].setText("0");
        	        yourInputField[7].setText("0");
        	        yourInputField[8].setText("0");
        	        
	            	
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

        	        yourInputField[2].setText(MinuOutput[2].getText());
        	        yourInputField[1].setText(MinuOutput[1].getText());
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
        button[6].addActionListener(             // BSSD  -MATS
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
        	        	MAIN.GLOBAL.adenaenne=Integer.parseInt(yourInputField[7].getText());
        	        Funktsioonid.time();
        	        if(MAIN.GLOBAL.timerunning==true){
        	        	
        	        
        	        	
        	        	MAIN.GLOBAL.tulemusstring="Time running";
        	        	MinuOutput[8].setText(MAIN.GLOBAL.tulemusstring);}
        	        }}	
        		);    
        button[7].addActionListener(             // BSSD  -MATS
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
        	        System.out.println("nupp 8");
        	        if(MAIN.GLOBAL.timerunning==false){
        	        	MAIN.GLOBAL.adenahiljem=Integer.parseInt(yourInputField[8].getText());
        	        	Funktsioonid.profitcalc();
        	        MinuOutput[8].setText(MAIN.GLOBAL.tulemusstring);
        	        
        	        	
        	        	
        	        }else{
        	        	MinuOutput[8].setText("Time running");
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