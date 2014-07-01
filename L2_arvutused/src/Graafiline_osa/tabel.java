package Graafiline_osa;




import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.JTextField;

import layout.TableLayout;

public class tabel {

    public static void start(String args[]) {
    	
        JFrame frame = new JFrame(MAIN.GLOBAL.aknanimi);
        frame.setSize((MAIN.GLOBAL.width), (MAIN.GLOBAL.height));
        frame.setLayout(new TableLayout(MAIN.GLOBAL.size));
        String[] label=MAIN.GLOBAL.label;
        
        JButton button[] = new JButton[label.length];
        for (int i = 0; i < label.length; i++) {
            button[i] = new JButton(label[i]);
        }
        
        JLabel label1;
        label1 = new JLabel(MAIN.GLOBAL.lbl1string);
        

        final JTextField[] yourInputField= new JTextField[MAIN.GLOBAL.yourInputFieldArv];
        
        for (int i = 1; i < MAIN.GLOBAL.yourInputFieldArv; i++)
        {
        	yourInputField[i] = new JTextField();
          // add any listener you want to txt[i]
          frame.add(yourInputField[i],MAIN.GLOBAL.inputlocation[i]);
        }
        
        /*
        final JTextField MinuOutput = new JTextField();
        MinuOutput.setText("This is a text");
        MinuOutput.setColumns(20); 
        */
       final  JTextField[] MinuOutput=new JTextField[MAIN.GLOBAL.MinuOutputArv];
  //      System.out.print("loen sisse minuoutputte ...");
        int i = 0;
        for (i = 1; i < MAIN.GLOBAL.MinuOutputArv; i++)
        {
        	MinuOutput[i] = new JTextField();
        	if (i==1){
        		MinuOutput[i].setBackground(Color.GREEN);
        		MinuOutput[i].setText("kuku");
        		
        	}else{
        	  MinuOutput[i].setText(""+i);
        	  MinuOutput[i].setEditable(false);}
          // add any listener you want to txt[i]
   //       frame.add(MinuOutput[i]);
        }
       
        
        
    
    //    System.out.println("...done");
        
        
        
        
// System.out.print("lisan outputte ....");
        	frame.add(MinuOutput[1], MAIN.GLOBAL.outputlocation_1);
        	frame.add(MinuOutput[2], MAIN.GLOBAL.outputlocation_2);
        	frame.add(MinuOutput[3], MAIN.GLOBAL.outputlocation_3);
        	frame.add(MinuOutput[4], MAIN.GLOBAL.outputlocation_4);
        	frame.add(MinuOutput[5], MAIN.GLOBAL.outputlocation_5);
        	frame.add(MinuOutput[6], MAIN.GLOBAL.outputlocation_6);
        	frame.add(MinuOutput[7], MAIN.GLOBAL.outputlocation_7);
        	frame.add(MinuOutput[8], MAIN.GLOBAL.outputlocation_8);
        	frame.add(MinuOutput[9], MAIN.GLOBAL.outputlocation_9);
        	frame.add(MinuOutput[10], MAIN.GLOBAL.outputlocation_10);
        	frame.add(MinuOutput[11], MAIN.GLOBAL.outputlocation_11);
        	frame.add(MinuOutput[12], MAIN.GLOBAL.outputlocation_12);
        	frame.add(MinuOutput[13], MAIN.GLOBAL.outputlocation_13);
        	frame.add(MinuOutput[14], MAIN.GLOBAL.outputlocation_14);
        	frame.add(MinuOutput[15], MAIN.GLOBAL.outputlocation_15);
        	frame.add(MinuOutput[16], MAIN.GLOBAL.outputlocation_16);
        	frame.add(MinuOutput[17], MAIN.GLOBAL.outputlocation_17);
        	frame.add(MinuOutput[18], MAIN.GLOBAL.outputlocation_18);
        	frame.add(MinuOutput[19], MAIN.GLOBAL.outputlocation_19);
        	frame.add(MinuOutput[20], MAIN.GLOBAL.outputlocation_20);
        	frame.add(MinuOutput[21], MAIN.GLOBAL.outputlocation_21);
        	frame.add(MinuOutput[22], MAIN.GLOBAL.outputlocation_22);
        	frame.add(MinuOutput[23], MAIN.GLOBAL.outputlocation_23);
        	frame.add(MinuOutput[24], MAIN.GLOBAL.outputlocation_24);
        	frame.add(MinuOutput[25], MAIN.GLOBAL.outputlocation_25);
        	frame.add(MinuOutput[26], MAIN.GLOBAL.outputlocation_26);
        	frame.add(MinuOutput[27], MAIN.GLOBAL.outputlocation_27);
      //  	System.out.println("done");

        
      //  	System.out.print("lisan muid asju ...");
        
 //   frame.add(yourInputField[1], MAIN.GLOBAL.inputlocation_1); 
 //   frame.add(yourInputField[2], MAIN.GLOBAL.inputlocation_2);
        frame.add(label1, MAIN.GLOBAL.lbllocation_1);
        frame.add(button[0], MAIN.GLOBAL.btnlocation_1);
        frame.add(button[1], MAIN.GLOBAL.btnlocation_2);
        frame.add(button[2], MAIN.GLOBAL.btnlocation_3);
        frame.add(button[3], MAIN.GLOBAL.btnlocation_4);
        
     //   System.out.print("done");
        
        yourInputField[1].addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField[1].getText();
        	            MinuOutput[1].setText(str);
        	        }
        	    }
        	);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}