/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * files used to call events based on location
 */
package locations;

import algorithms.Chance;

public class LocationForest extends Location implements LocationBase {
	
	private Chance chance = new Chance();
	
	String localName = "Dark Forest"; // name displayed in console
	
	int battleDif = 2; // dicatates monster that will appear / battle difficulty
	
	/**
	 * calls event based on chance
	 */
	@Override
	public void event(int chanceNum) {
		if (chanceNum <= 100)
		{
			hint.hintWin();
		}
		if (chanceNum >= 101 && chanceNum <= 200)
		{
			battle.monsterFight(battleDif, false);
		}
		if (chanceNum >= 201)
		{
			int cha = chance.getChance30noluck();
			forrestEvent.getEvent(cha, 0, true);
		}
	}
	/**
	 * @return localName
	 */
	@Override
	public String getlocalName() {
		return localName;
	}
	/**
	 * @return battle difficulty
	 */
	@Override
	public int getBattleDif() {
		return battleDif;
	}
}
