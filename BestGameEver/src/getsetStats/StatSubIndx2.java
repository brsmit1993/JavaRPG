/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * File controsl removing stat points from index2 players stats during pvp.
 */
package getsetStats;

import java.util.ArrayList;

import battleMode.PVPMode;
import gameMethods.MainGame;
import player.Player;

public class StatSubIndx2 {
	static PVPMode pvp = new PVPMode(); // used to get index 2
	private static ArrayList<Player> player; // used to store current player file
	/**
	 *  sets index2 player str to str - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setStr(int amount) 
	{
		StatSubIndx2.setPlayer(MainGame.getPlayer());
		if(player.get(pvp.getCurIndx2()).getStr() == 2 && amount == 2) {
			amount = 1;
			if(player.get(pvp.getCurIndx2()).getStr() == 1) {
			return false;
			}
		}
			else {
				player.get(pvp.getCurIndx2()).setStr(player.get(pvp.getCurIndx2()).getStr() - amount);
				MainGame.setPlayer(StatSubIndx2.getPlayer());
				return true;
			}
		
		if(player.get(pvp.getCurIndx2()).getStr() == 1) {
			return false;
			}
		else {
			player.get(pvp.getCurIndx2()).setStr(player.get(pvp.getCurIndx2()).getStr() - amount);
			MainGame.setPlayer(StatSubIndx2.getPlayer());
			return true;
		}

	}
	/**
	 *  sets index2 player sma to sma - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setSma(int amount) 
	{
		StatSubIndx2.setPlayer(MainGame.getPlayer());
		if(player.get(pvp.getCurIndx2()).getStr() == 2 && amount == 2) {
			amount = 1;
			if(player.get(pvp.getCurIndx2()).getStr() == 1) {
			return false;
			}
		}
			else {
				player.get(pvp.getCurIndx2()).setStr(player.get(pvp.getCurIndx2()).getStr() - amount);
				MainGame.setPlayer(StatSubIndx2.getPlayer());
				return true;
			}
		
		if(player.get(pvp.getCurIndx2()).getStr() == 1) {
			return false;
			}
		else {
			player.get(pvp.getCurIndx2()).setStr(player.get(pvp.getCurIndx2()).getStr() - amount);
			MainGame.setPlayer(StatSubIndx2.getPlayer());
			return true;
		}

	}
	/**
	 *  sets index2 player luc to luc - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setLuc(int amount) 
	{
		StatSubIndx2.setPlayer(MainGame.getPlayer());
		if(player.get(pvp.getCurIndx2()).getStr() == 2 && amount == 2) {
			amount = 1;
			if(player.get(pvp.getCurIndx2()).getStr() == 1) {
			return false;
			}
		}
			else {
				player.get(pvp.getCurIndx2()).setStr(player.get(pvp.getCurIndx2()).getStr() - amount);
				MainGame.setPlayer(StatSubIndx2.getPlayer());
				return true;
			}
		
		if(player.get(pvp.getCurIndx2()).getStr() == 1) {
			return false;
			}
		else {
			player.get(pvp.getCurIndx2()).setStr(player.get(pvp.getCurIndx2()).getStr() - amount);
			MainGame.setPlayer(StatSubIndx2.getPlayer());
			return true;
		}

	}
	/**
	 *  sets index2 player def to def - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setDef(int amount) 
	{
		StatSubIndx2.setPlayer(MainGame.getPlayer());
		if(player.get(pvp.getCurIndx2()).getStr() == 2 && amount == 2) {
			amount = 1;
			if(player.get(pvp.getCurIndx2()).getStr() == 1) {
			return false;
			}
		}
			else {
				player.get(pvp.getCurIndx2()).setStr(player.get(pvp.getCurIndx2()).getStr() - amount);
				MainGame.setPlayer(StatSubIndx2.getPlayer());
				return true;
			}
		
		if(player.get(pvp.getCurIndx2()).getStr() == 1) {
			return false;
			}
		else {
			player.get(pvp.getCurIndx2()).setStr(player.get(pvp.getCurIndx2()).getStr() - amount);
			MainGame.setPlayer(StatSubIndx2.getPlayer());
			return true;
		}

	}
	/**
	 *  sets index2 player spd to spd - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setSpd(int amount) 
	{
		StatSubIndx2.setPlayer(MainGame.getPlayer());
		if(player.get(pvp.getCurIndx2()).getStr() == 2 && amount == 2) {
			amount = 1;
			if(player.get(pvp.getCurIndx2()).getStr() == 1) {
			return false;
			}
		}
			else {
				player.get(pvp.getCurIndx2()).setStr(player.get(pvp.getCurIndx2()).getStr() - amount);
				MainGame.setPlayer(StatSubIndx2.getPlayer());
				return true;
			}
		
		if(player.get(pvp.getCurIndx2()).getStr() == 1) {
			return false;
			}
		else {
			player.get(pvp.getCurIndx2()).setStr(player.get(pvp.getCurIndx2()).getStr() - amount);
			MainGame.setPlayer(StatSubIndx2.getPlayer());
			return true;
		}

	}
	/**
	 *  sets index2 player xp to xp - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setXp(int amount) {
		StatSubIndx2.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setXp(player.get(pvp.getCurIndx2()).getXp() - amount);
		MainGame.setPlayer(StatSubIndx2.getPlayer());
		return true;
	}
	/**
	 *  sets index2 player lvl to lvl + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setLvl(int amount) {
		player.get(pvp.getCurIndx2()).setLvl(player.get(pvp.getCurIndx2()).getLvl() - amount);
		MainGame.setPlayer(StatAdd.getPlayer());
		return true;	
	}
	/**
	 *  sets index2 player hp to hp - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setHp(int amount) 
	{
		StatSubIndx2.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setHp(player.get(pvp.getCurIndx2()).getHp() - amount);
		if(player.get(pvp.getCurIndx2()).getHp() < 0)
		{
			player.get(pvp.getCurIndx2()).setHp(0);
		}
		StatSubIndx2.setPlayer(MainGame.getPlayer());
		return true;
	}
	/**
	 *  sets index2 player sp to sp - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setSp(int amount) 
	{
		StatSubIndx2.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setSp(player.get(pvp.getCurIndx2()).getSp() - amount);
		if(player.get(pvp.getCurIndx2()).getSp() < 0)
		{
			player.get(pvp.getCurIndx2()).setSp(0);
		}
		MainGame.setPlayer(StatSubIndx2.getPlayer());
		return true;
	}
	/**
	 *  sets index2 player maxhp to maxhp - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setMaxHp(int amount) 
	{
		StatSubIndx2.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setMaxHp(player.get(pvp.getCurIndx2()).getMaxHp() - amount);
		StatSubIndx2.setPlayer(MainGame.getPlayer());
		return true;
	}
	/**
	 *  sets index2 player maxsp to maxsp - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setMaxSp(int amount) 
	{
		StatSubIndx2.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setMaxSp(player.get(pvp.getCurIndx2()).getMaxSp() - amount);
		MainGame.setPlayer(StatSubIndx2.getPlayer());
		return true;
	}
	/**
	 *  sets index2 player cordx to cordx - amount
	 * @param amount
	 */
	public void setCordX (int amount) {
		StatAdd.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setCordX(player.get(pvp.getCurIndx2()).getCordX() - amount);
		MainGame.setPlayer(StatAdd.getPlayer());
	}
	/**
	 *  sets index2 cordy to cordy - amount
	 * @param amount
	 */
	public void setCordY (int amount) {
		StatAdd.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setCordY(player.get(pvp.getCurIndx2()).getCordY() - amount);
		MainGame.setPlayer(StatAdd.getPlayer());
	}
	/**
	 * 
	 * @return new player list
	 */
	public static ArrayList<Player> getPlayer() {
		return player;
	}
	/**
	 * 
	 * @param player gets current player list
	 */
	public static void setPlayer(ArrayList<Player> player) {
		StatSubIndx2.player = player;
	}
}