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
				
				//selectOK.setOpaque(false);
				
//				mapImage.setContentPane(new JPanel(){
//					BufferedImage image = (BufferedImage) ImageIO.getImageReaders("X:/Desktop/FirstVent.png");
//						public void paintComponent(Graphics g){
//						super.paintComponent(g);
//						g.drawImage(image, 0, 0, 300, 300, this);
//					}
//					
//				});
//				
				mapIcon = new ImageIcon("X:/Desktop/FirstVent.png");
				map = new JLabel(mapIcon);
				mapImage.add(map);
				mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
				mapImage.setLocationRelativeTo(null);
				mapImage.setVisible(true); 					
				mapImage.setDefaultCloseOperation(1);
				mapImage.setAlwaysOnTop(true);
				//mapImage.add(selectOK);
				potty();
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
		
		int howMany = NaziNumber.nextInt(8);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
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
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
					//mapImage.add(selectOK);
					//commRoom();
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
					//mapImage.add(selectOK);
					//commRoom();
				} //end of action event code
				});	//end of action recognition code
			break; 
			
		case 1:
			JFrame madeIt1 = new JFrame("Wait a minute...");
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, or crawl "
					+ "to another room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);						//sets the size of the window
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown1 = new JButton("Drop In");
			jumpDown1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt1.setVisible(true);
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
					//mapImage.add(selectOK);
					//commRoom();
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
					//mapImage.add(selectOK);
					//commRoom();
				} //end of action event code
				});	//end of action recognition code
			break;
			
		case 2:
			JFrame madeIt2 = new JFrame("Wait a minute...");
			JLabel dropOrDitch2 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			whatToDo = madeIt2.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt2.setSize(800,400);						//sets the size of the window
			madeIt2.setLocationRelativeTo(null);
			madeIt2.setLayout(new GridLayout(2,1));
			
			dropOrDitch2.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom2 = new JButton("New Room");
			newRoom2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown2 = new JButton("Drop In");
			jumpDown2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt2.add(dropOrDitch2);         				  	//JFrame
			madeIt2.add(whatNow);
			madeIt2.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt2.setVisible(true);
			
			newRoom2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 3:
			JFrame madeIt3 = new JFrame("Wait a minute...");
			JLabel dropOrDitch3 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are three Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			whatToDo = madeIt3.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt3.setSize(800,400);						//sets the size of the window
			madeIt3.setLocationRelativeTo(null);
			madeIt3.setLayout(new GridLayout(2,1));
			
			dropOrDitch3.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom3 = new JButton("New Room");
			newRoom3.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown3 = new JButton("Drop In");
			jumpDown3.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom3);
			whatNow.add(jumpDown3);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt3.add(dropOrDitch3);         				  	//JFrame
			madeIt3.add(whatNow);
			madeIt3.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt3.setVisible(true);
			
			newRoom3.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt3.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown3.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt3.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 4:
			JFrame madeIt4 = new JFrame("Wait a minute...");
			JLabel dropOrDitch4 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are four Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			whatToDo = madeIt4.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt4.setSize(800,400);						//sets the size of the window
			madeIt4.setLocationRelativeTo(null);
			madeIt4.setLayout(new GridLayout(2,1));
			
			dropOrDitch4.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom4 = new JButton("New Room");
			newRoom4.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown4 = new JButton("Drop In");
			jumpDown4.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom4);
			whatNow.add(jumpDown4);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt4.add(dropOrDitch4);         				  	//JFrame
			madeIt4.add(whatNow);
			madeIt4.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt4.setVisible(true);
			
			newRoom4.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt4.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown4.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt4.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 5:
			JFrame madeIt5 = new JFrame("Wait a minute...");
			JLabel dropOrDitch5 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are five Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			whatToDo = madeIt5.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt5.setSize(800,400);						//sets the size of the window
			madeIt5.setLocationRelativeTo(null);
			madeIt5.setLayout(new GridLayout(2,1));
			
			dropOrDitch5.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom5 = new JButton("New Room");
			newRoom5.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown5 = new JButton("Drop In");
			jumpDown5.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom5);
			whatNow.add(jumpDown5);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt5.add(dropOrDitch5);         				  	//JFrame
			madeIt5.add(whatNow);
			madeIt5.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt5.setVisible(true);
			
			newRoom5.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt5.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown5.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt5.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 6:
			JFrame madeIt6 = new JFrame("Wait a minute...");
			JLabel dropOrDitch6 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are six Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			whatToDo = madeIt6.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt6.setSize(800,400);						//sets the size of the window
			madeIt6.setLocationRelativeTo(null);
			madeIt6.setLayout(new GridLayout(2,1));
			
			dropOrDitch6.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom6 = new JButton("New Room");
			newRoom6.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown6 = new JButton("Drop In");
			jumpDown6.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom6);
			whatNow.add(jumpDown6);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt6.add(dropOrDitch6);         				  	//JFrame
			madeIt6.add(whatNow);
			madeIt6.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt6.setVisible(true);
			
			newRoom6.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt6.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown6.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt6.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 7:
			JFrame madeIt7 = new JFrame("Wait a minute...");
			JLabel dropOrDitch7 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are seven Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			whatToDo = madeIt7.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt7.setSize(800,400);						//sets the size of the window
			madeIt7.setLocationRelativeTo(null);
			madeIt7.setLayout(new GridLayout(2,1));
			
			dropOrDitch7.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom7 = new JButton("New Room");
			newRoom7.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown7 = new JButton("Drop In");
			jumpDown7.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom7);
			whatNow.add(jumpDown7);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt7.add(dropOrDitch7);         				  	//JFrame
			madeIt7.add(whatNow);
			madeIt7.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt7.setVisible(true);
			
			newRoom7.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt7.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown7.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt7.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 8:
			JFrame madeIt8 = new JFrame("Wait a minute...");
			JLabel dropOrDitch8 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are three Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			whatToDo = madeIt8.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt8.setSize(800,400);						//sets the size of the window
			madeIt8.setLocationRelativeTo(null);
			madeIt8.setLayout(new GridLayout(2,1));
			
			dropOrDitch8.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom8 = new JButton("New Room");
			newRoom8.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown8 = new JButton("Drop In");
			jumpDown8.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom8);
			whatNow.add(jumpDown8);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt8.add(dropOrDitch8);         				  	//JFrame
			madeIt8.add(whatNow);
			madeIt8.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt8.setVisible(true);
			
			newRoom8.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt8.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown8.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt8.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
		}//end switch case
		
		
		
	}//end method
	
	public void cRoom(){
		
		int howMany = NaziNumber.nextInt(1);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "custodial room. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
			whatToDo = madeIt.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt.setSize(800,400);						
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
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/CusRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/CusRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break; 
			
		case 1:
			JFrame madeIt1 = new JFrame("Wait a minute...");
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "custodial room. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, or crawl "
					+ "to another room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);					
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown1 = new JButton("Drop In");
			jumpDown1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   			
			madeIt1.setVisible(true);
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/CusRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/CusRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		}//end switch case
		
	}//end method
	
	public void oRoom(){
		
		int howMany = NaziNumber.nextInt(4);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "operating room. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
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
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/ORoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/ORoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break; 
			
		case 1:
			JFrame madeIt1 = new JFrame("Wait a minute...");
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "operating room. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);						//sets the size of the window
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown1 = new JButton("Drop In");
			jumpDown1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt1.setVisible(true);
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapImage = new JFrame("Map");
					mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
					map = null;
					mapImage = null;
					
					
					mapIcon = new ImageIcon("X:/Desktop/ORoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/ORoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 2:
			JFrame madeIt2 = new JFrame("Wait a minute...");
			JLabel dropOrDitch2 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "operating room. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt2.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt2.setSize(800,400);						//sets the size of the window
			madeIt2.setLocationRelativeTo(null);
			madeIt2.setLayout(new GridLayout(2,1));
			
			dropOrDitch2.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom2 = new JButton("New Room");
			newRoom2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown2 = new JButton("Drop In");
			jumpDown2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt2.add(dropOrDitch2);         				  	//JFrame
			madeIt2.add(whatNow);
			madeIt2.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt2.setVisible(true);
			
			newRoom2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/ORoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/ORoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 3:
			JFrame madeIt3 = new JFrame("Wait a minute...");
			JLabel dropOrDitch3 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "operating room. Apparently, there are three Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt3.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt3.setSize(800,400);						//sets the size of the window
			madeIt3.setLocationRelativeTo(null);
			madeIt3.setLayout(new GridLayout(2,1));
			
			dropOrDitch3.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom3 = new JButton("New Room");
			newRoom3.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown3 = new JButton("Drop In");
			jumpDown3.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom3);
			whatNow.add(jumpDown3);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt3.add(dropOrDitch3);         				  	//JFrame
			madeIt3.add(whatNow);
			madeIt3.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt3.setVisible(true);
			
			newRoom3.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt3.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/ORoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown3.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt3.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/ORoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 4:
			JFrame madeIt4 = new JFrame("Wait a minute...");
			JLabel dropOrDitch4 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "operating room. Apparently, there are four Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt4.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt4.setSize(800,400);						//sets the size of the window
			madeIt4.setLocationRelativeTo(null);
			madeIt4.setLayout(new GridLayout(2,1));
			
			dropOrDitch4.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom4 = new JButton("New Room");
			newRoom4.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown4 = new JButton("Drop In");
			jumpDown4.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom4);
			whatNow.add(jumpDown4);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt4.add(dropOrDitch4);         				  	//JFrame
			madeIt4.add(whatNow);
			madeIt4.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt4.setVisible(true);
			
			newRoom4.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt4.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/ORoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown4.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt4.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
		}//end switch case		
		
	}//end method
	
	public void dOffice(){
		
		int howMany = NaziNumber.nextInt(1);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "doctor's office. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
			whatToDo = madeIt.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt.setSize(800,400);						
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
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapImage = new JFrame("Map");
					mapIcon = new ImageIcon("X:/Desktop/DOffice.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break; 
			
		case 1:
			JFrame madeIt1 = new JFrame("Wait a minute...");
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "doctor's office. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, or crawl "
					+ "to another room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);					
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown1 = new JButton("Drop In");
			jumpDown1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			
			mapImage = new JFrame("Map");		//////////////////////////////////////////
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   			
			madeIt1.setVisible(true);
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/DOffice.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		}//end switch case
		
	}//end method
	
	public void safeRoom(){
		int howMany = NaziNumber.nextInt(1);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "secret file room. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
			whatToDo = madeIt.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt.setSize(800,400);						
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
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/SecretRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break; 
			
		case 1:
			JFrame madeIt1 = new JFrame("Wait a minute...");
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "secret file room. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, or crawl "
					+ "to another room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);					
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown1 = new JButton("Drop In");
			jumpDown1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   			
			madeIt1.setVisible(true);
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/SecretRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
		}//end switch case
	}//end method
	
	public void mOffice(){
		int howMany = NaziNumber.nextInt(2);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "operating room. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
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
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/MOffice.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break; 
			
		case 1:
			JFrame madeIt1 = new JFrame("Wait a minute...");
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "master's office. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);						//sets the size of the window
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown1 = new JButton("Drop In");
			jumpDown1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt1.setVisible(true);
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/MOffice.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 2:
			JFrame madeIt2 = new JFrame("Wait a minute...");
			JLabel dropOrDitch2 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "master's office. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt2.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt2.setSize(800,400);						//sets the size of the window
			madeIt2.setLocationRelativeTo(null);
			madeIt2.setLayout(new GridLayout(2,1));
			
			dropOrDitch2.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom2 = new JButton("New Room");
			newRoom2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown2 = new JButton("Drop In");
			jumpDown2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt2.add(dropOrDitch2);         				  	//JFrame
			madeIt2.add(whatNow);
			madeIt2.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt2.setVisible(true);
			
			newRoom2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/MOffice.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
		}//end switch case
			
	}//end method
	
	public void commRoom(){
		
		int howMany = NaziNumber.nextInt(4);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "communications room. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
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
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/CommRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break; 
			
		case 1:
			JFrame madeIt1 = new JFrame("Wait a minute...");
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "communications room. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);						//sets the size of the window
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown1 = new JButton("Drop In");
			jumpDown1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt1.setVisible(true);
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/CommRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 2:
			JFrame madeIt2 = new JFrame("Wait a minute...");
			JLabel dropOrDitch2 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "communications room. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt2.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt2.setSize(800,400);						//sets the size of the window
			madeIt2.setLocationRelativeTo(null);
			madeIt2.setLayout(new GridLayout(2,1));
			
			dropOrDitch2.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom2 = new JButton("New Room");
			newRoom2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown2 = new JButton("Drop In");
			jumpDown2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt2.add(dropOrDitch2);         				  	//JFrame
			madeIt2.add(whatNow);
			madeIt2.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt2.setVisible(true);
			
			newRoom2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/CommRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 3:
			JFrame madeIt3 = new JFrame("Wait a minute...");
			JLabel dropOrDitch3 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "communications room. Apparently, there are three Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt3.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt3.setSize(800,400);						//sets the size of the window
			madeIt3.setLocationRelativeTo(null);
			madeIt3.setLayout(new GridLayout(2,1));
			
			dropOrDitch3.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom3 = new JButton("New Room");
			newRoom3.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown3 = new JButton("Drop In");
			jumpDown3.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom3);
			whatNow.add(jumpDown3);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt3.add(dropOrDitch3);         				  	//JFrame
			madeIt3.add(whatNow);
			madeIt3.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt3.setVisible(true);
			
			newRoom3.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt3.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/CommRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown3.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt3.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 4:
			JFrame madeIt4 = new JFrame("Wait a minute...");
			JLabel dropOrDitch4 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "communications room. Apparently, there are four Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt4.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt4.setSize(800,400);						//sets the size of the window
			madeIt4.setLocationRelativeTo(null);
			madeIt4.setLayout(new GridLayout(2,1));
			
			dropOrDitch4.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom4 = new JButton("New Room");
			newRoom4.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown4 = new JButton("Drop In");
			jumpDown4.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom4);
			whatNow.add(jumpDown4);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt4.add(dropOrDitch4);         				  	//JFrame
			madeIt4.add(whatNow);
			madeIt4.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt4.setVisible(true);
			
			newRoom4.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt4.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/CommRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown4.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt4.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
		}//end switch case	
		
