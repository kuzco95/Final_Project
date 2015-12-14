////Final project game main class
//code from Project 2
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

public class Final_Game {
	
	private JFrame introContext = new JFrame("Year: 1946");	
	private JLabel USAcontentLabel = new JLabel("<html> <font color='silver'> Welcome, USAyou have awakened in "
			+ "a cold cell with a map on the ground and no recollection as to how you got there."
			+ "The last thing you remember is flying a bomber over Berlin.  Take a look "
			+ "at the map in your cell.</font><html>",JLabel.CENTER);
	
	private JLabel GBcontentLabel = new JLabel("<html> <font color='silver'> Welcome, BRITyou have awakened in "
			+ "a cold cell with a map on the ground and no recollection as to how you got there."
			+ "The last thing you remember is flying a bomber over Berlin.  Take a look "
			+ "at the map in your cell.</font><html>",JLabel.CENTER);
	
	private JLabel RussiancontentLabel = new JLabel("<html> <font color='silver'> Welcome, RUSSIANyou have awakened in "
			+ "a cold cell with a map on the ground and no recollection as to how you got there."
			+ "The last thing you remember is flying a bomber over Berlin.  Take a look "
			+ "at the map in your cell.</font><html>",JLabel.CENTER);
	
	protected JLabel titleImage;
	protected ImageIcon titleIcon;  
	
	public JFrame gameMap = new JFrame("Map"); 
	protected Container Context;
	private JPanel controlPanel;
	
	protected JFrame asylumRevelation = new JFrame("Enlightenment");
	protected JLabel RevelationContent = new JLabel("<html> <font color='silver'> After looking out "
			+ "the small window in the door, you soon realize that you are, in fact, locked inside "
			+ "a Nazi facility. Attract the guard's attention and get out quickly. </font><html>");
	
	protected Container learn;
	protected JPanel clickOK; ////////////////////////
	
//	public JFrame homeLandFrame = new JFrame("Map"); 
//	protected Container homeContainer;
//	private JPanel homePanel;
	
	protected JFrame homeLandFrame = new JFrame("Enlightenment");
	protected JLabel homeLandLabel = new JLabel("<html> <font color='silver'> Select your country of origin. </font><html>");
	
	protected Container homeContainer;
	private JPanel homePanel;
	
	
	String comeFrom;
	
	public void motherLand(){
		
	homeContainer = homeLandFrame.getContentPane();
	homeContainer.setBackground(Color.black);
	
	homeLandFrame.setSize(800,400);						//sets the size of the window
	homeLandFrame.setLocationRelativeTo(null);
	homeLandFrame.setLayout(new GridLayout(2,1));
		
	homeLandLabel.setFont(new Font("Goudy old style",Font.PLAIN,20));
	
	homePanel = new JPanel();					
	homePanel.setLayout(new FlowLayout());
	homePanel.setBackground(Color.black);
	
	JButton Merica = new JButton("USA");						//USA button
	Merica.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton UK = new JButton("Great Britain");					//England button
	UK.setFont(new Font("Goudy old style",Font.PLAIN,16));

	JButton Russia = new JButton("Russia");						//Russia button
	Russia.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	homePanel.add(Merica);		
	homePanel.add(UK);
	homePanel.add(Russia);
	
	homeLandFrame.add(homeLandLabel);
	homeLandFrame.add(homePanel);
	homeLandFrame.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
	homeLandFrame.setVisible(true);
	
	comeFrom = "null";
	
	Merica.addActionListener(new ActionListener(){			//creates ActionListener for OK button
		public void actionPerformed(ActionEvent E){
			homeLandFrame.dispose();						//closes JFrame	
			comeFrom = "USA";
			start();
		} //end of action event code
		});	//end of action recognition code
	
	UK.addActionListener(new ActionListener(){		//creates ActionListener for OK button
		public void actionPerformed(ActionEvent E){
			homeLandFrame.dispose();						//closes JFrame	
			comeFrom = "Great Britain";
			start();
		} //end of action event code
		});	//end of action recognition code
	
	Russia.addActionListener(new ActionListener(){		//creates ActionListener for OK button
		public void actionPerformed(ActionEvent E){
			homeLandFrame.dispose();						//closes JFrame	
			comeFrom = "Russia";
			start();
		} //end of action event code
		});	//end of action recognition code
	}
	
