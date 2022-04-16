/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * This file controls what happens when two players enter into PVP.
 */

package battleMode;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.html.ImageView;

import algorithms.BattleAlgorithms;
import gameMethods.CheckPVP;
import gameMethods.MainGame;
import getsetStats.StatSub;
import getsetStats.StatSubIndx2;
import guiComponents.Btns;
import guiComponents.PlayerLbls;
import inventory.InventoryMethod;
import player.CallAbility;

import ui.StatDisplay;
import ui.StatDisplayIndx2;



public class PVPMode {
	
	private static MainGame game = new MainGame();// instanties MainGame class
	private CheckPVP pvp = new CheckPVP(); // insantiates CheckPVP class

	
	private BattleAlgorithms batChance = new BattleAlgorithms(); // insantiates BattleAlgorithms to calcualte damage
	private StatSub sub = new StatSub(); // instantiates StatSub to remove stats from current player
	private StatDisplay dsp = new StatDisplay(); // instantiates StatDisplay to call and display current player stats

	private StatSubIndx2 subDex2 = new StatSubIndx2(); // instantiates StastSubIndx2 to remove stats from player 2 in pvp mode
	private StatDisplayIndx2 dspDex2 = new StatDisplayIndx2(); // instantes StatDisplay to display player 2 stats in pvp mode
	private CallAbility call = new CallAbility(); // instantiates CallAbility to call abilites for player 1 and 2
	
	
	private static InventoryMethod inv = new InventoryMethod(); // called to get random item after battle
	private static Btns btns = new Btns();
	private static PlayerLbls lbl = new PlayerLbls();
	

	private static int curIndx2; // calls index for player 2
	private final int baseAttack = 2; // sets base attack to 2
	private int chance; // controls chance of players ability to run
	private static int damage; // controls damage players cause
	
	private static boolean pvpEnabled = false; // when true enables pvp
	private static boolean p2;
	
	/**
	 * gui stuff
	 */
	
	private static JFrame pvpBatFrame = new JFrame("RPG Simulator");
	private static JPanel pvpBatPanel1 = new JPanel();
	private static JPanel pvpBatPanel2 = new JPanel();
	private static JPanel pvpBatPanel3 = new JPanel();
	private static JPanel pvpBatPanel4 = new JPanel();
	
	private static JLabel playNameLbl1 = new JLabel();
	private static JLabel playImgLbl = new JLabel();
	private static  JLabel playHpLbl = new JLabel();
	private static  JLabel playSpLbl = new JLabel();
	private static  JLabel playStrLbl = new JLabel();
	private static  JLabel playDefLbl = new JLabel();
	private static  JLabel playSmaLbl = new JLabel();
	private static  JLabel playSpdLbl = new JLabel();
	private static  JLabel playLucLbl = new JLabel();

	private static  JLabel dexNameLbl = new JLabel();
	private static  JLabel dexImgLbl = new JLabel();
	private static  JLabel dexHpLbl = new JLabel();
	private static  JLabel dexSpLbl = new JLabel();
	private static  JLabel dexStrLbl = new JLabel();
	private static  JLabel dexDefLbl = new JLabel();
	private static  JLabel dexSmaLbl = new JLabel();
	private static  JLabel dexSpdLbl = new JLabel();
	private static  JLabel dexLucLbl = new JLabel();
	
	private static  JLabel dexMoveLbl = new JLabel();
	private static  JLabel playMoveLbl = new JLabel();
	
