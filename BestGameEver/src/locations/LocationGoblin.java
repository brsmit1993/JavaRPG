/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * files used to call events based on location
 */
package locations;

public class LocationGoblin extends Location implements LocationBase {
	
	String localName = "Goblin King Palace"; // name displayed in console
	
	int battleDif = 4; // dicatates monster that will appear / battle difficulty
	
	/**
	 * calls battle sequence through MonsterFight class and chooses the golbin king
	 */
	@Override
	public void event(int chanceNum) {
		battle.monsterFight(battleDif, false);
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
