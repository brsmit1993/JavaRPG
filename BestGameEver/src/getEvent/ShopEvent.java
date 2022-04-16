/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * If player ends up in coin shop local this file is ran and opens a shop menu.
 */
package getEvent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


import gameMethods.MainGame;
import getsetStats.StatAdd;
import getsetStats.StatSub;
import guiComponents.Images;
import inventory.InventoryMethod;
import inventory.Item;
import inventory.ItemList;
import ui.StatDisplay;


public class ShopEvent {
	
	static Random rand = new Random(); // calls rand for random item select
	
	
	private StatDisplay dsp = new StatDisplay(); // called to display current stats
	private StatAdd add = new StatAdd(); // called to add stats to player class
	private StatSub sub = new StatSub(); // called to subtract stats from player class
	private Images img = new Images();
	
	private static ArrayList<Item> itemlist = ItemList.getItem(); // called to get game items

	private static ArrayList<Item> liveInv; // used to store the active inventor based on game index
	
	boolean inInv = true; // true while player is still in inventory
	/**
	 * GUI Stuff
	 */
	private JFrame invFrame = new JFrame();
	private JPanel invPanel1 = new JPanel();
	
	private JButton buyBtn = new JButton();
	private JButton sellBtn = new JButton();
	private JButton leaveBtn = new JButton();
	
	private JList<String> invJ = new JList<String>();
	private JList<String> invS = new JList<String>();
	
	private JLabel playerName = new JLabel();
	private JLabel shopName = new JLabel();
	
	private static DefaultListModel<String> playerItems = new DefaultListModel<String>();
	private static DefaultListModel<String> shopItems = new DefaultListModel<String>();
	
	private static JScrollPane listScrollPane1;
	private static JScrollPane listScrollPane2;
	
	private static JLabel gold = new JLabel();
	private static JLabel shopGold = new JLabel();
	private static JLabel price = new JLabel();
	private static JLabel value = new JLabel();
	
	private JLabel shopImg = new JLabel();
	
