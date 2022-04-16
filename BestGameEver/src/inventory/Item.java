/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * file stores basic layout for items as well as objects used and setters and getters
 */
package inventory;

import gameMethods.MainGame;
import getsetStats.StatAdd;
import getsetStats.StatAddIndx2;
import getsetStats.StatSub;
import guiComponents.Images;
import ui.StatDisplay;
import ui.StatDisplayIndx2;
public abstract class Item {

	protected static StatAdd add = new StatAdd(); // used for items that positively effect stats
	protected StatDisplayIndx2 dspDex2 = new StatDisplayIndx2(); // instantes StatDisplay to display player 2 stats in pvp mode
	protected static StatAddIndx2 addDex2 = new StatAddIndx2(); // incase of pvp
	protected static StatSub sub = new StatSub(); // used to remove stats from player who used items
	protected static StatDisplay dsp = new StatDisplay(); // displays new stats if item used successful
	protected static Images img = new Images();
	protected static MainGame game = new MainGame();
	
	String itemName = null; // item name
	int itemValue = 0; // item value for shop
	boolean consumeable = false; // is item removed after use?
	
	/**
	 * sets generic method name for all items
	 */
	public void statEffect(int dex, boolean p2)
	{
		
	}
	/**
	 * 
	 * @return is item removed?
	 */
	public boolean isConsumeable() 
	{
		return consumeable;
	}
	/**
	 * sets if item is used
	 * @param consumeable
	 */
	public void setConsumeable(boolean consumeable) 
	{
		this.consumeable = consumeable;
	}
	/**
	 * get item name set by item in constructor
	 * @return
	 */
	public String getItemName() 
	{
		return itemName;	
	}
	/**
	 * set item name
	 * @param itemName
	 */
	public void setItemName(String itemName) 
	{
		this.itemName = itemName;
	}
	/**
	 * get item value in constructor
	 * @return
	 */
	public int getItemValue() 
	{
		return itemValue;
	}
	/** 
	 * sets item value
	 * @param itemValue
	 */
	public void setItemValue(int itemValue) 
	{
		this.itemValue = itemValue;
	}
	
	
}
