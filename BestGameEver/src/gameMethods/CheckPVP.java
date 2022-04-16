/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * The purpose of this file is to check and see if two players are in the same location and if they are it retursn true if not then it returns false
 */
package gameMethods;

import java.util.ArrayList;

import battleMode.PVPMode;
import player.Player;


public class CheckPVP {
	
	private static MainGame game = new MainGame(); // used to get curIndx
	private static ArrayList<Player> player; // used to get players information from MainGame Player

	
	
	
	private static int curIndex2; // used to store second index for pulling player information
	
	/**
	 * returns true if two players are found to be in the same location
	 * @return
	 */
	public boolean checkPVP() {
		
		CheckPVP.setPlayer(MainGame.getPlayer()); //sets player list to current MainGame player list

		

				
		// runs through and checks all players currently in game and compares it to the current players location
		for (int i = 0; i < player.size(); ++i)
		{	
				//essentially checks to make sure that both players belong to the player class
			
			
				// checks if current players cords match player pulled from list cords
				if (player.get(game.getCurIndx()).getCordX() == player.get(i).getCordX() && player.get(game.getCurIndx()).getCordY() == player.get(i).getCordY())
			{
				CheckPVP.setCurIndex2(i); //sets index to the i which is the index that matched with current players location
				if(game.getCurIndx() != curIndex2) { // prevents the current players index from being used as curindex2
					PVPMode.setCurIndx2(i);
					return true;
				}
			}
			
		}
		
		
		return false;
		
	}

	public static ArrayList<Player> getPlayer() {
		return player;
	}

	public static void setPlayer(ArrayList<Player> player) {
		CheckPVP.player = player;
	}
	public int getCurIndex2() {
		return curIndex2;
	}

	public static void setCurIndex2(int curIndex2) {
		CheckPVP.curIndex2 = curIndex2;
	}
	
}
