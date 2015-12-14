package Final_game;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class No_Vent_Rooms extends Super_Class {
	public void Walk_Out(){
		
	}//end method 
	
	public void torture_Room(){
		int howMany = NaziNumber.nextInt(2);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You made it to the torture room. "
					+ " Apparently no one is in there. Would you like to attempt an escape through the window"
					+ "and risk being shot by the guards in the towers while you hop the fence,"
					+ " or try another room?</font><html>");
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
			
			newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/tortureRoom.png");
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
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You made it to the torture room. "
					+ " Apparently there is one Nazi in there. Would you like to attempt to take him out, or"
					+ "run to a different room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);						//sets the size of the window
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton fight1 = new JButton("Fight");
			fight1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(fight1);
			whatNow.add(newRoom1);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt1.setVisible(true);
			
			fight1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
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
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt1.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/tortureRoom.png");
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
			JLabel dropOrDitch2 = new JLabel("<html> <font color='silver'> You made it to the torture room. "
					+ " Apparently there are two Nazis in there. Would you like to attempt to take them out, or"
					+ "run to a different room?</font><html>");
			whatToDo = madeIt2.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt2.setSize(800,400);						//sets the size of the window
			madeIt2.setLocationRelativeTo(null);
			madeIt2.setLayout(new GridLayout(2,1));
			
			dropOrDitch2.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton Fight2 = new JButton("Fight");
			Fight2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton newRoom2 = new JButton("Drop In");
			newRoom2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(Fight2);
			whatNow.add(newRoom2);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt2.add(dropOrDitch2);         				  	//JFrame
			madeIt2.add(whatNow);
			madeIt2.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt2.setVisible(true);
			
			Fight2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
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
			
			newRoom2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
				public void actionPerformed(ActionEvent E){
					madeIt2.dispose();						//closes JFrame
					
					mapIcon = new ImageIcon("X:/Desktop/tortureRoom.png");
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
	
	public void Hall2(){
		int howMany = NaziNumber.nextInt(2);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You made it to Hallway 2. "
					+ " Apparently there is no one in there. Would you like to attempt to take him out, or"	////////////////
					+ "run to a different room?</font><html>");
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
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You made it to Hallway 2. "
					+ " There is one Nazi in there. Would you like to attempt to take him out, or "
					+ "run to a different room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);						//sets the size of the window
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton fight1 = new JButton("Fight");
			fight1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(fight1);
			whatNow.add(newRoom1);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt1.setVisible(true);
			
			fight1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
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
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
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
			JLabel dropOrDitch2 = new JLabel("<html> <font color='silver'> You made it to Hallway 2. "
					+ " Apparently there are two Nazis in there. Would you like to attempt to take themout, or"
					+ " run to a different room?</font><html>");
			whatToDo = madeIt2.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt2.setSize(800,400);						//sets the size of the window
			madeIt2.setLocationRelativeTo(null);
			madeIt2.setLayout(new GridLayout(2,1));
			
			dropOrDitch2.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton fight2 = new JButton("Fight");
			fight2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton newRoom2 = new JButton("New Room");
			newRoom2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(fight2);
			whatNow.add(newRoom2);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt2.add(dropOrDitch2);         				  	//JFrame
			madeIt2.add(whatNow);
			madeIt2.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt2.setVisible(true);
			
			fight2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
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
			
			newRoom2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
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
	
	public void Hall3(){
		int howMany = NaziNumber.nextInt(2);		//random number generator for number of nazis in room
		switch(howMany)
		{
		case 0:
			JFrame madeIt = new JFrame("Wait a minute...");
			JLabel dropOrDitch = new JLabel("<html> <font color='silver'> You made it to Hallway 3. "
					+ " Apparently there is no one in there. Would you like to attempt to take him out, or"
					+ " run to a different room?</font><html>");
			whatToDo = madeIt.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt.setSize(800,400);						//sets the size of the window
			madeIt.setLocationRelativeTo(null);
			madeIt.setLayout(new GridLayout(2,1));
			
			dropOrDitch.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton fight = new JButton("Fight");
			fight.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton newRoom = new JButton("New Room");
			newRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(fight);
			whatNow.add(newRoom);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt.add(dropOrDitch);         				  	//JFrame
			madeIt.add(whatNow);
			madeIt.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt.setVisible(true);
			
			fight.addActionListener(new ActionListener(){		//creates ActionListener for OK button
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
			
			newRoom.addActionListener(new ActionListener(){		//creates ActionListener for OK button
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
			JLabel dropOrDitch1 = new JLabel("<html> <font color='silver'> You made it to Hallway 3. "
					+ " Apparently there is one Nazi in there. Would you like to attempt to take him out, or"
					+ "run to a different room?</font><html>");
			whatToDo = madeIt1.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt1.setSize(800,400);						//sets the size of the window
			madeIt1.setLocationRelativeTo(null);
			madeIt1.setLayout(new GridLayout(2,1));
			
			dropOrDitch1.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton fight1 = new JButton("Fight");
			fight1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton newRoom1 = new JButton("New Room");
			newRoom1.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(fight1);
			whatNow.add(newRoom1);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt1.add(dropOrDitch1);         				  	//JFrame
			madeIt1.add(whatNow);
			madeIt1.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt1.setVisible(true);
			
			fight1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
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
			
			newRoom1.addActionListener(new ActionListener(){		//creates ActionListener for OK button
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
			JLabel dropOrDitch2 = new JLabel("<html> <font color='silver'> You made it to Hallway 3. "
					+ " Apparently there are two Nazis in there. Would you like to attempt to take them out, or"
					+ "run to a different room?</font><html>");
			whatToDo = madeIt2.getContentPane();
			whatToDo.setBackground(Color.black);
			
			madeIt2.setSize(800,400);						//sets the size of the window
			madeIt2.setLocationRelativeTo(null);
			madeIt2.setLayout(new GridLayout(2,1));
			
			dropOrDitch2.setFont(new Font("Goudy old style",Font.PLAIN,20)); 
			
			whatNow = new JPanel();				
			whatNow.setLayout(new FlowLayout());
			whatNow.setBackground(Color.black);
			
			JButton fight2 = new JButton("Fight");
			fight2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			JButton newRoom2 = new JButton("New Room");
			newRoom2.setFont(new Font("Goudy old style",Font.PLAIN,16));
			
			whatNow.add(fight2);
			whatNow.add(newRoom2);
			
			mapImage = new JFrame("Map");
			mapIcon = null;//new ImageIcon("X:/Desktop/Hall1.png");
			map = null;
			mapImage = null;
			
			
			madeIt2.add(dropOrDitch2);         				  	//JFrame
			madeIt2.add(whatNow);
			madeIt2.setDefaultCloseOperation(2);   				//closes program when you close window; code from Cordell
			madeIt2.setVisible(true);
			
			fight2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
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
			
			newRoom2.addActionListener(new ActionListener(){		//creates ActionListener for OK button
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

}//end class
