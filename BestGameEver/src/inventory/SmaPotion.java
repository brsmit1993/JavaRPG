/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 */
package inventory;

public class SmaPotion extends Item{
	/**
	 * sets SmaPotion info name through constructor	
	 */
	public SmaPotion () 
	{
		setItemName("Intelligence Potion");
		setItemValue(1000);
		setConsumeable(true);
	}
	/**
	 * how it effects player when used
	 */
	@Override
	public void statEffect(int dex, boolean p2) {
		if (p2)
		{
			boolean suc; // did item get used successfully?
			suc = addDex2.setSma(1); // returns if player gained stat
			if(suc == true) // only dispalys if palyer gained stat 
			{
			}	
		}
		else
		{	
		boolean suc; // did item get used successfully?
		suc = add.setSma(1); // returns if player gained stat
		if(suc == true) // only dispalys if palyer gained stat 
		{
		}
		}
	}
}
