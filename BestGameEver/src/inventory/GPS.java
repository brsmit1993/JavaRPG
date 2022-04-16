/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * stores info and effect for item GPS
 */
package inventory;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import guiComponents.Btns;
import guiComponents.PlayerLbls;

public class GPS extends Item {
	/**
	 * sets info for GPS	
	 */
	private static Btns btns = new Btns();
	private static PlayerLbls lbl = new PlayerLbls();
	
	private JFrame gpsFrame = new JFrame();
	private JPanel gpsPanel = new JPanel();
	private JLabel gpsLbl = new JLabel();
	private JButton gpsBtn = new JButton();
	
	
	public GPS () 
	{
		setItemName("GPS"); // sets name
		setItemValue(5000); // sets value for shop
		setConsumeable(false); // no the player does not eat the gps
	}
	/**
	 * how item effects player
	 */
	@Override
	public void statEffect(int dex, boolean p2) 
	{
		
		gpsPanel.removeAll();
		gpsPanel.repaint();
		
		GridBagLayout gpsGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		if (!gpsFrame.isUndecorated()) {
		    gpsFrame.setUndecorated(true);
		}
		if(!gpsFrame.isVisible()){
		    gpsFrame.setVisible(true);
		}
	
		gpsFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		gpsFrame.setAlwaysOnTop(true);
		gpsFrame.setAutoRequestFocus(true);
		
		gpsPanel.setBackground(Color.black);
		gpsPanel.setLayout(gpsGrid);
		
		gpsLbl = lbl.getNameLbl();
		
		gpsBtn = btns.getBtnLay();
		gpsBtn.setText("Close GPS");
		
		if (p2)
		{	
			gpsLbl.setText("X = " + dspDex2.getCordX() + " Y = " + dspDex2.getCordY());
		}
		else
		{
			gpsLbl.setText("X = " + dsp.getCordX() + " Y = " + dsp.getCordY());
		}
		
		
		gbc.gridy = 0;
		gpsPanel.add(gpsLbl, gbc);
		gbc.gridy = 1;
		gpsPanel.add(gpsBtn, gbc);
		
		gpsFrame.add(gpsPanel);
		
		gpsBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				gpsFrame.dispose();
				
				gpsPanel.removeAll();
				gpsPanel.repaint();
			}
	    });
		gpsPanel.validate();
	}
	
}
