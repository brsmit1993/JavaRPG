/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * This file is ran when a player encounters a monster. This file dictates how the fight will proceed based on the players choice as well as the mosnters stats.
 * This file also contains the code System.Exit(0) and in the instance the player defeats the gobling king/ mosnter at indx 10 of monster list the game will end
 * with that player declared the winner.
 */
package battleMode;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import algorithms.BattleAlgorithms;
import console.PlayerEntry;
import gameMethods.CheckLvlMethod;
import gameMethods.DisplayWinner;
import gameMethods.MainGame;
import getEvent.HintEvent.endMoveHint;
import getsetStats.MonStatSub;
import getsetStats.StatAdd;
import getsetStats.StatSub;
import guiComponents.Btns;
import guiComponents.PlayerLbls;
import inventory.InventoryMethod;
import monsters.Monster;
import monsters.MonsterList;
import player.CallAbility;

import ui.MonStatDisplay;
import ui.StatDisplay;

public class MonsterBattle {
	
	private static Random rand = new Random(); // called for random generation of numbers
	private static MainGame game = new MainGame(); // called for finding curindx
	private static PlayerEntry enter = new PlayerEntry(); // called to get players choices
	private BattleAlgorithms batChance = new BattleAlgorithms(); // called to find dmg through algorithms
	private CheckLvlMethod lvl = new CheckLvlMethod(); // called to dispaly required XP for each lvl after battle
	private StatAdd add = new StatAdd(); // called to add stats to player class
	private StatSub sub = new StatSub(); // called to subtract stats from player class
	private StatDisplay dsp = new StatDisplay(); // called to display and get stats from player class
	private MonStatDisplay monDsp = new MonStatDisplay(); // called to dispaly current monsters stats
	private MonStatSub monSub = new MonStatSub(); // called to subtract current monsters stats
	private CallAbility call = new CallAbility(); // called to call abilities when player chooses to

	private static InventoryMethod inv = new InventoryMethod(); // called to get random item after battle
	private static Btns btns = new Btns();
	private static PlayerLbls lbl = new PlayerLbls();
	private DisplayWinner win = new DisplayWinner();

	
	
	private static ArrayList<Monster> monster; //where the mosnter is called from through out the battle
	
	
	private static int monsIndx; // used to call mosnter from mosnter list
	private final int baseAttack = 2; // sets base attack to 2 damage
	private int chance; // used for escape method
	private static int damage; // set through out the battle based on occurences
	
	/**
	 * GUI Stuff
	 */
	
	private static JFrame monBatFrame = new JFrame("RPG Simulator");
	private static JPanel monBatPanel1 = new JPanel();
	private static JPanel monBatPanel2 = new JPanel();
	private static JPanel monBatPanel3 = new JPanel();
	private static JPanel monBatPanel4 = new JPanel();
	
	private static JLabel playNameLbl1 = new JLabel();
	private static JLabel playImgLbl = new JLabel();
	private static  JLabel playHpLbl = new JLabel();
	private static  JLabel playSpLbl = new JLabel();
	private static  JLabel playStrLbl = new JLabel();
	private static  JLabel playDefLbl = new JLabel();
	private static  JLabel playSmaLbl = new JLabel();
	private static  JLabel playSpdLbl = new JLabel();
	private static  JLabel playLucLbl = new JLabel();

	private static  JLabel monNameLbl = new JLabel();
	private static  JLabel monImgLbl = new JLabel();
	private static  JLabel monHpLbl = new JLabel();
	private static  JLabel monSpLbl = new JLabel();
	private static  JLabel monStrLbl = new JLabel();
	private static  JLabel monDefLbl = new JLabel();
	private static  JLabel monSmaLbl = new JLabel();
	private static  JLabel monSpdLbl = new JLabel();
	private static  JLabel monLucLbl = new JLabel();
	
	private static  JLabel monDesc = new JLabel();
	private static  JLabel monMoveLbl = new JLabel();
	private static  JLabel playMoveLbl = new JLabel();
	
	private static  JButton attackBtn = new JButton();
	private static  JButton ability1Btn = new JButton();
	private static  JButton ability2Btn = new JButton();
	private static  JButton ability3Btn = new JButton();
	private static  JButton invBtn = new JButton();
	private static  JButton runBtn = new JButton();
	
