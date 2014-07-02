package Graafiline_osa;





import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.JTextField;
import javax.swing.SwingConstants;


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
        	System.out.println(i);
        	labelid[i]=new JLabel(MAIN.GLOBAL.labeltext[i]);
        	frame.add(labelid[i],MAIN.GLOBAL.labellocation[i]);
        	}
        labelid[1].setVisible(false);
        labelid[15].setVisible(false);
        labelid[18].setVisible(false);
        labelid[19].setVisible(false);
        labelid[3].setVisible(false);
        labelid[4].setVisible(false);
        labelid[5].setVisible(false);
        labelid[8].setVisible(false);
        labelid[9].setVisible(false);
        labelid[10].setVisible(false);
        labelid[16].setHorizontalAlignment(SwingConstants.CENTER);
        labelid[17].setHorizontalAlignment(SwingConstants.CENTER);


      
        
        
        
        
        
        final JTextField[] yourInputField= new JTextField[(MAIN.GLOBAL.yourInputFieldArv+1)];
        
        for (int i = 1; i < (MAIN.GLOBAL.yourInputFieldArv+1); i++)
        {
        	yourInputField[i] = new JTextField();
        	if(MAIN.GLOBAL.displaylocations){
        	yourInputField[i].setText(""+i+" # "+MAIN.GLOBAL.inputlocation[i]);
        	}

          frame.add(yourInputField[i],MAIN.GLOBAL.inputlocation[i]);

        }
        
        
        yourInputField[1].setVisible(false);
        yourInputField[3].setVisible(false);
        yourInputField[4].setVisible(false);
        yourInputField[5].setVisible(false);
        yourInputField[6].setVisible(false);
        yourInputField[8].setVisible(false);
        yourInputField[9].setVisible(false);
        yourInputField[10].setVisible(false);
        yourInputField[11].setVisible(false);
        yourInputField[12].setVisible(false);
        yourInputField[13].setVisible(false);
        yourInputField[14].setVisible(false);
        yourInputField[15].setVisible(false);
        yourInputField[17].setVisible(false);
        yourInputField[19].setVisible(false);
        yourInputField[20].setVisible(false);
        yourInputField[21].setVisible(false);
        yourInputField[22].setVisible(false);
        yourInputField[23].setVisible(false);
        yourInputField[24].setVisible(false);
        yourInputField[25].setVisible(false);
        yourInputField[28].setVisible(false);
        
        
        yourInputField[18].setText("0");
        yourInputField[27].setText("0");
        yourInputField[16].setText("0");
        
    	yourInputField[2].setText("0");
    	
    	yourInputField[26].setText("0");
    	yourInputField[7].setText("0");
        
        
        
        
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
 
        MinuOutput[3].setVisible(false);
        MinuOutput[4].setVisible(false);
        MinuOutput[5].setVisible(false);
        MinuOutput[6].setVisible(false);
        MinuOutput[7].setVisible(false);
        MinuOutput[8].setVisible(false);
        MinuOutput[9].setVisible(false);
        MinuOutput[10].setVisible(false);
        MinuOutput[13].setVisible(false);
        MinuOutput[14].setVisible(false);
        MinuOutput[15].setVisible(false);
        MinuOutput[16].setVisible(false);
        MinuOutput[17].setVisible(false);
        MinuOutput[18].setVisible(false);
        MinuOutput[21].setVisible(false);
        MinuOutput[22].setVisible(false);
        MinuOutput[23].setVisible(false);
        MinuOutput[24].setVisible(false);
        MinuOutput[25].setVisible(false);
        MinuOutput[26].setVisible(false);
        MinuOutput[27].setVisible(false);


        frame.add(button[0], MAIN.GLOBAL.btnlocation_1);
        frame.add(button[1], MAIN.GLOBAL.btnlocation_2);
        frame.add(button[2], MAIN.GLOBAL.btnlocation_3);
        frame.add(button[3], MAIN.GLOBAL.btnlocation_4);
        frame.add(button[4], MAIN.GLOBAL.btnlocation_5);
        frame.add(button[5], MAIN.GLOBAL.btnlocation_6);
        
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
        	            MinuOutput[1].setText(str);
        	        
        	        }
        	        
        	        
        	        
        	        
        	    }	
        		
        		
        		);
 */       
        button[1].addActionListener(
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
int i=0;
        	        	
        	        	String str[]=new String[4];
        	        	str[0]=yourInputField[16].getText();
        	        	str[1]=yourInputField[2].getText();
        	        	str[2]=yourInputField[26].getText();
        	        	str[3]=yourInputField[7].getText();
        	            try{
        	            	MAIN.GLOBAL.adenaReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.soulReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.spiritReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.cryDReserv=Double.parseDouble(str[i]);
        	      
        	        	ssd_adena_input.Klass1.main(null);	
            	        MinuOutput[1].setText(""+(int)MAIN.GLOBAL.cryDKogusOsta);
            	        MinuOutput[12].setText(""+(int)MAIN.GLOBAL.soulKogusOsta);
            	       MinuOutput[20].setText(""+(int)MAIN.GLOBAL.spiritKogusOsta);
            	        MinuOutput[2].setText(""+(int)MAIN.GLOBAL.adenaReserv);
            	        MinuOutput[19].setText(""+(int)MAIN.GLOBAL.spiritReserv);
            	        MinuOutput[28].setText(""+(int)MAIN.GLOBAL.cryDJ2rel);
            	        yourInputField[27].setText(""+(int)MAIN.GLOBAL.SSDShots);
            	       MinuOutput[11].setText(""+(int)MAIN.GLOBAL.soulJ2rel);
           	        
            	        }
        	            catch(Exception e1){
        	            	if (i==0){yourInputField[16].setText("Number!");}
        	            	if (i==1){yourInputField[2].setText("Number!");}
        	            	if (i==2){yourInputField[26].setText("Number!");}
        	            	if (i==3){yourInputField[7].setText("Number!");}
        	            };
        	        }}	
        		);    
        button[3].addActionListener(
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
int i=0;
        	        	
        	        	String str[]=new String[4];
        	        	str[0]=yourInputField[16].getText();
        	        	str[1]=yourInputField[2].getText();
        	        	str[2]=yourInputField[26].getText();
        	        	str[3]=yourInputField[7].getText();
        	            try{
        	            	MAIN.GLOBAL.adenaReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.soulReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.spiritReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.cryDReserv=Double.parseDouble(str[i]);
        	      
        	        	ssd_adena_input.Klass1.main(null);	
            	        MinuOutput[1].setText(""+(int)MAIN.GLOBAL.cryDKogusOsta);
            	        MinuOutput[12].setText(""+(int)MAIN.GLOBAL.soulKogusOsta);
            	       MinuOutput[20].setText(""+(int)MAIN.GLOBAL.spiritKogusOsta);
            	        MinuOutput[2].setText(""+(int)MAIN.GLOBAL.adenaReserv);
            	        MinuOutput[19].setText(""+(int)MAIN.GLOBAL.spiritReserv);
            	        MinuOutput[28].setText(""+(int)MAIN.GLOBAL.cryDJ2rel);
            	        yourInputField[27].setText(""+(int)MAIN.GLOBAL.SSDShots);
            	       MinuOutput[11].setText(""+(int)MAIN.GLOBAL.soulJ2rel);
        	        
        	        }
    	            catch(Exception e1){
    	            	if (i==0){yourInputField[16].setText("Number!");}
    	            	if (i==1){yourInputField[2].setText("Number!");}
    	            	if (i==2){yourInputField[26].setText("Number!");}
    	            	if (i==3){yourInputField[7].setText("Number!");}
    	            };
    	        }}	
    		);
        button[0].addActionListener(   ///adena->bssd nupp
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {

int i=0;
        	        	
        	        	String str[]=new String[4];
        	        	str[0]=yourInputField[16].getText();
        	        	str[1]=yourInputField[2].getText();
        	        	str[2]=yourInputField[26].getText();
        	        	str[3]=yourInputField[7].getText();
        	            try{
        	            	MAIN.GLOBAL.adenaReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.soulReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.spiritReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.cryDReserv=Double.parseDouble(str[i]);
        	        bssd_adena_input.Klass1.main(null);	
        	        MinuOutput[1].setText(""+(int)MAIN.GLOBAL.cryDKogusOsta);
        	        MinuOutput[12].setText(""+(int)MAIN.GLOBAL.soulKogusOsta);
        	        MinuOutput[20].setText(""+(int)MAIN.GLOBAL.spiritKogusOsta);
        	        MinuOutput[2].setText(""+(int)MAIN.GLOBAL.adenaReserv);
        	        MinuOutput[19].setText(""+(int)MAIN.GLOBAL.spiritJ2rel);
        	        MinuOutput[28].setText(""+(int)MAIN.GLOBAL.cryDJ2rel);
        	        yourInputField[18].setText(""+(int)MAIN.GLOBAL.BSSDShots);
           	       MinuOutput[11].setText(""+(int)MAIN.GLOBAL.soulReserv);
        	            }
        	            catch(Exception e1){
        	            	if (i==0){yourInputField[16].setText("Number!");}
        	            	if (i==1){yourInputField[2].setText("Number!");}
        	            	if (i==2){yourInputField[26].setText("Number!");}
        	            	if (i==3){yourInputField[7].setText("Number!");}
        	            };
        	        }}	
        		);
        button[2].addActionListener(   ///BSSD->Mats
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
        	        	
        	        	int i=0;
        	        	
        	        	String str[]=new String[4];
        	        	str[0]=yourInputField[16].getText();
        	        	str[1]=yourInputField[2].getText();
        	        	str[2]=yourInputField[26].getText();
        	        	str[3]=yourInputField[7].getText();
        	            try{
        	            	MAIN.GLOBAL.adenaReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.soulReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.spiritReserv=Double.parseDouble(str[i]);i++;MAIN.GLOBAL.cryDReserv=Double.parseDouble(str[i]);
        	        bssd_adena_input.Klass1.main(null);	
        	        MinuOutput[1].setText(""+(int)MAIN.GLOBAL.cryDKogusOsta);
        	        MinuOutput[12].setText(""+(int)MAIN.GLOBAL.soulKogusOsta);
        	        MinuOutput[20].setText(""+(int)MAIN.GLOBAL.spiritKogusOsta);
        	        MinuOutput[2].setText(""+(int)MAIN.GLOBAL.adenaReserv);
        	        MinuOutput[19].setText(""+(int)MAIN.GLOBAL.spiritJ2rel);
        	        MinuOutput[28].setText(""+(int)MAIN.GLOBAL.cryDJ2rel);
        	        yourInputField[18].setText(""+(int)MAIN.GLOBAL.BSSDShots);
        	        MinuOutput[11].setText(""+(int)MAIN.GLOBAL.soulReserv);
    	            }
        	            catch(Exception e1){
        	            	if (i==0){yourInputField[16].setText("Number!");}
        	            	if (i==1){yourInputField[2].setText("Number!");}
        	            	if (i==2){yourInputField[26].setText("Number!");}
        	            	if (i==3){yourInputField[7].setText("Number!");}
        	            };
        	        }}	
        		);
        
        
        
        
        
       
       
       
       
       
        button[5].addActionListener(   ///CLEAR
        	    new ActionListener() {
        	    	
        	        public void actionPerformed(ActionEvent e) {
 
        	           
        	        MAIN.GLOBAL.adenaReserv=0;MAIN.GLOBAL.soulReserv=0;MAIN.GLOBAL.spiritReserv=0;MAIN.GLOBAL.cryDReserv=0;
        	        bssd_adena_input.Klass1.main(null);	
        	        MinuOutput[2].setText("");
        	        MinuOutput[11].setText("");
        	        MinuOutput[19].setText("");
        	        MinuOutput[28].setText("");
        	        MinuOutput[12].setText("");
        	        MinuOutput[20].setText("");
        	        MinuOutput[1].setText("");
        	        yourInputField[18].setText("0");
        	        yourInputField[27].setText("0");
        	        yourInputField[16].setText("0");
        	        
	            	yourInputField[2].setText("0");
	            	
	            	yourInputField[26].setText("0");
	            	yourInputField[7].setText("0");
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

        	        yourInputField[2].setText(MinuOutput[11].getText());
        	        yourInputField[16].setText(MinuOutput[2].getText());
        	        yourInputField[26].setText(MinuOutput[19].getText());
        	        yourInputField[7].setText(MinuOutput[28].getText());
        	        MinuOutput[2].setText("");
        	        MinuOutput[11].setText("");
        	        MinuOutput[19].setText("");
        	        MinuOutput[28].setText("");
        	        MinuOutput[12].setText("");
        	        MinuOutput[20].setText("");
        	        MinuOutput[1].setText("");
        	        yourInputField[18].setText("");
        	        yourInputField[27].setText("");

    	            }
        	      
        	        }	
        		);
       
        
      
        yourInputField[16].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	        	
        	        	
        	            String str=yourInputField[16].getText();
        	            try{
        	            	double a=Double.parseDouble(str);
        	            
        	            	MAIN.GLOBAL.adenaReserv=a;
        	            
        	            
        	            }
        	            catch(Exception e1){
        	            	yourInputField[16].setText("Number!"); 
        	            };
        	        //    MinuOutput[1].setText(str);
        	            
        	            
        	            
        	        }
        	    }
        	);
        
   /*     yourInputField[2].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[2].getText();
        	            MinuOutput[2].setText(str);
        	        }
        	    }
        	);
        yourInputField[3].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[3].getText();
        	            MinuOutput[3].setText(str);
        	        }
        	    }
        	);
        yourInputField[4].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[4].getText();
        	            MinuOutput[4].setText(str);
        	        }
        	    }
        	);
        yourInputField[5].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[5].getText();
        	            MinuOutput[5].setText(str);
        	        }
        	    }
        	);
        yourInputField[6].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[6].getText();
        	            MinuOutput[6].setText(str);
        	        }
        	    }
        	);
        yourInputField[7].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[7].getText();
        	            MinuOutput[7].setText(str);
        	        }
        	    }
        	);
        yourInputField[8].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[8].getText();
        	            MinuOutput[8].setText(str);
        	        }
        	    }
        	);
        yourInputField[9].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[9].getText();
        	            MinuOutput[9].setText(str);
        	        }
        	    }
        	);
        yourInputField[10].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[10].getText();
        	            MinuOutput[10].setText(str);
        	        }
        	    }
        	);
        yourInputField[11].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[11].getText();
        	            MinuOutput[11].setText(str);
        	        }
        	    }
        	);
        yourInputField[12].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[12].getText();
        	            MinuOutput[12].setText(str);
        	        }
        	    }
        	);
        yourInputField[13].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[13].getText();
        	            MinuOutput[13].setText(str);
        	        }
        	    }
        	);
        yourInputField[14].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[14].getText();
        	            MinuOutput[14].setText(str);
        	        }
        	    }
        	);
        yourInputField[15].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[15].getText();
        	            MinuOutput[15].setText(str);
        	        }
        	    }
        	);
        yourInputField[16].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[16].getText();
        	            MinuOutput[16].setText(str);
        	        }
        	    }
        	);
        yourInputField[17].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[17].getText();
        	            MinuOutput[17].setText(str);
        	        }
        	    }
        	);
        yourInputField[18].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[18].getText();
        	            MinuOutput[18].setText(str);
        	        }
        	    }
        	);
        yourInputField[19].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[19].getText();
        	            MinuOutput[19].setText(str);
        	        }
        	    }
        	);
        yourInputField[20].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[20].getText();
        	            MinuOutput[20].setText(str);
        	        }
        	    }
        	);
        yourInputField[21].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[21].getText();
        	            MinuOutput[21].setText(str);
        	        }
        	    }
        	);
        yourInputField[22].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[22].getText();
        	            MinuOutput[22].setText(str);
        	        }
        	    }
        	);
        yourInputField[23].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[23].getText();
        	            MinuOutput[23].setText(str);
        	        }
        	    }
        	);
        yourInputField[24].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[24].getText();
        	            MinuOutput[24].setText(str);
        	        }
        	    }
        	);
        yourInputField[25].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[25].getText();
        	            MinuOutput[25].setText(str);
        	        }
        	    }
        	);
        yourInputField[26].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[26].getText();
        	            MinuOutput[26].setText(str);
        	        }
        	    }
        	);

        yourInputField[27].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[27].getText();
        	            MinuOutput[27].setText(str);
        	        }
        	    }
        	); 
        yourInputField[28].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[28].getText();
        	            MinuOutput[28].setText(str);
        	        }
        	    }
        );
        */
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}