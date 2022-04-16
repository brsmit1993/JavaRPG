/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 */
package inventory;

public class SpdPotion extends Item {
	/**
	 * sets SpdPotion info through constructor
	 */
	public SpdPotion () 
	{
		setItemName("Speed Potion"); // sets name
		setItemValue(1000); //sets value for use at shop
		setConsumeable(true); // removed from inv after use
	}
	
	/**
	 * how item effects player when used
	 */
	@Override
	public void statEffect(int dex, boolean p2) 
	{
		if (p2)
		{
			boolean suc; // did player gain stat?
			suc = addDex2.setSpd(1); // returns if player gained stat
			if(suc == true)  // only shows if player gained stat
			{
			}
		}
		else
		{
			boolean suc; // did player gain stat?
			suc = add.setSpd(1); // returns if player gained stat
			if(suc == true)  // only shows if player gained stat
			{
			}	
		}

	}
}
