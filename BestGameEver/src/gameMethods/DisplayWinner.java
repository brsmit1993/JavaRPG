package gameMethods;

import java.awt.Color;
import java.awt.Dimension;
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

import console.GameStart;

import guiComponents.Btns;
import guiComponents.Images;
import guiComponents.PlayerLbls;
import inventory.InventoryMethod;

public class DisplayWinner {

	static MainGame game = new MainGame(); // used to pull curIndx
	private static Btns btns = new Btns();
	private static PlayerLbls lbl = new PlayerLbls();
	private static Images img = new Images();
	
	private JFrame winFrame = new JFrame();
	private JPanel winPanel = new JPanel();
	private JLabel winLbl = new JLabel();
	private JButton winBtn = new JButton();
	
	
	private ActionListener confirmwin = new confirmwin();
	
	/**
	 * method used for checking if player is dead after move ends
	 * move ends if players HP hits 0 in battle or after event is ran
	 */	
	public void winWind(int i)
	{
		winPanel.removeAll();
		winPanel.repaint();
		
		TitledBorder title;
		Border redline = BorderFactory.createLineBorder(new Color(255, 215, 0));
		GridBagLayout winGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();

		winFrame.setUndecorated(true);
		
		winFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	
		winFrame.setVisible(true);
		winFrame.setAlwaysOnTop(true);
		winFrame.setAutoRequestFocus(true);
		
		winPanel.setLayout(winGrid);
		winPanel.setBackground(Color.black);
		
		winLbl = lbl.getNameLbl();
		title = BorderFactory.createTitledBorder(
                redline, MainGame.getPlayer().get(i).getPlayName() + " WINS!");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitleColor(new Color(255, 215, 0));
		winLbl.setBorder(title);
		winLbl.setForeground(new Color(255, 215, 0));
		winLbl.setText(MainGame.getPlayer().get(i).getPlayName() + " IS THE WINNER!!!");
		
		winBtn = btns.getBtnLay();
		winBtn.setText("YOU'RE AWESOME SAUCE");
		winBtn.addActionListener(confirmwin);
		winBtn.setPreferredSize(new Dimension(400, 50));
		
		
		winFrame.add(winPanel);
		gbc.gridy = 0;
		winPanel.add(winLbl, gbc);
		gbc.gridy = 1;
		winPanel.add(img.getImgWin(), gbc);
		gbc.gridy = 2;
		winPanel.add(winBtn, gbc);
		
		
		winPanel.validate();
		
		
	}
	public class confirmwin implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}

	}
}
