/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 */
package inventory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

import algorithms.Chance;
import battleMode.MonsterBattle;
import battleMode.PVPMode;
import console.PlayerEntry;
import gameMethods.MainGame;

import ui.StatDisplay;
import ui.StatDisplayIndx2;


/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * This file controls all logic related to how the players inventory operates. It also controls random items added.
 * Inventory logic includes adding rand, and set items, dropping set items, checking for inventory space, and when the inventory
 * is full asking if the player wants to drop an item to pick up a new item. liveInv is set based on the MainGames current indx
 * and pulled from listList and stored after exiting the inventory method.
 */
public class InventoryMethod {
	
	static Random rand = new Random(); // calls rand for random item select
	
	private static PVPMode pvpWind = new PVPMode();
	private static MainGame game = new MainGame(); // stores main game state
	private static PlayerEntry enter = new PlayerEntry(); // called for player enter choice
	private static Chance chance = new Chance(); // called for random chance variables
	private StatDisplay dsp = new StatDisplay(); // called to display current stats
	private StatDisplayIndx2 dspDex2 = new StatDisplayIndx2(); // instantes StatDisplay to display player 2 stats in pvp mode
	private MonsterBattle bat = new MonsterBattle();
	
	
	private static ArrayList<Item> itemlist = ItemList.getItem(); // called to get game items
	private static List<ArrayList<Item>> listList; // stores all currently active player inventories
	private static ArrayList<Item> liveInv; // used to store the active inventor based on game index
	
	boolean inInv = true; // true while player is still in inventory
	/**
	 * GUI Stuff
	 */
	private JFrame invFrame = new JFrame();
	private JPanel invPanel1 = new JPanel();
	private JButton useBtn = new JButton();
	private JButton dropBtn = new JButton();
	private JButton retBtn = new JButton();
	private JList<String> invJ = new JList<String>();
	private JLabel playerName = new JLabel();
	private static DefaultListModel<String> playerItems = new DefaultListModel<String>();
	private static JScrollPane listScrollPane;
	private static JLabel gold = new JLabel();
	/**
	 * dispalys options and current inventory
	 * @param dex 
	 * @param p2 
	 */
	public void invMethod(int dex, boolean p2, boolean battle, boolean pvp) 
	{
		invFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		invPanel1.removeAll();
		invPanel1.repaint();
		
	    invJ.addListSelectionListener(new ListSelectionListener() {
	        public void valueChanged(ListSelectionEvent e) {
	            if (!e.getValueIsAdjusting()) {
	                
	            }
	        }
	    });

		setLiveInv(listList.get(dex)); // sets live inv to correct player inv
		
		liveInv.add(ItemList.getItem().get(9));
		
		for (int i = 0; i < liveInv.size(); i++)
		{
		playerItems.addElement(liveInv.get(i).getItemName());
		}
		
		useBtn.addActionListener(new ActionListener(){  
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
	    		 playerItems = (DefaultListModel) invJ.getModel();
	    		int selectedIndex = invJ.getSelectedIndex();

	    		if (selectedIndex != -1) {
	    			
	    			if (liveInv.get(selectedIndex).isConsumeable())
		    		{
	    		    playerItems.remove(selectedIndex);
	    		    liveInv.get(selectedIndex).statEffect(dex, p2);
	    		    liveInv.remove(selectedIndex);	    		   
	    		    listList.set(dex, liveInv);
		    		}
	    			else
	    			{
	    				  liveInv.get(selectedIndex).statEffect(dex, p2);
	    			}
	    		}
	    		
			}
	    });
		
