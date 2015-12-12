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



public class Super_Class {
	
	protected JFrame mapImage;
	protected ImageIcon mapIcon;
	protected JLabel map;
	public void pick_Room(String[] args){
		
	final JFrame decide;
	final JLabel choose;
	final JPanel controlPanel;
	
	JButton lounge = new JButton("1");
	lounge.setFont(new Font("Goudy old style",Font.PLAIN,16));	//alters the font of button
	
	JButton cRoom = new JButton("2");
	cRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton oRoom = new JButton("3");
	oRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton dOffice = new JButton("4");
	dOffice.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton safeRoom = new JButton("5");
	safeRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton mOffice = new JButton("6");
	mOffice.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton commRoom = new JButton("7");
	commRoom.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton checkIn = new JButton("8");
	checkIn.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton lobby = new JButton("9");
	lobby.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton potty = new JButton("10");
	potty.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	JButton Hall1 = new JButton("Hallway");
	Hall1.setFont(new Font("Goudy old style",Font.PLAIN,16));
	
	}//end Super_Class method

} // end class
