/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * This file is used to display stats when player enters stats during battle or in the move menu.
 * This file pulls information from the player list at the currIndx.
 */
package gameMethods;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import getsetStats.StatAdd;
import getsetStats.StatSub;
import guiComponents.Btns;
import guiComponents.PlayerLbls;

import ui.StatDisplay;
import ui.StatDisplayIndx2;

public class DisplayStats {

	private CheckLvlMethod lvl = new CheckLvlMethod(); // used to pull XP requirements for each lvl
	private StatDisplay dsp = new StatDisplay(); // used to display players current stats from player list at CurrIndx
	private StatDisplayIndx2 dspDex2 = new StatDisplayIndx2(); // instantes StatDisplay to display player 2 stats in pvp mode
	private Btns btnDes = new Btns();
	private PlayerLbls lblDes = new PlayerLbls();
	private static MainGame game = new MainGame(); // stores main game state
	private static StatAdd add = new StatAdd(); // adds stat of players choice when lvling up
	private StatSub sub = new StatSub(); // removes the XP after the player lvls up
	
	private String xpGoal;
	
	/**
	 * gui stuff
	 */
	
	private JFrame statMenu = new JFrame("RPG Simulator");
	private JPanel statPanel1 = new JPanel();
	
	private JLabel playerName = new JLabel();
	private JLabel skillLbl = new JLabel();
	private JLabel hpLbl = new JLabel();
	private JLabel spLbl = new JLabel();
	private JLabel strLbl = new JLabel();
	private JLabel defLbl = new JLabel();
	private JLabel spdLbl = new JLabel();
	private JLabel smaLbl = new JLabel();
	private JLabel lucLbl = new JLabel();
	private JLabel lvlLbl = new JLabel();
	private JLabel xpLbl = new JLabel();
	
	private JButton retBtn = new JButton();
	private JButton strBtn = new JButton();
	private JButton defBtn = new JButton();
	private JButton spdBtn = new JButton();
	private JButton smaBtn = new JButton();
	private JButton lucBtn = new JButton();
	
	private ActionListener addStr = new addStr();
	private ActionListener addDef = new addDef();
	private ActionListener addSpd = new addSpd();
	private ActionListener addLuc = new addLuc();
	private ActionListener addSma = new addSma();
	