	private static  JButton attackBtn = new JButton();
	private static  JButton ability1Btn = new JButton();
	private static  JButton ability2Btn = new JButton();
	private static  JButton ability3Btn = new JButton();
	private static  JButton invBtn = new JButton();
	private static  JButton runBtn = new JButton();
	private static JLabel whoGo = new JLabel();
	

		
	private ActionListener attackListener = new attackListener();
	private ActionListener ability1Listener = new ability1Listener();
	private ActionListener ability2Listener = new ability2Listener();
	private ActionListener ability3Listener = new ability3Listener();
	private ActionListener invListener = new invListener();
	private ActionListener runListener = new runListener();
	/**
	 * controls the flow of PVP based on players health and speed stats
	 */
	public void pvpBegin()
	{
		if(dsp.getSpd() >= dspDex2.getSpd())
		{
			p2 = false;
		}
		else
		{
			p2 = true;
		}
		setPvpEnabled(true);
		pvpWind();
	}
	public void pvpWind()
	{		
		refresh();
		
		GridBagLayout playGrid = new GridBagLayout();
		GridBagLayout dexGrid = new GridBagLayout();
		GridBagLayout btnGrid = new GridBagLayout();
		GridBagLayout panelGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		TitledBorder title;
		Border redline = BorderFactory.createLineBorder(Color.red);
		
		
		try {
		    pvpBatFrame.setIconImage(ImageIO.read(getClass().getResourceAsStream("/console/resources/appIcon.jpg")));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		pvpBatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pvpBatFrame.setSize(1000, 1000);
		pvpBatFrame.setVisible(true);
		
		
		pvpBatPanel1.setBackground(Color.black);
		pvpBatPanel2.setBackground(Color.black);
		pvpBatPanel3.setBackground(Color.black);
		pvpBatPanel4.setBackground(Color.black);
	
		pvpBatPanel4.setLayout(panelGrid);

		
		title = BorderFactory.createTitledBorder(
                redline, dsp.getName() + "s last move");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitleColor(Color.white);
		playMoveLbl.setBorder(title);
		playMoveLbl.setText("no attack yet");
		playMoveLbl.setForeground(Color.white);
		
		playImgLbl = new JLabel(dsp.getImg2());
		
		playNameLbl1 = MainGame.getPlayerName();
		playNameLbl1.setText(dsp.getName());
		
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
                redline, dspDex2.getName() + "s last move");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitleColor(Color.white);
		
		dexMoveLbl.setBorder(title);
		dexMoveLbl.setText("no attack yet");
		dexMoveLbl.setForeground(Color.white);
		
		dexNameLbl = lbl.getNameLbl2();
		dexNameLbl.setText(dspDex2.getName());
		
		dexImgLbl = new JLabel(dspDex2.getImg2());
		
		dexHpLbl = lbl.getStatLbl();
		dexHpLbl.setText("HP:" + dspDex2.getHp() + "/" + dspDex2.getMaxHp());
		
		dexSpLbl = lbl.getStatLbl();
		dexSpLbl.setText("SP:" + dspDex2.getSp() + "/" + dspDex2.getMaxSp());
		
		dexStrLbl = lbl.getStatLbl();
		dexStrLbl.setText("Strength:" + dspDex2.getStr() + "/" + "10");
		
		dexDefLbl = lbl.getStatLbl();
		dexDefLbl.setText("Defense:" + dspDex2.getDef() + "/" + "10");
		
		dexSmaLbl = lbl.getStatLbl();
		dexSmaLbl.setText("Intelligence:" + dspDex2.getSma() + "/" + "10");
		
		dexSpdLbl = lbl.getStatLbl();
		dexSpdLbl.setText("Speed:" + dspDex2.getSpd() + "/" + "10");
		
		dexLucLbl = lbl.getStatLbl();
		dexLucLbl.setText("Luck:" + dspDex2.getLuc() + "/" + "10");
		
		whoGo = lbl.getStatLbl();
		if(p2)
		{
			whoGo.setText(dspDex2.getName() + "s Turn");
		}
		else
		{
			whoGo.setText(dsp.getName() + "s Turn");
		}
		
		attackBtn = btns.getBtnLay();
		attackBtn.setText("Attack");
		attackBtn.addActionListener(attackListener);
		
		ability1Btn = btns.getBtnLay();
		if (p2)
		{
		ability1Btn.setText(dspDex2.getAbil1());	
		}
		else
		{
		ability1Btn.setText(dsp.getAbil1());
		}
		ability1Btn.addActionListener(ability1Listener);
		
		ability2Btn = btns.getBtnLay();
		if (p2)
		{
		ability2Btn.setText(dspDex2.getAbil2());	
		}
		else
		{
		ability2Btn.setText(dsp.getAbil2());
		}
		ability2Btn.addActionListener(ability2Listener);
		
		ability3Btn = btns.getBtnLay();
		if (p2)
		{
		ability3Btn.setText(dspDex2.getAbil3());	
		}
		else
		{
		ability3Btn.setText(dsp.getAbil3());
		}
		ability3Btn.addActionListener(ability3Listener);
		ability3Btn.setPreferredSize(new Dimension(300, 50));
		
		invBtn = btns.getBtnLay();
		invBtn.setText("Inventory");
		invBtn.addActionListener(invListener);
		
		runBtn = btns.getBtnLay();
		runBtn.setText("RUN");
		runBtn.addActionListener(runListener);
		
		pvpBatPanel1.setLayout(playGrid);
		gbc.gridx = 0;
		gbc.gridy = 0;
		pvpBatPanel1.add(playNameLbl1, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		pvpBatPanel1.add(playImgLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		pvpBatPanel1.add(playHpLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		pvpBatPanel1.add(playSpLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		pvpBatPanel1.add(playStrLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		pvpBatPanel1.add(playDefLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 6;
		pvpBatPanel1.add(playSmaLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 7;
		pvpBatPanel1.add(playSpdLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 8;
		pvpBatPanel1.add(playLucLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 9;
		pvpBatPanel1.add(playMoveLbl, gbc);
		
		pvpBatPanel2.setLayout(btnGrid);
		gbc.gridx = 0;
		gbc.gridy = 0;
		pvpBatPanel2.add(whoGo);
		gbc.gridx = 0;
		gbc.gridy = 1;
		pvpBatPanel2.add(attackBtn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		pvpBatPanel2.add(ability1Btn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		pvpBatPanel2.add(ability2Btn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		pvpBatPanel2.add(ability3Btn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		pvpBatPanel2.add(invBtn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 6;
		pvpBatPanel2.add(runBtn, gbc);
		
		pvpBatPanel3.setLayout(dexGrid);
		gbc.gridx = 0;
		gbc.gridy = 0;
		pvpBatPanel3.add(dexNameLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		pvpBatPanel3.add(dexImgLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		pvpBatPanel3.add(dexHpLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		pvpBatPanel3.add(dexSpLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		pvpBatPanel3.add(dexStrLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		pvpBatPanel3.add(dexDefLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 6;
		pvpBatPanel3.add(dexSmaLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 7;
		pvpBatPanel3.add(dexSpdLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 8;
		pvpBatPanel3.add(dexLucLbl, gbc);
		gbc.gridx = 0;
		gbc.gridy = 9;
		pvpBatPanel3.add(dexMoveLbl, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		pvpBatPanel4.add(pvpBatPanel1, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		pvpBatPanel4.add(pvpBatPanel2, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		pvpBatPanel4.add(pvpBatPanel3, gbc);
		pvpBatFrame.add(pvpBatPanel4);
		

		
		pvpBatPanel1.validate();
		pvpBatPanel2.validate();
		pvpBatPanel3.validate();
		pvpBatPanel4.validate();
		pvpBatFrame.pack();
		
		
		
	}
	
	public void switchTurn()
	{
		if(dsp.getHp() <= 0 || dspDex2.getHp() <= 0)
		{
			p2 = false;
			pvpBatFrame.dispose();
			refresh();
			MainGame.endMove();
			MainGame.openMenu();
		}
		else
		{
		if(p2)
		{
		p2 = false;	
		}
		else
		{
		p2 = true;
		}
		if(p2)
		{
			whoGo.setText(dspDex2.getName() + "s Turn");
		}
		else
		{
			whoGo.setText(dsp.getName() + "s Turn");
		}	
		if (p2)
		{
		ability1Btn.setText(dspDex2.getAbil1());	
		}
		else
		{
		ability1Btn.setText(dsp.getAbil1());
		}
		if (p2)
		{
		ability2Btn.setText(dspDex2.getAbil2());	
		}
		else
		{
		ability2Btn.setText(dsp.getAbil2());
		}
		if (p2)
		{
		ability3Btn.setText(dspDex2.getAbil3());	
		}
		else
		{
		ability3Btn.setText(dsp.getAbil3());
		}
		}
	}
	public void refresh()
	{
		pvpBatPanel1.removeAll();
		pvpBatPanel2.removeAll();
		pvpBatPanel3.removeAll();
		pvpBatPanel4.removeAll();

		pvpBatPanel1.repaint();
		pvpBatPanel2.repaint();
		pvpBatPanel3.repaint();
		pvpBatPanel4.repaint();

		attackBtn.removeActionListener(attackListener);
		ability1Btn.removeActionListener(ability1Listener);
		ability2Btn.removeActionListener(ability2Listener);
		ability3Btn.removeActionListener(ability3Listener);
		invBtn.removeActionListener(invListener);
		runBtn.removeActionListener(runListener);

	}
	
	public class attackListener extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(p2)
			{
				setDamage(baseAttack + batChance.dmgModPlayBase(dspDex2.getStr(), dspDex2.getLuc(), dsp.getDef()));
				sub.setHp(damage);
				playHpLbl.setText("HP:" + dsp.getHp());
				dexMoveLbl.setText(dspDex2.getName() + " did " + damage + " damage.");
				
			}
			else
			{
				setDamage(baseAttack + batChance.dmgModPlayBase(dsp.getStr(), dsp.getLuc(), dspDex2.getDef()));
				subDex2.setHp(damage);
				dexHpLbl.setText("HP:" + dspDex2.getHp());
				playMoveLbl.setText(dspDex2.getName() + " did " + damage + " damage.");
			}
			
			switchTurn();
		}
	}
	
	public class ability1Listener extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (p2)
			{
				if(dspDex2.getSp() >= 10)
				{
				setDamage(call.callAbil1(curIndx2, true)); // calls ability 1 from player class
				dexMoveLbl.setText(dspDex2.getName() + " did " + damage + " damage.");
				sub.setHp(damage);
				playHpLbl.setText("HP:" + dsp.getHp());
				dexSpLbl.setText("SP:" + dspDex2.getSp() + "/" + dspDex2.getMaxSp());
				}
				else
				{
				dexMoveLbl.setText(dspDex2.getName() + "s ability failed.");	
				}	
			}
			else
			{
				if(dsp.getSp() >= 10)
				{
					setDamage(call.callAbil1(game.getCurIndx(), false)); // calls ability 1 from player class
					playMoveLbl.setText(dsp.getName() + " did " + damage + " damage.");
					subDex2.setHp(damage);
					dexHpLbl.setText("HP:" + dspDex2.getHp());
					playSpLbl.setText("SP:" + dsp.getSp() + "/" + dsp.getMaxSp());
				}
				else
				{
					playMoveLbl.setText(dsp.getName() + "s ability failed.");	
				}
			}
			switchTurn();
		}
	}		
	
	public class ability2Listener extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (p2)
			{
				if(dspDex2.getSp() >= 25)
				{
				setDamage(call.callAbil2(curIndx2, true)); // calls ability 1 from player class
				dexMoveLbl.setText(dspDex2.getName() + " did " + damage + " damage.");
				sub.setHp(damage);
				playHpLbl.setText("HP:" + dsp.getHp());
				dexSpLbl.setText("SP:" + dspDex2.getSp() + "/" + dspDex2.getMaxSp());
				}
				else
				{
				dexMoveLbl.setText(dspDex2.getName() + "s ability failed.");	
				}	
			}
			else
			{
				if(dsp.getSp() >= 25)
				{
					setDamage(call.callAbil2(game.getCurIndx(), false)); // calls ability 1 from player class
					playMoveLbl.setText(dsp.getName() + " did " + damage + " damage.");
					subDex2.setHp(damage);
					dexHpLbl.setText("HP:" + dspDex2.getHp());
					playSpLbl.setText("SP:" + dsp.getSp() + "/" + dsp.getMaxSp());
				}
				else
				{
					playMoveLbl.setText(dsp.getName() + "s ability failed.");	
				}
			}
			switchTurn();
		}
	}
	public class ability3Listener extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (p2)
			{
				if(dspDex2.getSp() >= 50)
				{
				setDamage(call.callAbil3(curIndx2, true)); // calls ability 1 from player class
				dexMoveLbl.setText(dspDex2.getName() + " did " + damage + " damage.");
				sub.setHp(damage);
				playHpLbl.setText("HP:" + dsp.getHp());
				dexSpLbl.setText("SP:" + dspDex2.getSp() + "/" + dspDex2.getMaxSp());
				}
				else
				{
				dexMoveLbl.setText(dspDex2.getName() + "s ability failed.");	
				}	
			}
			else
			{
				if(dsp.getSp() >= 10)
				{
					setDamage(call.callAbil3(game.getCurIndx(), false)); // calls ability 1 from player class
					playMoveLbl.setText(dsp.getName() + " did " + damage + " damage.");
					subDex2.setHp(damage);
					dexHpLbl.setText("HP:" + dspDex2.getHp());
					playSpLbl.setText("SP:" + dsp.getSp() + "/" + dsp.getMaxSp());
				}
				else
				{
					playMoveLbl.setText(dsp.getName() + "s ability failed.");	
				}
		}
			switchTurn();
	}
	}
	public class invListener extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			pvpBatFrame.dispose();
			if (p2)
			{
			inv.invMethod(curIndx2, true, true, true);
			}
			else
			{
			inv.invMethod(game.getCurIndx(), false, true, true);
			}
			refresh();
		}
	}
	
	public class runListener extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(p2)
			{
				chance = batChance.escapeChance(dspDex2.getLuc(), dsp.getLuc()); // if the palyer is a coward gets chance for escape
				if (chance > 20) // if the chance is greater then 20 then player escapes
				{
					p2 = false;
					MainGame.endMove();
					MainGame.openMenu();
					pvpBatFrame.dispose();
					refresh();
				}
				else
				{
					dexMoveLbl.setText(dspDex2.getName() + " failed to escape!!!");
					switchTurn();
				}	
			}
			else
			{
			chance = batChance.escapeChance(dsp.getLuc(), dspDex2.getLuc()); // if the palyer is a coward gets chance for escape
			if (chance > 20) // if the chance is greater then 20 then player escapes
			{
				p2 = false;
				MainGame.endMove();
				MainGame.openMenu();
				pvpBatFrame.dispose();
				refresh();
			}
			else
			{
				playMoveLbl.setText(dsp.getName() + " failed to escape!!!");
				switchTurn();
			}
			}
		}
	}
	public boolean isPvpEnabled() {
		return pvpEnabled;
	}
	/**
	 * sets pvpenabled
	 * @param pvpEnabled
	 */
	public void setPvpEnabled(boolean pvpEnabled) {
		PVPMode.pvpEnabled = pvpEnabled;
	}
	/**
	 * returns damage
	 * @return
	 */
	public int getDamage() {
		return damage;
	}
	/**
	 * sets damage in PVPMode
	 * @param damage
	 */
	public void setDamage(int damage) {
		PVPMode.damage = damage;
	}
	/**
	 * sets palyer Response based on players entry
	 * @param playResp
	 */

	/**
	 * gets index 2 information
	 * @return
	 */
	public int getCurIndx2() {
		return curIndx2;
	}
	/**
	 * sets index2 so PVPMode pulls the right data
	 * @param curIndx2
	 */
	public static void setCurIndx2(int curIndx2) {
		PVPMode.curIndx2 = curIndx2;
	}
	
}
