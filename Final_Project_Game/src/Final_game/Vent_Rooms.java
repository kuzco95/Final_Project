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
	
	int counter = 0;

	JMenuBar roomMenuBar = new JMenuBar();
	
	protected JFrame pickRoom = new JFrame("Pick a room");
	protected JLabel selectRoom = new JLabel("<html> <font color='silver'> (A few "
			+ "intense moments later...) <br> Congratulations! "
			+ "You have successfully stolen a Nazi uniform, which bought you time to enter "
			+ "a room with a vent. Select a room to crawl to. (Vents are represented by "
			+ "blue circles on the map)</font><html>");
	protected Container chooseRoom;
	protected JPanel choosePanel;
	
	protected JFrame mapImage = new JFrame("Map"); 
	protected ImageIcon mapIcon = new ImageIcon("");
	
	JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Now that you're in the room, "
			+ "Would you like to attempt an escape through the window and risk being shot by the guards "
			+ "in the towers while you hop the fence, or try another room?</font><html>");
	
	public void Vent(){ 
		JMenu roomMenu = new JMenu("Rooms"); //JMenu for rooms
		 
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
		
		
		roomMenu.add(lounge); 		//JMenu items
		roomMenu.add(cRoom);
		roomMenu.add(oRoom);
		roomMenu.add(dOffice);
		roomMenu.add(safeRoom);
		roomMenu.add(mOffice);
		roomMenu.add(commRoom);
		roomMenu.add(checkIn);
		roomMenu.add(lobby);
		roomMenu.add(potty);
		roomMenu.add(Hall1);
		
		
		roomMenuBar.add(roomMenu);
		//pickRoom.setJMenuBar(roomMenuBar);
		mapImage.setJMenuBar(roomMenuBar);
		
		//roomMenu.setVisible(true);
		
		
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
				//mapImage.add(roomMenuBar);
				mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
				mapImage.setLocationRelativeTo(null);			
				mapImage.setVisible(true); 					
				mapImage.setDefaultCloseOperation(1);
				mapImage.setAlwaysOnTop(true);
				
			} //end of action event code
			});	//end of action recognition code
		
		lounge.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						//closes JFrame
				//pickRoom.setAlwaysOnTop(true);
				counter ++;
				if (counter > 6){
					Final_Game last_Game = new Final_Game();
					last_Game.loseMethod(points);
					
				}//end if statement
				
				else{
					
					Lounge();
				}
						
						
				
			} //end of action event code
			});	//end of action recognition code
		
		cRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						//closes JFrame
				//pickRoom.setAlwaysOnTop(true);
						cRoom();
				
			} //end of action event code
			});	//end of action recognition code
		
		oRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						//closes JFrame
				//pickRoom.setAlwaysOnTop(true);
						oRoom();
				
			} //end of action event code
			});	//end of action recognition code
		
		dOffice.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						//closes JFrame
				//pickRoom.setAlwaysOnTop(true);
						dOffice();
				
			} //end of action event code
			});	//end of action recognition code
		
		safeRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						//closes JFrame
				//pickRoom.setAlwaysOnTop(true);
						safeRoom();
				
			} //end of action event code
			});	//end of action recognition code
		
		mOffice.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						//closes JFrame
				//pickRoom.setAlwaysOnTop(true);
						mOffice();
				
			} //end of action event code
			});	//end of action recognition code
		
		commRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						//closes JFrame
				//pickRoom.setAlwaysOnTop(true);
						commRoom();
				
			} //end of action event code
			});	//end of action recognition code
		
		checkIn.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						//closes JFrame
				//pickRoom.setAlwaysOnTop(true);
						checkIn();
				
			} //end of action event code
			});	//end of action recognition code
		
		lobby.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						//closes JFrame
				//pickRoom.setAlwaysOnTop(true);
						lobby();
				
			} //end of action event code
			});	//end of action recognition code
		
		potty.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						//closes JFrame
				//pickRoom.setAlwaysOnTop(true);
						potty();
				
			} //end of action event code
			});	//end of action recognition code
		
		Hall1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						//closes JFrame
				//pickRoom.setAlwaysOnTop(true);
						Hall1();
				
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
			
			//madeIt.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton = new JButton("View Points");
			pointButton.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom);
			whatNow.add(jumpDown);
			whatNow.add(pointButton);
			
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
					mapImage.setJMenuBar(roomMenuBar);
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
					JFrame madeIt = new JFrame("Wait a minute...");
