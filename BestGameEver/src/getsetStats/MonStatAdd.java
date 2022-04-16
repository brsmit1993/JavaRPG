/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * File controsl addings stat points to monsters stats. Currently not in use but coded for future use.
 */
package getsetStats;

import java.util.ArrayList;

import battleMode.MonsterBattle;
import monsters.Monster;

public class MonStatAdd {
	
	protected static ArrayList<Monster> monster; //used to store monster list
	static MonsterBattle monBat = new MonsterBattle(); // used to get index of monster
	
	/**
	 * sets monster Str + amount
	 * @param amount
	 */
	public void setStr(int amount)
	{
		MonStatAdd.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setStr( monster.get(monBat.getMonsIndx()).getStr() + amount);
		MonsterBattle.setMonster(MonStatAdd.getMonster());		
	}
	/**
	 * sets monster Sma + amount
	 * @param amount
	 */
	public void setSma(int amount)
	{
		MonStatAdd.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setSma( monster.get(monBat.getMonsIndx()).getSma() + amount);
		MonsterBattle.setMonster(MonStatAdd.getMonster());		
	}
	/**
	 * sets monster Luc + amount
	 * @param amount
	 */
	public void setLuc(int amount)
	{
		MonStatAdd.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setLuc( monster.get(monBat.getMonsIndx()).getLuc() + amount);
		MonsterBattle.setMonster(MonStatAdd.getMonster());		
	}
	/**
	 * sets monster Def + amount
	 * @param amount
	 */
	public void setDef(int amount)
	{
		MonStatAdd.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setDef( monster.get(monBat.getMonsIndx()).getDef() + amount);
		MonsterBattle.setMonster(MonStatAdd.getMonster());		
	}
	/**
	 * sets monster Spd + amount
	 * @param amount
	 */
	public void setSpd(int amount)
	{
		MonStatAdd.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setSpd( monster.get(monBat.getMonsIndx()).getSpd() + amount);
		MonsterBattle.setMonster(MonStatAdd.getMonster());		
	}
	/**
	 * sets monster Hp + amount
	 * @param amount
	 */
	public void setHp(int amount)
	{
		MonStatAdd.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setHp( monster.get(monBat.getMonsIndx()).getHp() + amount);
		MonsterBattle.setMonster(MonStatAdd.getMonster());		
	}
	/**
	 * sets monster SP + amount
	 * @param amount
	 */
	public void setSp(int amount)
	{
		MonStatAdd.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setSp( monster.get(monBat.getMonsIndx()).getSp() + amount);
		MonsterBattle.setMonster(MonStatAdd.getMonster());		
	}
	/**
	 * sets monster Xp + amount
	 * @param amount
	 */
	public void setXp(int amount)
	{
		MonStatAdd.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setXp( monster.get(monBat.getMonsIndx()).getXp() + amount);
		MonsterBattle.setMonster(MonStatAdd.getMonster());		
	}
	/**
	 * returns updated monster list
	 * @return
	 */
	public static ArrayList<Monster> getMonster() {
		 return monster;
	}
	/**
	 * gets current monster list
	 * @param monster
	 */
	public static void setMonster(ArrayList<Monster> monster) {
		MonStatAdd.monster = monster;
	}
}
