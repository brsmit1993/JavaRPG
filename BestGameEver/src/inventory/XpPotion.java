/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * file to store XP potion information as well as its affect when used by player
 */
package inventory;

import gameMethods.CheckLvlMethod;

public class XpPotion extends Item {
	
	private CheckLvlMethod lvl = new CheckLvlMethod(); // used to pull info on lvl requirements
	
	/**
	 * contstructor for item XP potion
	 */
	public XpPotion () 
	{
		setItemName("XP Potion"); // sets item name
		setItemValue(1000); //sets item value for shop
		setConsumeable(true); // item removed from inv after use
	}
	
	/**
	 *  adds XP to current player and checks for lvlup / displays new info
	 */
	@Override
	public void statEffect(int dex, boolean p2) {
		if(p2)
		{
			addDex2.setXp(500);		
			lvl.checkLvlUp(p2);
		}
		else
		{
			add.setXp(500);			
			lvl.checkLvlUp(false);
		}

		
	}	
}