//					JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Now that you're in the room, "
//					+ "Would you like to attempt an escape through the window and risk being shot by the guards "
//					+ "in the towers while you hop the fence, or try another room?</font><html>");
					whatToDo = madeIt.getContentPane();
					whatToDo.setBackground(Color.black);
					
					madeIt.setSize(800,400);						//sets the size of the window
					madeIt.setLocationRelativeTo(null);
					madeIt.setLayout(new GridLayout(2,1));
					
					dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
					
					whatNow = new JPanel();				
					whatNow.setLayout(new FlowLayout());
					whatNow.setBackground(Color.black);
					
					JButton window = new JButton("Window");
					window.setFont(new Font("Goudy old style",Font.PLAIN,16));
					
					JButton newRoom = new JButton("New Room");
					newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
					
					whatNow.add(window);
					whatNow.add(newRoom);
					
					mapImage = new JFrame("Map");
					mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
					map = null;
					mapImage = null;
					
					
					madeIt.add(dropOrDitch);         				  	//JFrame
					madeIt.add(whatNow);
					madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
					madeIt.setVisible(true);
					
					window.addActionListener(new ActionListener(){		//creates ActionListener for OK button
						public void actionPerformed(ActionEvent E){
							madeIt.dispose();						//closes JFrame
							
							runShot();
							
						} //end of action event code
						});	//end of action recognition code
					
					newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
						public void actionPerformed(ActionEvent E){
							madeIt.dispose();						//closes JFrame
							
							mapImage = new JFrame("Map");
							//mapImage.setJMenuBar(roomMenuBar);
							mapImage.setJMenuBar(roomMenuBar);
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
				} //end of action event code
				});	//end of action recognition code
			
			
			pointButton.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt1.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton1 = new JButton("View Points");
			pointButton1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			whatNow.add(pointButton1);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					windowRooms();
					
					//mapImage.add(selectOK);
					//commRoom();
				} //end of action event code
				});	//end of action recognition code
			
			pointButton1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt2.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton2 = new JButton("View Points");
			pointButton2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			whatNow.add(pointButton2);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					windowRooms();
				
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt3.setJMenuBar(roomMenuBar);
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

			JButton pointButton3 = new JButton("View Points");
			pointButton3.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom3);
			whatNow.add(jumpDown3);
			whatNow.add(pointButton3);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					windowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton3.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt4.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton4 = new JButton("View Points");
			pointButton4.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom4);
			whatNow.add(jumpDown4);
			whatNow.add(pointButton4);
			
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
					mapImage.setJMenuBar(roomMenuBar);
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
					
				fourPlus();
				
				} //end of action event code
				});	//end of action recognition code
			
			pointButton4.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt5.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton5 = new JButton("View Points");
			pointButton5.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom5);
			whatNow.add(jumpDown5);
			whatNow.add(pointButton5);
			
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
					mapImage.setJMenuBar(roomMenuBar);
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
					
					fourPlus();
					
				} //end of action event code
				});	//end of action recognition code
			
			pointButton5.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt6.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton6 = new JButton("View Points");
			pointButton6.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom6);
			whatNow.add(jumpDown6);
			whatNow.add(pointButton6);
			
			
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
					mapImage.setJMenuBar(roomMenuBar);
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
					
					fourPlus();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton6.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt7.setJMenuBar(roomMenuBar);
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

			JButton pointButton7 = new JButton("View Points");
			pointButton7.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom7);
			whatNow.add(jumpDown7);
			whatNow.add(pointButton7);
			
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
					mapImage.setJMenuBar(roomMenuBar);
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
					
					fourPlus();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton7.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt8.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton8 = new JButton("View Points");
			pointButton8.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom8);
			whatNow.add(jumpDown8);
			whatNow.add(pointButton8);
			
			
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
					mapImage.setJMenuBar(roomMenuBar);
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
					
					fourPlus();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton8.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			
			//madeIt.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton = new JButton("View Points");
			pointButton.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom);
			whatNow.add(jumpDown);
			whatNow.add(pointButton);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt1.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton1 = new JButton("View Points");
			pointButton1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			whatNow.add(pointButton1);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton = new JButton("View Points");
			pointButton.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom);
			whatNow.add(jumpDown);
			whatNow.add(pointButton);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					windowRooms();												///////////////////
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt1.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton1 = new JButton("View Points");
			pointButton1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			whatNow.add(pointButton1);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
					//mapImage = new JFrame("Map");
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

					WinLose(howMany);
					windowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt2.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton2 = new JButton("View Points");
			pointButton2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			whatNow.add(pointButton2);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					windowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt3.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton3 = new JButton("View Points");
			pointButton3.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom3);
			whatNow.add(jumpDown3);
			whatNow.add(pointButton3);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					windowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton3.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt4.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton4 = new JButton("View Points");
			pointButton4.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom4);
			whatNow.add(jumpDown4);
			whatNow.add(pointButton4);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					fourPlus();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton4.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton = new JButton("View Points");
			pointButton.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom);
			whatNow.add(jumpDown);
			whatNow.add(pointButton);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt1.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton1 = new JButton("View Points");
			pointButton1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			whatNow.add(pointButton1);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton = new JButton("View Points");
			pointButton.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom);
			whatNow.add(jumpDown);
			whatNow.add(pointButton);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt1.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton1 = new JButton("View Points");
			pointButton1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			whatNow.add(pointButton1);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
					+ "master's office. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
			whatToDo = madeIt.getContentPane();
			whatToDo.setBackground(Color.black);
			
			//madeIt.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton = new JButton("View Points");
			pointButton.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom);
			whatNow.add(jumpDown);
			whatNow.add(pointButton);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt1.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton1 = new JButton("View Points");
			pointButton1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			mapImage.setJMenuBar(roomMenuBar);
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			whatNow.add(pointButton1);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt2.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton2 = new JButton("View Points");
			pointButton2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			whatNow.add(pointButton2);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton = new JButton("View Points");
			pointButton.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom);
			whatNow.add(jumpDown);
			whatNow.add(pointButton);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt1.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton1 = new JButton("View Points");
			pointButton1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			whatNow.add(pointButton1);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt2.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton2 = new JButton("View Points");
			pointButton2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			whatNow.add(pointButton2);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt3.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton3 = new JButton("View Points");
			pointButton3.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom3);
			whatNow.add(jumpDown3);
			whatNow.add(pointButton3);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton3.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt4.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton4 = new JButton("View Points");
			pointButton4.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom4);
			whatNow.add(jumpDown4);
			whatNow.add(pointButton4);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					fourPlus();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton4.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
				} //end of action event code
				});	//end of action recognition code
			
			break;
		}//end switch case	

		
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
			
			//madeIt.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton = new JButton("View Points");
			pointButton.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom);
			whatNow.add(jumpDown);
			whatNow.add(pointButton);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt1.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton1 = new JButton("View Points");
			pointButton1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			whatNow.add(pointButton1);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt2.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton2 = new JButton("View Points");
			pointButton2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			whatNow.add(pointButton2);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton = new JButton("View Points");
			pointButton.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom);
			whatNow.add(jumpDown);
			whatNow.add(pointButton);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					lobbyWin();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt1.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton1 = new JButton("View Points");
			pointButton1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			whatNow.add(pointButton1);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					lobbyWin();
					
				} //end of action event code
				});	//end of action recognition code
			
			pointButton1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt2.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton2 = new JButton("View Points");
			pointButton2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			whatNow.add(pointButton2);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					lobbyWin();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt3.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton3 = new JButton("View Points");
			pointButton3.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom3);
			whatNow.add(jumpDown3);
			whatNow.add(pointButton3);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					lobbyWin();			
					
				} //end of action event code
				});	//end of action recognition code
			
			pointButton3.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt4.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton4 = new JButton("View Points");
			pointButton4.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom4);
			whatNow.add(jumpDown4);
			whatNow.add(pointButton4);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					fourPlus();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton4.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton = new JButton("View Points");
			pointButton.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom);
			whatNow.add(jumpDown);
			whatNow.add(pointButton);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt1.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton1 = new JButton("View Points");
			pointButton1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			whatNow.add(pointButton1);
			
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt1.setVisible(true);
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapImage = new JFrame("Map");
					
					mapImage.setJMenuBar(roomMenuBar);
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			JButton pointButton = new JButton("View Points");
			pointButton.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom);
			whatNow.add(jumpDown);			
			whatNow.add(pointButton);	
			
			//mapImage = new JFrame("Map");
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
					
					mapImage.setJMenuBar(roomMenuBar);
					//mapImage = new JFrame("Map");
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
					
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			JButton pointButton1 = new JButton("View Points");
			pointButton1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom1);
			whatNow.add(jumpDown1);
			whatNow.add(pointButton1);
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
					//mapImage = new JFrame("Map");
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
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
			
			//madeIt2.setJMenuBar(roomMenuBar);
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
			
			JButton pointButton2 = new JButton("View Points");
			pointButton2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			whatNow.add(pointButton2);
			
			
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
					
					mapImage.setJMenuBar(roomMenuBar);
					//mapImage = new JFrame("Map");
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
					
					WinLose(howMany);
					noWindowRooms();
								
				} //end of action event code
				});	//end of action recognition code
			
			pointButton2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						//closes JFrame
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
				} //end of action event code
				});	//end of action recognition code
			
			break;
		}//end switch case
			
	}//end method
	
	public void windowRooms(){
		JFrame madeIt = new JFrame("Wait a minute...");
	JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Now that you're safely in the room, "
		+ "Would you like to attempt an escape through the window and risk being shot by the guards "
		+ "in the towers while you hop the fence, or try another room?</font><html>");
		whatToDo = madeIt.getContentPane();
		whatToDo.setBackground(Color.black);
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(Color.black);
		
		JButton window = new JButton("Window");
		window.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
		
		whatNow.add(window);
		whatNow.add(newRoom);
		
		mapImage = new JFrame("Map");
		mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
		map = null;
		mapImage = null;
		
		
		madeIt.add(dropOrDitch);         				  	//JFrame
		madeIt.add(whatNow);
		madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
		madeIt.setVisible(true);
		
		window.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				madeIt.dispose();						//closes JFrame
				
				runShot();
				
			} //end of action event code
			});	//end of action recognition code
		
		newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
			public void actionPerformed(ActionEvent E){
				madeIt.dispose();						//closes JFrame
				
				mapImage = new JFrame("Map");
				mapImage.setJMenuBar(roomMenuBar);
				mapImage.setJMenuBar(roomMenuBar);
				mapIcon = new ImageIcon("X:/Desktop/FirstVent.png");
				map = new JLabel(mapIcon);
				mapImage.add(map);
				mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
				mapImage.setLocationRelativeTo(null);
				mapImage.setVisible(true); 					
				mapImage.setDefaultCloseOperation(1);
				mapImage.setAlwaysOnTop(true);			
			} //end of action event code
			});	//end of action recognition code
//	} //end of action event code
//	});	//end of action recognition code

		
	}//end method

	public void noWindowRooms(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You're safely in the room, "
			+ "but there is no way to escape. Find another room.</font><html>");
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
			
			whatNow.add(newRoom);
			
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
					mapImage.setJMenuBar(roomMenuBar);
					
					mapIcon = new ImageIcon("X:/Desktop/FirstVent.png");
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);			
				} //end of action event code
				});	//end of action recognition code
		
	}//end method
	
	public  void lobbyWin(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Awesome! Now that you have the "
				+ "lobby to yourself - RUN!</font><html>");
			whatToDo = madeIt.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt.setSize(800,400);						//sets the size of the window
			madeIt.setLocationRelativeTo(null);
			madeIt.setLayout(new GridLayout(2,1));
			
			dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			
			
			JButton newRoom = new JButton("Run");
			newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(newRoom);
			
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
					
					Final_Game lobbyWin = new Final_Game();
					lobbyWin.winMethod(points);		
				} //end of action event code
				});	//end of action recognition code
		
	}//end method
	
} //end class 