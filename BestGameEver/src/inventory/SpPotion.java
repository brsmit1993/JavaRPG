/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * stores item info and stat effect for SP potion
 */
package inventory;

public class SpPotion extends Item{
	/**
	 * defines information for SpPotion
	 */
	public SpPotion () 
	{
		setItemName("SP Potion"); //sets name
		setItemValue(200); // sets value for shop
		setConsumeable(true); // removed from inv after use
	}
	/**
	 * used to add Sp to player stat when player uses item
	 */
	@Override
	public void statEffect(int dex, boolean p2) {
		if(p2)
		{
		addDex2.setSp(100);	
		}
		else
		{
		add.setSp(100);
		}
	}
}
