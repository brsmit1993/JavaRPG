/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * File gets events randomly if random event is actived and player is in a town local.
 */
package getEvent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import algorithms.Chance;
import gameMethods.MainGame;
import guiComponents.Btns;
import guiComponents.PlayerLbls;

public class HintEvent {
	
	
	private PlayerLbls lblLay = new PlayerLbls();
	private Btns btnLay = new Btns();
	
	private SpringLayout laySpr = new SpringLayout();
	
	private Chance chance = new Chance();
	private String hintTxt;
	private JFrame hintFrame = new JFrame();
	private JPanel hintPanel1 = new JPanel();
	private JPanel hintPanel2 = new JPanel();
	private JLabel hintLbl = new JLabel();
	private JButton endMoveBtn = new JButton();
	private ActionListener endMove = new endMoveHint();
	
	
	
	public String getEvent()
	{
		int cha = chance.getChance30noluck();
		
		switch (cha)
		{
		case 1:
			setHintTxt("<html> <center> HINT </center> <br> Make sure to stock up on HP potions <br> before fighting the Goblin King </html>");
			break;
		case 2:
			setHintTxt("<html> <center> HINT </center> <br> If you didn't know your inventory <br> space maxes out at 10 items.</html>");
			break;
		case 3:
			setHintTxt("<html> <center> HINT </center> <br> You suck. Give up. </html>");
			break;
		case 4:
			setHintTxt("<html> <center> HINT </center> <br> Oh you're actually still trying?</html>");
			break;
		case 5:
			setHintTxt("<html> <center> HINT </center> <br> Take a shower you smell. </html>");
			break;
		case 6:
			setHintTxt("<html> <center> HINT </center> <br> Everytime you level up you gain back <br> your HP and SP </html>");
			break;
		case 7:
			setHintTxt("<html> <center> HINT </center> <br> Events are great ways to gain and lose <br> skill points </html>");
			break;
		case 8:
			setHintTxt("<html> <center> HINT </center> <br> Don't talk to trees.</html>");
			break;
		case 9:
			setHintTxt("<html> <center> HINT </center> <br> Don't talk to rocks.</html>");
			break;
		case 10:
			setHintTxt("<html> <center> HINT </center> <br> Shadow Pass is the most dangerous place <br> to fight in the map.</html>");
			break;
		case 11:
			setHintTxt("<html> <center> HINT </center> <br> Towns are the easiest places <br> to fight monsters. </html>");
			break;
		case 12:
			setHintTxt("<html> <center> HINT </center> <br> DON'T LISTEN TO THE VOICES </html>");
			break;
		case 13:
			setHintTxt("<html> <center> HINT </center> <br> DON'T LET THE WORLD BURN </html> ");
			break;
		case 14:
			setHintTxt("<html> <center> HINT </center> <br> Sometimes things are not as <br> they appear.</html>");
			break;
		case 15:
			setHintTxt("<html> <center> HINT </center> <br> Speed affects who gets the <br> first move.</html>");
			break;
		case 16:
			setHintTxt("<html> <center> HINT </center> <br> A map gives you hints on how the <br> map actually works.</html>");
			break;
		case 17:
			setHintTxt("<html> <center> HINT </center> <br> A GPS will well do what <br> a GPS does.</html>");
			break;
		case 18:
			setHintTxt("<html> <center> HINT </center> <br> Strength affects your attack.</html>");
			break;
		case 19:
			setHintTxt("<html> <center> HINT </center> <br> Ability attacks are affected by <br> your main stat.</html>");
			break;
		case 20:
			setHintTxt("<html> <center> HINT </center> <br> Luck can help you in certain events <br> as well as battle.</html>");
			break;
		case 21:
			setHintTxt("<html> <center> HINT </center> <br> If you think you can't <br> win a fight, run.</html>");
			break;
		case 22:
			setHintTxt("<html> <center> HINT </center> <br> Don't die.</html>");
			break;
		case 23:
			setHintTxt("<html> <center> HINT </center> <br> If you did die you suck.</html>");
			break;
		case 24:
			setHintTxt("<html> <center> HINT </center> <br> Entering the same location as another <br> human player initiates PVP</html>");
			break;
		case 25:
			setHintTxt("<html> <center> HINT </center> <br> During PVP you can't access your <br> inventory or stats.</html>");
			break;
		case 26:
			setHintTxt("<html> <center> HINT </center> <br> During normal battle you can <br> still access your inventory</html>");
			break;
		case 27:
			setHintTxt("<html> <center> HINT </center> <br> If you plan to go to shadows <br> pass bring potions.</html>");
			break;
		case 28:
			setHintTxt("<html> <center> HINT </center> <br> Avoid shadows pass until you're able <br> to handle tougher monsters</html>");
			break;
		case 29:
			setHintTxt("<html> <center> HINT </center> <br> The Goblin King will kill you. </html>");
			break;
		case 30:
			setHintTxt("<html> <center> HINT </center> <br> You'll never win just give up.</html>");
			break;
		}
		
		return hintTxt;
	}

	public void hintWin()
	{
		GridBagLayout hintGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		hintFrame.setSize(500,225);
		hintFrame.setVisible(true);
		hintFrame.setLayout(new BorderLayout());
		
		hintPanel1.setBackground(Color.black);
		hintPanel1.setLayout(hintGrid);
		hintPanel1.setSize(800, 200);
		hintPanel2.setBackground(Color.black);
		hintPanel2.setLayout(hintGrid);
		hintPanel2.setSize(800, 200);
		
		hintLbl = lblLay.getStatLbl();
		hintLbl.setText(getEvent());
		hintLbl.setBounds(10, 10, 300, 100);
		
		endMoveBtn = btnLay.getBtnLay();
		endMoveBtn.setText("End Move");
		endMoveBtn.addActionListener(endMove);
		
		hintFrame.add(hintPanel1, BorderLayout.NORTH);
		hintFrame.add(hintPanel2, BorderLayout.CENTER);
		gbc.gridy = 1;
		hintPanel1.add(hintLbl, gbc);
		gbc.gridy = 1;
		hintPanel2.add(endMoveBtn, gbc);
		/*
		laySpr.putConstraint(SpringLayout.WEST, hintLbl, 30, SpringLayout.WEST, hintPanel);
		laySpr.putConstraint(SpringLayout.NORTH, hintLbl, 10, SpringLayout.NORTH, hintPanel);
		laySpr.putConstraint(SpringLayout.WEST, endMoveBtn, 30, SpringLayout.WEST, hintPanel);
		laySpr.putConstraint(SpringLayout.NORTH, endMoveBtn, 60, SpringLayout.NORTH, hintLbl);
		laySpr.putConstraint(SpringLayout.HORIZONTAL_CENTER, hintLbl, 0, SpringLayout.HORIZONTAL_CENTER, hintPanel);
		*/
		hintPanel1.validate();
		hintPanel2.validate();
		hintFrame.validate();
	}
	
	public class endMoveHint extends AbstractAction  {

		@Override
		public void actionPerformed(ActionEvent e) {
			MainGame.endMove();
			MainGame.openMenu();
			hintFrame.dispose();
			hintPanel1.removeAll();
			hintPanel2.removeAll();
			hintPanel1.repaint();
			hintPanel2.repaint();
		}

	}
	public String getHintTxt() {
		return hintTxt;
	}

	public void setHintTxt(String hintTxt) {
		this.hintTxt = hintTxt;
	}
}
