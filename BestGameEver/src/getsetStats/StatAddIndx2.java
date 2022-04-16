/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * File controsl adding stat points to index 2 player stats during pvp.
 */
package getsetStats;

import java.util.ArrayList;

import battleMode.PVPMode;
import gameMethods.MainGame;
import player.Player;

public class StatAddIndx2 {
	
	static PVPMode pvp = new PVPMode(); // used to get index2
	private static ArrayList<Player> player; // used to store current player list
	/**
	 *  sets index2 player str to str + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setStr(int amount) 
	{
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		if (player.get(pvp.getCurIndx2()).getStr() == 10)
		{
			return false;
		}
		else 
		{
			player.get(pvp.getCurIndx2()).setStr(player.get(pvp.getCurIndx2()).getStr() + amount);
			MainGame.setPlayer(StatAddIndx2.getPlayer());
			return true;
		}	
	}
	/**
	 *  sets index2 player sma to sma + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setSma(int amount) 
	{
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		if (player.get(pvp.getCurIndx2()).getSma() == 10)
		{
			return false;
		}
		else 
		{
			player.get(pvp.getCurIndx2()).setSma(player.get(pvp.getCurIndx2()).getSma() + amount);
			MainGame.setPlayer(StatAddIndx2.getPlayer());
			return true;
		}	
	}
	/**
	 *  sets index2 player luc to luc + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setLuc(int amount) 
	{
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		if (player.get(pvp.getCurIndx2()).getLuc() == 10)
		{
			return false;
		}
		else 
		{
			player.get(pvp.getCurIndx2()).setLuc(player.get(pvp.getCurIndx2()).getLuc() + amount);
			MainGame.setPlayer(StatAddIndx2.getPlayer());
			return true;
		}	
	}
	/**
	 *  sets index2 player def to def + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setDef(int amount) 
	{
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		if (player.get(pvp.getCurIndx2()).getDef() == 10)
		{
			return false;
		}
		else 
		{
			player.get(pvp.getCurIndx2()).setDef(player.get(pvp.getCurIndx2()).getDef() + amount);
			MainGame.setPlayer(StatAddIndx2.getPlayer());
			return true;
		}	
	}
	/**
	 *  sets index2 player spd to spd + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setSpd(int amount) 
	{
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		if (player.get(pvp.getCurIndx2()).getSpd() == 10)
		{
			return false;
		}
		else 
		{
			player.get(pvp.getCurIndx2()).setSpd(player.get(pvp.getCurIndx2()).getSpd() + amount);
			MainGame.setPlayer(StatAddIndx2.getPlayer());
			return true;
		}	
	}
	/**
	 *  sets index2 player hp to hp + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setHp(int amount) 
	{
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setHp(player.get(pvp.getCurIndx2()).getHp() + amount);
		if(player.get(pvp.getCurIndx2()).getHp() > player.get(pvp.getCurIndx2()).getMaxHp())
		{
			player.get(pvp.getCurIndx2()).setHp(player.get(pvp.getCurIndx2()).getMaxHp());
		}
		MainGame.setPlayer(StatAddIndx2.getPlayer());
		return true;
	}
	/**
	 *  sets index2 player sp to sp + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setSp(int amount) 
	{
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setSp(player.get(pvp.getCurIndx2()).getSp() + amount);
		if(player.get(pvp.getCurIndx2()).getSp() > player.get(pvp.getCurIndx2()).getMaxSp())
		{
			player.get(pvp.getCurIndx2()).setSp(player.get(pvp.getCurIndx2()).getMaxSp());
		}
		MainGame.setPlayer(StatAddIndx2.getPlayer());
		return true;
	}
	/**
	 *  sets index2 player maxhp to maxhp + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setMaxHp(int amount) 
	{
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setMaxHp(player.get(pvp.getCurIndx2()).getMaxHp() + amount);
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		return true;
	}
	/**
	 *  sets index2 player maxsp to maxsp + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setMaxSp(int amount) 
	{
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setMaxSp(player.get(pvp.getCurIndx2()).getMaxSp() + amount);
		MainGame.setPlayer(StatAddIndx2.getPlayer());
		return true;
	}
	/**
	 *  sets index2 player xp to xp + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setXp(int amount) {
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setXp(player.get(pvp.getCurIndx2()).getXp() + amount);
		MainGame.setPlayer(StatAddIndx2.getPlayer());
		return true;
	}
	/**
	 *  sets index2 player lvl to lvl + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setLvl(int amount) {
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setLvl(player.get(pvp.getCurIndx2()).getLvl() + amount);
		MainGame.setPlayer(StatAddIndx2.getPlayer());
		return true;	
	}
	/**
	 *  sets index2 player cordx to cordx + amount
	 * @param amount
	 */
	public void setCordX (int amount) {
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setCordX(player.get(pvp.getCurIndx2()).getCordX() + amount);
		MainGame.setPlayer(StatAddIndx2.getPlayer());
	}
	/**
	 *  sets index2 cordy to cordy + amount
	 * @param amount
	 */
	public void setCordY (int amount) {
		StatAddIndx2.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setCordY(player.get(pvp.getCurIndx2()).getCordY() + amount);
		MainGame.setPlayer(StatAddIndx2.getPlayer());
	}
	
	public void setSkillPoints(int amount)
	{
		StatAdd.setPlayer(MainGame.getPlayer());
		player.get(pvp.getCurIndx2()).setSkillPoints(player.get(pvp.getCurIndx2()).getSkillPoints() + amount);
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
		StatAddIndx2.player = player;
	}
}
