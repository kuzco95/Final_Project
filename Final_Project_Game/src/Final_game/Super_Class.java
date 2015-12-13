package Final_game;

import javax.swing.*;						//.* indicates everything in that package is imported
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.security.SecureRandom;
import java.io.File;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;



public class Super_Class {
	
	protected SecureRandom NaziNumber = new SecureRandom();
	
	protected JFrame mapImage;
	protected ImageIcon mapIcon;
	protected JLabel map;
	protected JFrame madeIt;
	protected JLabel dropOrDitch;
	
	protected Container whatToDo;
	protected JPanel whatNow;
	
	protected Container loserBackground;
	protected Container winnerBackground;
	
	
	public void pick_Room(String[] args){
		
	final JFrame decide;
	final JLabel choose;
	final JPanel controlPanel;
	
	JButton lounge = new JButton("1");
	lounge.setFont(new Font("Goudy old style",Font.PLAIN,16));	//alters the font of button
	
	JButton cRoom = new JButton("2");
	cRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton oRoom = new JButton("3");
	oRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton dOffice = new JButton("4");
	dOffice.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton safeRoom = new JButton("5");
	safeRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton mOffice = new JButton("6");
	mOffice.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton commRoom = new JButton("7");
	commRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton checkIn = new JButton("8");
	checkIn.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton lobby = new JButton("9");
	lobby.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton potty = new JButton("10");
	potty.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton Hall1 = new JButton("Hallway");
	Hall1.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton newRoom = new JButton("New Room");
	newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton jumpDown = new JButton("Drop In");
	jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	}//end Super_Class method
	
	public void WinLose(int thereWere){
		
		 SecureRandom winLose = new SecureRandom();
		 int outcome = winLose.nextInt(1);
		 
		 switch(outcome)
		 {
		 case 0:
			 JFrame winner = new JFrame("Win!");
			 JLabel youWin = new JLabel("<html> <font color='silver'> After a brief struggle, you "
			 		+ "prevailed.</font><html>");
			 
			 winnerBackground = winner.getContentPane();
			 winnerBackground.setBackground(Color.black);
			 
			 winner.setSize(800,400);						//sets the size of the window
			 winner.setLocationRelativeTo(null);
			 winner.setLayout(new GridLayout(2,1));
				
				youWin.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
				
				whatNow = new JPanel();				
				whatNow.setLayout(new FlowLayout());
				whatNow.setBackground(Color.black);
				
				JButton winnerOK = new JButton("OK");
				winnerOK.setFont(new Font("Goudy old style",Font.PLAIN,16));
				
				whatNow.add(winnerOK);
				
				winner.add(youWin);
				winner.add(whatNow);
				winner.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
				winner.setVisible(true);
				
				winnerOK.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent E){
						winner.dispose();						//closes JFrame
					
					
					}//end of action event code			
				});//end of action recognition code
			 break;
			 
		 case 1:
			 JFrame loser = new JFrame("Loss!");
			 JLabel youLose = new JLabel("<html> <font color='silver'> You have been slain.</font><html>");
			 
			 loserBackground = loser.getContentPane();
			 loserBackground.setBackground(Color.black);
			 
			 loser.setSize(800,400);						//sets the size of the window
			 loser.setLocationRelativeTo(null);
			 loser.setLayout(new GridLayout(2,1));
				
				youLose.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
				
				whatNow = new JPanel();				
				whatNow.setLayout(new FlowLayout());
				whatNow.setBackground(Color.black);
				
				JButton loserOK = new JButton("OK");
				loserOK.setFont(new Font("Goudy old style",Font.PLAIN,16));
				
				whatNow.add(loserOK);
				
				loser.add(youLose);
				loser.add(whatNow);
				loser.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
				loser.setVisible(true);
				
				loserOK.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent E){
						loser.dispose();						//closes JFrame
					
					
					}//end of action event code			
				});//end of action recognition code
				
		 
		 }//end switch case
		 
		 if (thereWere >= 3){
			 JFrame cptObvious = new JFrame("Loser");
			 JLabel yaLost = new JLabel("<html> <font color='silver'> You stood no chance against the Nazis and lost, you "
			 		+ "arrogant bastard. </font><html>");
			 
		 }//end if statement
			 
		 
		
		
		
	}//end method

} // end class
