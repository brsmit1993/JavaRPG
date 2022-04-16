/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * This file is meant to control the flow of the game when the game is still going.
 */
package gameMethods;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import algorithms.Chance;
import battleMode.MonsterBattle;
import battleMode.PVPMode;
import console.GameStart;
import gameMethods.DisplayStats.addStr;
import getEvent.EventList;
import getEvent.GetSurroundings;
import getEvent.HintEvent;
import getEvent.ListEventInterface;
import getEvent.ShadowPassEvents;
import getsetStats.StatAdd;
import getsetStats.StatSub;
import guiComponents.TutorialWindow;
import inventory.InventoryMethod;
import inventory.Item;
import inventory.ItemList;
import player.Player;

import ui.StatDisplay;
public class MainGame {
	
	static private GameStart end = new GameStart(); // used to display game outro
	private Chance chance = new Chance(); // used to get chance variables
	
	private static EventList list = new EventList(); // used to get and display events
	private static CheckLvlMethod lvl = new CheckLvlMethod(); // used to get check lvl method
	private static CheckPVP checkPvp = new CheckPVP(); // used to enable pvp
	private static PVPMode pvpStart = new PVPMode(); // used to start pvp sequence
	private static DeathCheck checkDeath = new DeathCheck(); // used to check for death of players
	private static StatDisplay dsp = new StatDisplay(); // called to display and get stats from player class
	private static GetSurroundings dir = new GetSurroundings();
	private StatAdd add = new StatAdd(); // adds to players cords
	private StatSub sub = new StatSub(); // subs from palyers cords
	private InventoryMethod inv = new InventoryMethod();
	private DisplayStats statMenu = new DisplayStats();
	private static TutorialWindow tutWin = new TutorialWindow();
	private static MonsterBattle monBat = new MonsterBattle();
	


	private ShadowPassEvents shadow = new ShadowPassEvents();
	
	private static ArrayList<Player> player; // stores list of current players
	private static ArrayList<ListEventInterface> event = list.getEvent(); // calls events from the getEvent file

	private static int curIndx = 0; // set to 0 and increments and resets in method
	static int curPlayer = 1; // set to 1 and increments and resets in method
	private static int playerAlive; // stores current player alive in game
	private static int chanceNum; // stores variable for random events
	private static boolean pvp = false; // set to false and turns to true when two players end up in the same location
	private static int maxX;
	private static int maxY;
	private static int mapSize;
	
	private static JFrame menuFrame = new JFrame("Rpg Simulator");
	private static JPanel menuPanel = new JPanel();
	private SpringLayout laySpr = new SpringLayout();
	
	private static JButton north = new JButton();
	private static JButton south = new JButton();
	private static JButton east = new JButton();
	private static JButton west = new JButton();
	private static JButton invBtn = new JButton("Inventory");
	private static JButton statBtn = new JButton("Stats");
	private static JButton tutBtn = new JButton("Help");
	private static JButton exitBtn = new JButton("Exit");
	private static JLabel tellPlay = new JLabel();
	private static JLabel playerName = new JLabel();
	private static JLabel img;
	
	private static String playName;
	private static String playName2;
	
	/**
	 * This is the method is used to control flow of game as it progresses
	 */
	
	
	public void Game()  {

		
		try {
		    menuFrame.setIconImage(ImageIO.read(getClass().getResourceAsStream("/console/resources/appIcon.jpg")));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		setMapSize(maxX * maxY);

		event.get(0).eventGet(maxX, maxY, 0);
		north.setText("North(" + dir.getNorth() + ")");
		south.setText("South(" + dir.getSouth() + ")");
		west.setText("West(" + dir.getWest() + ")");
		east.setText("East(" + dir.getEast() + ")");
		
		
		
		
		openMenu();
		
		
		
		north.addActionListener(new ActionListener(){
  	
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
	    	if (dir.getNorth().equals("NOTHING"))
	    	{
	    		JFrame no = new JFrame();
	    		no.setSize(300,100);
	    		no.setVisible(true);
	    		JPanel you = new JPanel();
	    		you.setBackground(Color.black);
	    		you.setLayout(new BorderLayout());
	    		JLabel dont = new JLabel("You Can't Go That Way");
	    		dont.setFont(new Font("Courier New", Font.BOLD, 20));
	    		dont.setForeground(Color.white);
	    		no.add(you);
	    		you.add(dont, BorderLayout.CENTER);
	    	}
	    	else
	    	{
	    		add.setCordY(1);
	    		event.get(0).eventGet(maxX, maxY, 0);
	    		north.setText("North(" + dir.getNorth() + ")");
	    		south.setText("South(" + dir.getSouth() + ")");
	    		west.setText("West(" + dir.getWest() + ")");
	    		east.setText("East(" + dir.getEast() + ")");
	    		menuFrame.dispose();
	    		moveEvent();
	    	}
			}
	    });
		
		south.addActionListener(new ActionListener(){  
			
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
		    	if (dir.getSouth().equals("NOTHING"))
		    	{
		    		JFrame no = new JFrame();
		    		no.setSize(300,100);
		    		no.setVisible(true);
		    		JPanel you = new JPanel();
		    		you.setBackground(Color.black);
		    		you.setLayout(new BorderLayout());
		    		JLabel dont = new JLabel("You Can't Go That Way");
		    		dont.setFont(new Font("Courier New", Font.BOLD, 20));
		    		dont.setForeground(Color.white);
		    		no.add(you);
		    		you.add(dont, BorderLayout.CENTER);
		    	}
		    	else
		    	{
		    		sub.setCordY(1);
		    		event.get(0).eventGet(maxX, maxY, 0);
		    		north.setText("North(" + dir.getNorth() + ")");
		    		south.setText("South(" + dir.getSouth() + ")");
		    		west.setText("West(" + dir.getWest() + ")");
		    		east.setText("East(" + dir.getEast() + ")");
		    		menuFrame.dispose();
		    		moveEvent();
		    	}

			}
	    });
		