	/**
	 * monster death winodw.
	 */
	JFrame monDeadFrame = new JFrame("RPG Simulator");
	JPanel monDeadPanel = new JPanel();
	JLabel monDeadLbl = new JLabel();
	JButton monDeadBtn = new JButton();
	
	private ActionListener attackListener = new attackListener();
	private ActionListener ability1Listener = new ability1Listener();
	private ActionListener ability2Listener = new ability2Listener();
	private ActionListener ability3Listener = new ability3Listener();
	private ActionListener invListener = new invListener();
	private ActionListener runListener = new runListener();
	private ActionListener endMove = new endMoveMonBat();
	private static boolean extrFight;
	
	

	
	/**
	 * 
	 * @param battleDif
	 * this is the monster fight method. this method calls battleDif from the location file and based on the players location and a randomly generated number
	 * selects a monster for the player to fight
	 * @throws InterruptedException 
	 */
	public void monsterFight(int battleDif, boolean extrFight)  // calls battle difficulty from current location file
	{
		
		try {
		    monBatFrame.setIconImage(ImageIO.read(getClass().getResourceAsStream("/console/resources/appIcon.jpg")));
		} catch (IOException e) {
		    e.printStackTrace();
		}		
		try {
		    monDeadFrame.setIconImage(ImageIO.read(getClass().getResourceAsStream("/console/resources/appIcon.jpg")));
		} catch (IOException e) {
		    e.printStackTrace();
		}
	MonsterBattle.setExtrFight(extrFight);
	MonsterList monList = new MonsterList();	// generates a new list to reset stats everytime the monsterfight method is called
	monster = monList.getMonster(); // sets the array list monster to the new monster list
	
	
	
	switch(battleDif) // switch generates a number based on the battle dif
	{
		case 1:
			MonsterBattle.setMonsIndx(rand.nextInt((12 - 1) + 1) + 1); // generates number between 1 - 12
			break;
		case 2:
			MonsterBattle.setMonsIndx(rand.nextInt((21 - 13) + 1) + 13); // generates number between 13 - 21
			break;
		case 3:
			MonsterBattle.setMonsIndx(rand.nextInt((31 - 21) + 1) + 21); // generates number between 21 - 31
			break;	
		default:
			MonsterBattle.setMonsIndx(0); // if battle dif is higher then 3 calles the Goblin King
	} //end of switch

	
	
	monBatWind();
	if (monDsp.getHp() > 0 && monDsp.getSpd() > dsp.getSpd() && dsp.getHp() > 0) // if monster has high speed then the mosnter attacks firsts
	{
		monAttack();
	}

	} // end of method

	public void monAttack()
	{
		if (monDsp.getHp() >= 1 && dsp.getHp() >= 1) // if mosnter and player are still alive monster attacks again
		{
			setDamage(baseAttack + batChance.dmgModMonst(monDsp.getStr(), monDsp.getLuc(), dsp.getDef())); // sets damage based on mosnters strength and players defens and luck
			sub.setHp(getDamage()); // removes players hit points based on damage
			playHpLbl.setText("HP:" + dsp.getHp() + "/" + dsp.getMaxHp());
			monMoveLbl.setText(monDsp.getName() + " did " + damage + " damage.");
			if (dsp.getHp() <= 0)
			{
				extrFight = false;
				MainGame.endMove();
				MainGame.openMenu();
				monDeadFrame.dispose();
				monBatFrame.dispose();
				refresh();	
			}
		}
	}
	
	public void refresh()
	{
		monBatPanel1.removeAll();
		monBatPanel2.removeAll();
		monBatPanel3.removeAll();
		monBatPanel4.removeAll();
		monDeadPanel.removeAll();
		monBatPanel1.repaint();
		monBatPanel2.repaint();
		monBatPanel3.repaint();
		monBatPanel4.repaint();
		monDeadPanel.repaint();
		attackBtn.removeActionListener(attackListener);
		ability1Btn.removeActionListener(ability1Listener);
		ability2Btn.removeActionListener(ability2Listener);
		ability3Btn.removeActionListener(ability3Listener);
		invBtn.removeActionListener(invListener);
		runBtn.removeActionListener(runListener);
		monDeadBtn.removeActionListener(endMove);
	}
	