	protected void start(){
	switch(comeFrom)
	{
	case "USA":
		
		Context = introContext.getContentPane();
		Context.setBackground(Color.black);	
		
		introContext.setSize(800,400);						//sets the size of the window
		introContext.setLocationRelativeTo(null);
		introContext.setLayout(new GridLayout(2,1));
		
		USAcontentLabel.setFont(new Font("Goudy old style",Font.PLAIN,20)); //declares font and size

		controlPanel = new JPanel();					
		controlPanel.setLayout(new FlowLayout());
		controlPanel.setBackground(Color.black);	//makes JPanel background black
		
		JButton viewMap = new JButton("OK");
		viewMap.setFont(new Font("Goudy old style",Font.PLAIN,16));	//alters the font of button
		
		controlPanel.add(viewMap);									//OK button
		
		introContext.add(USAcontentLabel);         				  	//JFrame
		introContext.add(controlPanel);
		introContext.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
		introContext.setVisible(true);	
		
		viewMap.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				//introContext.dispose();						//closes JFrame
				
				//System.out.println("The thing will close.");
				
				Pre_Pick();
				
			} //end of action event code
			});	//end of action recognition code
		break;
	case "Great Britain":
		Context = introContext.getContentPane();
		Context.setBackground(Color.black);	
		
		introContext.setSize(800,400);						//sets the size of the window
		introContext.setLocationRelativeTo(null);
		introContext.setLayout(new GridLayout(2,1));
		
		GBcontentLabel.setFont(new Font("Goudy old style",Font.PLAIN,20)); //declares font and size

		controlPanel = new JPanel();					
		controlPanel.setLayout(new FlowLayout());
		controlPanel.setBackground(Color.black);	//makes JPanel background black
		
		JButton GBviewMap = new JButton("OK");
		GBviewMap.setFont(new Font("Goudy old style",Font.PLAIN,16));	//alters the font of button
		
		controlPanel.add(GBviewMap);									//OK button
		
		introContext.add(USAcontentLabel);         				  	//JFrame
		introContext.add(controlPanel);
		introContext.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
		introContext.setVisible(true);	
		
		GBviewMap.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				//introContext.dispose();						//closes JFrame
				
				//System.out.println("The thing will close.");
				
				Pre_Pick();
				
			} //end of action event code
			});	//end of action recognition code
		
		break;
	case "Russia":
		
		Context = introContext.getContentPane();
		Context.setBackground(Color.black);	
		
		introContext.setSize(800,400);						//sets the size of the window
		introContext.setLocationRelativeTo(null);
		introContext.setLayout(new GridLayout(2,1));
		
		RussiancontentLabel.setFont(new Font("Goudy old style",Font.PLAIN,20)); //declares font and size

		controlPanel = new JPanel();					
		controlPanel.setLayout(new FlowLayout());
		controlPanel.setBackground(Color.black);	//makes JPanel background black
		
		JButton RviewMap = new JButton("OK");
		RviewMap.setFont(new Font("Goudy old style",Font.PLAIN,16));	//alters the font of button
		
		controlPanel.add(RviewMap);									//OK button
		
		introContext.add(USAcontentLabel);         				  	//JFrame
		introContext.add(controlPanel);
		introContext.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
		introContext.setVisible(true);	
		
		RviewMap.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				//introContext.dispose();						//closes JFrame
				
				//System.out.println("The thing will close.");
				
				Pre_Pick();
				
			} //end of action event code
			});	//end of action recognition code
		break;
	
	}//end switch case
		
	}//end motherLand method
	

	
	//ACTION CODE METHOD
	public void actionCode(){
		
		
//		Context = introContext.getContentPane();
//		Context.setBackground(Color.black);	
//		
//		introContext.setSize(800,400);						//sets the size of the window
//		introContext.setLocationRelativeTo(null);
//		introContext.setLayout(new GridLayout(2,1));
//		
//		contextContent.setFont(new Font("Goudy old style",Font.PLAIN,20)); //declares font and size
//
//		controlPanel = new JPanel();					
//		controlPanel.setLayout(new FlowLayout());
//		controlPanel.setBackground(Color.black);	//makes JPanel background black
//		
//		JButton viewMap = new JButton("OK");
//		viewMap.setFont(new Font("Goudy old style",Font.PLAIN,16));	//alters the font of button
//		
//		controlPanel.add(viewMap);									//OK button
//		
//		introContext.add(contextContent);         				  	//JFrame
//		introContext.add(controlPanel);
//		introContext.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
//		introContext.setVisible(true);	
//		
//		viewMap.addActionListener(new ActionListener(){		//creates ActionListener for OK button
//			public void actionPerformed(ActionEvent E){
//				//introContext.dispose();						//closes JFrame
//				
//				//System.out.println("The thing will close.");
//				
//				Pre_Pick();
//				
//			} //end of action event code
//			});	//end of action recognition code
		
		return; 
			} //end action code method
	
	
	public void Pre_Pick(){
		introContext.dispose();						//closes JFrame
		gameMap.setAlwaysOnTop(true);
		
		titleIcon = new ImageIcon("X:/Desktop/StartingGameMap.png");				//inserts map
		titleImage = new JLabel(titleIcon);
		gameMap.add(titleImage);
		//titleImage.setVisible(true);
		gameMap.setExtendedState( gameMap.getExtendedState()|JFrame.MAXIMIZED_BOTH );	//sets the size of the window code from stackoverflow.com
		gameMap.setLocationRelativeTo(null);
		gameMap.setVisible(true); 					//makes game map visible
		gameMap.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
		//gameMap.repaint();
		 
//		try{Thread.sleep(4000);}					//displays for 4.0 seconds							
//		catch(Exception e){};
//	
//		
//		gameMap.dispose();
//		gameMap.setVisible(false);
		
		
		learn = asylumRevelation.getContentPane();
		learn.setBackground(Color.black);
		
		
		asylumRevelation.setSize(800,400);						//sets the size of the window
		asylumRevelation.setLocationRelativeTo(null);
		asylumRevelation.setLayout(new GridLayout(2,1));
		
		RevelationContent.setFont(new Font("Goudy old style",Font.PLAIN,20)); //declares font and size
		
		clickOK = new JPanel();					
		clickOK.setLayout(new FlowLayout());
		clickOK.setBackground(Color.black);							//makes JPanel background black
		
		JButton gotIt = new JButton("OK");
		gotIt.setFont(new Font("Goudy old style",Font.PLAIN,16));	//alters the font of button
		//gotIt.setPreferredSize(new Dimension(10,10));				//stackoverflow
		
		clickOK.add(gotIt);											//OK button
		
		asylumRevelation.add(RevelationContent);         			//JFrame
		asylumRevelation.add(clickOK);
		asylumRevelation.setDefaultCloseOperation(2);
		

		asylumRevelation.setVisible(true);
		
		Vent_Rooms transfer = new Vent_Rooms();
		gotIt.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				asylumRevelation.dispose();						//closes JFrame
				transfer.Vent();
			} //end of action event code
			});	//end of action recognition code	
		
		return;
	} //end Pre_Pick method
	
	
	public void winMethod(int total) { 
		
		String winPoints[] = new String[3]; //point array for when you win
		winPoints[0]= "Well, at least you survived."; //100-300 
		winPoints[1]= "You'll have some great stories for the grandkids"; //400 - 900
		winPoints[2] = "You became a war hero!"; //1000 +
		
	}//end winMethod method
	
	public void loseMethod(){

		String losePoints[] = new String[3];
		losePoints[0] = "Wow, you suck."; //100 - 300 
		losePoints[1] = "Your fellow soldiers would've been proud"; //400 - 900
		losePoints[2] = "You could've been a legend!"; //1000 +
		
	}//end loseMethod

	
		}//end class
