/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * Used to set interface for ListEvent
 */
package getEvent;

import java.util.ArrayList;

import player.Player;

public interface ListEventInterface {

	/**
	 * used to get event
	 */
	public void eventGet(int maxX, int maxY, int chanceNum);
	
	/**
	 * used to get player list
	 * @return
	 */
	public static ArrayList<Player> getPlayer() {
		return null;
	}
	
	/**
	 * used to set player list
	 * @param player
	 */
	public static void setPlayer(ArrayList<Player> player) {
	}
}

