/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * This file is ran when a player encounters a monster. This file dictates how the fight will proceed based on the players choice as well as the mosnters stats.
 * This file also contains the code System.Exit(0) and in the instance the player defeats the gobling king/ mosnter at indx 10 of monster list the game will end
 * with that player declared the winner.
 */
package console;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import gameMethods.MainGame;
import guiComponents.TutorialWindow;
import inventory.InventoryMethod;
import inventory.Item;
import player.*;

	/**
 	* @author BrandonSmith
 	* @since 2019.03.18
 	* @version 1.0
 	* This file is ran at the beginning and end of the game. It is also responisble for creating the players at the beginning of the game as well as their inventories in
 	* the list of lists affectionately named listList.
 	*/

	


public class GameStart {
	
	
	    private static MainGame game = new MainGame(); //instanties MainGame File
		private static PlayerEntry enter = new PlayerEntry(); // controls players text entry
		private static Knight knight = new Knight(); // instanties the knight class
		private static Mage mage = new Mage(); // instantiates the mage class
		private static Thief thief = new Thief(); // instanties the thief class
		private static Ranger ranger = new Ranger(); // instnatiates the ranger class
		
		private static ArrayList<Player> player = new ArrayList<Player>(); // instanties the player class
		private static ArrayList<ArrayList<Item>> listList = new ArrayList<ArrayList<Item>>(); // controls players inventory by storing them at set indexes based on amount of players
		

		private static int playCount; // stores amount of players playing selected by user
		private static int maxX;
		private static int maxY;
		private static int i;
		private static JFrame charCre = new JFrame("RPG Simulator");
		private static JFrame getNameBox = new JFrame();
		

		

		
		 
	
	



