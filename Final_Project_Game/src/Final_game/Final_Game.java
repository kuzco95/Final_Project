////Final project game main class
//code from Project 2
package Final_game;
import javax.swing.*;						//.* indicates everything in that package is imported
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.security.SecureRandom;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;

public class Final_Game extends Super_Class {
	protected JLabel titleImage;
	protected ImageIcon titleIcon;  
	private JLabel contentLabel;
	public JFrame gameMap = new JFrame("Map"); 
	protected Container Context;
	private JPanel controlPanel;
	
	protected JFrame asylumRevelation = new JFrame("Enlightenment");
	protected JLabel RevelationContent = new JLabel("<html> <font color='silver'> After looking out "
			+ "the small window in the door, you soon realize that you're locked inside a Nazi "
			+ "facility. Attract the guard's attention and get out quickly. </font><html>");
	
	protected Container learn;
	protected JPanel clickOK; 
	
	protected JFrame homeLandFrame = new JFrame("Enlightenment");
	protected JLabel homeLandLabel = new JLabel("<html> <font color='silver'> Select your country of origin. </font><html>");
	
	protected Container homeContainer;
	private JPanel homePanel;

	protected String comeFrom;
	
	protected String intro(String nat) {
		String introMessage = "<html> <font color='silver'> Welcome, you have awakened in "
			+ "a cold cell with a map on the ground and no recollection as to how you got there."
			+ "The last thing you remember is flying a bomber over Berlin with your fellow " + nat + " buddies. "
			+ "Take a look at the map in your cell.</font><html>";
		System.out.println("line 60 " + nationality);
		return introMessage;
	}