	public void monBatWind()  
	{
		refresh();
		
		GridBagLayout playGrid = new GridBagLayout();
		GridBagLayout monGrid = new GridBagLayout();
		GridBagLayout btnGrid = new GridBagLayout();
		GridBagLayout panelGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		TitledBorder title;
		Border redline = BorderFactory.createLineBorder(Color.red);
		monBatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		monBatFrame.setSize(1000, 1000);
		monBatFrame.setVisible(true);
		
		
		monBatPanel1.setBackground(Color.black);
		monBatPanel2.setBackground(Color.black);
		monBatPanel3.setBackground(Color.black);
		monBatPanel4.setBackground(Color.black);
	
		monBatPanel4.setLayout(panelGrid);

		
		title = BorderFactory.createTitledBorder(
                redline, dsp.getName() + "s last move");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitleColor(Color.white);
		playMoveLbl.setBorder(title);
		playMoveLbl.setText("no attack yet");
		playMoveLbl.setForeground(Color.white);
		
		playImgLbl = dsp.getImg();
		
		playNameLbl1 = MainGame.getPlayerName();
		playNameLbl1.setFont(new Font("Courier New", Font.BOLD, 35));
		
		playHpLbl = lbl.getStatLbl();
		playHpLbl.setText("HP:" + dsp.getHp() + "/" + dsp.getMaxHp());
		
		playSpLbl = lbl.getStatLbl();
		playSpLbl.setText("SP:" + dsp.getSp() + "/" + dsp.getMaxSp());
		
		playStrLbl = lbl.getStatLbl();
		playStrLbl.setText("Strength:" + dsp.getStr() + "/" + "10");
		
		playDefLbl = lbl.getStatLbl();
		playDefLbl.setText("Defense:" + dsp.getDef() + "/" + "10");
		
		playSmaLbl = lbl.getStatLbl();
		playSmaLbl.setText("Intelligence:" + dsp.getSma() + "/" + "10");
		
		playSpdLbl = lbl.getStatLbl();
		playSpdLbl.setText("Speed:" + dsp.getSpd() + "/" + "10");
		
		playLucLbl = lbl.getStatLbl();
		playLucLbl.setText("Luck:" + dsp.getLuc() + "/" + "10");
	
		
	
		title = BorderFactory.createTitledBorder(
                redline, monDsp.getName() + "s last move");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitleColor(Color.white);
		
		monMoveLbl.setBorder(title);
		monMoveLbl.setText("no attack yet");
		monMoveLbl.setForeground(Color.white);
		
		monNameLbl = lbl.getNameLbl();
		monNameLbl.setText(monDsp.getName());
		
		monImgLbl = monDsp.getImg();
		
		monHpLbl = lbl.getStatLbl();
		monHpLbl.setText("HP:" + monDsp.getHp());
		
		monSpLbl = lbl.getStatLbl();
		monSpLbl.setText("SP:" + monDsp.getSp());
		
		monStrLbl = lbl.getStatLbl();
		monStrLbl.setText("Strength:" + monDsp.getStr() + "/" + "10");
		
		monDefLbl = lbl.getStatLbl();
		monDefLbl.setText("Defense:" + monDsp.getDef() + "/" + "10");
		
		monSmaLbl = lbl.getStatLbl();
		monSmaLbl.setText("Intelligence:" + monDsp.getSma() + "/" + "10");
		
		monSpdLbl = lbl.getStatLbl();
		monSpdLbl.setText("Speed:" + monDsp.getSpd() + "/" + "10");
		
		monLucLbl = lbl.getStatLbl();
		monLucLbl.setText("Luck:" + monDsp.getLuc() + "/" + "10");
		
		attackBtn = btns.getBtnLay();
		attackBtn.setText("Attack");
		attackBtn.addActionListener(attackListener);
		
		ability1Btn = btns.getBtnLay();
		ability1Btn.setText(dsp.getAbil1());
		ability1Btn.addActionListener(ability1Listener);
		
		ability2Btn = btns.getBtnLay();
		ability2Btn.setText(dsp.getAbil2());
		ability2Btn.addActionListener(ability2Listener);
		
		ability3Btn = btns.getBtnLay();
		ability3Btn.setText(dsp.getAbil3());
		ability3Btn.addActionListener(ability3Listener);
		ability3Btn.setPreferredSize(new Dimension(300, 50));
		
		invBtn = btns.getBtnLay();
		invBtn.setText("Inventory");
		invBtn.addActionListener(invListener);
		
		runBtn = btns.getBtnLay();
		runBtn.setText("RUN");
		runBtn.addActionListener(runListener);
		
		monBatPanel1.setLayout(playGrid);
		gbc.gridx = 0;
		gbc.gridy = 0;
		monBatPanel1.add(playNameLbl1, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		monBatPanel1.add(playImgLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		monBatPanel1.add(playHpLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		monBatPanel1.add(playSpLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		monBatPanel1.add(playStrLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		monBatPanel1.add(playDefLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 6;
		monBatPanel1.add(playSmaLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 7;
		monBatPanel1.add(playSpdLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 8;
		monBatPanel1.add(playLucLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 9;
		monBatPanel1.add(playMoveLbl, gbc);
		
		monBatPanel2.setLayout(btnGrid);
		gbc.gridx = 0;
		gbc.gridy = 0;
		monBatPanel2.add(attackBtn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		monBatPanel2.add(ability1Btn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		monBatPanel2.add(ability2Btn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		monBatPanel2.add(ability3Btn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		monBatPanel2.add(invBtn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		monBatPanel2.add(runBtn, gbc);
		
		monBatPanel3.setLayout(monGrid);
		gbc.gridx = 0;
		gbc.gridy = 0;
		monBatPanel3.add(monNameLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		monBatPanel3.add(monImgLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		monBatPanel3.add(monHpLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		monBatPanel3.add(monSpLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		monBatPanel3.add(monStrLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		monBatPanel3.add(monDefLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 6;
		monBatPanel3.add(monSmaLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 7;
		monBatPanel3.add(monSpdLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 8;
		monBatPanel3.add(monLucLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 9;
		monBatPanel3.add(monMoveLbl, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		monBatPanel4.add(monBatPanel1, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		monBatPanel4.add(monBatPanel2, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		monBatPanel4.add(monBatPanel3, gbc);
		monBatFrame.add(monBatPanel4);
		

		
		monBatPanel1.validate();
		monBatPanel2.validate();
		monBatPanel3.validate();
		monBatPanel4.validate();
		monBatFrame.pack();
		
		
		
	}
	
	public void monDeath()
	{	
		
		GridBagLayout monDeadGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		if(monster.get(0).getHp() <= 0)
		{
			win.winWind(MainGame.getCurIndx());
		}
		if(monDsp.getHp() <= 0) { 
		extrFight = false;
		refresh();
		monBatFrame.dispose();
		refresh();
		add.setXp(monDsp.getXp());
		inv.addRandItem();
		add.setGold(50);
		
		monDeadFrame.setSize(500,300);
		monDeadFrame.setVisible(true);
		monDeadPanel.setBackground(Color.black);
		monDeadPanel.setLayout(monDeadGrid);
		monDeadBtn = btns.getBtnLay();
		monDeadBtn.setText("End Turn");
		String info = "<html><center> Congrats you killed the " + monDsp.getName() + "<br> Xp Gained: " + monDsp.getXp() + "<br> Gold Gained: 50 <br> "
				+ "The monster also dropped some loot. </center> </html>";
		monDeadLbl = lbl.getStatLbl();
		monDeadLbl.setText(info);
		monDeadLbl.setBounds(0, 0, 500, 300);

		monDeadFrame.add(monDeadPanel);
		gbc.gridx = 0;
		gbc.gridy = 1;
		monDeadPanel.add(monDeadBtn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 0;
		monDeadPanel.add(monDeadLbl, gbc);
		
		monDeadBtn.addActionListener(endMove);
		monDeadPanel.validate();
		monDeadFrame.pack();
	}
		
	}
	public class endMoveMonBat extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{

			MainGame.endMove();
			MainGame.openMenu();
			monDeadFrame.dispose();
			monBatFrame.dispose();
			refresh();
		}	
	}
	
	public class attackListener extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
		setDamage(baseAttack + batChance.dmgModPlayBase(dsp.getStr(), dsp.getLuc(), monDsp.getDef()));
		monSub.setHp(damage);
		monHpLbl.setText("HP:" + monDsp.getHp());
		
		playMoveLbl.setText(dsp.getName() + " did " + damage + " damage.");
		monAttack();
		monDeath();
		}
	}
	
	public class ability1Listener extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			
			if(dsp.getSp() >= 10)
			{
			setDamage(call.callAbil1(game.getCurIndx(), false)); // calls ability 1 from player class
			playMoveLbl.setText(dsp.getName() + " did " + damage + " damage.");
			monSub.setHp(damage);
			monHpLbl.setText("HP:" + monDsp.getHp());
			playSpLbl.setText("SP:" + dsp.getSp() + "/" + dsp.getMaxSp());
			}
			else
			{
			playMoveLbl.setText(dsp.getName() + "s ability failed.");	
			}
			monAttack();
			monDeath();
		}
	}		
	
	public class ability2Listener extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			
			if(dsp.getSp() >= 25)
			{
			setDamage(call.callAbil2(game.getCurIndx(), false)); // calls ability 2 from player class
			playMoveLbl.setText(dsp.getName() + " did " + damage + " damage.");
			monSub.setHp(damage);
			monHpLbl.setText("HP:" + monDsp.getHp());
			playSpLbl.setText("SP:" + dsp.getSp() + "/" + dsp.getMaxSp());
			}
			else
			{
			playMoveLbl.setText(dsp.getName() + "s ability failed.");	
			}
			monAttack();
			monDeath();
		}
	}
	
	public class ability3Listener extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			
			if(dsp.getSp() >= 50)
			{
			setDamage(call.callAbil3(game.getCurIndx(), false)); // calls ability 3 from player class
			playMoveLbl.setText(dsp.getName() + " did " + damage + " damage.");
			monSub.setHp(damage);
			monHpLbl.setText("HP:" + monDsp.getHp());
			playSpLbl.setText("SP:" + dsp.getSp() + "/" + dsp.getMaxSp());
			}
			else
			{
			playMoveLbl.setText(dsp.getName() + "s ability failed.");	
			}
			monAttack();
			monDeath();
		}
	}
	
	public class invListener extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			monBatFrame.dispose();
			inv.invMethod(game.getCurIndx(), false, true, false);
		}
	}
	
	public class runListener extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			chance = batChance.escapeChance(dsp.getLuc(), monDsp.getLuc()); // if the palyer is a coward gets chance for escape
			if (chance > 20) // if the chance is greater then 20 then player escapes
			{
				extrFight = false;
				MainGame.endMove();
				MainGame.openMenu();
				monBatFrame.dispose();
				refresh();
			}
			else
			{
				playMoveLbl.setText(dsp.getName() + " failed to escape!!!");
				monAttack();
			}
		}
	}

	
	/**
	 * 
	 * @return
	 * returns damage int
	 */
	public int getDamage() {
		return damage;
	}
/**
 * 
 * @param damage
 * sets damage int
 */
	public static void setDamage(int damage) {
		MonsterBattle.damage = damage;
	}
	/**
	 * 
	 * @return
	 * returns monster arraylist
	 */
	public static ArrayList<Monster> getMonster() {
		return monster;
	}
	/**
	 * 
	 * @return
	 * gets monster index number
	 */
	public int getMonsIndx() {
		return monsIndx;
	}
	/**
	 * 
	 * @param monsIndx
	 * sets monsters index
	 */
	public static void setMonsIndx(int monsIndx) {
		MonsterBattle.monsIndx = monsIndx;
	}
	public static void setMonster(ArrayList<Monster> monster) {
		MonsterBattle.monster = monster;
	}

	public static boolean isExtrFight() {
		return extrFight;
	}

	public static void setExtrFight(boolean extrFight) {
		MonsterBattle.extrFight = extrFight;
	}
	
	
	} //end of class
