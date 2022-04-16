/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * files used to call events based on location
 */
package locations;

import gameMethods.MainGame;

public class LocationCoin extends Location implements LocationBase {
	MainGame game = new MainGame();
	
	String localName = "Coin Shop"; // name displayed in console
	
	int battleDif = 0; // dicatates monster that will appear / battle difficulty
	
	/**
	 * calls shop event
	 */
	@Override
	public void event(int chanceNum) {
		shopEvent.shopEvent(MainGame.getCurIndx(), false, false, false);
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