	public void motherLand(){	
	homeContainer = homeLandFrame.getContentPane();
	homeContainer.setBackground(black);
	homeLandFrame.setSize(800,400);						//sets the size of the window
	homeLandFrame.setLocationRelativeTo(null);
	homeLandFrame.setLayout(new GridLayout(2,1));	
	homeLandLabel.setFont(new Font(font,Font.PLAIN,20));
	
	homePanel = new JPanel();					
	homePanel.setLayout(new FlowLayout());
	homePanel.setBackground(black);
	
	JButton Merica = new JButton("USA");						//USA button
	Merica.setFont(new Font(font,Font.PLAIN,fontSize));

	JButton UK = new JButton("Great Britain");					//England button
	UK.setFont(new Font(font,Font.PLAIN,fontSize));

	JButton Russia = new JButton("Russia");						//Russia button
	Russia.setFont(new Font(font,Font.PLAIN,fontSize));
	
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
			nationality = "American";
			System.out.println("line 102 " + nationality);
			start();
		}
		});	
	
	UK.addActionListener(new ActionListener(){		
		public void actionPerformed(ActionEvent E){
			homeLandFrame.dispose();				
			comeFrom = "Great Britain";
			nationality = "British";
			System.out.println("line 112 " + nationality);
			start();
		} 
		});	
	
	Russia.addActionListener(new ActionListener(){		
		public void actionPerformed(ActionEvent E){
			homeLandFrame.dispose();						
			comeFrom = "Russia";
			nationality = "Russian";
			System.out.println("line 122 " + nationality);
			start();
		} 
		});	
	}
	
	private JFrame introContext = new JFrame("Year: 1946");	
	protected void start(){
		contentLabel = new JLabel(intro(nationality),JLabel.CENTER);
		System.out.println("line 131 " + nationality);
		
		//set window preferences (size, font, background)
		Context = introContext.getContentPane();
		Context.setBackground(black);	
		introContext.setSize(800,400);					
		introContext.setLocationRelativeTo(null);
		introContext.setLayout(new GridLayout(2,1));
		
		controlPanel = new JPanel();					
		controlPanel.setLayout(new FlowLayout());
		controlPanel.setBackground(black);
		
		contentLabel.setFont(new Font(font,Font.PLAIN,20)); //declares font and size
		introContext.add(contentLabel);         			//JFrame
		introContext.add(controlPanel);
		introContext.setDefaultCloseOperation(2);   			
		introContext.setVisible(true);
		
		JButton okButton = new JButton("OK");
		okButton.setFont(new Font(font,Font.PLAIN,fontSize));
		
		controlPanel.add(okButton);									
		okButton.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent E){
				Pre_Pick();
				
			} 
			});	
	}//end motherLand method
	
	public void Pre_Pick(){
		introContext.dispose();						//closes JFrame
		gameMap.setAlwaysOnTop(true);
		
		titleIcon = new ImageIcon("/Final_Project_Game/src/Final_game/StartingGameMap.png");	//inserts map
		titleImage = new JLabel(titleIcon);
		gameMap.add(titleImage);
		//titleImage.setVisible(true);
		gameMap.setExtendedState(gameMap.getExtendedState()|JFrame.MAXIMIZED_BOTH );	//sets the size of the window code from stackoverflow.com
		gameMap.setLocationRelativeTo(null);
		gameMap.setVisible(true); 					//makes game map visible
		gameMap.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
		
		learn = asylumRevelation.getContentPane();
		learn.setBackground(black);
			
		asylumRevelation.setSize(800,400);						//sets the size of the window
		asylumRevelation.setLocationRelativeTo(null);
		asylumRevelation.setLayout(new GridLayout(2,1));
		
		RevelationContent.setFont(new Font(font,Font.PLAIN,20)); //declares font and size
		
		clickOK = new JPanel();					
		clickOK.setLayout(new FlowLayout());
		clickOK.setBackground(black);							//makes JPanel background black
		
		JButton gotIt = new JButton("OK");
		gotIt.setFont(new Font(font,Font.PLAIN,fontSize));	//alters the font of button
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
		
		try{
			PrintWriter finalPoints = new PrintWriter("Point File");		//writes to file
			
			finalPoints.println("Final points: " + total );									
			
			}catch (Exception e){}
		
		JFrame iWin = new JFrame();
		JLabel winLabel;
		
		if (total <= 300){
		
		winLabel = new JLabel("<html> <font color='silver'> Congratulations, you've won! "
				+ "Your final score was " + total + "." +winPoints[0]+"</font><html>");
		}else if(total <= 900 && total > 300){
			
		winLabel = new JLabel("<html> <font color='silver'> Congratulations, you've won! "
					+ "Your final score was" + total + "." +winPoints[1]+"</font><html>");
		}else {
		
			winLabel = new JLabel("<html> <font color='silver'> Congratulations, you've won! "
					+ "Your final score was" + total + "." +winPoints[2]+"</font><html>");
		}//end if statement
		
		whatToDo = iWin.getContentPane();
		whatToDo.setBackground(black);
		
		iWin.setSize(800,400);						//sets the size of the window
		iWin.setLocationRelativeTo(null);
		iWin.setLayout(new GridLayout(2,1));
		
		winLabel.setFont(new Font(font,Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton okWin = new JButton("OK");
		okWin.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(okWin);
			
		iWin.add(winLabel);         				  		//JFrame
		iWin.add(whatNow);
		iWin.setDefaultCloseOperation(2);   			
		iWin.setVisible(true);
		
		okWin.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent E){
				iWin.dispose();								
				System.exit(0);								//ends program
			} //end of action event code
			});	//end of action recognition code
		
	}//end winMethod method
	
	public void loseMethod(int total){

		String losePoints[] = new String[3];
		losePoints[0] = "Wow, you suck."; //100 - 300 
		losePoints[1] = "Your fellow soldiers would've been proud"; //400 - 900
		losePoints[2] = "You could've been a legend!"; //1000 +
		
		try{
			PrintWriter finalPoints = new PrintWriter("Point File");		//writes to file
			
			finalPoints.println("Final points: " + total );
			
			finalPoints.close();
			}catch (Exception e){}
		
		JFrame iLose = new JFrame();
		JLabel loseLabel;
		if (total <= 300){
			
			loseLabel = new JLabel("<html> <font color='silver'> You lost. "
				+ "Your final score was " + total + "." +losePoints[0]+"</font><html>");
			}else if(total <= 900 && total > 300){
				
				loseLabel = new JLabel("<html> <font color='silver'> You lost. "
				+ "Your final score was " + total + "." +losePoints[1]+"</font><html>");
			}else {
			
				loseLabel = new JLabel("<html> <font color='silver'> You lost. "
				+ "Your final score was " + total + "." +losePoints[2]+"</font><html>");
			}//end if statement		
		
		whatToDo = iLose.getContentPane();
		whatToDo.setBackground(black);
		
		iLose.setSize(800,400);						//sets the size of the window
		iLose.setLocationRelativeTo(null);
		iLose.setLayout(new GridLayout(2,1));
		
		loseLabel.setFont(new Font(font,Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton okLose = new JButton("OK");
		okLose.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(okLose);
		
		iLose.add(loseLabel);         				  		
		iLose.add(whatNow);
		iLose.setDefaultCloseOperation(2);   				
		iLose.setVisible(true);
		
		okLose.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent E){
				iLose.dispose();							
				System.exit(0);											
			} 
		});	
		
	}//end loseMethod	
}