		east.addActionListener(new ActionListener(){  
			
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
		    	if (dir.getEast().equals("NOTHING"))
		    	{
		    		JFrame no = new JFrame();
		    		no.setSize(300,100);
		    		no.setVisible(true);
		    		JPanel you = new JPanel();
		    		you.setBackground(Color.black);
		    		you.setLayout(new BorderLayout());
		    		JLabel dont = new JLabel("You Can't Go That Way");
		    		dont.setFont(new Font("Courier New", Font.BOLD, 20));
		    		dont.setForeground(Color.white);
		    		no.add(you);
		    		you.add(dont, BorderLayout.CENTER);
		    	}
		    	else
		    	{
		    		add.setCordX(1);
		    		event.get(0).eventGet(maxX, maxY, 0);
		    		north.setText("North(" + dir.getNorth() + ")");
		    		south.setText("South(" + dir.getSouth() + ")");
		    		west.setText("West(" + dir.getWest() + ")");
		    		east.setText("East(" + dir.getEast() + ")");
		    		menuFrame.dispose();
		    		moveEvent();
		    	}

			}
	    });
		
		west.addActionListener(new ActionListener(){  
			
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
		    	if (dir.getWest().equals("NOTHING"))
		    	{
		    		JFrame no = new JFrame();
		    		no.setSize(300,100);
		    		no.setVisible(true);
		    		JPanel you = new JPanel();
		    		you.setBackground(Color.black);
		    		you.setLayout(new BorderLayout());
		    		JLabel dont = new JLabel("You Can't Go That Way");
		    		dont.setFont(new Font("Courier New", Font.BOLD, 20));
		    		dont.setForeground(Color.white);
		    		no.add(you);
		    		you.add(dont, BorderLayout.CENTER);
		    	}
		    	else
		    	{
		    		sub.setCordX(1);
		    		event.get(0).eventGet(maxX, maxY, 0);
		    		north.setText("North(" + dir.getNorth() + ")");
		    		south.setText("South(" + dir.getSouth() + ")");
		    		west.setText("West(" + dir.getWest() + ")");
		    		east.setText("East(" + dir.getEast() + ")");
		    		menuFrame.dispose();
		    		moveEvent();
		    	}

			}
	    });
		
		invBtn.addActionListener(new ActionListener(){  
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
	    		menuFrame.dispose();
	    		inv.invMethod(curIndx, false, false, false);
			}
	    });
		
		statBtn.addActionListener(new ActionListener(){  
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
	    		menuFrame.dispose();
	    		statMenu.displayStats(curIndx, false);
			}
	    });
		
		tutBtn.addActionListener(new ActionListener(){  
			
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
	    		
	    		tutWin.openTutWin();
			}
	    });
		
		exitBtn.addActionListener(new ActionListener(){  
			
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
	    		System.exit(0);
			}
	    });
		
		if (curPlayer > player.size()) // prevents out of range index error
		{
			MainGame.setCurPlayer(1); //resets curPlayer variable
			MainGame.setCurIndx(0); // resets curPlayer variable
		}
		
		


			
		/*	while (playerAlive >= 2)  // runs while at least 2 players are alive
			{
				

						
			

			
			
			
			
			
			
			
			if (player.size() == 1) // runs if 1 player left
			{
				end.setPlayer(MainGame.getPlayer()); // ends game
			}
			
			
			} */
			
	}

	public void moveEvent()
	{
		MainGame.setChanceNum(chance.getChance300(player.get(curIndx).getLuc())); // sets chance after player moves		
		MainGame.setPvp(checkPvp.checkPVP()); // checks to see if pvp needs to be enabled
	

	 
		    if (checkPvp.checkPVP()) 
			{
				pvpStart.pvpBegin(); // runs if pvp was enabled and goes through pvp sequence	
			}
			if (pvp == false) 
			{
			event.get(1).eventGet(maxX, maxY, MainGame.getChanceNum()); // gets battle sequcne
			} 	
	}
	
	public static void runChecks()
	{
		if (player.get(getCurIndx()).getHp() > 0) // if player still alive
		{
		lvl.checkLvlUp(false); // checks for lvl up requirements
		}
		

		checkDeath.checkDeath(); // checks for players deaths
		
	}
	
	public static void refresh()
	{
		menuPanel.removeAll();
		menuPanel.repaint();
	}
	public static void openMenu() {


		
		GridBagLayout menuFrameGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		refresh();

		if (!menuFrame.isUndecorated()) {
			menuFrame.setUndecorated(true);
		}
			menuFrame.setVisible(true);
		
		
		menuFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		menuPanel.setBackground(Color.black);
		menuPanel.setLayout(menuFrameGrid);
		
		north.setPreferredSize(new Dimension(menuFrame.getWidth()-100, menuFrame.getHeight()/15));
		north.setForeground(Color.white);
		north.setBackground(new Color(129, 7, 0));
		north.setFont(new Font("Courier New", Font.BOLD, menuFrame.getWidth()/25));
		
		
		south.setPreferredSize(new Dimension(menuFrame.getWidth()-100, menuFrame.getHeight()/15));
		south.setForeground(Color.white);
		south.setBackground(new Color(129, 7, 0));
		south.setFont(new Font("Courier New", Font.BOLD, menuFrame.getWidth()/25));
		
		
		east.setPreferredSize(new Dimension(menuFrame.getWidth()-100, menuFrame.getHeight()/15));
		east.setForeground(Color.white);
		east.setBackground(new Color(129, 7, 0));
		east.setFont(new Font("Courier New", Font.BOLD, menuFrame.getWidth()/25));
		
		
		west.setPreferredSize(new Dimension(menuFrame.getWidth()-100, menuFrame.getHeight()/15));
		west.setForeground(Color.white);
		west.setBackground(new Color(129, 7, 0));
		west.setFont(new Font("Courier New", Font.BOLD, menuFrame.getWidth()/25));
		
		
		invBtn.setPreferredSize(new Dimension(menuFrame.getWidth()-100, menuFrame.getHeight()/15));
		invBtn.setForeground(Color.white);
		invBtn.setBackground(new Color(129, 7, 0));
		invBtn.setFont(new Font("Courier New", Font.BOLD, menuFrame.getWidth()/25));
		
		
		statBtn.setPreferredSize(new Dimension(menuFrame.getWidth()-100, menuFrame.getHeight()/15));
		statBtn.setForeground(Color.white);
		statBtn.setBackground(new Color(129, 7, 0));
		statBtn.setFont(new Font("Courier New", Font.BOLD, menuFrame.getWidth()/25));
		
		
		tutBtn.setPreferredSize(new Dimension(menuFrame.getWidth()-100, menuFrame.getHeight()/15));
		tutBtn.setForeground(Color.white);
		tutBtn.setBackground(new Color(129, 7, 0));
		tutBtn.setFont(new Font("Courier New", Font.BOLD, menuFrame.getWidth()/25));
		
		
		exitBtn.setPreferredSize(new Dimension(menuFrame.getWidth()-100, menuFrame.getHeight()/15));
		exitBtn.setForeground(Color.white);
		exitBtn.setBackground(new Color(129, 7, 0));
		exitBtn.setFont(new Font("Courier New", Font.BOLD, menuFrame.getWidth()/25));
		
		
		
		playerName = new JLabel(dsp.getName());
		playerName.setForeground(Color.white);
		playerName.setFont(new Font("Courier New", Font.BOLD, menuFrame.getWidth()/24));
		
		
		tellPlay.setText("Make your move...");
		tellPlay.setForeground(Color.white);
		tellPlay.setFont(new Font("Courier New", Font.BOLD, menuFrame.getWidth()/35));
		
		

		img = dsp.getImg();
		

		
		menuFrame.add(menuPanel);
		
	    gbc.gridx = 0;
	    gbc.gridy = 0;
		menuPanel.add(playerName, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 1;
		menuPanel.add(tellPlay, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 2;
		menuPanel.add(getImg(), gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 3;
		menuPanel.add(north, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 4;
		menuPanel.add(south, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 5;
		menuPanel.add(west, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 6;
		menuPanel.add(east, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 7;
		menuPanel.add(invBtn, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 8;
		menuPanel.add(statBtn, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 9;
		menuPanel.add(tutBtn, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 10;
		menuPanel.add(exitBtn, gbc);
		
		
		
		if (MonsterBattle.isExtrFight())
		{
		menuFrame.dispose();
		menuFrame.dispose();
		monBat.monBatWind();
		}
		}
	
	public static void endMove()
	{
		if (MonsterBattle.isExtrFight())
		{
		menuFrame.dispose();
		}
		else
		{
		runChecks();
		if (checkDeath.isDeath())
		{
			checkDeath.setDeath(false);
			MainGame.setCurPlayer(curPlayer + 1); // increments cur player
			if (curPlayer > player.size()) // prevents out of range error
			{
				MainGame.setCurPlayer(1); // resets curplayer to 1
				MainGame.setCurIndx(0); // resets curindx to 0
			}
			else
			{
			MainGame.setCurPlayer(curPlayer - 1); // increments cur player
			}
		}
		else
		{
		MainGame.setCurPlayer(curPlayer + 1); // increments cur player
		MainGame.setCurIndx(curIndx + 1); // increments cur indx
		
		if (curPlayer > player.size()) // prevents out of range error
		{
			MainGame.setCurPlayer(1); // resets curplayer to 1
			MainGame.setCurIndx(0); // resets curindx to 0
		}
		}
		player.get(0).setCordX(0);
		player.get(0).setCordY(0);
		event.get(0).eventGet(maxX, maxY, 0);
		north.setText("North(" + dir.getNorth() + ")");
		south.setText("South(" + dir.getSouth() + ")");
		west.setText("West(" + dir.getWest() + ")");
		east.setText("East(" + dir.getEast() + ")");
		menuPanel.removeAll();
		
		// IF IT WORKS IT WORKS!!!!
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
	    gbc.gridx = 0;
	    gbc.gridy = 0;
		menuPanel.add(playerName, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 1;
		menuPanel.add(tellPlay, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 2;
		menuPanel.add(getImg(), gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 3;
		menuPanel.add(north, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 4;
		menuPanel.add(south, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 5;
		menuPanel.add(west, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 6;
		menuPanel.add(east, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 7;
		menuPanel.add(invBtn, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 8;
		menuPanel.add(statBtn, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 9;
		menuPanel.add(tutBtn, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 10;
		menuPanel.add(exitBtn, gbc);
		}
	}

	
	
	public static JLabel getImg() {
		img = dsp.getImg();
		return img;
	}



	public static void setImg(JLabel img) {
		MainGame.img = img;
	}



	public static ArrayList<Player> getPlayer() {
		return player;
	}

	public static void setPlayer(ArrayList<Player> player) {
		MainGame.player = player;
	}


	public int getCurPlayer() {
		return curPlayer;
	}


	public static void setCurPlayer(int curPlayer) {
		MainGame.curPlayer = curPlayer;
	}
	public static int getCurIndx() {
		return curIndx;
	}


	public static void setCurIndx(int curIndx) {
		MainGame.curIndx = curIndx;
	}


	public int getPlayerAlive() {
		return playerAlive;
	}


	public static void setPlayerAlive(int playerAlive) {
		MainGame.playerAlive = playerAlive;
	}


	public static int getChanceNum() {
		return chanceNum;
	}


	public static void setChanceNum(int chanceNum) {
		MainGame.chanceNum = chanceNum;
	}


	public static boolean isPvp() {
		return pvp;
	}


	public static void setPvp(boolean pvp) {
		MainGame.pvp = pvp;
	}


	public static int getMaxX() {
		return maxX;
	}


	public static void setMaxX(int maxX) {
		MainGame.maxX = maxX;
	}


	public static int getMaxY() {
		return maxY;
	}


	public static void setMaxY(int maxY) {
		MainGame.maxY = maxY;
	}



	public static JFrame getMenuFrame() {
		return menuFrame;
	}



	public static void setMenuFrame(JFrame menuFrame) {
		MainGame.menuFrame = menuFrame;
	}



	public static JLabel getPlayerName() {
		return playerName;
	}



	public static void setPlayerName(JLabel playerName) {
		MainGame.playerName = playerName;
	}

	public static int getMapSize() {
		return mapSize;
	}

	public static void setMapSize(int mapSize) {
		MainGame.mapSize = mapSize;
	}

	public static String getPlayName() {
		return playName;
	}

	public void setPlayName(String playName) {
		this.playName = playName;
	}

	public static String getPlayName2() {
		return playName2;
	}

	public static void setPlayName2(String playName2) {
		MainGame.playName2 = playName2;
	}








}
