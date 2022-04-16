/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * This file is used to check the players XP against the required XP for the lvl up method to run. If the player has the right amount of XP
 * then the player will lvl up if not then he will not.
 */
package gameMethods;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import battleMode.PVPMode;
import console.PlayerEntry;
import gameMethods.DeathCheck.confirmDeath;
import getsetStats.StatAdd;
import getsetStats.StatAddIndx2;
import getsetStats.StatSub;
import getsetStats.StatSubIndx2;
import guiComponents.Btns;
import guiComponents.Images;
import guiComponents.PlayerLbls;

import ui.StatDisplay;
import ui.StatDisplayIndx2;

public class CheckLvlMethod {
	
	static private PlayerEntry enter = new PlayerEntry(); // used to get choice for increase in stats
	
	
	
	private static StatAdd add = new StatAdd(); // adds stat of players choice when lvling up
	private StatSub sub = new StatSub(); // removes the XP after the player lvls up
	private static StatDisplay dsp = new StatDisplay(); // displays current player stats

	private StatSubIndx2 subDex2 = new StatSubIndx2(); // instantiates StastSubIndx2 to remove stats from player 2 in pvp mode
	private static StatDisplayIndx2 dspDex2 = new StatDisplayIndx2(); // instantes StatDisplay to display player 2 stats in pvp mode
	private static StatAddIndx2 addDex2 = new StatAddIndx2();
	private static Btns btns = new Btns();
	private static PlayerLbls lbl = new PlayerLbls();
	private static Images img = new Images();
	private static PVPMode pvp = new PVPMode();
	private static MainGame game = new MainGame();
	
	
	private JFrame lvlFrame = new JFrame();
	private JPanel lvlPanel = new JPanel();
	private JLabel lvlLbl = new JLabel();
	private JButton lvlBtn = new JButton();
	
	private ActionListener confirmLvl = new confirmLvl();
	
	private final int lvl2xp = 100; //sets XP required for level 2
	private final int lvl3xp = 200; //sets XP required for level 3
	private final int lvl4xp = 400; //sets XP required for level 4
	private final int lvl5xp = 800; //sets XP required for level 5
	private final int lvl6xp = 1200; //sets XP required for level 6
	private final int lvl7xp = 1600; //sets XP required for level 7
	private final int lvl8xp = 2000; //sets XP required for level 8
	private final int lvl9xp = 2400; //sets XP required for level 9
	private final int lvl10xp = 2800; //sets XP required for level 10 THIS IS THE MAX LVL AS OF 3.31.2019
	
	private static boolean suc = false; //If player attempts to add to stat that is already 10 stays false else becomes true
	
