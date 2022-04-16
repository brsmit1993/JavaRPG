/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * file stores info for HP potion
 */
package inventory;

public class HpPotion extends Item {
	/**
	 * sets item info for HP potion
	 */
	public HpPotion () 
	{
		setItemName("Health Potion"); // sets item name
		setItemValue(150); // sets item value for shop
		setConsumeable(true); // removed after use
	}
	/**
	 * how it effects player when used 
	 */
	@Override
	public void statEffect(int dex, boolean p2) {
		if(p2)
		{
		addDex2.setHp(100);	
		}
		else
		{	
		add.setHp(100);
		}
	}
}