//		JFrame madeIt = new JFrame("Wait a minute...");
//		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Congratulations! You have crawled to the vent above the "
//				+ "communications room. Apparently there are (INSERT RANDOM NUMBER) Nazis in there. "
//				+ "Would you like to drop in and attempt to take them out, or crawl to another room?</font><html>");
//		whatToDo = madeIt.getContentPane();
//		whatToDo.setBackground(Color.black);
//		
//		madeIt.setSize(800,400);						//sets the size of the window
//		madeIt.setLocationRelativeTo(null);
//		madeIt.setLayout(new GridLayout(2,1));
//		
//		dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
//		
//		whatNow = new JPanel();				
//		whatNow.setLayout(new FlowLayout());
//		whatNow.setBackground(Color.black);
//		
//		JButton newRoom = new JButton("New Room");
//		newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
//		
//		JButton jumpDown = new JButton("Drop In");
//		jumpDown.setFont(new Font("Goudy old style",Font.PLAIN,16));
//		
//		whatNow.add(newRoom);
//		whatNow.add(jumpDown);
//		
//		
//		madeIt.add(dropOrDitch);         				  	//JFrame
//		madeIt.add(whatNow);
//		madeIt.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
//		madeIt.setVisible(true);
		
	}//end method
	
	public void checkIn(){
		
		int howMany = NaziNumber.nextInt(2);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "check-in room. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
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
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/CheckinRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break; 
			
		case 1:
			JFrame madeIt1 = new JFrame("Wait a minute...");
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "check-in room. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);						//sets the size of the window
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown1 = new JButton("Drop In");
			jumpDown1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt1.setVisible(true);
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/CheckinRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 2:
			JFrame madeIt2 = new JFrame("Wait a minute...");
			JLabel dropOrDitch2 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "check-in room. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt2.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt2.setSize(800,400);						//sets the size of the window
			madeIt2.setLocationRelativeTo(null);
			madeIt2.setLayout(new GridLayout(2,1));
			
			dropOrDitch2.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom2 = new JButton("New Room");
			newRoom2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown2 = new JButton("Drop In");
			jumpDown2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt2.add(dropOrDitch2);         				  	//JFrame
			madeIt2.add(whatNow);
			madeIt2.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt2.setVisible(true);
			
			newRoom2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/CheckinRoom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
		}//end switch case
		
	}//end method
	
	public void lobby(){
		
		int howMany = NaziNumber.nextInt(4);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lobby. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");
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
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lobby.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break; 
			
		case 1:
			JFrame madeIt1 = new JFrame("Wait a minute...");
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lobby. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);						//sets the size of the window
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown1 = new JButton("Drop In");
			jumpDown1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt1.setVisible(true);
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lobby.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 2:
			JFrame madeIt2 = new JFrame("Wait a minute...");
			JLabel dropOrDitch2 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lobby. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt2.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt2.setSize(800,400);						//sets the size of the window
			madeIt2.setLocationRelativeTo(null);
			madeIt2.setLayout(new GridLayout(2,1));
			
			dropOrDitch2.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom2 = new JButton("New Room");
			newRoom2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown2 = new JButton("Drop In");
			jumpDown2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt2.add(dropOrDitch2);         				  	//JFrame
			madeIt2.add(whatNow);
			madeIt2.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt2.setVisible(true);
			
			newRoom2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lobby.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 3:
			JFrame madeIt3 = new JFrame("Wait a minute...");
			JLabel dropOrDitch3 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lobby. Apparently, there are three Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt3.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt3.setSize(800,400);						//sets the size of the window
			madeIt3.setLocationRelativeTo(null);
			madeIt3.setLayout(new GridLayout(2,1));
			
			dropOrDitch3.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom3 = new JButton("New Room");
			newRoom3.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown3 = new JButton("Drop In");
			jumpDown3.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom3);
			whatNow.add(jumpDown3);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt3.add(dropOrDitch3);         				  	//JFrame
			madeIt3.add(whatNow);
			madeIt3.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt3.setVisible(true);
			
			newRoom3.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt3.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lobby.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown3.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt3.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 4:
			JFrame madeIt4 = new JFrame("Wait a minute...");
			JLabel dropOrDitch4 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lobby. Apparently, there are four Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt4.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt4.setSize(800,400);						//sets the size of the window
			madeIt4.setLocationRelativeTo(null);
			madeIt4.setLayout(new GridLayout(2,1));
			
			dropOrDitch4.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom4 = new JButton("New Room");
			newRoom4.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown4 = new JButton("Drop In");
			jumpDown4.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom4);
			whatNow.add(jumpDown4);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt4.add(dropOrDitch4);         				  	//JFrame
			madeIt4.add(whatNow);
			madeIt4.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt4.setVisible(true);
			
			newRoom4.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt4.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Lobby.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown4.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt4.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
		}//end switch case
		
	}//end method
	
	public void potty(){
		
		int howMany = NaziNumber.nextInt(1);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "bathroom. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
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
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Bathroom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break; 
			
		case 1:
			JFrame madeIt1 = new JFrame("Wait a minute...");
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "bathroom. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);						//sets the size of the window
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown1 = new JButton("Drop In");
			jumpDown1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt1.setVisible(true);
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapIcon = new ImageIcon("X:/Desktop/Bathroom.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/Lounge.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
		}//end switch case
		
	}//end method
	
	public void Hall1(){
		int howMany = NaziNumber.nextInt(2);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "main hallway. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
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
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapImage = new JFrame("Map");
					mapIcon = new ImageIcon("X:/Desktop/Hall1.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					mapIcon = new ImageIcon("X:/Desktop/Hall1.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break; 
			
		case 1:
			JFrame madeIt1 = new JFrame("Wait a minute...");
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "main hallway. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);						//sets the size of the window
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown1 = new JButton("Drop In");
			jumpDown1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			
			mapImage = new JFrame("Map");					////////////////////
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt1.setVisible(true);
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapImage = new JFrame("Map");
					mapIcon = new ImageIcon("X:/Desktop/Hall1.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					mapIcon = new ImageIcon("X:/Desktop/Hall1.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
			
		case 2:
			JFrame madeIt2 = new JFrame("Wait a minute...");
			JLabel dropOrDitch2 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "main hallway. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			whatToDo = madeIt2.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt2.setSize(800,400);						//sets the size of the window
			madeIt2.setLocationRelativeTo(null);
			madeIt2.setLayout(new GridLayout(2,1));
			
			dropOrDitch2.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton newRoom2 = new JButton("New Room");
			newRoom2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton jumpDown2 = new JButton("Drop In");
			jumpDown2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			
			
			mapImage = new JFrame("Map");						//////////////////////////
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt2.add(dropOrDitch2);         				  	//JFrame
			madeIt2.add(whatNow);
			madeIt2.setDefaultCloseOperation(1);   				//closes program when you close window; code from Cordell
			madeIt2.setVisible(true);
			
			newRoom2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapImage = new JFrame("Map");
					mapIcon = new ImageIcon("X:/Desktop/Hall1.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} //end of action event code
				});	//end of action recognition code
			
			jumpDown2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					mapIcon = new ImageIcon("X:/Desktop/Hall1.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
								
				} //end of action event code
				});	//end of action recognition code
			
			break;
		}//end switch case
			
	}//end method
} //end class 