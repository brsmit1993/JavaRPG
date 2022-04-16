/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * File controsl removing stat points from monsters stats. Used in MonsterBattle Class
 */
package getsetStats;

import java.util.ArrayList;

import battleMode.MonsterBattle;
import monsters.Monster;


public class MonStatSub {
	
	protected static ArrayList<Monster> monster; // used to store current mosnter list	
	static MonsterBattle monBat = new MonsterBattle(); // used to get current mosnter indx
	
	/**
	 * sets monster Str - amount
	 * @param amount
	 */
	public void setStr(int amount)
	{
		MonStatSub.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setStr( monster.get(monBat.getMonsIndx()).getStr() - amount);
		MonsterBattle.setMonster(MonStatSub.getMonster());		
	}
	/**
	 * sets monster Sma - amount
	 * @param amount
	 */
	public void setSma(int amount)
	{
		MonStatSub.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setSma( monster.get(monBat.getMonsIndx()).getSma() - amount);
		MonsterBattle.setMonster(MonStatSub.getMonster());		
	}
	/**
	 * sets monster Luc - amount
	 * @param amount
	 */
	public void setLuc(int amount)
	{
		MonStatSub.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setLuc( monster.get(monBat.getMonsIndx()).getLuc() - amount);
		MonsterBattle.setMonster(MonStatSub.getMonster());		
	}
	/**
	 * sets monster Def - amount
	 * @param amount
	 */
	public void setDef(int amount)
	{
		MonStatSub.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setDef( monster.get(monBat.getMonsIndx()).getDef() - amount);
		MonsterBattle.setMonster(MonStatSub.getMonster());		
	}
	/**
	 * sets monster Spd - amount
	 * @param amount
	 */
	public void setSpd(int amount)
	{
		MonStatSub.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setSpd( monster.get(monBat.getMonsIndx()).getSpd() - amount);
		MonsterBattle.setMonster(MonStatSub.getMonster());		
	}
	/**
	 * sets monster Hp - amount
	 * @param amount
	 */
	public void setHp(int amount)
	{
		MonStatSub.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setHp( monster.get(monBat.getMonsIndx()).getHp() - amount);
		MonsterBattle.setMonster(MonStatSub.getMonster());		
	}
	/**
	 * sets monster Sp - amount
	 * @param amount
	 */
	public void setSp(int amount)
	{
		MonStatSub.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setSp( monster.get(monBat.getMonsIndx()).getSp() - amount);
		MonsterBattle.setMonster(MonStatSub.getMonster());		
	}
	/**
	 * sets monster Xp - amount
	 * @param amount
	 */
	public void setXp(int amount)
	{
		MonStatSub.setMonster(MonsterBattle.getMonster());
		monster.get(monBat.getMonsIndx()).setXp( monster.get(monBat.getMonsIndx()).getXp() - amount);
		MonsterBattle.setMonster(MonStatSub.getMonster());		
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
		MonStatSub.monster = monster;
	}
}