	/**
	 * Character Creation
	 * this method controls the character creation mode and adds new players based on player count using a for loop to allow multiple entries
	 * @throws  
	 */
	public void createCharacter (int playCount)   {

		try {
		    charCre.setIconImage(ImageIO.read(getClass().getResourceAsStream("/console/resources/appIcon.jpg")));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		GameStart.playCount = playCount;
		GridBagLayout lblGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		
		charCre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		charCre.setVisible(true);
		charCre.setSize(825, 500);
		
		
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.black);
		panel1.setSize(825, 50);
		panel1.setLocation(0, 0);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.gray);
		panel2.setLocation(0,50);
		panel2.setSize(825,5);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.black);
		panel3.setSize(825, 445);
		panel3.setLocation(0,55);
		panel3.setLayout(lblGrid);
		
		charCre.add(panel1);
		charCre.add(panel2); 
		charCre.add(panel3);
		
		ImageIcon knightbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/knight.png"));
		Image image1 = knightbad.getImage(); // transform it 
		Image newimg1 = image1.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon knightImg = new ImageIcon(newimg1);  // transform it back
		
		ImageIcon mageImgbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/mage.png"));
		Image image2 = mageImgbad.getImage(); // transform it 
		Image newimg2 = image2.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon mageImg = new ImageIcon(newimg2);  // transform it back
		
		ImageIcon rangerImgbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/ranger.jpg"));
		Image image3 = rangerImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon rangerImg = new ImageIcon(newimg3);  // transform it back
		
		ImageIcon thiefImgbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/thief.jpg"));
		Image image4 = thiefImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon thiefImg = new ImageIcon(newimg4);  // transform it back
		
		JLabel ask = new JLabel("Player " + (i + 1) + " Select Your Class");
		ask.setForeground(Color.white);
		ask.setFont(new Font("Courier New", Font.BOLD, 30));
		
		//class names
		
		JLabel className1 = new JLabel("Knight");
		className1.setForeground(Color.white);
		className1.setFont(new Font("Courier New", Font.BOLD, 35));
		
		JLabel className2 = new JLabel("Mage");
		className2.setForeground(Color.white);
		className2.setFont(new Font("Courier New", Font.BOLD, 35));
		
		JLabel className3 = new JLabel("Ranger");
		className3.setForeground(Color.white);
		className3.setFont(new Font("Courier New", Font.BOLD, 35));
		
		JLabel className4 = new JLabel("Thief");
		className4.setForeground(Color.white);
		className4.setFont(new Font("Courier New", Font.BOLD, 35));
		
		// strength stats
		
		JLabel classStatStr1 = new JLabel("Strength: " + knight.getStr());
		classStatStr1.setForeground(Color.white);
		classStatStr1.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatStr2 = new JLabel("Strength: " + mage.getStr());
		classStatStr2.setForeground(Color.white);
		classStatStr2.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatStr3 = new JLabel("Strength: " + ranger.getStr());
		classStatStr3.setForeground(Color.white);
		classStatStr3.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatStr4 = new JLabel("Strength: " + thief.getStr());
		classStatStr4.setForeground(Color.white);
		classStatStr4.setFont(new Font("Courier New", Font.BOLD, 20));
		
		// defense stats
		
		JLabel classStatDef1 = new JLabel("Defense: " + knight.getDef());
		classStatDef1.setForeground(Color.white);
		classStatDef1.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatDef2 = new JLabel("Defense: " + mage.getDef());
		classStatDef2.setForeground(Color.white);
		classStatDef2.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatDef3 = new JLabel("Defense: " + ranger.getDef());
		classStatDef3.setForeground(Color.white);
		classStatDef3.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatDef4 = new JLabel("Defense: " + thief.getDef());
		classStatDef4.setForeground(Color.white);
		classStatDef4.setFont(new Font("Courier New", Font.BOLD, 20));
		
		// speed stats
		
		JLabel classStatSpd1 = new JLabel("Speed: " + knight.getSpd());
		classStatSpd1.setForeground(Color.white);
		classStatSpd1.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatSpd2 = new JLabel("Speed: " + mage.getSpd());
		classStatSpd2.setForeground(Color.white);
		classStatSpd2.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatSpd3 = new JLabel("Speed: " + ranger.getSpd());
		classStatSpd3.setForeground(Color.white);
		classStatSpd3.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatSpd4 = new JLabel("Speed: " + thief.getSpd());
		classStatSpd4.setForeground(Color.white);
		classStatSpd4.setFont(new Font("Courier New", Font.BOLD, 20));
		
		// intelligence stats
		
		JLabel classStatSma1 = new JLabel("Intelligence: " + knight.getSma());
		classStatSma1.setForeground(Color.white);
		classStatSma1.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatSma2 = new JLabel("Intelligence: " + mage.getSma());
		classStatSma2.setForeground(Color.white);
		classStatSma2.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatSma3 = new JLabel("Intelligence: " + ranger.getSma());
		classStatSma3.setForeground(Color.white);
		classStatSma3.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatSma4 = new JLabel("Intelligence: " + thief.getSma());
		classStatSma4.setForeground(Color.white);
		classStatSma4.setFont(new Font("Courier New", Font.BOLD, 20));

		// luck stats
		
		JLabel classStatLuc1 = new JLabel("Luck: " + knight.getLuc());
		classStatLuc1.setForeground(Color.white);
		classStatLuc1.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatLuc2 = new JLabel("Luck: " + mage.getLuc());
		classStatLuc2.setForeground(Color.white);
		classStatLuc2.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatLuc3 = new JLabel("Luck: " + ranger.getLuc());
		classStatLuc3.setForeground(Color.white);
		classStatLuc3.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel classStatLuc4 = new JLabel("Luck: " + thief.getLuc());
		classStatLuc4.setForeground(Color.white);
		classStatLuc4.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JButton pick1 = new JButton("Choose Knight");
		pick1.setPreferredSize(new Dimension(200, 50));
		pick1.setForeground(Color.white);
		pick1.setBackground(new Color(129, 7, 0));
		pick1.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JButton pick2 = new JButton("Choose Mage");
		pick2.setPreferredSize(new Dimension(200, 50));
		pick2.setForeground(Color.white);
		pick2.setBackground(new Color(129, 7, 0));
		pick2.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JButton pick3 = new JButton("Choose Ranger");
		pick3.setPreferredSize(new Dimension(200, 50));
		pick3.setForeground(Color.white);
		pick3.setBackground(new Color(129, 7, 0));
		pick3.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JButton pick4 = new JButton("Choose Thief");
		pick4.setPreferredSize(new Dimension(200, 50));
		pick4.setForeground(Color.white);
		pick4.setBackground(new Color(129, 7, 0));
		pick4.setFont(new Font("Courier New", Font.BOLD, 20));

		JLabel img1 = new JLabel(knightImg);
		JLabel img2 = new JLabel(mageImg);
		JLabel img3 = new JLabel(rangerImg);
		JLabel img4 = new JLabel(thiefImg);
		
		setMaxX(14 * playCount);
		setMaxY(14 * playCount);
		
		gbc.fill = GridBagConstraints.BOTH;
		
		//knight info
	    
		gbc.gridx = 0;
	    gbc.gridy = 0;
		panel3.add(className1, gbc);
	    
		gbc.gridx = 0;
	    gbc.gridy = 1;
		panel3.add(img1, gbc);
		
		gbc.gridx = 0;
	    gbc.gridy = 2;
	    panel3.add(classStatStr1, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 3;
	    panel3.add(classStatDef1, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 4; 
	    panel3.add(classStatSpd1, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 5; 
	    panel3.add(classStatSma1, gbc);
	   
	    gbc.gridx = 0;
	    gbc.gridy = 6;
	    panel3.add(classStatLuc1, gbc);
	   
	    gbc.gridx = 0;
	    gbc.gridy = 7;
	    panel3.add(pick1, gbc);
	    


	    
	    // mage info
	  
	    gbc.gridx = 1;
	    gbc.gridy = 0;
		panel3.add(className2, gbc);
	    
		gbc.gridx = 1;
	    gbc.gridy = 1;
		panel3.add(img2, gbc);
				
		gbc.gridx = 1;
	    gbc.gridy = 2;		    
	    panel3.add(classStatStr2, gbc);
	  
	    gbc.gridx = 1;
	    gbc.gridy = 3;	    
	    panel3.add(classStatDef2, gbc);
	  
	    gbc.gridx = 1;
	    gbc.gridy = 4; 
	    panel3.add(classStatSpd2, gbc);
	   
	    gbc.gridx = 1;
	    gbc.gridy = 5;
	    panel3.add(classStatSma2, gbc);
	  
	    gbc.gridx = 1;
	    gbc.gridy = 6;
	    panel3.add(classStatLuc2, gbc);
	   
	    gbc.gridx = 1;
	    gbc.gridy = 7;
	    panel3.add(pick2, gbc);
	    
	    // ranger info
	   
	    gbc.gridx = 2;
	    gbc.gridy = 0;
		panel3.add(className3, gbc);
	  
	    
		gbc.gridx = 2;
	    gbc.gridy = 1;
		panel3.add(img3, gbc);
		
		gbc.gridx = 2;
	    gbc.gridy = 2;	    
	    panel3.add(classStatStr3, gbc);
	  
	    gbc.gridx = 2;
	    gbc.gridy = 3;	    
	    panel3.add(classStatDef3, gbc);
	  
	    gbc.gridx = 2;
	    gbc.gridy = 4;	    
	    panel3.add(classStatSpd3, gbc);
	  
	    gbc.gridx = 2;
	    gbc.gridy = 5;	    
	    panel3.add(classStatSma3, gbc);
	  
	    gbc.gridx = 2;
	    gbc.gridy = 6;	    
	    panel3.add(classStatLuc3, gbc);
	   
	    gbc.gridx = 2;
	    gbc.gridy = 7;	    
	    panel3.add(pick3, gbc);

	    
	    // thief info
	    gbc.gridx = 3;
	    gbc.gridy = 0;
		panel3.add(className4, gbc);
	    
		gbc.gridx = 3;
	    gbc.gridy = 1;
		panel3.add(img4, gbc);
		
		gbc.gridx = 3;
	    gbc.gridy = 2;		    
	    panel3.add(classStatStr4, gbc);
	 
	    gbc.gridx = 3;
	    gbc.gridy = 3;		    
	    panel3.add(classStatDef4, gbc);
	   
	    gbc.gridx = 3;
	    gbc.gridy = 4;		    
	    panel3.add(classStatSpd4, gbc);
	   
	    gbc.gridx = 3;
	    gbc.gridy = 5;		    
	    panel3.add(classStatSma4, gbc);
	   
	    gbc.gridx = 3;
	    gbc.gridy = 6;		    
	    panel3.add(classStatLuc4, gbc);
	  
	    gbc.gridx = 3;
	    gbc.gridy = 7;		    
	    panel3.add(pick4, gbc);
	  
		
	    	
	    	
			panel1.add(ask);
			
			   
		
			
			
	    pick1.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player.add(new Knight());
	    		ask.setText("Player " + (i + 2) + " Select Your Class");
	    		charCre.dispose();
				setLocation();
				getName();
			}  
	    	    });  
	    
	    pick2.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
				player.add(new Mage());
	    		ask.setText("Player " + (i + 2) + " Select Your Class");
	    		charCre.dispose();
				setLocation();
				getName();  
	    	        }  
	    	    });  
	    
	    pick3.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
				player.add(new Ranger());
	    		ask.setText("Player " + (i + 2) + " Select Your Class");
	    		charCre.dispose();
				setLocation();
				getName();   
	    	        }  
	    	    });  
	    
	    pick4.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
				
	    		player.add(new Thief());
	    		ask.setText("Player " + (i + 2) + " Select Your Class");
	    		charCre.dispose();
				setLocation();
				getName();
				
				
	    	        }  
	    	    });  
			
			
			
			
			
		
			

		
			

	}



	public static void setLocation() 
	{
		listList.add(new ArrayList<Item>()); // adds a new list to the listList array list of lists. :D That was a mouth full.
		//sets players cords based on which player is selecting their class up to a max of 8 players
		//if the map is made larger or max players is increased this must be modified to set extra players starting cords
		Random rand = new Random(); // insantiates the Random class
		
		
		boolean suc = false;
		while (!suc)
		{
			int randX = rand.nextInt((getMaxX() - 1) + 1) + 1;
			int randY = rand.nextInt((getMaxY() - 1) + 1) + 1;
			if 
			(
					randX == (maxX/2 + 2) && randY == (maxY/2) ||
					randX == (maxX/2 - 2) && randY == (maxY/2) ||
					randX == (maxX/2) && randY == (maxY/2 + 2) ||
					randX == (maxX/2) && randY == (maxY/2 - 2) ||
					randX == (maxX/2 - 1) && randY == (maxY/2 - 1) ||
					randX == (maxX/2 - 1) && randY == (maxY/2 - 2) ||
					randX == (maxX/2 - 2) && randY == (maxY/2 - 1) ||
					randX == (maxX/2 - 2) && randY == (maxY/2 - 2) ||
					randX == (maxX/2 + 1) && randY == (maxY/2 + 1) ||
					randX == (maxX/2 + 1) && randY == (maxY/2 + 2) ||
					randX == (maxX/2 + 2) && randY == (maxY/2 + 1) ||
					randX == (maxX/2 + 2) && randY == (maxY/2 + 2) ||
					randX == (maxX/2 - 1) && randY == (maxY/2 + 1) ||
					randX == (maxX/2 - 1) && randY == (maxY/2 + 2) ||
					randX == (maxX/2 - 2) && randY == (maxY/2 + 1) ||
					randX == (maxX/2 - 2) && randY == (maxY/2 + 2) ||
					randX == (maxX/2 + 1) && randY == (maxY/2 - 1) ||
					randX == (maxX/2 + 1) && randY == (maxY/2 - 2) ||
					randX == (maxX/2 + 2) && randY == (maxY/2 - 1) ||
					randX == (maxX/2 + 2) && randY == (maxY/2 - 2)  ||
					randX == (maxX/2) && randY == (maxY/2 + 1) ||
					randX == (maxX/2 - 1) && randY == (maxY/2) ||
					randX == (maxX/2 + 1) && randY == (maxY/2) ||		
					randX == (maxX/2) && randY == (maxY/2 - 1) ||
					randX == (maxX/2) && randY == (maxY/2 + 3) ||
					randX == (maxX/2 - 1) && randY == (maxY/2 + 3) ||
					randX == (maxX/2 - 2) && randY == (maxY/2 + 3) ||
					randX == (maxX/2 + 1) && randY == (maxY/2 + 3) ||
					randX == (maxX/2 + 2) && randY == (maxY/2 + 3) ||
					randX == (maxX/2) && randY == (maxY/2 - 3) ||
					randX == (maxX/2 - 1) && randY == (maxY/2 - 3) ||
					randX == (maxX/2 - 2) && randY == (maxY/2 - 3) ||
					randX == (maxX/2 + 1) && randY == (maxY/2 - 3) ||
					randX == (maxX/2 + 2) && randY == (maxY/2 - 3) ||
					randX == (maxX/2 + 3) && randY == (maxY/2) ||
					randX == (maxX/2 + 3) && randY == (maxY/2 - 1) ||
					randX == (maxX/2 + 3) && randY == (maxY/2 - 2) ||
					randX == (maxX/2 + 3) && randY == (maxY/2 + 1) ||
					randX == (maxX/2 + 3) && randY == (maxY/2 + 2) ||
					randX == (maxX/2 - 3) && randY == (maxY/2) ||
					randX == (maxX/2 - 3) && randY == (maxY/2 - 1) ||
					randX == (maxX/2 - 3) && randY == (maxY/2 - 2) ||
					randX == (maxX/2 - 3) && randY == (maxY/2 + 2) ||
					randX == (maxX/2 - 3) && randY == (maxY/2 + 3) ||
					randX == (maxX/2 + 3) && randY == (maxY/2 + 3) ||
					randX == (maxX/2 + 3) && randY == (maxY/2 - 3) ||
					randX == (maxX/2 - 3) && randY == (maxY/2 + 3) ||
					randX == (maxX/2 - 3) && randY == (maxY/2 - 3) ||
					randX == (maxX/2 - 4) && randY == (maxY/2) ||
					randY == (maxY/2 + 1) || randY == (maxY/2 + 2) ||
					randY == (maxY/2 + 3) || randY == (maxY/2 - 1) ||
					randY == (maxY/2 - 2) || randY == (maxY/2 - 3) ||
					randX == (maxX/2 + 4) && randY == (maxY/2) ||
					randY == (maxY/2 + 1) || randY == (maxY/2 + 2) ||
					randY == (maxY/2 + 3) || randY == (maxY/2 - 1) ||
					randY == (maxY/2 - 2) || randY == (maxY/2 - 3) ||
					randY == (maxY/2 - 4) && randX == (maxX/2) ||
					randX == (maxX/2 + 1) || randX == (maxX/2 + 2) ||
					randX == (maxX/2 + 3) || randX == (maxX/2 - 1) ||
					randX == (maxX/2 - 2) || randX == (maxX/2 - 3) ||
					randY == (maxY/2 + 4) && randX == (maxX/2) ||
					randX == (maxX/2 + 1) || randX == (maxX/2 + 2) ||
					randX == (maxX/2 + 3) || randX == (maxX/2 - 1) ||
					randX == (maxX/2 - 2) || randX == (maxX/2 - 3) ||
					//end shadow pass and mosnter base check start coin shop check
					randX == (maxX) && randY == (maxY) ||
					randX == (maxX - 1) && randY == (maxY) ||
					randX == (maxX) && randY == (maxY - 1) ||
					randX == (maxX) && randY == (1) ||
					randX == (maxX) && randY == (1) ||
					randX == (maxX - 1) && randY == (1)||
					randX == (maxX) && randY == (2) ||
					randX == (1) && randY == (maxY) ||
					randX == (1) && randY == (maxY - 1) ||
					randX == (2) && randY == (maxY) ||
					randX == (1) && randY == (1) ||
					randX == (2) && randY == (1) ||
					randX == (1) && randY == (2) ||
					randX == 0 || randY == 0
			) 
			{
			suc = false;
			}
			else
			{
				player.get(i).setCordX(randX);
				player.get(i).setCordY(randY);
				break;
			}
			
			
		}
		

		
	} // end of method
	
	/**
	 * displayers winner if only 1 player is left.
	 */
	public static void  gameOutro () {
		/**
		 * runs for loop to check all remaining players health and finds winner if their is still more then 1 player
		 * deathCheck should prevent this from being needed but this is just a precaution.
		 */
		for (int i = 0; player.size() > i; ++i )
		{
			if(player.get(i).getHp() > 0) {
			
			}
			
		}

		System.exit(0); // ends program
	}
	
	private void getName(){
		SpringLayout laySpr = new SpringLayout();
		JPanel namePanel = new JPanel();
		
		getNameBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getNameBox.setSize(320,250);
		getNameBox.setVisible(true);
		getNameBox.add(namePanel);
		namePanel.setSize(new Dimension(320, 250));
		namePanel.setBackground(Color.black);
		JButton enter = new JButton("Enter");
		enter.setPreferredSize(new Dimension(250, 50));
		enter.setForeground(Color.white);
		enter.setBackground(new Color(129, 7, 0));
		enter.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel ask = new JLabel("Please Enter Name Of Player: 1");
		namePanel.add(ask);
		

	
		ask.setPreferredSize(new Dimension(250, 50));
		ask.setForeground(Color.white);
		ask.setBackground(new Color(129, 7, 0));
		ask.setFont(new Font("Courier New", Font.BOLD, 12));
		
		
		JTextField nameBox = new JTextField("enter name here");
		nameBox.setPreferredSize(new Dimension(250, 50));
		nameBox.setForeground(Color.white);
		nameBox.setBackground(new Color(129, 7, 0));
		nameBox.setFont(new Font("Courier New", Font.BOLD, 15));
		
		
		
		namePanel.add(nameBox);
		namePanel.add(enter);
		
		laySpr.putConstraint(SpringLayout.WEST, ask, 30, SpringLayout.WEST, getNameBox);
		laySpr.putConstraint(SpringLayout.NORTH, ask, 10, SpringLayout.NORTH, getNameBox);
		laySpr.putConstraint(SpringLayout.WEST, nameBox, 30, SpringLayout.WEST, getNameBox);
		laySpr.putConstraint(SpringLayout.NORTH, nameBox, 60, SpringLayout.NORTH, ask);
		laySpr.putConstraint(SpringLayout.WEST, enter, 30, SpringLayout.WEST, getNameBox);
		laySpr.putConstraint(SpringLayout.NORTH, enter, 60, SpringLayout.NORTH, nameBox);
		
	    enter.addActionListener(new ActionListener(){  
			
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
	    		
	    		boolean suc = false;
	    		while (true) {
	    		try{
	    		    player.get(i).setPlayName(nameBox.getText());
	    		    ask.setText("Please Enter Name Of Player: " + (i + 2));
	    		    
	    		    suc = true;
	    		    break;
	    		}catch (NullPointerException ex) {
	    			suc = false;
	    			JFrame notOk = new JFrame();
	    			notOk.setVisible(true);
	    			notOk.setSize(200,100);
	    			JLabel why = new JLabel("TRY AGAIN!");
	    			notOk.add(why);
	    			break;
	    		}
	    		}
	    		
	    		if (suc)
	    		{

					getNameBox.dispose();
					i++;

					if (i < playCount)
					{
					createCharacter(playCount);
					}
					else
					{
			    		InventoryMethod.setListList(GameStart.getListList()); //sets listList to InventoryMethod listList
			    		MainGame.setPlayer(GameStart.getPlayer()); // sets players in GameStart file to MainGame file palyers
			    		MainGame.setMaxX(GameStart.getMaxX());
			    		MainGame.setMaxY(GameStart.getMaxY());
			    		MainGame.setPlayerAlive(GameStart.getPlayCount()); // sets player alive in maingame to amount of players
			    		game.Game();	
					}
	    		}
	    		else
	    		{
	    			
	    		}

			}
	    });
		
	}
	/**
	 * returns player list
	 * @return
	 */
	public static ArrayList<Player> getPlayer() {
		return player;
	}
	/**
	 * sets player list
	 * @param player
	 */
	public void setPlayer(ArrayList<Player> player) {
		GameStart.player = player;
	}
	/**
	 * gets palyer count
	 * @return
	 */
	public static int getPlayCount() {
		return playCount;
	}
	/**
	 * sets playerCount
	 * @param playCount
	 */
	public static void setPlayCount(int playCount) {
		GameStart.playCount = playCount;
	}
	/**
	 * returns listList
	 * @return
	 */
	public static ArrayList<ArrayList<Item>> getListList() {
		return listList;
	}
	/**
	 * sets listList
	 * @param listList
	 */
	public static void setListList(ArrayList<ArrayList<Item>> listList) {
		GameStart.listList = listList;
	}
	public static int getMaxX() {
		return maxX;
	}
	public static void setMaxX(int maxX) {
		GameStart.maxX = maxX;
	}
	public static int getMaxY() {
		return maxY;
	}
	public static void setMaxY(int maxY) {
		GameStart.maxY = maxY;
	}
	public static int getI() {
		return i;
	}
	public static void setI(int i) {
		GameStart.i = i;
	}


}
