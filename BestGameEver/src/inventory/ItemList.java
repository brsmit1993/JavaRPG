/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * used to store all items in game and pulled from list as needed
 */
package inventory;

import java.util.ArrayList;

public class ItemList {
	
	private static SmaPotion SmaP = new SmaPotion(); // intelligence potion
	private static DefPotion DefP = new DefPotion(); // defense potion
	private static HpPotion HpP = new HpPotion(); // HP potion
	private static LucPotion LucP = new LucPotion(); // Luck Potion
	private static SpdPotion SpdP = new SpdPotion(); // Speed Potion
	private static SpPotion SpP = new SpPotion(); // Sp Potion
	private static StrPotion StrP = new StrPotion(); // Strength potion
	private static XpPotion XpP = new XpPotion(); // Xp Potion
	private static Map map = new Map(); // this is a map
	private static GPS gps = new GPS(); // this is an appple... oh wait it's a gps my bad
	
	/**
	 * creates list named item to store all all items
	 */
	private static ArrayList<Item> item = new ArrayList<Item>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = -6998129655740529429L;

		{
			add(HpP);//0
			add(SpP);//1
			add(SmaP);//2
			add(LucP);//3
			add(SpdP);//4
			add(StrP);//5
			add(DefP);//6
			add(XpP);//7
			add(gps);//8
			add(map);//9
		}
		
	};
	
	/**
	 * 
	 * @return list of items
	 */
	public static ArrayList<Item> getItem() {
		return ItemList.item;
	}
}
