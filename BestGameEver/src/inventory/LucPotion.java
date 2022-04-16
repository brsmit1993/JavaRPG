/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * file used to store info and effect of Luck Potion
 */
package inventory;

public class LucPotion extends Item{
	/**
	 * sets info for LucPotion in constructor
	 */
	public LucPotion () 
	{
		setItemName("Luck Potion"); // item name
		setItemValue(1000); // item value in shop
		setConsumeable(true); // removed after use
	}
	/**
	 * effect when player uses item
	 */
	@Override
	public void statEffect(int dex, boolean p2) 
	{
		if(p2)
		{
			boolean suc; // did item get stat point?
			suc = addDex2.setLuc(1); // returns if item got stat point
			if(suc == true)  // only displays if player got stat point
			{
			}
		}
		else
		{
			boolean suc; // did item get stat point?
			suc = add.setLuc(1); // returns if item got stat point
			if(suc == true)  // only displays if player got stat point
			{
			}	
		}

	}
}