	/**
	 * Literally does what it says. :D
	 * @param p2 
	 * @param dex2 
	 */
	public void displayStats(int dex2, boolean p2) {
		
		GridBagLayout statGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		/**
		 *  dispalys stats and users name based on currIndx in Main Game
		 */
		
		try {
		    statMenu.setIconImage(ImageIO.read(getClass().getResourceAsStream("/console/resources/appIcon.jpg")));
		} catch (IOException e) {
		    e.printStackTrace();
		}	
		
	statMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	statMenu.setSize(450,750);
	statMenu.setVisible(true);
	
	
	
	statPanel1.setBackground(Color.black);
	statPanel1.setLayout(statGrid);
	
	
	statMenu.add(statPanel1);
	
	
	playerName = lblDes.getNameLbl();
	playerName.setText(dsp.getName());
	
	skillLbl = lblDes.getStatLbl();
	skillLbl.setText("Skill Points:" + dsp.getSkillPoints());
	
	hpLbl = lblDes.getStatLbl();
	hpLbl.setText("HP:" + dsp.getHp() + "/" + dsp.getMaxHp());
	
	spLbl = lblDes.getStatLbl();
	spLbl.setText("SP:" + dsp.getSp() + "/" + dsp.getMaxSp());

	strLbl = lblDes.getStatLbl();
	strLbl.setText("Strength:" + dsp.getStr() + "/10");

	defLbl = lblDes.getStatLbl();
	defLbl.setText("Defense:" + dsp.getDef() + "/10");
	
	smaLbl = lblDes.getStatLbl();
	smaLbl.setText("Intelligence:" + dsp.getSma() + "/10");
	
	spdLbl = lblDes.getStatLbl();
	spdLbl.setText("Speed:" + dsp.getSpd() + "/10");
	
	lucLbl = lblDes.getStatLbl();
	lucLbl.setText("Luck:" + dsp.getLuc() + "/10");
	
	lvlLbl = lblDes.getStatLbl();
	lvlLbl.setText("Level:" + dsp.getLvl() + "/10");

	xpLbl = lblDes.getStatLbl();
	xpLbl.setText("XP:" + dsp.getXp() + "/" + getXpGoal());
	
	retBtn = btnDes.getBtnLay();
	retBtn.setText("Return");
	
	strBtn.setText("+");
	strBtn.setPreferredSize(new Dimension(50, 50));
	strBtn.setForeground(Color.white);
	strBtn.setBackground(new Color(129, 7, 0));
	strBtn.setFont(new Font("Courier New", Font.BOLD, 20));
	
	defBtn.setText("+");
	defBtn.setPreferredSize(new Dimension(50, 50));
	defBtn.setForeground(Color.white);
	defBtn.setBackground(new Color(129, 7, 0));
	defBtn.setFont(new Font("Courier New", Font.BOLD, 20));
	
	spdBtn.setText("+");
	spdBtn.setPreferredSize(new Dimension(50, 50));
	spdBtn.setForeground(Color.white);
	spdBtn.setBackground(new Color(129, 7, 0));
	spdBtn.setFont(new Font("Courier New", Font.BOLD, 20));
	
	smaBtn.setText("+");
	smaBtn.setPreferredSize(new Dimension(50, 50));
	smaBtn.setForeground(Color.white);
	smaBtn.setBackground(new Color(129, 7, 0));
	smaBtn.setFont(new Font("Courier New", Font.BOLD, 20));
	
	lucBtn.setText("+");
	lucBtn.setPreferredSize(new Dimension(50, 50));
	lucBtn.setForeground(Color.white);
	lucBtn.setBackground(new Color(129, 7, 0));
	lucBtn.setFont(new Font("Courier New", Font.BOLD, 20));
	
	
	
	
	gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 0;
    statPanel1.add(playerName, gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    statPanel1.add(skillLbl, gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    statPanel1.add(dsp.getImg(), gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    statPanel1.add(hpLbl, gbc);
    gbc.gridx = 1;
    gbc.gridy = 4;
    statPanel1.add(spLbl, gbc);
    gbc.gridx = 1;
    gbc.gridy = 5;
    statPanel1.add(lvlLbl, gbc);
    gbc.gridx = 1;
    gbc.gridy = 6;
    statPanel1.add(xpLbl, gbc);
    gbc.gridx = 1;
    gbc.gridy = 7;
    statPanel1.add(strLbl, gbc);
    gbc.gridx = 1;
    gbc.gridy = 8;
    statPanel1.add(defLbl, gbc);
    gbc.gridx = 1;
    gbc.gridy = 9;
    statPanel1.add(smaLbl, gbc);
    gbc.gridx = 1;
    gbc.gridy = 10;
    statPanel1.add(spdLbl, gbc);
    gbc.gridx = 1;
    gbc.gridy = 11;
    statPanel1.add(lucLbl, gbc);
    gbc.gridx = 1;
    gbc.gridy = 12;
    statPanel1.add(retBtn, gbc);
    gbc.gridx = 0;
    gbc.gridy = 7;
    statPanel1.add(strBtn, gbc);
    gbc.gridx = 0;
    gbc.gridy = 8;
    statPanel1.add(defBtn, gbc);
    gbc.gridx = 0;
    gbc.gridy = 9;
    statPanel1.add(smaBtn, gbc);
    gbc.gridx = 0;
    gbc.gridy = 10;
    statPanel1.add(spdBtn, gbc);
    gbc.gridx = 0;
    gbc.gridy = 11;
    statPanel1.add(lucBtn, gbc);
    
    statPanel1.validate();
  
    
    retBtn.addActionListener(new ActionListener(){  
    	@Override
		public void actionPerformed(ActionEvent arg0) 
		{
    		statPanel1.removeAll();
    		statMenu.dispose();
    		MainGame.openMenu();
    		
    		strBtn.removeActionListener(addStr);
    		defBtn.removeActionListener(addDef);
    		smaBtn.removeActionListener(addSma);
    		spdBtn.removeActionListener(addSpd);
    		lucBtn.removeActionListener(addLuc);
    		
		}
    });
	
    strBtn.addActionListener(addStr);
	defBtn.addActionListener(addDef);
	spdBtn.addActionListener(addSpd);
	smaBtn.addActionListener(addSma);
	lucBtn.addActionListener(addLuc);
 	
	statPanel1.validate();
	statMenu.validate();

	}

	public String getXpGoal() {
		switch (dsp.getLvl()) {
		case 1:
			xpGoal =  Integer.toString(lvl.getLvl2xp());
			break;
		case 2:
			xpGoal =  Integer.toString(lvl.getLvl3xp());
			break;
		case 3: 
			xpGoal =  Integer.toString(lvl.getLvl4xp());
			break;
		case 4: 
			xpGoal =  Integer.toString(lvl.getLvl5xp());
			break;
		case 5:
			xpGoal =  Integer.toString(lvl.getLvl6xp());
			break;
		case 6:
			xpGoal =  Integer.toString(lvl.getLvl7xp());
			break;
		case 7:
			xpGoal =  Integer.toString(lvl.getLvl8xp());
			break;
		case 8:
			xpGoal =  Integer.toString(lvl.getLvl9xp());
			break;
		case 9:
			xpGoal =  Integer.toString(lvl.getLvl10xp());
			break;
		}
		return xpGoal;
	}
	


	public JFrame getStatMenu() {
		return statMenu;
	}

	public void setStatMenu(JFrame statMenu) {
		this.statMenu = statMenu;
	}

	public JLabel getSkillLbl() {
		return skillLbl;
	}

	public void setSkillLbl(JLabel skillLbl) {
		this.skillLbl = skillLbl;
	}

	public JLabel getStrLbl() {
		return strLbl;
	}

	public void setStrLbl(JLabel strLbl) {
		this.strLbl = strLbl;
	}
	
	public class addStr extends AbstractAction  {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			if (dsp.getStr() < 10 && dsp.getSkillPoints() > 0)
			{
				add.setStr(1);
				sub.setSkillPoint(1);
				strLbl.setText("Strength:" + dsp.getStr() + "/10");
    			skillLbl.setText("Skill Points:" + dsp.getSkillPoints());
			}
			
		}

	}
	
	public class addDef extends AbstractAction  {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
    		if (dsp.getDef() < 10 && dsp.getSkillPoints() > 0)
    		{
    			add.setDef(1);
    			sub.setSkillPoint(1);
    			defLbl.setText("Defense:" + dsp.getDef() + "/10");
    			skillLbl.setText("Skill Points:" + dsp.getSkillPoints());
    		}
			
		}

	}
	
	public class addSma extends AbstractAction  {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
    		if (dsp.getSma() < 10 && dsp.getSkillPoints() > 0)
    		{
    			add.setSma(1);
    			sub.setSkillPoint(1);
    			smaLbl.setText("Intelligence:" + dsp.getSma() + "/10");
    			skillLbl.setText("Skill Points:" + dsp.getSkillPoints());
    		}
			
		}

	}
	
	public class addSpd extends AbstractAction  {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
    		if (dsp.getSpd() < 10 && dsp.getSkillPoints() > 0)
    		{
    			add.setSpd(1);
    			sub.setSkillPoint(1);
    			spdLbl.setText("Speed:" + dsp.getSpd() + "/10");
    			skillLbl.setText("Skill Points:" + dsp.getSkillPoints());
    		}
			
		}

	}
	
	public class addLuc extends AbstractAction  {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
    		if (dsp.getLuc() < 10 && dsp.getSkillPoints() > 0)
    		{
    			add.setLuc(1);
    			sub.setSkillPoint(1);
    			lucLbl.setText("Luck:" + dsp.getLuc() + "/10");
    			skillLbl.setText("Skill Points:" + dsp.getSkillPoints());
    		}
			
		}

	}
}
