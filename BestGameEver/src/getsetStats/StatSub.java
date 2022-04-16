/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * File controsl removing stat points from current player stats.
 */
package getsetStats;

import java.util.ArrayList;

import gameMethods.MainGame;
import player.Player;

public class StatSub {
	static MainGame game = new MainGame(); // used to get current index
	private static ArrayList<Player> player; // used to store current player list
	/**
	 *  sets current player str to str - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setStr(int amount) 
	{
		StatSub.setPlayer(MainGame.getPlayer());
		if(player.get(game.getCurIndx()).getStr() == 2 && amount == 2) {
			amount = 1;
			if(player.get(game.getCurIndx()).getStr() == 1) {
			return false;
			}
		}
			else {
				player.get(game.getCurIndx()).setStr(player.get(game.getCurIndx()).getStr() - amount);
				MainGame.setPlayer(StatSub.getPlayer());
				return true;
			}
		
		if(player.get(game.getCurIndx()).getStr() == 1) {
			return false;
			}
		else {
			player.get(game.getCurIndx()).setStr(player.get(game.getCurIndx()).getStr() - amount);
			MainGame.setPlayer(StatSub.getPlayer());
			return true;
		}

	}
	/**
	 *  sets current player sma to sma - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setSma(int amount) 
	{
		StatSub.setPlayer(MainGame.getPlayer());
		if(player.get(game.getCurIndx()).getStr() == 2 && amount == 2) {
			amount = 1;
			if(player.get(game.getCurIndx()).getStr() == 1) {
			return false;
			}
		}
			else {
				player.get(game.getCurIndx()).setStr(player.get(game.getCurIndx()).getStr() - amount);
				MainGame.setPlayer(StatSub.getPlayer());
				return true;
			}
		
		if(player.get(game.getCurIndx()).getStr() == 1) {
			return false;
			}
		else {
			player.get(game.getCurIndx()).setStr(player.get(game.getCurIndx()).getStr() - amount);
			MainGame.setPlayer(StatSub.getPlayer());
			return true;
		}

	}
	/**
	 *  sets current player luc to luc - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setLuc(int amount) 
	{
		StatSub.setPlayer(MainGame.getPlayer());
		if(player.get(game.getCurIndx()).getStr() == 2 && amount == 2) {
			amount = 1;
			if(player.get(game.getCurIndx()).getStr() == 1) {
			return false;
			}
		}
			else {
				player.get(game.getCurIndx()).setStr(player.get(game.getCurIndx()).getStr() - amount);
				MainGame.setPlayer(StatSub.getPlayer());
				return true;
			}
		
		if(player.get(game.getCurIndx()).getStr() == 1) {
			return false;
			}
		else {
			player.get(game.getCurIndx()).setStr(player.get(game.getCurIndx()).getStr() - amount);
			MainGame.setPlayer(StatSub.getPlayer());
			return true;
		}

	}
	/**
	 *  sets current player def to def - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setDef(int amount) 
	{
		StatSub.setPlayer(MainGame.getPlayer());
		if(player.get(game.getCurIndx()).getStr() == 2 && amount == 2) {
			amount = 1;
			if(player.get(game.getCurIndx()).getStr() == 1) {
			return false;
			}
		}
			else {
				player.get(game.getCurIndx()).setStr(player.get(game.getCurIndx()).getStr() - amount);
				MainGame.setPlayer(StatSub.getPlayer());
				return true;
			}
		
		if(player.get(game.getCurIndx()).getStr() == 1) {
			return false;
			}
		else {
			player.get(game.getCurIndx()).setStr(player.get(game.getCurIndx()).getStr() - amount);
			MainGame.setPlayer(StatSub.getPlayer());
			return true;
		}

	}
	/**
	 *  sets current player spd to spd - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setSpd(int amount) 
	{
		StatSub.setPlayer(MainGame.getPlayer());
		if(player.get(game.getCurIndx()).getStr() == 2 && amount == 2) {
			amount = 1;
			if(player.get(game.getCurIndx()).getStr() == 1) {
			return false;
			}
		}
			else {
				player.get(game.getCurIndx()).setStr(player.get(game.getCurIndx()).getStr() - amount);
				MainGame.setPlayer(StatSub.getPlayer());
				return true;
			}
		
		if(player.get(game.getCurIndx()).getStr() == 1) {
			return false;
			}
		else {
			player.get(game.getCurIndx()).setStr(player.get(game.getCurIndx()).getStr() - amount);
			MainGame.setPlayer(StatSub.getPlayer());
			return true;
		}

	}
	/**
	 *  sets current player xp to xp - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setXp(int amount) {
		StatSub.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setXp(player.get(game.getCurIndx()).getXp() - amount);
		MainGame.setPlayer(StatSub.getPlayer());
		return true;
	}
	/**
	 *  sets current player lvl to lvl - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setLvl(int amount) {
		player.get(game.getCurIndx()).setLvl(player.get(game.getCurIndx()).getLvl() - amount);
		MainGame.setPlayer(StatSub.getPlayer());
		return true;	
	}
	/**
	 *  sets current player hp to hp - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setHp(int amount) 
	{
		StatSub.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setHp(player.get(game.getCurIndx()).getHp() - amount);
		if(player.get(game.getCurIndx()).getHp() < 0)
		{
			player.get(game.getCurIndx()).setHp(0);
		}
		StatSub.setPlayer(MainGame.getPlayer());
		return true;
	}
	/**
	 *  sets current player sp to sp - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setSp(int amount) 
	{
		StatSub.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setSp(player.get(game.getCurIndx()).getSp() - amount);
		if(player.get(game.getCurIndx()).getSp() < 0)
		{
			player.get(game.getCurIndx()).setSp(0);
		}
		MainGame.setPlayer(StatSub.getPlayer());
		return true;
	}
	/**
	 *  sets current player maxhp to maxhp - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setMaxHp(int amount) 
	{
		StatSub.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setMaxHp(player.get(game.getCurIndx()).getMaxHp() - amount);
		StatSub.setPlayer(MainGame.getPlayer());
		return true;
	}
	/**
	 *  sets current player maxsp to maxsp - amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setMaxSp(int amount) 
	{
		StatSub.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setMaxSp(player.get(game.getCurIndx()).getMaxSp() - amount);
		MainGame.setPlayer(StatSub.getPlayer());
		return true;
	}
	/**
	 *  sets current player cordx to cordx - amount
	 * @param amount
	 */
	public void setCordX (int amount) {
		StatSub.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setCordX(player.get(game.getCurIndx()).getCordX() - amount);
		MainGame.setPlayer(StatSub.getPlayer());
	}
	/**
	 *  sets current cordy to cordy - amount
	 * @param amount
	 */
	public void setCordY (int amount) {
		StatSub.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setCordY(player.get(game.getCurIndx()).getCordY() - amount);
		MainGame.setPlayer(StatSub.getPlayer());
	}
	/**
	 *  sets current player gold to gold - amount
	 * @param amount
	 */
	public void setGold (int amount) {
		StatSub.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setGold(player.get(game.getCurIndx()).getGold() - amount);
		MainGame.setPlayer(StatSub.getPlayer());
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
		StatSub.player = player;
	}
	public void setSkillPoint(int amount) {
		StatSub.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setSkillPoints(player.get(game.getCurIndx()).getSkillPoints() - amount);
		MainGame.setPlayer(StatSub.getPlayer());	
	}
}