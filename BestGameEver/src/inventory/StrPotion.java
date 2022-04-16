/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * used to store strength Potion information as well as affect and return name
 */
package inventory;

public class StrPotion extends Item {	
	/**
	 * sets info for strength potion
	 */
	public StrPotion () 
	{
		setItemName("Strength Potion"); // sets item name
		setItemValue(1000); // sets item value for shop use
		setConsumeable(true); // item removed from inv after use
	}
	
	@Override
	public void statEffect(int dex, boolean p2) {
		if(p2)
		{
			boolean suc = false; // default set to false
			suc = addDex2.setStr(1); // if it works returns true
			if(suc == true) //only runs if potion worked 
			{
			}
		}
		else
		{
			boolean suc = false; // default set to false
			suc = add.setStr(1); // if it works returns true
			if(suc == true) //only runs if potion worked 
			{
			}
		}
	
	}
}
