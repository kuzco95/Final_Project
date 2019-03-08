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
		 
		JMenuItem lounge = rooms[0];
		JMenuItem cRoom = rooms[1];
		JMenuItem oRoom = rooms[2];
		JMenuItem dOffice = rooms[2];
		JMenuItem safeRoom = rooms[3];
		JMenuItem mOffice = rooms[4];
		JMenuItem commRoom = rooms[5];
		JMenuItem checkIn = rooms[6];
		JMenuItem lobby = rooms[7];
		JMenuItem potty = rooms[8];
		JMenuItem Hall1 = rooms[9];
		Hall1.setFont(new Font(font,Font.PLAIN,fontSize));
		
		//JMenu Items
		for(int r = 0; r < 10; r++) {
			roomMenu.add(rooms[r]);
		}
		
		roomMenuBar.add(roomMenu);
		
		mapImage.setJMenuBar(roomMenuBar);
		chooseRoom = pickRoom.getContentPane();
		chooseRoom.setBackground(black);
		
		pickRoom.setSize(800,400);						//sets the size of the window
		pickRoom.setLocationRelativeTo(null);
		pickRoom.setLayout(new GridLayout(2,1));
		
		selectRoom.setFont(new Font(font,Font.PLAIN,20)); 

		choosePanel = new JPanel();
		choosePanel.setLayout(new FlowLayout());
		choosePanel.setBackground(black);
		
		JButton selectOK = new JButton("OK");
		
		selectOK.setFont(new Font(font,Font.PLAIN,fontSize));	
		
		choosePanel.add(selectOK);									//OK button
		
		pickRoom.add(selectRoom);         				  	//JFrame
		pickRoom.add(choosePanel);
		pickRoom.setDefaultCloseOperation(2);   				
		pickRoom.setVisible(true);	
		
		selectOK.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				pickRoom.dispose();						 
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
			} 
			});	 
		
		lounge.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						 
				//pickRoom.setAlwaysOnTop(true);
				counter ++;
				if (counter > 6){
					Final_Game last_Game = new Final_Game();
					last_Game.loseMethod(points);
					
				}//end if statement
				
				else{
					
					Lounge();
				}	
			} 
			});	 
		
		cRoom.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						 
				//pickRoom.setAlwaysOnTop(true);
						cRoom();
			} 
			});	 
		
		oRoom.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						 
				//pickRoom.setAlwaysOnTop(true);
						oRoom();
			} 
			});	 
		
		dOffice.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						 
				//pickRoom.setAlwaysOnTop(true);
						dOffice();
			} 
			});	 
		
		safeRoom.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						 
				//pickRoom.setAlwaysOnTop(true);
						safeRoom();
			} 
			});	 
		
		mOffice.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						 
				//pickRoom.setAlwaysOnTop(true);
						mOffice();
			} 
			});	 
		
		commRoom.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						 
				//pickRoom.setAlwaysOnTop(true);
						commRoom();
			} 
			});	 
		
		checkIn.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						 
				//pickRoom.setAlwaysOnTop(true);
						checkIn();
			} 
			});	 
		
		lobby.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						 
				//pickRoom.setAlwaysOnTop(true);
						lobby();
			} 
			});	 
		
		potty.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						 
				//pickRoom.setAlwaysOnTop(true);
						potty();
			} 
			});	 
		
		Hall1.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				mapImage.dispose();						 
				//pickRoom.setAlwaysOnTop(true);
						Hall1();
			} 
			});
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
		final JFrame madeIt = new JFrame("Wait a minute...");
		
		JLabel dropOrDitch = new JLabel("");
		dropOrDitch.setFont(new Font(font,Font.PLAIN,20));
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton pointButton = new JButton("View Points");
		pointButton.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		whatNow.add(pointButton);
		switch(howMany)
		{
		case 0:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
			whatToDo = madeIt.getContentPane();
			whatToDo.setBackground(black); 			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
//					dropOrDitch = JLabel("<html> <font color='silver'> Now that you're in the room, "
//					+ "Would you like to attempt an escape through the window and risk being shot by the guards "
//					+ "in the towers while you hop the fence, or try another room?</font><html>");
//					whatToDo = madeIt.getContentPane();
//					whatToDo.setBackground(black);

				
					whatNow = new JPanel();				
					whatNow.setLayout(new FlowLayout());
					whatNow.setBackground(black);
					
					JButton window = new JButton("Window");
					window.setFont(new Font(font,Font.PLAIN,fontSize));
					
					JButton newRoom = new JButton("New Room");
					newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
					
					whatNow.add(window);
					whatNow.add(newRoom);
					
					mapImage = new JFrame("Map");
					mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
					map = null;
					mapImage = null;
					
//					madeIt.add(dropOrDitch);         				  	//JFrame
					madeIt.add(whatNow);
					madeIt.setDefaultCloseOperation(2);   				
					madeIt.setVisible(true);
					
					window.addActionListener(new ActionListener(){		 
						public void actionPerformed(ActionEvent E){
							madeIt.dispose();						 
							
							runShot();
							
						} 
						});	 
					
					newRoom.addActionListener(new ActionListener(){		 
						public void actionPerformed(ActionEvent E){
							madeIt.dispose();						 
							
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
						} 
						});	 
				} 
				});	 
			
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						 
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
				} 
				});	 
			
			break; 
			
		case 1:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, or crawl "
					+ "to another room?</font><html>");
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
				
					WinLose(howMany);
					windowRooms();
					
					//mapImage.add(selectOK);
					//commRoom();
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						 
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
				} 
				});	 
			break;
		case 2:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			
			JButton newRoom2 = new JButton("New Room");
			newRoom2.setFont(new Font(font,Font.PLAIN,fontSize));
			
			JButton jumpDown2 = new JButton("Drop In");
			jumpDown2.setFont(new Font(font,Font.PLAIN,fontSize));
			
			JButton pointButton2 = new JButton("View Points");
			pointButton2.setFont(new Font(font,Font.PLAIN,fontSize));
			
			whatNow.add(newRoom2);
			whatNow.add(jumpDown2);
			whatNow.add(pointButton2);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom2.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown2.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					WinLose(howMany);
					windowRooms();			
				} 
				});	 
			
			pointButton2.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			
			break;
			
		case 3:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are three Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			
			
			dropOrDitch.setFont(new Font(font,Font.PLAIN,20)); 

			JButton newRoom3 = new JButton("New Room");
			newRoom3.setFont(new Font(font,Font.PLAIN,fontSize));
			
			JButton jumpDown3 = new JButton("Drop In");
			jumpDown3.setFont(new Font(font,Font.PLAIN,fontSize));

			JButton pointButton3 = new JButton("View Points");
			pointButton3.setFont(new Font(font,Font.PLAIN,fontSize));
			
			whatNow.add(newRoom3);
			whatNow.add(jumpDown3);
			whatNow.add(pointButton3);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom3.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown3.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
					WinLose(howMany);
					windowRooms();
								
				} 
				});	 
			
			pointButton3.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break;
		case 4:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are four Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			
			JButton newRoom4 = new JButton("New Room");
			newRoom4.setFont(new Font(font,Font.PLAIN,fontSize));
			
			JButton jumpDown4 = new JButton("Drop In");
			jumpDown4.setFont(new Font(font,Font.PLAIN,fontSize));
			
			JButton pointButton4 = new JButton("View Points");
			pointButton4.setFont(new Font(font,Font.PLAIN,fontSize));
			
			whatNow.add(newRoom4);
			whatNow.add(jumpDown4);
			whatNow.add(pointButton4);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom4.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown4.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
				fourPlus();
				} 
				});	 
			
			pointButton4.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			break;
		case 5:
			JLabel dropOrDitch5 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are five Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			
			JButton newRoom5 = new JButton("New Room");
			newRoom5.setFont(new Font(font,Font.PLAIN,fontSize));
			
			JButton jumpDown5 = new JButton("Drop In");
			jumpDown5.setFont(new Font(font,Font.PLAIN,fontSize));
			
			JButton pointButton5 = new JButton("View Points");
			pointButton5.setFont(new Font(font,Font.PLAIN,fontSize));
			
			whatNow.add(newRoom5);
			whatNow.add(jumpDown5);
			whatNow.add(pointButton5);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom5.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown5.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
					fourPlus();
				} 
				});	 
			
			pointButton5.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break;
		case 6:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are six Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			
			JButton newRoom6 = new JButton("New Room");
			newRoom6.setFont(new Font(font,Font.PLAIN,fontSize));
			
			JButton jumpDown6 = new JButton("Drop In");
			jumpDown6.setFont(new Font(font,Font.PLAIN,fontSize));
			
			JButton pointButton6 = new JButton("View Points");
			pointButton6.setFont(new Font(font,Font.PLAIN,fontSize));
			
			whatNow.add(newRoom6);
			whatNow.add(jumpDown6);
			whatNow.add(pointButton6);
			
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom6.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown6.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
					fourPlus();	
				} 
				});	 
			
			pointButton6.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});
			break;
		case 7:
			JLabel dropOrDitch7 = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are seven Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			JButton newRoom7 = new JButton("New Room");
			newRoom7.setFont(new Font(font,Font.PLAIN,fontSize));
			
			JButton jumpDown7 = new JButton("Drop In");
			jumpDown7.setFont(new Font(font,Font.PLAIN,fontSize));

			JButton pointButton7 = new JButton("View Points");
			pointButton7.setFont(new Font(font,Font.PLAIN,fontSize));
			
			whatNow.add(newRoom7);
			whatNow.add(jumpDown7);
			whatNow.add(pointButton7);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom7.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown7.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					fourPlus();			
				} 
				});	 
			
			pointButton7.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});
			break;
		case 8:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lounge. Apparently, there are three Nazis in there. Would you like to drop in and try to take them out, or crawl "
					+ "to another room?</font><html>");
			
			JButton newRoom8 = new JButton("New Room");
			newRoom8.setFont(new Font(font,Font.PLAIN,fontSize));
			
			JButton jumpDown8 = new JButton("Drop In");
			jumpDown8.setFont(new Font(font,Font.PLAIN,fontSize));
			
			JButton pointButton8 = new JButton("View Points");
			pointButton8.setFont(new Font(font,Font.PLAIN,fontSize));
			
			whatNow.add(newRoom8);
			whatNow.add(jumpDown8);
			whatNow.add(pointButton8);
			
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom8.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown8.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					fourPlus();			
				} 
				});	 
			
			pointButton8.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break;
		}//end switch case
	}//end method
	
	public void cRoom(){
		
		int howMany = NaziNumber.nextInt(1);		//random number generator for number of nazis in room
		final JFrame madeIt = new JFrame("Wait a minute...");
		
		JLabel dropOrDitch = new JLabel("");
		dropOrDitch.setFont(new Font(font,Font.PLAIN,20));
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton pointButton = new JButton("View Points");
		pointButton.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		whatNow.add(pointButton);
		switch(howMany)
		{
		case 0:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "custodial room. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
			whatToDo = madeIt.getContentPane();
			whatToDo.setBackground(black);

			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
					noWindowRooms();
								
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						 
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
				} 
				});	 
			
			break; 
			
		case 1:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "custodial room. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, or crawl "
					+ "to another room?</font><html>");
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   			
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
					WinLose(howMany);
					noWindowRooms();		
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});
			break;
		}//end switch case
	}//end method
	
	public void oRoom(){
		
		int howMany = NaziNumber.nextInt(4);		//random number generator for number of nazis in room
		final JFrame madeIt = new JFrame("Wait a minute...");
		
		JLabel dropOrDitch = new JLabel("");
		dropOrDitch.setFont(new Font(font,Font.PLAIN,20));
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton pointButton = new JButton("View Points");
		pointButton.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		whatNow.add(pointButton);
		switch(howMany)
		{
		case 0:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "operating room. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
					windowRooms();												///////////////////
								
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					//madeIt.dispose();						 
					
				JOptionPane.showMessageDialog(null, "Current points: " + points);
					
				} 
				});	 
			
			break; 
			
		case 1:
			 dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "operating room. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					WinLose(howMany);
					windowRooms();
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);	
				} 
				});	
			break;	
		case 2:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "operating room. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					WinLose(howMany);
					windowRooms();	
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					JOptionPane.showMessageDialog(null, "Current points: " + points);	
				} 
				});	
			break;
		case 3:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "operating room. Apparently, there are three Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					WinLose(howMany);
					windowRooms();
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break;
		case 4:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "operating room. Apparently, there are four Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
					fourPlus();		
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);	
				} 
				});
			break;
		}//end switch case		
		
	}//end method
	
	public void dOffice(){
		int howMany = NaziNumber.nextInt(1);		//random number generator for number of nazis in room
		final JFrame madeIt = new JFrame("Wait a minute...");
		
		JLabel dropOrDitch = new JLabel("");
		dropOrDitch.setFont(new Font(font,Font.PLAIN,20));
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton pointButton = new JButton("View Points");
		pointButton.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		whatNow.add(pointButton);
		switch(howMany)
		{
		case 0:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "doctor's office. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
		
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					noWindowRooms();			
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			break; 
			
		case 1:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "doctor's office. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, or crawl "
					+ "to another room?</font><html>");
			
			mapImage = new JFrame("Map");		//////////////////////////////////////////
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   			
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					WinLose(howMany);
					noWindowRooms();
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			break;
		}//end switch case
	}//end method
	
	public void safeRoom(){
		int howMany = NaziNumber.nextInt(1);		//random number generator for number of nazis in room
		final JFrame madeIt = new JFrame("Wait a minute...");
		
		JLabel dropOrDitch = new JLabel("");
		dropOrDitch.setFont(new Font(font,Font.PLAIN,20));
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton pointButton = new JButton("View Points");
		pointButton.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		whatNow.add(pointButton);
		switch(howMany)
		{
		case 0:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "secret file room. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();							
					noWindowRooms();		
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){	
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break; 
			
		case 1:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "secret file room. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, or crawl "
					+ "to another room?</font><html>");
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   			
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
					WinLose(howMany);
					noWindowRooms();
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){	
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break;
		}//end switch case
	}//end method
	
	public void mOffice(){
		int howMany = NaziNumber.nextInt(2);		//random number generator for number of nazis in room
		final JFrame madeIt = new JFrame("Wait a minute...");
		
		JLabel dropOrDitch = new JLabel("");
		dropOrDitch.setFont(new Font(font,Font.PLAIN,20));
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton pointButton = new JButton("View Points");
		pointButton.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		whatNow.add(pointButton);
		switch(howMany)
		{
		case 0:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "master's office. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
					noWindowRooms();
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){	
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			break; 
			
		case 1:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "master's office. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();		
					WinLose(howMany);
					noWindowRooms();		
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){	
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break;
		case 2:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "master's office. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
					WinLose(howMany);
					noWindowRooms();
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break;
		}//end switch case
	}//end method
	
	public void commRoom(){
		
		int howMany = NaziNumber.nextInt(4);		//random number generator for number of nazis in room
		final JFrame madeIt = new JFrame("Wait a minute...");
		
		JLabel dropOrDitch = new JLabel("");
		dropOrDitch.setFont(new Font(font,Font.PLAIN,20));
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton pointButton = new JButton("View Points");
		pointButton.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		whatNow.add(pointButton);
		
		mapImage = new JFrame("Map");
		mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
		map = null;
		mapImage = null;
		
		switch(howMany)
		{
		case 0:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "communications room. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					WinLose(howMany);
					noWindowRooms();
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			break; 
		case 1:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "communications room. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					WinLose(howMany);
					noWindowRooms();
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break;
		case 2:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "communications room. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					WinLose(howMany);
					noWindowRooms();
				} 
				});	 
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			break;
		case 3:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "communications room. Apparently, there are three Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					WinLose(howMany);
					noWindowRooms();
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break;
		case 4:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "communications room. Apparently, there are four Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
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
				} 
				});	
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					fourPlus();	
				} 
				});	 
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});
			break;
		}		
	}//end method
	
	public void checkIn(){
		
		int howMany = NaziNumber.nextInt(2);		//random number generator for number of nazis in room
		final JFrame madeIt = new JFrame("Wait a minute...");
		
		JLabel dropOrDitch = new JLabel("");
		dropOrDitch.setFont(new Font(font,Font.PLAIN,20));
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton pointButton = new JButton("View Points");
		pointButton.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		whatNow.add(pointButton);
		
		mapImage = new JFrame("Map");
		mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
		map = null;
		mapImage = null;
		switch(howMany)
		{
		case 0:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "check-in room. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
					noWindowRooms();
				} 
				});	 
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){	
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break; 
		case 1:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "check-in room. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					WinLose(howMany);
					noWindowRooms();
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){	
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			break;
		case 2:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "check-in room. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
					mapIcon = new ImageIcon("X:/Desktop/CheckinRoom.png");
					mapImage.setJMenuBar(roomMenuBar);
					map = new JLabel(mapIcon);
					mapImage.add(map);
					mapImage.setExtendedState(mapImage.getExtendedState()|JFrame.MAXIMIZED_BOTH );
					mapImage.setLocationRelativeTo(null);
					mapImage.setVisible(true); 					
					mapImage.setDefaultCloseOperation(1);
					mapImage.setAlwaysOnTop(true);
				} 
				});	 
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
					WinLose(howMany);
					noWindowRooms();
				} 
				});	 
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){	
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			break;
		}//end switch case
	}//end method
	
	public void lobby(){
		
		int howMany = NaziNumber.nextInt(4);		//random number generator for number of nazis in room
		final JFrame madeIt = new JFrame("Wait a minute...");
		
		JLabel dropOrDitch = new JLabel("");
		dropOrDitch.setFont(new Font(font,Font.PLAIN,20));
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton pointButton = new JButton("View Points");
		pointButton.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		whatNow.add(pointButton);
		
		mapImage = new JFrame("Map");
		mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
		map = null;
		mapImage = null;
		switch(howMany)
		{
		case 0:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lobby. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					lobbyWin();
				} 
				});	
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break; 
		case 1:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lobby. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					WinLose(howMany);
					lobbyWin();
				} 
				});	 
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){	
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			break;
		case 2:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lobby. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					WinLose(howMany);
					lobbyWin();
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			break;
		case 3:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lobby. Apparently, there are three Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					WinLose(howMany);
					lobbyWin();	
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break;
		case 4:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "lobby. Apparently, there are four Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
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
				} 
				});	 
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
					fourPlus();
				} 
				});	 
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			break;
		}//end switch case
	}//end method
	
	public void potty(){
		
		int howMany = NaziNumber.nextInt(1);		//random number generator for number of nazis in room
		final JFrame madeIt = new JFrame("Wait a minute...");
		
		JLabel dropOrDitch = new JLabel("");
		dropOrDitch.setFont(new Font(font,Font.PLAIN,20));
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton pointButton = new JButton("View Points");
		pointButton.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		whatNow.add(pointButton);
		
		mapImage = new JFrame("Map");
		mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
		map = null;
		mapImage = null;
		switch(howMany)
		{
		case 0:
		dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "bathroom. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					noWindowRooms();
				} 
				});	 
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break; 
		case 1:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "bathroom. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();		
					WinLose(howMany);
					noWindowRooms();
				} 
				});	 
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			break;
		}//end switch case
	}//end method
	
	public void Hall1(){
		int howMany = NaziNumber.nextInt(2);		//random number generator for number of nazis in room
		
		final JFrame madeIt = new JFrame("Wait a minute...");
		
		JLabel dropOrDitch = new JLabel("");
		dropOrDitch.setFont(new Font(font,Font.PLAIN,20));
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton jumpDown = new JButton("Drop In");
		jumpDown.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton pointButton = new JButton("View Points");
		pointButton.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(newRoom);
		whatNow.add(jumpDown);
		whatNow.add(pointButton);
		
		mapImage = new JFrame("Map");
		mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
		map = null;
		mapImage = null;	
		
		
		switch(howMany)
		{
		case 0:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "main hallway. Apparently no one is in there. Would you like to drop in, or crawl to another room?</font><html>");
			whatToDo = madeIt.getContentPane();
			whatToDo.setBackground(black);
		
			
			//mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();		
					noWindowRooms();				
				} 
				});	 
			
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	 
			
			break; 
			
		case 1:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "main hallway. Apparently, there is one Nazi in there. Would you like to drop in and try to take him out, "
					+ "or crawl to another room?</font><html>");

			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(black);

			mapImage = new JFrame("Map");					////////////////////
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
					WinLose(howMany);
					noWindowRooms();
				} 
				});	 
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break;
		case 2:
			dropOrDitch = new JLabel("<html> <font color='silver'> You have crawled to the vent above the "
					+ "main hallway. Apparently, there are two Nazis in there. Would you like to drop in and try to take them out, "
					+ "or crawl to another room?</font><html>");
	
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(1);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();
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
				} 
				});	 
			
			jumpDown.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();	
					WinLose(howMany);
					noWindowRooms();
				} 
				});	
			pointButton.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
				JOptionPane.showMessageDialog(null, "Current points: " + points);
				} 
				});	
			break;
		}//end switch case
	}//end method
	
	public void windowRooms(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Now that you're safely in the room, "
		+ "Would you like to attempt an escape through the window and risk being shot by the guards "
		+ "in the towers while you hop the fence, or try another room?</font><html>");
		whatToDo = madeIt.getContentPane();
		whatToDo.setBackground(black);
		
		madeIt.setSize(800,400);						//sets the size of the window
		madeIt.setLocationRelativeTo(null);
		madeIt.setLayout(new GridLayout(2,1));
		
		dropOrDitch.setFont(new Font(font,Font.PLAIN,20)); 
		
		whatNow = new JPanel();				
		whatNow.setLayout(new FlowLayout());
		whatNow.setBackground(black);
		
		JButton window = new JButton("Window");
		window.setFont(new Font(font,Font.PLAIN,fontSize));
		
		JButton newRoom = new JButton("New Room");
		newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
		
		whatNow.add(window);
		whatNow.add(newRoom);
		
		mapImage = new JFrame("Map");
		mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
		map = null;
		mapImage = null;
		
		
		madeIt.add(dropOrDitch);         				  	//JFrame
		madeIt.add(whatNow);
		madeIt.setDefaultCloseOperation(2);   				
		madeIt.setVisible(true);
		
		window.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				madeIt.dispose();						 
				
				runShot();
				
			} 
			});	 
		
		newRoom.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent E){
				madeIt.dispose();						 
				
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
			} 
			});	 	
	}//end method

	public void noWindowRooms(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You're safely in the room, "
			+ "but there is no way to escape. Find another room.</font><html>");
			whatToDo = madeIt.getContentPane();
			whatToDo.setBackground(black);
			
			madeIt.setSize(800,400);						//sets the size of the window
			madeIt.setLocationRelativeTo(null);
			madeIt.setLayout(new GridLayout(2,1));
			
			dropOrDitch.setFont(new Font(font,Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(black);
				
			JButton newRoom = new JButton("New Room");
			newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
			
			whatNow.add(newRoom);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
					
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
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
				} 
				});	 	
	}//end method
	
	public  void lobbyWin(){
		JFrame madeIt = new JFrame("Wait a minute...");
		JLabel dropOrDitch = new JLabel("<html> <font color='silver'> Awesome! Now that you have the "
				+ "lobby to yourself - RUN!</font><html>");
			whatToDo = madeIt.getContentPane();
			whatToDo.setBackground(black);
			
			madeIt.setSize(800,400);						//sets the size of the window
			madeIt.setLocationRelativeTo(null);
			madeIt.setLayout(new GridLayout(2,1));
			
			dropOrDitch.setFont(new Font(font,Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(black);
				
			JButton newRoom = new JButton("Run");
			newRoom.setFont(new Font(font,Font.PLAIN,fontSize));
			
			whatNow.add(newRoom);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
	
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				
			madeIt.setVisible(true);
			
			newRoom.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						 
					
					Final_Game lobbyWin = new Final_Game();
					lobbyWin.winMethod(points);		
				} 
				});	 
	}
} 