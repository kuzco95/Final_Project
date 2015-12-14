package Final_game;

import javax.swing.*;						//.* indicates everything in that package is imported
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.security.SecureRandom;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;



public class Super_Class {

	protected SecureRandom NaziNumber = new SecureRandom();
	
	int points = 100;
	
	public JMenu roomMenu; 
	
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
	
	JMenuItem lounge = new JMenuItem("1");
	lounge.setFont(new Font("Goudy old style",Font.PLAIN,16));	//alters the font of button
	
	JMenuItem cRoom = new JMenuItem("2");
	cRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JMenuItem oRoom = new JMenuItem("3");
	oRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JMenuItem dOffice = new JMenuItem("4");
	dOffice.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JMenuItem safeRoom = new JMenuItem("5");
	safeRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JMenuItem mOffice = new JMenuItem("6");
	mOffice.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JMenuItem commRoom = new JMenuItem("7");
	commRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JMenuItem checkIn = new JMenuItem("8");
	checkIn.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JMenuItem lobby = new JMenuItem("9");
	lobby.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JMenuItem potty = new JMenuItem("10");
	potty.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JMenuItem Hall1 = new JMenuItem("Hallway");
	Hall1.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton newRoom = new JButton("New Room");
	newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton jumpDown = new JButton("Drop In");
	jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	}//end Super_Class method
	
	public void WinLose(int thereWere){
		 
		
		
		 SecureRandom winLose = new SecureRandom();
		 int outcome = winLose.nextInt(1);
		 
		 if (thereWere >= 4){
			 
			  fourPlus();			//calls fourPlus method when there are more than four Nazis	  
			  
		 }//end if statement	 
		 
		 switch(outcome)		//switch case: determines if you win or lose
		 {
		 case 0:
			 
			 points = points + (thereWere*100);		//adds points to the score
			 
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
			 points = points + (thereWere*100);		//adds points to the score
			 
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
					System.exit(0);
					
					}//end of action event code			
				});//end of action recognition code
				
		 
		 }//end switch case	 	
		
	}//end method
	
	public void fourPlus(){
		
		JFrame cptObvious = new JFrame("Loser");
		 JLabel yaLost = new JLabel("<html> <font color='silver'> You stood no chance against the Nazis and lost, you "
		 		+ "arrogant bastard. </font><html>");
		 
		whatToDo = cptObvious.getContentPane();
		whatToDo.setBackground(Color.black);
		 
		 cptObvious.setSize(800,400);						//sets the size of the window
		 cptObvious.setLocationRelativeTo(null);
		 cptObvious.setLayout(new GridLayout(2,1));
		 
		 yaLost.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
		 
		 whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton pushOK = new JButton("OK");
			pushOK.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(pushOK);
			
			cptObvious.add(yaLost);         				  	//JFrame
			cptObvious.add(whatNow);
			cptObvious.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			cptObvious.setVisible(true);
			
			pushOK.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					cptObvious.dispose();						//closes JFrame
					
					
					Final_Game over = new Final_Game();
					over.loseMethod(points);
				} //end of action event code
				});	//end of action recognition code			
		
	}//end method

		
	public void runShot(){
		
		 SecureRandom run = new SecureRandom();
		 int deathLive = run.nextInt(20);
		 
		 switch(deathLive)
		 {
		 case 0: case 1: case 2: 
			 JFrame liver = new JFrame("Win!");
			 JLabel youLive = new JLabel("<html> <font color='silver'> It was a close call, but you "
			 		+ "managed to hop the fence without getting shot.</font><html>");
			 
			 winnerBackground = liver.getContentPane();
			 winnerBackground.setBackground(Color.black);
			 
			 liver.setSize(800,400);						//sets the size of the window
			 liver.setLocationRelativeTo(null);
			 liver.setLayout(new GridLayout(2,1));
				
			 youLive.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
				
				whatNow = new JPanel();				
				whatNow.setLayout(new FlowLayout());
				whatNow.setBackground(Color.black);
				
				JButton winnerOK = new JButton("OK");
				winnerOK.setFont(new Font("Goudy old style",Font.PLAIN,16));
				
				whatNow.add(winnerOK);
				
				liver.add(youLive);
				liver.add(whatNow);
				liver.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
				liver.setVisible(true);
				
				winnerOK.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent E){
						liver.dispose();						//closes JFrame
					
						Final_Game youWon = new Final_Game();
						youWon.winMethod(points);
					
					}//end of action event code			
				});//end of action recognition code
			 break;
			 
		 case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16:
		 case 17: case 18: case 19: case 20:
			 JFrame dier = new JFrame("Loss!");
			 JLabel youDied = new JLabel("<html> <font color='silver'> You stook no chance against the guards in the towers.</font><html>");
			 
			 loserBackground = dier.getContentPane();
			 loserBackground.setBackground(Color.black);
			 
			 dier.setSize(800,400);						//sets the size of the window
			 dier.setLocationRelativeTo(null);
			 dier.setLayout(new GridLayout(2,1));
				
			 youDied.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
				
				whatNow = new JPanel();				
				whatNow.setLayout(new FlowLayout());
				whatNow.setBackground(Color.black);
				
				JButton loserOK = new JButton("OK");
				loserOK.setFont(new Font("Goudy old style",Font.PLAIN,16));
				
				whatNow.add(loserOK);
				
				dier.add(youDied);
				dier.add(whatNow);
				dier.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
				dier.setVisible(true);
				
				loserOK.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent E){
						dier.dispose();						//closes JFrame
					
						Final_Game youLost = new Final_Game();
						youLost.loseMethod(points);
						
					}//end of action event code			
				});//end of action recognition code
				
		 
		 }//end switch case

		
	}//end method

} // end class