	/**
	 * method used to check for possiblity of levling up
	 * @param p2 
	 */
	public void checkLvlUp(boolean p2) 
	{	
		/**
		 * if statement is rand if states ran if player has XP greater or equal to required XP and is at certain level
		 */
		if(p2)
		{
			if(dspDex2.getXp() >= lvl2xp && dspDex2.getLvl() == 1) // lvl 1 to 2
			{
				subDex2.setXp(lvl2xp); //removes set amount of XP
				lvlUp(p2); // runs lvl up
			}
			if(dspDex2.getXp() >=  lvl3xp && dspDex2.getLvl() == 2) // lvl 2 to 3
			{
				subDex2.setXp(lvl3xp); //removes set amount of XP
				lvlUp(p2);	// runs lvl up
			}
			if(dspDex2.getXp() >= lvl4xp && dspDex2.getLvl() == 3) // lvl 3 to 4
			{
				subDex2.setXp(lvl4xp);//removes set amount of XP
				lvlUp(p2);// runs lvl up
			}
			if(dspDex2.getXp() >= lvl5xp && dspDex2.getLvl() == 4) // lvl 4 to 5
			{
				subDex2.setXp(lvl5xp);//removes set amount of XP
				lvlUp(p2);// runs lvl up
			}
			if(dspDex2.getXp() >= lvl6xp && dspDex2.getLvl() == 5) // lvl 5 to 6
			{
				subDex2.setXp(lvl6xp);//removes set amount of XP
				lvlUp(p2);// runs lvl up
			}
			if(dspDex2.getXp() >= lvl7xp && dspDex2.getLvl() == 6) // lvl 6 to 7
			{
				subDex2.setXp(lvl7xp);//removes set amount of XP
				lvlUp(p2);// runs lvl up
			}
			if(dspDex2.getXp() >= lvl8xp && dspDex2.getLvl() == 7) // lvl 7 to 8
			{
				subDex2.setXp(lvl8xp);//removes set amount of XP
				lvlUp(p2);// runs lvl up
			}
			if(dspDex2.getXp() >= lvl9xp && dspDex2.getLvl() == 8) // lvl 8 to 9
			{
				subDex2.setXp(lvl9xp);//removes set amount of XP
				lvlUp(p2);// runs lvl up
			}
			if(dspDex2.getXp() >= lvl10xp && dspDex2.getLvl() == 9) // lvl 9 to 10
			{
				subDex2.setXp(lvl10xp);//removes set amount of XP
				lvlUp(p2);// runs lvl up
			}
			
		}
		else
		{
			if(dsp.getXp() >= lvl2xp && dsp.getLvl() == 1) // lvl 1 to 2
			{
				sub.setXp(lvl2xp); //removes set amount of XP
				lvlUp(false); // runs lvl up
			}
			if(dsp.getXp() >=  lvl3xp && dsp.getLvl() == 2) // lvl 2 to 3
			{
				sub.setXp(lvl3xp); //removes set amount of XP
				lvlUp(false);	// runs lvl up
			}
			if(dsp.getXp() >= lvl4xp && dsp.getLvl() == 3) // lvl 3 to 4
			{
				sub.setXp(lvl4xp);//removes set amount of XP
				lvlUp(false);// runs lvl up
			}
			if(dsp.getXp() >= lvl5xp && dsp.getLvl() == 4) // lvl 4 to 5
			{
				sub.setXp(lvl5xp);//removes set amount of XP
				lvlUp(false);// runs lvl up
			}
			if(dsp.getXp() >= lvl6xp && dsp.getLvl() == 5) // lvl 5 to 6
			{
				sub.setXp(lvl6xp);//removes set amount of XP
				lvlUp(false);// runs lvl up
			}
			if(dsp.getXp() >= lvl7xp && dsp.getLvl() == 6) // lvl 6 to 7
			{
				sub.setXp(lvl7xp);//removes set amount of XP
				lvlUp(false);// runs lvl up
			}
			if(dsp.getXp() >= lvl8xp && dsp.getLvl() == 7) // lvl 7 to 8
			{
				sub.setXp(lvl8xp);//removes set amount of XP
				lvlUp(false);// runs lvl up
			}
			if(dsp.getXp() >= lvl9xp && dsp.getLvl() == 8) // lvl 8 to 9
			{
				sub.setXp(lvl9xp);//removes set amount of XP
				lvlUp(false);// runs lvl up
			}
			if(dsp.getXp() >= lvl10xp && dsp.getLvl() == 9) // lvl 9 to 10
			{
				sub.setXp(lvl10xp);//removes set amount of XP
				lvlUp(false);// runs lvl up
			}
			
		}
	} // end of method
	/**
	 * runs if player meets required XP
	 */
	public void lvlUp (boolean p2) {		
		/**
		 * DISPLAYS INFORMATION AND CHOICES TO USER FOR WHEN PLAYER LEVELS UP
		 */
		if(p2)
		{
			addDex2.setMaxHp(25); // gives player 25 extra maxHP
			addDex2.setMaxSp(25); // gives player 25 extra MaxSP
			addDex2.setHp(dspDex2.getMaxHp()); // resets current HP to maxHP
			addDex2.setSp(dspDex2.getMaxSp()); // resets current SP to MaxSP
			addDex2.setSkillPoints(1);
			addDex2.setLvl(1);
			lvlWind(pvp.getCurIndx2());
		}
		else
		{
			add.setMaxHp(25); // gives player 25 extra maxHP
			add.setMaxSp(25); // gives player 25 extra MaxSP
			add.setHp(dsp.getMaxHp()); // resets current HP to maxHP
			add.setSp(dsp.getMaxSp()); // resets current SP to MaxSP	
			add.setSkillPoints(1);
			add.setLvl(1);
			lvlWind(game.getCurIndx());
		}
	}
	
