/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * Used for item Defense Potion to Increase Defense Stat By 1 when player chooses.
 */
package inventory;

public class DefPotion extends Item {
	/**
	 * sets info for defesne potion with constructor
	 */
	public DefPotion () 
	{
		setItemName("Defense Potion"); // sets item name
		setItemValue(1000); // sets item value for shop
		setConsumeable(true); // removed after use
	}
	/**
	 * effect of use of item
	 */
	@Override
	public void statEffect(int dex, boolean p2) 
	{

		add.setDef(1); // adds 1 to stat

	}
}
