/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * This file / method is ran to check if player is dead.
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

import battleMode.MonsterBattle.endMoveMonBat;
import console.GameStart;
import guiComponents.Btns;
import guiComponents.Images;
import guiComponents.PlayerLbls;
import inventory.InventoryMethod;



public class DeathCheck {
	
	private DisplayWinner win = new DisplayWinner();
	static MainGame game = new MainGame(); // used to pull curIndx
	private static Btns btns = new Btns();
	private static PlayerLbls lbl = new PlayerLbls();
	private static Images img = new Images();
	
	private JFrame deathFrame = new JFrame();
	private JPanel deathPanel = new JPanel();
	private JLabel deathLbl = new JLabel();
	private JButton deathBtn = new JButton();
	
	private ActionListener confirmDeath = new confirmDeath();
	
	boolean death = false;
	/**
	 * method used for checking if player is dead after move ends
	 * move ends if players HP hits 0 in battle or after event is ran
	 */
	public void checkDeath() {
		/** 
		 * runs through player list and checks to see if any players HP is 0 or less
		 */
		for (int i = 0; i < MainGame.getPlayer().size(); ++i)
		{
			/** 
			 * informs player of death and removes them from player list
			 * also removes inventory of said player from list
			 */
		if (MainGame.getPlayer().get(i).getHp() <= 0)
		{
			death = true;
			deathWind(i);
			MainGame.getPlayer().remove(i); // removes player of index at i 
			InventoryMethod.getListList().remove(i); // removes inventory of index at i
			MainGame.setPlayerAlive(MainGame.getPlayer().size()); // sets players alive to new player list size
		}
		}
		
		// if player size is equal to 1 then runs game outro.
		if (MainGame.getPlayer().size() == 1)
		{
			win.winWind(0);
		}
	}
	
	public void deathWind(int i)
	{
		deathPanel.removeAll();
		deathPanel.repaint();
		
		TitledBorder title;
		Border redline = BorderFactory.createLineBorder(Color.red);
		GridBagLayout deathGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();

		deathFrame.setUndecorated(true);
		
		deathFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	
		deathFrame.setVisible(true);
		deathFrame.setAlwaysOnTop(true);
		deathFrame.setAutoRequestFocus(true);
		
		deathPanel.setLayout(deathGrid);
		deathPanel.setBackground(Color.black);
		
		deathLbl = lbl.getNameLbl();
		title = BorderFactory.createTitledBorder(
                redline, MainGame.getPlayer().get(i).getPlayName() + " sucks!");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitleColor(Color.red);
		deathLbl.setBorder(title);
		deathLbl.setForeground(Color.red);
		deathLbl.setText(MainGame.getPlayer().get(i).getPlayName() + " IS DEAD AND HAS BEEN REMOVED FROM THE GAME!");
		
		deathBtn = btns.getBtnLay();
		deathBtn.setText("YOU SUCK!");
		deathBtn.addActionListener(confirmDeath);
		
		
		deathFrame.add(deathPanel);
		gbc.gridy = 0;
		deathPanel.add(deathLbl, gbc);
		gbc.gridy = 1;
		deathPanel.add(img.getImgDeath(), gbc);
		gbc.gridy = 2;
		deathPanel.add(deathBtn, gbc);
		
		
		deathPanel.validate();
		
		
	}
	public class confirmDeath implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
	

			
			deathFrame.dispose();
			deathBtn.removeActionListener(confirmDeath);
			deathPanel.removeAll();
			deathPanel.repaint();
			deathFrame.dispose();
			
		}

	}
	public boolean isDeath() {
		return death;
	}

	public void setDeath(boolean death) {
		this.death = death;
	}
	
}