	public void lvlWind(int dex)
	{
		lvlPanel.removeAll();
		lvlPanel.repaint();
		
		TitledBorder title;
		Border goldline = BorderFactory.createLineBorder(new Color(255, 215, 0));
		GridBagLayout lvlGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		lvlFrame.setUndecorated(true);
		lvlFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		lvlFrame.setVisible(true);
		lvlFrame.setAlwaysOnTop(true);
		lvlFrame.setAutoRequestFocus(true);
		
		lvlPanel.setLayout(lvlGrid);
		lvlPanel.setBackground(Color.black);
		
		lvlLbl = lbl.getNameLbl();
		
		title = BorderFactory.createTitledBorder(
                goldline, MainGame.getPlayer().get(dex).getPlayName() + " rocks!");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitleColor(new Color(255, 215, 0));
		lvlLbl.setBorder(title);
		lvlLbl.setForeground(new Color(255, 215, 0));
		lvlLbl.setText("<html> " + MainGame.getPlayer().get(dex).getPlayName() + " LEVELED UP!!!<br> "+ MainGame.getPlayer().get(dex).getPlayName()  + 
				" GAINED 1 SKILL POINT! </html>");
		
		lvlBtn = btns.getBtnLay();
		lvlBtn.setText("YOU ROCK!");
		lvlBtn.addActionListener(confirmLvl);
		
		
		lvlFrame.add(lvlPanel);
		gbc.gridy = 0;
		lvlPanel.add(lvlLbl, gbc);
		gbc.gridy = 1;
		lvlPanel.add(img.getImgLvl(), gbc);
		gbc.gridy = 2;
		lvlPanel.add(lvlBtn, gbc);
		
		
		lvlPanel.validate();
		
	}
	public class confirmLvl implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			lvlFrame.dispose();
			lvlBtn.removeActionListener(confirmLvl);
			lvlPanel.removeAll();
			lvlPanel.repaint();
			lvlFrame.dispose();
		}

	}
	
	/**
	 * returns bool suc
	 * @return
	 */
	public static boolean isSuc() {
		return suc;
	}
	/**
	 * sets suc bool
	 * @param suc
	 */
	public static void setSuc(boolean suc) {
		CheckLvlMethod.suc = suc;
	}
	/**
	 * gets Lvl2XP
	 * @return
	 */
	public int getLvl2xp() {
		return lvl2xp;
	}

	/**
	 * gets lvl3XP
	 * @return
	 */
	public int getLvl3xp() {
		return lvl3xp;
	}
	/**
	 * gets lvl4XP
	 * @return
	 */
	public int getLvl4xp() {
		return lvl4xp;
	}
	/**
	 * gets lvl5XP
	 * @return
	 */
	public int getLvl5xp() {
		return lvl5xp;
	}
	/**
	 * gets lvl6XP
	 * @return
	 */
	public int getLvl6xp() {
		return lvl6xp;
	}
	/**
	 * gets lvl7XP
	 * @return
	 */
	public int getLvl7xp() {
		return lvl7xp;
	}
	/**
	 * gets lvl8XP
	 * @return
	 */
	public int getLvl8xp() {
		return lvl8xp;
	}
	/**
	 * gets lvl9XP
	 * @return
	 */
	public int getLvl9xp() {
		return lvl9xp;
	}
	/**
	 * gets lvl10XP
	 * @return
	 */
	public int getLvl10xp() {
		return lvl10xp;
	}


	
}
