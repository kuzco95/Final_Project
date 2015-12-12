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



public class Vent_Rooms extends Super_Class{

	protected JFrame pickRoom = new JFrame("Pick a room");
	protected JLabel selectRoom = new JLabel("<html> <font color='silver'> (A few "
			+ "intense moments later...) <br> Congratulations! "
			+ "You have successfully stolen a Nazi uniform, which bought you time to enter "
			+ "a room with a vent. Select a room to crawl to. (Vents are represented by "
			+ "blue circles on the map)</font><html>");
	protected Container chooseRoom;
	JPanel choosePanel;
	
	protected JFrame mapImage = new JFrame("Map"); 
	protected ImageIcon mapIcon = new ImageIcon("");
	
	public void Vent(){ 
		
		chooseRoom = pickRoom.getContentPane();
		chooseRoom.setBackground(Color.black);
		
		pickRoom.setSize(800,400);						//sets the size of the window
		pickRoom.setLocationRelativeTo(null);
		pickRoom.setLayout(new GridLayout(2,1));
		
		selectRoom.setFont(new Font("Goudy old style",Font.PLAIN,20)); //declares font and size

		choosePanel = new JPanel();
		choosePanel.setLayout(new FlowLayout());
		choosePanel.setBackground(Color.black);
		
		JButton selectOK = new JButton("OK");
		
		selectOK.setFont(new Font("Goudy old style",Font.PLAIN,16));	
		
		choosePanel.add(selectOK);									//OK button
		
		pickRoom.add(selectRoom);         				  	//JFrame
		pickRoom.add(choosePanel);
		pickRoom.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
		pickRoom.setVisible(true);	
		
		selectOK.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				pickRoom.dispose();						//closes JFrame
				//pickRoom.setAlwaysOnTop(true);
				
				mapIcon = new ImageIcon("X:/Desktop/FirstVent.png");
				map = new JLabel(mapIcon);
				mapImage.add(map);
				mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
				mapImage.setLocationRelativeTo(null);
				mapImage.setVisible(true); 					
				mapImage.setDefaultCloseOperation(1);
				//mapImage.add(selectOK);
				Lounge();
			} //end of action event code
			});	//end of action recognition code
		
		
		return; 
		
	}// end method
	public void Select_Room(){
//		mapIcon = new ImageIcon("X:/Desktop/FirstVent.png");
//		map = new JLabel(mapIcon);
//		mapImage.add(map);
//		mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
//		mapImage.setLocationRelativeTo(null);
//		mapImage.setVisible(true); 					//makes game map visible
//		mapImage.setDefaultCloseOperation(1);  
	
	}//end method
	
	public void Lounge(){
		
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Congratulations! You have crawled to the vent above the "
				+ "lounge. Apparently there are (INSERT RANDOM NUMBER) Nazis in there. Would you "
				+ "like to drop in and attempt to take them out, or crawl to another room?</font><html>");
		whatToDo = madeIt.getContentPane();
		whatToDo.setBackground(Color.black);
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(Color.black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		
		
		madeIt.add(dropOrDitch);         				  	//JFrame
		madeIt.add(whatNow);
		madeIt.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
		madeIt.setVisible(true);
		
		
	}//end method
	
	public void cRoom(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Congratulations! You have crawled to the vent above the "
				+ "costudial room. Apparently there are (INSERT RANDOM NUMBER) Nazis in there. "
				+ "Would you like to drop in and attempt to take them out, or crawl to another room?</font><html>");
		whatToDo = madeIt.getContentPane();
		whatToDo.setBackground(Color.black);
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(Color.black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		
		
		madeIt.add(dropOrDitch);         				  	//JFrame
		madeIt.add(whatNow);
		madeIt.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
		madeIt.setVisible(true);
		
		
	}//end method
	
	public void oRoom(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Congratulations! You have crawled to the vent above the "
				+ "operating room. Apparently there are (INSERT RANDOM NUMBER) Nazis in there. "
				+ "Would you like to drop in and attempt to take them out, or crawl to another room?</font><html>");
		whatToDo = madeIt.getContentPane();
		whatToDo.setBackground(Color.black);
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(Color.black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		
		
		madeIt.add(dropOrDitch);         				  	//JFrame
		madeIt.add(whatNow);
		madeIt.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
		madeIt.setVisible(true);
		
		
	}//end method
	
	public void dOffice(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Congratulations! You have crawled to the vent above the "
				+ "doctor's office. Apparently there are (INSERT RANDOM NUMBER) Nazis in there. "
				+ "Would you like to drop in and attempt to take them out, or crawl to another room?</font><html>");
		whatToDo = madeIt.getContentPane();
		whatToDo.setBackground(Color.black);
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(Color.black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		
		
		madeIt.add(dropOrDitch);         				  	//JFrame
		madeIt.add(whatNow);
		madeIt.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
		madeIt.setVisible(true);
		
	}//end method
	
	public void safeRoom(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Congratulations! You have crawled to the vent above the "
				+ "secret file room. Apparently there are (INSERT RANDOM NUMBER) Nazis in there. "
				+ "Would you like to drop in and attempt to take them out, or crawl to another room?</font><html>");
		whatToDo = madeIt.getContentPane();
		whatToDo.setBackground(Color.black);
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(Color.black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		
		
		madeIt.add(dropOrDitch);         				  	//JFrame
		madeIt.add(whatNow);
		madeIt.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
		madeIt.setVisible(true);
		
	}//end method
	
	public void mOffice(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Congratulations! You have crawled to the vent above the "
				+ "master's office. Apparently there are (INSERT RANDOM NUMBER) Nazis in there. "
				+ "Would you like to drop in and attempt to take them out, or crawl to another room?</font><html>");
		whatToDo = madeIt.getContentPane();
		whatToDo.setBackground(Color.black);
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(Color.black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		
		
		madeIt.add(dropOrDitch);         				  	//JFrame
		madeIt.add(whatNow);
		madeIt.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
		madeIt.setVisible(true);
		
	}//end method
	
	public void commRoom(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Congratulations! You have crawled to the vent above the "
				+ "communications room. Apparently there are (INSERT RANDOM NUMBER) Nazis in there. "
				+ "Would you like to drop in and attempt to take them out, or crawl to another room?</font><html>");
		whatToDo = madeIt.getContentPane();
		whatToDo.setBackground(Color.black);
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(Color.black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		
		
		madeIt.add(dropOrDitch);         				  	//JFrame
		madeIt.add(whatNow);
		madeIt.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
		madeIt.setVisible(true);
		
	}//end method
	
	public void checkIn(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Congratulations! You have crawled to the vent above the "
				+ "check in room. Apparently there are (INSERT RANDOM NUMBER) Nazis in there. Would "
				+ "you like to drop in and attempt to take them out, or crawl to another room?</font><html>");
		whatToDo = madeIt.getContentPane();
		whatToDo.setBackground(Color.black);
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(Color.black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		
		
		madeIt.add(dropOrDitch);         				  	//JFrame
		madeIt.add(whatNow);
		madeIt.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
		madeIt.setVisible(true);
		
	}//end method
	
	public void lobby(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Congratulations! You have crawled to the vent above the "
				+ "lobby. Apparently there are (INSERT RANDOM NUMBER) Nazis in there. Would you "
				+ "like to drop in and attempt to take them out, or crawl to another room?</font><html>");
		whatToDo = madeIt.getContentPane();
		whatToDo.setBackground(Color.black);
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(Color.black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		
		
		madeIt.add(dropOrDitch);         				  	//JFrame
		madeIt.add(whatNow);
		madeIt.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
		madeIt.setVisible(true);
		
	}//end method
	
	public void potty(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Congratulations! You have crawled to the vent above the "
				+ "bathroom. Apparently there is (INSERT RANDOM NUMBER) in there. Would you "
				+ "like to drop in and attempt to take them out, or crawl to another room?</font><html>");
		whatToDo = madeIt.getContentPane();
		whatToDo.setBackground(Color.black);
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(Color.black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		
		
		madeIt.add(dropOrDitch);         				  	//JFrame
		madeIt.add(whatNow);
		madeIt.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
		madeIt.setVisible(true);
		
	}//end method
	
	public void Hall1(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Congratulations! You have crawled to the vent above the "
				+ "main hallway. Apparently, there are (INSERT RANDOM NUMBER) Nazis in there. Would you "
				+ "like to drop in and attempt to take them out, or crawl to another room?</font><html>");
		whatToDo = madeIt.getContentPane();
		whatToDo.setBackground(Color.black);
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(Color.black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		
		
		madeIt.add(dropOrDitch);         				  	//JFrame
		madeIt.add(whatNow);
		madeIt.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
		madeIt.setVisible(true);
		
	}//end method
} //end class 
