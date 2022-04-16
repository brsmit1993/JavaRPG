/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package player;

import java.util.ArrayList;
import gameMethods.MainGame;

public class CallAbility{
	
	private static ArrayList<Player> player; // stores player classes
	
	/**
	 * calls ability 1 based on index and indx2. indx2 is a bool that defines if it's player 1 or 2 during pvp.
	 * in monster battle indx2 is always set to false. in pvp mode indx2 becomes true if it's player 2 attacking
	 * @param indx
	 * @param indx2
	 * @return
	 */
	public int callAbil1(int indx, boolean indx2)
	{
		CallAbility.setPlayer(MainGame.getPlayer());
		return player.get(indx).ability1(indx2);
		
	}
	
	/**
	 * calls ability 2 based on index and indx2. indx2 is a bool that defines if it's player 1 or 2 during pvp.
	 * in monster battle indx2 is always set to false. in pvp mode indx2 becomes true if it's player 2 attacking
	 * @param indx
	 * @param indx2
	 * @return
	 */
	public int callAbil2(int indx, boolean indx2)
	{
		CallAbility.setPlayer(MainGame.getPlayer());
		return player.get(indx).ability2(indx2);
		
	}
	
	/**
	 * calls ability 3 based on index and indx2. indx2 is a bool that defines if it's player 1 or 2 during pvp.
	 * in monster battle indx2 is always set to false. in pvp mode indx2 becomes true if it's player 2 attacking
	 * @param indx
	 * @param indx2
	 * @return
	 */
	public int callAbil3(int indx, boolean indx2)
	{
		CallAbility.setPlayer(MainGame.getPlayer());
		return player.get(indx).ability3(indx2);
		
	}
	
	/**
	 * sets player array list with current player list
	 * @param player
	 */
	public static void setPlayer(ArrayList<Player> player) {
		CallAbility.player = player;
	}
	
	
	

}
