/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file gets the current mosnter indexes stats
 */
package ui;

import java.util.ArrayList;

import javax.swing.JLabel;

import battleMode.MonsterBattle;
import monsters.Monster;

public class MonStatDisplay {
	
	private static ArrayList<Monster> monster; // stores current mosnter list	
	private static MonsterBattle monBat = new MonsterBattle(); // calls current monster class
	
	/**
	 * gets monsters name based MonsterBattles setting for MonsIndx
	 * @return
	 */
	public String getName() 
	{
		MonStatDisplay.setMonster(MonsterBattle.getMonster());
		return monster.get(monBat.getMonsIndx()).getMonsterName();
	}
	/**
	 * gets monsters description based MonsterBattles setting for MonsIndx
	 * @return
	 */
	public String getDesc()
	{
		MonStatDisplay.setMonster(MonsterBattle.getMonster());
		return monster.get(monBat.getMonsIndx()).getMonsterDesc();
	}
	/**
	 * gets monsters strength based MonsterBattles setting for MonsIndx
	 * @return
	 */
	public int getStr()
	{
		MonStatDisplay.setMonster(MonsterBattle.getMonster());
		return monster.get(monBat.getMonsIndx()).getStr();
	}
	/**
	 * gets monsters intelligence based MonsterBattles setting for MonsIndx
	 * @return
	 */
	public int getSma()
	{
		MonStatDisplay.setMonster(MonsterBattle.getMonster());
		return monster.get(monBat.getMonsIndx()).getSma();
	}
	/**
	 * gets monsters luck based MonsterBattles setting for MonsIndx
	 * @return
	 */
	public int getLuc()
	{
		MonStatDisplay.setMonster(MonsterBattle.getMonster());
		return monster.get(monBat.getMonsIndx()).getLuc();
	}
	/**
	 * gets monsters defense based MonsterBattles setting for MonsIndx
	 * @return
	 */
	public int getDef()
	{
		MonStatDisplay.setMonster(MonsterBattle.getMonster());
		return monster.get(monBat.getMonsIndx()).getDef();
	}
	/**
	 * gets monsters speed based MonsterBattles setting for MonsIndx
	 * @return
	 */
	public int getSpd()
	{
		MonStatDisplay.setMonster(MonsterBattle.getMonster());
		return monster.get(monBat.getMonsIndx()).getSpd();
	}
	/**
	 * gets monsters hit points based MonsterBattles setting for MonsIndx
	 * @return
	 */
	public int getHp()
	{
		MonStatDisplay.setMonster(MonsterBattle.getMonster());
		return monster.get(monBat.getMonsIndx()).getHp();
	}
	/**
	 * gets monsters special points based MonsterBattles setting for MonsIndx
	 * @return
	 */
	public int getSp()
	{
		MonStatDisplay.setMonster(MonsterBattle.getMonster());
		return monster.get(monBat.getMonsIndx()).getSp();
	}
	/**
	 * gets monsters Xp based MonsterBattles setting for MonsIndx
	 * @return
	 */
	public int getXp()
	{
		MonStatDisplay.setMonster(MonsterBattle.getMonster());
		return monster.get(monBat.getMonsIndx()).getXp();
	}
	public JLabel getImg()
	{
		MonStatDisplay.setMonster(MonsterBattle.getMonster());
		return monster.get(monBat.getMonsIndx()).getMonImg();
	}
	
	/**
	 * returns monster list
	 * @return
	 */
	public static ArrayList<Monster> getMonster() {
		return monster;
	}
	/**
	 * sets monster list to current monster list before displaying stats
	 * @param player
	 */
	public static void setMonster(ArrayList<Monster> monster) {
		MonStatDisplay.monster = monster;
	}

	
	
}
