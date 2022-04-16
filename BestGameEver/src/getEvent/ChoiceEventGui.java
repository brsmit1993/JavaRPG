package getEvent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import battleMode.MonsterBattle.endMoveMonBat;
import gameMethods.MainGame;
import guiComponents.Btns;
import guiComponents.PlayerLbls;

public class ChoiceEventGui {
	private DarkForestEvents forrest = new DarkForestEvents();
	private TownEvents town = new TownEvents();
	
	private static Btns btns = new Btns();
	private static PlayerLbls lbl = new PlayerLbls();
	
	private static JFrame eventFrame = new JFrame();
	private static JPanel eventPanel = new JPanel();
	protected static JLabel eventLbl = new JLabel();
	protected static JButton choice1 = new JButton();
	protected static JButton choice2 = new JButton();
	protected static JButton choice3 = new JButton();
	
	private static JFrame outFrame = new JFrame();
	private static JPanel outPanel = new JPanel();
	protected static JLabel outLbl = new JLabel();
	protected static JButton endBtn = new JButton();
	
	private ActionListener endMove = new endMoveEvent();
	private ActionListener choice1AL = new choice1AL();
	private ActionListener choice2AL = new choice2AL();
	private ActionListener choice3AL = new choice3AL();
	
	private  int cha;
	private  static String eventType;
	
	
	public void eventChoiceWindow(int cha, String eventType)
	{
		
		
		this.cha = cha;
		this.eventType = eventType;
		
		TitledBorder title;
		Border whiteline = BorderFactory.createLineBorder(Color.white);
		GridBagLayout eventGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		eventFrame.setUndecorated(true);
		eventFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		eventFrame.setVisible(true);
		eventFrame.setAlwaysOnTop(true);
		eventFrame.setAutoRequestFocus(true);
		
		eventPanel.setBackground(Color.black);
		eventPanel.setLayout(eventGrid);
		
		setEventLbl(lbl.getStatLbl());
		title = BorderFactory.createTitledBorder(
                whiteline,  "***EVENT***");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitleColor(Color.white);
		eventLbl.setBorder(title);
		
		choice1 = btns.getBtnLay();
		choice2 = btns.getBtnLay();
		choice3 = btns.getBtnLay();
		choice1.addActionListener(choice1AL);
		choice2.addActionListener(choice2AL);
		choice3.addActionListener(choice3AL);
		choice1.setPreferredSize(new Dimension(800, 50));
		choice2.setPreferredSize(new Dimension(800, 50));
		choice3.setPreferredSize(new Dimension(800, 50));
		
		eventFrame.add(eventPanel);
		gbc.gridy = 0;
		eventPanel.add(getEventLbl(), gbc);
		gbc.gridy = 1;
		eventPanel.add(choice1, gbc);
		gbc.gridy = 2;
		eventPanel.add(choice2, gbc);
		gbc.gridy = 3;
		eventPanel.add(choice3, gbc);
		
		eventPanel.validate();
	}
	
	public void eventOutcomeWind()
	{	
		TitledBorder title;
		Border whiteline = BorderFactory.createLineBorder(Color.white);
		GridBagLayout outGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		outFrame.setUndecorated(true);
		outFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		outFrame.setVisible(true);
		outFrame.setAlwaysOnTop(true);
		outFrame.setAutoRequestFocus(true);
		
		outPanel.setBackground(Color.black);
		outPanel.setLayout(outGrid);
		
		setEventLbl(lbl.getStatLbl());
		title = BorderFactory.createTitledBorder(
                whiteline,  "***EVENT***");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitleColor(Color.white);
		eventLbl.setBorder(title);
		
		outLbl = lbl.getStatLbl();
		title = BorderFactory.createTitledBorder(
                whiteline,  "***OUTCOME***");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitleColor(Color.white);
		outLbl.setBorder(title);
		outLbl.setBounds(1, 1, 500, 500);
		
		endBtn = btns.getBtnLay();
		endBtn.addActionListener(endMove);
		endBtn.setText("End Move");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		outFrame.add(outPanel);
		gbc.gridy = 0;
		outPanel.add(eventLbl, gbc);
		gbc.gridy = 1;
		outPanel.add(outLbl, gbc);
		gbc.gridy = 2;
		outPanel.add(endBtn, gbc);
		
		outPanel.validate();
	}
	public void refreshChoice()
	{
		eventPanel.removeAll();
		eventPanel.repaint();
		choice1.removeActionListener(choice1AL);
		choice2.removeActionListener(choice2AL);
		choice3.removeActionListener(choice3AL);
	}
	public void refreshOutcome()
	{
		outPanel.removeAll();
		outPanel.repaint();
	}
	
	public static JLabel getEventLbl() {
		return eventLbl;
	}

	public static void setEventLbl(JLabel eventLbl) {
		ChoiceEventGui.eventLbl = eventLbl;
	}

	public class endMoveEvent extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			endBtn.removeActionListener(endMove);
			MainGame.endMove();
			MainGame.openMenu();

			outFrame.dispose();
			refreshChoice();
			refreshOutcome();
		}
	}
	
	public class choice1AL extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (eventType.equals("Shadow"))
			{
				refreshChoice();

				eventFrame.dispose();
				eventOutcomeWind();
				ShadowPassEvents.getEvent(cha, 1, false);
				
				
			}
			if (eventType.equals("Forrest"))
			{
				refreshChoice();
				eventFrame.dispose();
		
				eventOutcomeWind();
				DarkForestEvents.getEvent(cha, 1, false);
				
				
			}
			if (eventType.equals("Town"))
			{
				refreshChoice();
				eventFrame.dispose();
			
				eventOutcomeWind();
				TownEvents.getEvent(cha, 1, false);
			}
		}
	}
	
	public class choice2AL extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (eventType.equals("Shadow"))
			{
				refreshChoice();
				eventFrame.dispose();
				
				eventOutcomeWind();
				ShadowPassEvents.getEvent(cha, 2, false);
			}
			if (eventType.equals("Forrest"))
			{
				refreshChoice();
				eventFrame.dispose();
			
				eventOutcomeWind();
				DarkForestEvents.getEvent(cha, 2, false);
			}
			if (eventType.equals("Town"))
			{
				refreshChoice();
				eventFrame.dispose();
		
				eventOutcomeWind();
				TownEvents.getEvent(cha, 2, false);
			}
			
		}
	}
	
	public class choice3AL extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (eventType.equals("Shadow"))
			{
				refreshChoice();
				eventFrame.dispose();
				
				eventOutcomeWind();
				ShadowPassEvents.getEvent(cha, 3, false);
			}
			if (eventType.equals("Forrest"))
			{
				refreshChoice();
				eventFrame.dispose();
			
				eventOutcomeWind();
				DarkForestEvents.getEvent(cha, 3, false);
			}
			if (eventType.equals("Town"))
			{
				refreshChoice();
				eventFrame.dispose();

				eventOutcomeWind();
				TownEvents.getEvent(cha, 3, false);
			}
		}
	}
	
	
}
