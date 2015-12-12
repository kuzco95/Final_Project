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
			+ "a room with a vent. Select a room to crawl to.</font><html>");
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
				
				mapIcon = new ImageIcon("X:/Desktop/FirstVent.png");
				map = new JLabel(mapIcon);
				mapImage.add(map);
				mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
				mapImage.setLocationRelativeTo(null);
				mapImage.setVisible(true); 					//makes game map visible
				mapImage.setDefaultCloseOperation(1);
	
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
		
	}//end method
	
	public void cRoom(){
		
	}//end method
	
	public void oRoom(){
		
	}//end method
	
	public void dOffice(){
		
	}//end method
	
	public void safeRoom(){
		
	}//end method
	
	public void mOffice(){
		
	}//end method
	
	public void commRoom(){
		
	}//end method
	
	public void checkIn(){
		
	}//end method
	
	public void lobby(){
		
	}//end method
	
	public void potty(){
		
	}//end method
	
	public void Hall1(){
		
	}//end method
} //end class 
