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
	private JLabel contextContent = new JLabel("<html> <font color='silver'> Welcome, you have awakened in "
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
			+ "the small window in the door, you soon realize that you are, in fact, in a Nazi "
			+ "facility. Get out quickly. </font><html>");
	
	protected Container learn;
	protected JPanel clickOK;
	
	
	//ACTION CODE METHOD
	public void actionCode(){
		
		
		Context = introContext.getContentPane();
		Context.setBackground(Color.black);	
		
		introContext.setSize(800,400);						//sets the size of the window
		introContext.setLocationRelativeTo(null);
		introContext.setLayout(new GridLayout(2,1));
		
		contextContent.setFont(new Font("Goudy old style",Font.PLAIN,20)); //declares font and size

		controlPanel = new JPanel();					
		controlPanel.setLayout(new FlowLayout());
		controlPanel.setBackground(Color.black);	//makes JPanel background black
		
		JButton viewMap = new JButton("OK");
		viewMap.setFont(new Font("Goudy old style",Font.PLAIN,16));	//alters the font of button
		
		controlPanel.add(viewMap);									//OK button
		
		introContext.add(contextContent);         				  	//JFrame
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
		
		return; 
			} //end action code method
	
	
	public void Pre_Pick(){
		introContext.dispose();						//closes JFrame
		gameMap.setAlwaysOnTop(true);
		
		titleIcon = new ImageIcon("X:/Desktop/GameMapNoLabels.png");				//inserts map
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
		
		clickOK.add(gotIt);											//OK button
		
		asylumRevelation.add(RevelationContent);         			//JFrame
		asylumRevelation.add(clickOK);
		asylumRevelation.setDefaultCloseOperation(2);
		

		asylumRevelation.setVisible(true);
		
		gotIt.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				asylumRevelation.dispose();						//closes JFrame
						
			} //end of action event code
			});	//end of action recognition code	
		
		Vent_Rooms transfer = new Vent_Rooms();
		transfer.Vent();
		
		return;
	} //end Pre_Pick method
	
	
	public void GameOver() { 
		
		return;
	}//end GameOver method

	
		}//end class
