package Interface;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;

public class measurableViewer
{

   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 200;

   public static void main(String[] args)
   {
	   Scanner scnr = new Scanner(System.in);
	   
	      Measurable[] accounts = new Measurable[3];
	      accounts[0] = new BankAccount(0);
	      accounts[1] = new BankAccount(10000);
	      accounts[2] = new BankAccount(2000);

		   
	      Measurable[] countries = new Measurable[3];
	      countries[0] = new Country("Uruguay", 176220);
	      countries[1] = new Country("Thailand", 513120);
	      countries[2] = new Country("Belgium", 30510);	
	      
	      Measurable[] scores = new Measurable[5];
	      scores[0] = new Quiz(60);
	      scores[1] = new Quiz(90);
	      scores[2] = new Quiz(100);
	      scores[3] = new Quiz(85);
	      scores[4] = new Quiz(75);
	      
	   System.out.print("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
	   int whichMetric = scnr.nextInt();
	   String metricToUse="average";
	   if (whichMetric == 1) {metricToUse = "Maximum";}
	   if (whichMetric == 2) {metricToUse = "Minimum";}
	   if (whichMetric == 3) {metricToUse = "Average";}
      
	  JPanel panel = new JPanel();
	  JFrame frame = new JFrame();
      frame.add(panel);
 
      JButton button = new JButton("Get " + metricToUse + " Balance");
      panel.add(button);
      frame.add(panel);
      ActionListener listener = new ButtonListener(accounts,metricToUse);
      button.addActionListener(listener);
    
      JButton button2 = new JButton("Get " + metricToUse + " Area");
      panel.add(button2);
      ActionListener listener2 = new ButtonListener(countries,metricToUse);
      button2.addActionListener(listener2);
           
      JButton button3 = new JButton("Get " + metricToUse + " Score");
      panel.add(button3);
      ActionListener listener3 = new ButtonListener(scores,metricToUse);
      button3.addActionListener(listener3);
 
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}