	private ActionListener buyAL = new buyAL();
	private ActionListener sellAL = new sellAL();
	private ActionListener endAL = new endAL();
	/**
	 * dispalys options and current inventory
	 * @param dex 
	 * @param p2 
	 */
	public void shopEvent(int dex, boolean p2, boolean battle, boolean pvp) 
	{
		
		
		invPanel1.removeAll();
		invPanel1.repaint();
		
	   
	    
		setLiveInv(InventoryMethod.getListList().get(MainGame.getCurIndx())); // sets live inv to correct player inv
		

		
		for (int i = 0; i < liveInv.size(); i++)
		{
		playerItems.addElement(liveInv.get(i).getItemName());
		}
		
		for (int i = 0; i < itemlist.size(); i++)
		{
		shopItems.addElement(itemlist.get(i).getItemName());
		}
	
		GridBagLayout invGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();

		buyBtn.addActionListener(buyAL);
		sellBtn.addActionListener(sellAL);
		leaveBtn.addActionListener(endAL);
		
		invFrame.setSize(350,650);
		invFrame.setVisible(true);
		
		invPanel1.setBackground(Color.black);
		invPanel1.setLayout(invGrid);
		
		playerName.setText(dsp.getName());	
		playerName.setForeground(Color.white);
		playerName.setFont(new Font("Courier New", Font.BOLD, 35));
		
		shopName.setText("Shop Keeper");
		shopName.setForeground(Color.white);
		shopName.setFont(new Font("Courier New", Font.BOLD, 35));
		
		buyBtn.setText("Buy Item");
		buyBtn.setPreferredSize(new Dimension(200, 50));
		buyBtn.setForeground(Color.white);
		buyBtn.setBackground(new Color(129, 7, 0));
		buyBtn.setFont(new Font("Courier New", Font.BOLD, 20));
		
		sellBtn.setText("Sell Item");
		sellBtn.setPreferredSize(new Dimension(200, 50));
		sellBtn.setForeground(Color.white);
		sellBtn.setBackground(new Color(129, 7, 0));
		sellBtn.setFont(new Font("Courier New", Font.BOLD, 20));
		
		leaveBtn.setText("Leave Shop");
		leaveBtn.setPreferredSize(new Dimension(200, 50));
		leaveBtn.setForeground(Color.white);
		leaveBtn.setBackground(new Color(129, 7, 0));
		leaveBtn.setFont(new Font("Courier New", Font.BOLD, 20));
		
		
		
		
        invJ.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        invJ.setSelectedIndex(0);
        invJ.setVisibleRowCount(10);
        invJ = new JList<String>(playerItems);
        
        invS.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        invS.setSelectedIndex(0);
        invS.setVisibleRowCount(10);
        invS = new JList<String>(shopItems);
        
        listScrollPane1 = new JScrollPane(invJ);
        listScrollPane2 = new JScrollPane(invS);
        
        gold.setText("Gold:" + dsp.getGold());
        gold.setForeground(Color.white);
		gold.setFont(new Font("Courier New", Font.BOLD, 20));
		
        shopGold.setText("Gold: Infinite");
        shopGold.setForeground(Color.white);
        shopGold.setFont(new Font("Courier New", Font.BOLD, 20));
		
        price.setText("Price: ");
        price.setForeground(Color.white);
        price.setFont(new Font("Courier New", Font.BOLD, 20));
		
        value.setText("Value:");
        value.setForeground(Color.white);
        value.setFont(new Font("Courier New", Font.BOLD, 20));
        
		shopImg = img.getImgShop();
        
        
        
        Border loweredbevel = BorderFactory.createLoweredBevelBorder();
        Border raisedbevel = BorderFactory.createRaisedBevelBorder();
        
        Border compound;
        Border redline = BorderFactory.createLineBorder(Color.red);

        //This creates a nice frame.
        compound = BorderFactory.createCompoundBorder(
                                  raisedbevel, loweredbevel);
        

        //Add a red outline to the frame.
        compound = BorderFactory.createCompoundBorder(
                                  redline, compound);
        
        invJ.setBorder(compound);
        invS.setBorder(compound);
		
		invFrame.add(invPanel1);
		
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    invPanel1.add(playerName, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    invPanel1.add(dsp.getImg(), gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    invPanel1.add(gold, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 3;
		invPanel1.add(listScrollPane1, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 0;
		invPanel1.add(buyBtn, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 1;
	    invPanel1.add(price, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 2;
		invPanel1.add(sellBtn, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 3;
		invPanel1.add(value, gbc);
		gbc.gridx = 1;
		gbc.gridy = 4;
		invPanel1.add(leaveBtn, gbc);
	    gbc.gridx = 2;
	    gbc.gridy = 0;
	    invPanel1.add(shopName, gbc);
	    gbc.gridx = 2;
	    gbc.gridy = 1;
	    invPanel1.add(shopImg, gbc);
	    gbc.gridx = 2;
	    gbc.gridy = 2;
	    invPanel1.add(shopGold, gbc);
	    gbc.gridx = 2;
	    gbc.gridy = 3;
		invPanel1.add(listScrollPane2, gbc);

		
		invFrame.validate();
		invFrame.pack();
		
		 invJ.addListSelectionListener(new ListSelectionListener() {
		        public void valueChanged(ListSelectionEvent e) {
		            if (!e.getValueIsAdjusting()) {
		        		if (invJ.getSelectedIndex() != -1)
		        		{
		            	value.setText("Value:" + (liveInv.get(invJ.getSelectedIndex()).getItemValue() / 2));
		        		}
		            }
		        }
		    });
		    
		 invS.addListSelectionListener(new ListSelectionListener() {
		        public void valueChanged(ListSelectionEvent e) {
		        	if (!e.getValueIsAdjusting()) 
		        	{
		        		if (invS.getSelectedIndex() != -1)
		        		{
		        			price.setText("Price:" + ItemList.getItem().get(invS.getSelectedIndex()).getItemValue());
		        		}
		        	}
		        }
		    });
	} // end inv method
	
	public class buyAL extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
   		 shopItems = (DefaultListModel) invS.getModel();
   		int selectedIndex = invS.getSelectedIndex();

   		if (selectedIndex != -1) {
	    			if (dsp.getGold() >= itemlist.get(selectedIndex).getItemValue())
	    			{
   				sub.setGold(itemlist.get(selectedIndex).getItemValue());
   				liveInv.add(itemlist.get(selectedIndex));
   				playerItems.addElement(itemlist.get(selectedIndex).getItemName());
   				gold.setText("Gold:" + dsp.getGold());
	    			}
   		}
   			
			
		
		}
	}
	
	public class sellAL extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
   		 playerItems = (DefaultListModel) invJ.getModel();
	    		int selectedIndex = invJ.getSelectedIndex();

	    		if (selectedIndex != -1) {
	    			add.setGold((liveInv.get(selectedIndex).getItemValue()/2));
	    			gold.setText("Gold:" + dsp.getGold());
	    		    playerItems.remove(selectedIndex);   		 
	    		    liveInv.remove(selectedIndex);	    		   
	    		    InventoryMethod.getListList().set(MainGame.getCurIndx(), liveInv);
	    		}
		}
	}
	
	public class endAL extends AbstractAction  
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			playerItems.removeAllElements();
			shopItems.removeAllElements();
			MainGame.endMove();
			MainGame.openMenu();
    		invPanel1.removeAll();
			invPanel1.repaint();

    		invFrame.dispose();
    		sellBtn.removeActionListener(sellAL);
    		buyBtn.removeActionListener(buyAL);
    		leaveBtn.removeActionListener(endAL);
    		
		}
	}
	
	
	TitledBorder compound;
	
	
	
	/**
	 * 
	 * @return itemList
	 */
	public ArrayList<Item> getItemlist() {
		return itemlist;
	}
	/**
	 * gets games item list
	 * @param itemlist
	 */
	public static void setItemlist(ArrayList<Item> itemlist) {
		ShopEvent.itemlist = itemlist;
	}
	/**
	 * gets games current state
	 * @param game
	 */


	public static ArrayList<Item> getLiveInv() {
		return liveInv;
	}
	/**
	 * sets current liveInv
	 * @param liveInv
	 */
	public static void setLiveInv(ArrayList<Item> liveInv) {
		ShopEvent.liveInv = liveInv;
	}

	public JFrame getInvFrame() {
		return invFrame;
	}

	public void setInvFrame(JFrame invFrame) {
		this.invFrame = invFrame;
	}
	

}