		dropBtn.addActionListener(new ActionListener(){  
			
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
	    		 playerItems = (DefaultListModel) invJ.getModel();
		    		int selectedIndex = invJ.getSelectedIndex();

		    		if (selectedIndex != -1) {
		    		    playerItems.remove(selectedIndex);   		 
		    		    liveInv.remove(selectedIndex);	    		   
		    		    listList.set(dex, liveInv);
		    		}
			}
	    });
		
		retBtn.addActionListener(new ActionListener(){  
			
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
	    		invPanel1.remove(listScrollPane);
	    		listScrollPane.remove(invJ);
	    		if (battle)
	    		{
	    			if(pvp)
	    			{
	    				pvpWind.pvpWind();
	    			}
	    			else
	    			{
	    				bat.monBatWind();
	    			}
	    		}
	    		else
	    		{
	    			MainGame.openMenu();	
	    		}
	    		playerItems.removeAllElements();
	    		invFrame.dispose();
			}
	    });
		

		
		GridBagLayout invGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();

		
		invFrame.setSize(350,650);
		invFrame.setVisible(true);
		
		invPanel1.setBackground(Color.black);
		invPanel1.setLayout(invGrid);
		
		
		if(p2)
		{
			playerName.setText(dspDex2.getName());
		}
		else
		{
			playerName.setText(dsp.getName());	
		}
		
		playerName.setForeground(Color.white);
		playerName.setFont(new Font("Courier New", Font.BOLD, 35));
		
		useBtn.setText("Use Item");
		useBtn.setPreferredSize(new Dimension(200, 50));
		useBtn.setForeground(Color.white);
		useBtn.setBackground(new Color(129, 7, 0));
		useBtn.setFont(new Font("Courier New", Font.BOLD, 20));
		
		dropBtn.setText("Drop Item");
		dropBtn.setPreferredSize(new Dimension(200, 50));
		dropBtn.setForeground(Color.white);
		dropBtn.setBackground(new Color(129, 7, 0));
		dropBtn.setFont(new Font("Courier New", Font.BOLD, 20));
		
		retBtn.setText("Go Back");
		retBtn.setPreferredSize(new Dimension(200, 50));
		retBtn.setForeground(Color.white);
		retBtn.setBackground(new Color(129, 7, 0));
		retBtn.setFont(new Font("Courier New", Font.BOLD, 20));
		
		
		
        invJ.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        invJ.setSelectedIndex(0);
        invJ.setVisibleRowCount(10);
        invJ = new JList<String>(playerItems);
        listScrollPane = new JScrollPane(invJ);
        if(p2)
        {
        gold.setText("Gold:" + dspDex2.getGold());
        }
        else
        {
        gold.setText("Gold:" + dsp.getGold());
        }
        gold.setForeground(Color.white);
		gold.setFont(new Font("Courier New", Font.BOLD, 20));
        
        
        
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
        
		
		invFrame.add(invPanel1);
		
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    invPanel1.add(playerName);
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    if(p2) 
	    {
	    	invPanel1.add(dspDex2.getImg(), gbc);
	    }
	    else
	    {
	    	invPanel1.add(dsp.getImg(), gbc);
	    }
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    invPanel1.add(gold, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 3;
		invPanel1.add(listScrollPane, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 4;
		invPanel1.add(useBtn, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 5;
		invPanel1.add(dropBtn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 6;
		invPanel1.add(retBtn, gbc);	

		
		invFrame.validate();
		invFrame.pack();
	} // end inv method
	/**
	 * adds random item to inventory
	 */
	public void addRandItem () 
	{
		setLiveInv(listList.get(game.getCurIndx())); //sets active inventory to current player
		
		int getChance = chance.getChance300(dsp.getLuc()); // gets chance for random effect
		int x = 0; // x variable used to store extra random number
		boolean needDrop = false; // does item need dropped before adding another?
		
		/**
		 * gets random number based on getChance variable
		 */
		if (getChance <= 279)
		{
			x = rand.nextInt((1 - 0) + 1) + 0;
		}
		if (getChance >= 280 && getChance < 289)
		{
			x = rand.nextInt((7 - 2) + 1) + 2;
		}
		if (getChance >= 290)
		{
			x = rand.nextInt((9 - 8) + 1) + 8;
		}
					
		liveInv.add(ItemList.getItem().get(x));
		

		
		listList.set(MainGame.getCurIndx(), liveInv); // stores new inventory based on index
	} // end addRandItem
	
	/**
	 * used for shopEvent method to add item to inventory based on players choice
	 * @param itemNum
	 */
	public void addSetItem (int itemNum) 
	{
		
		setLiveInv(listList.get(MainGame.getCurIndx())); // sets live inv to current player
		
		liveInv.add(ItemList.getItem().get(itemNum -1)); // adds item based on players slections
	
		listList.set(MainGame.getCurIndx(), liveInv); // stores new player inventory
	} // end addSetItem

	/**
	 * if user uses item deciphers which item and its effect
	 * @param playResp
	 */
	
	
	TitledBorder compound;
	
	public void openInvWin()
	{
		
		
		GridBagLayout invGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		GridBagConstraints gbcList = new GridBagConstraints();
		
		invFrame.setSize(500,1000);
		invFrame.setVisible(true);
		
		invPanel1.setBackground(Color.black);
		invPanel1.setLayout(invGrid);
		
		
		playerName.setText(dsp.getName());
		playerName.setForeground(Color.white);
		playerName.setFont(new Font("Courier New", Font.BOLD, 35));
		
		useBtn.setText("Use Item");
		useBtn.setPreferredSize(new Dimension(200, 50));
		useBtn.setForeground(Color.white);
		useBtn.setBackground(new Color(129, 7, 0));
		useBtn.setFont(new Font("Courier New", Font.BOLD, 20));
		
		dropBtn.setText("Drop Item");
		dropBtn.setPreferredSize(new Dimension(200, 50));
		dropBtn.setForeground(Color.white);
		dropBtn.setBackground(new Color(129, 7, 0));
		dropBtn.setFont(new Font("Courier New", Font.BOLD, 20));
		
		retBtn.setText("Go Back");
		retBtn.setPreferredSize(new Dimension(200, 50));
		retBtn.setForeground(Color.white);
		retBtn.setBackground(new Color(129, 7, 0));
		retBtn.setFont(new Font("Courier New", Font.BOLD, 20));
		
		
		
        invJ.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        invJ.setSelectedIndex(0);
        invJ.setVisibleRowCount(10);
        invJ.setBackground(Color.black);
        invJ = new JList<String>(playerItems);
        
        
        
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
        JScrollPane listScrollPane = new JScrollPane(invJ);
		
		invFrame.add(invPanel1);
		
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    invPanel1.add(playerName);
	    gbc.gridx = 0;
	    gbc.gridy = 1;
		invPanel1.add(dsp.getImg(), gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 2;
		invPanel1.add(listScrollPane, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 3;
		invPanel1.add(useBtn, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 4;
		invPanel1.add(dropBtn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		invPanel1.add(retBtn, gbc);		
	}
	
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
		InventoryMethod.itemlist = itemlist;
	}
	/**
	 * gets games current state
	 * @param game
	 */
	public static void setGame(MainGame game) {
		InventoryMethod.game = game;
	}

	/**
	 * 
	 * @return current listList
	 */
	public static List<ArrayList<Item>> getListList() {
		return listList;
	}
	/**
	 * sets current listList
	 * @param listList
	 */
	public static void setListList(List<ArrayList<Item>> listList) {
		InventoryMethod.listList = listList;
	}
	/**
	 * gets current liveInv
	 * @return
	 */
	public static ArrayList<Item> getLiveInv() {
		return liveInv;
	}
	/**
	 * sets current liveInv
	 * @param liveInv
	 */
	public static void setLiveInv(ArrayList<Item> liveInv) {
		InventoryMethod.liveInv = liveInv;
	}

	public JFrame getInvFrame() {
		return invFrame;
	}

	public void setInvFrame(JFrame invFrame) {
		this.invFrame = invFrame;
	}
	
	
	

}
