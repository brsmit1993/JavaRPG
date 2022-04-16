/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * File controsl adding stat points to current player stats.
 */
package getsetStats;

import java.util.ArrayList;

import gameMethods.MainGame;
import player.Player;

public class StatAdd {
	
	static MainGame game = new MainGame(); // used to get CurrIndx
	private static ArrayList<Player> player; // used to store current player list
	/**
	 *  sets current player str to str + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setStr(int amount) 
	{
		StatAdd.setPlayer(MainGame.getPlayer());
		if (player.get(game.getCurIndx()).getStr() == 10)
		{
			
			return false;
		}
		else 
		{
			player.get(game.getCurIndx()).setStr(player.get(game.getCurIndx()).getStr() + amount);

			MainGame.setPlayer(StatAdd.getPlayer());
			return true;
		}	
	}
	/**
	 *  sets current player sma to sma + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setSma(int amount) 
	{
		StatAdd.setPlayer(MainGame.getPlayer());
		if (player.get(game.getCurIndx()).getSma() == 10)
		{
			return false;
		}
		else 
		{
			player.get(game.getCurIndx()).setSma(player.get(game.getCurIndx()).getSma() + amount);
			MainGame.setPlayer(StatAdd.getPlayer());
			return true;
		}	
	}
	/**
	 *  sets current player luc to luc + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setLuc(int amount) 
	{
		StatAdd.setPlayer(MainGame.getPlayer());
		if (player.get(game.getCurIndx()).getLuc() == 10)
		{
			return false;
		}
		else 
		{
			player.get(game.getCurIndx()).setLuc(player.get(game.getCurIndx()).getLuc() + amount);
			MainGame.setPlayer(StatAdd.getPlayer());
			return true;
		}	
	}
	/**
	 *  sets current player def to def + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setDef(int amount) 
	{
		StatAdd.setPlayer(MainGame.getPlayer());
		if (player.get(game.getCurIndx()).getDef() == 10)
		{
			return false;
		}
		else 
		{
			player.get(game.getCurIndx()).setDef(player.get(game.getCurIndx()).getDef() + amount);
			MainGame.setPlayer(StatAdd.getPlayer());
			return true;
		}	
	}
	/**
	 *  sets current player spd to spd + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setSpd(int amount) 
	{
		StatAdd.setPlayer(MainGame.getPlayer());
		if (player.get(game.getCurIndx()).getSpd() == 10)
		{
			return false;
		}
		else 
		{
			player.get(game.getCurIndx()).setSpd(player.get(game.getCurIndx()).getSpd() + amount);
			MainGame.setPlayer(StatAdd.getPlayer());
			return true;
		}	
	}
	/**
	 *  sets current player hp to hp + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setHp(int amount) 
	{
		StatAdd.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setHp(player.get(game.getCurIndx()).getHp() + amount);
		if(player.get(game.getCurIndx()).getHp() > player.get(game.getCurIndx()).getMaxHp())
		{
			player.get(game.getCurIndx()).setHp(player.get(game.getCurIndx()).getMaxHp());
		}
		MainGame.setPlayer(StatAdd.getPlayer());
		return true;
	}
	/**
	 *  sets current player sp to sp + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setSp(int amount) 
	{
		StatAdd.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setSp(player.get(game.getCurIndx()).getSp() + amount);
		if(player.get(game.getCurIndx()).getSp() > player.get(game.getCurIndx()).getMaxSp())
		{
			player.get(game.getCurIndx()).setSp(player.get(game.getCurIndx()).getMaxSp());
		}
		MainGame.setPlayer(StatAdd.getPlayer());
		return true;
	}
	/**
	 *  sets current player maxhp to maxhp + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setMaxHp(int amount) 
	{
		StatAdd.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setMaxHp(player.get(game.getCurIndx()).getMaxHp() + amount);
		StatAdd.setPlayer(MainGame.getPlayer());
		return true;
	}
	/**
	 *  sets current player maxsp to maxsp + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setMaxSp(int amount) 
	{
		StatAdd.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setMaxSp(player.get(game.getCurIndx()).getMaxSp() + amount);
		MainGame.setPlayer(StatAdd.getPlayer());
		return true;
	}
	/**
	 *  sets current player xp to xp + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setXp(int amount) {
		StatAdd.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setXp(player.get(game.getCurIndx()).getXp() + amount);
		MainGame.setPlayer(StatAdd.getPlayer());
		return true;
	}
	/**
	 *  sets current player lvl to lvl + amount
	 * @param amount
	 * @return if success or not
	 */
	public boolean setLvl(int amount) {
		StatAdd.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setLvl(player.get(game.getCurIndx()).getLvl() + amount);
		MainGame.setPlayer(StatAdd.getPlayer());
		return true;	
	}
	/**
	 *  sets current player cordx to cordx + amount
	 * @param amount
	 */
	public void setCordX (int amount) {
		StatAdd.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setCordX(player.get(game.getCurIndx()).getCordX() + amount);
		MainGame.setPlayer(StatAdd.getPlayer());
	}
	/**
	 *  sets current cordy to cordy + amount
	 * @param amount
	 */
	public void setCordY (int amount) {
		StatAdd.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setCordY(player.get(game.getCurIndx()).getCordY() + amount);
		MainGame.setPlayer(StatAdd.getPlayer());
	}
	/**
	 *  sets current player gold to gold + amount
	 * @param amount
	 */
	public void setGold (int amount) {
		StatAdd.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setGold(player.get(game.getCurIndx()).getGold() + amount);
		MainGame.setPlayer(StatAdd.getPlayer());
	}
	public void setSkillPoints(int amount)
	{
		StatAdd.setPlayer(MainGame.getPlayer());
		player.get(game.getCurIndx()).setSkillPoints(player.get(game.getCurIndx()).getSkillPoints() + amount);
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
		StatAdd.player = player;
	}
}
