/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package player;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

import algorithms.BattleAlgorithms;
import battleMode.PVPMode;
import getsetStats.MonStatSub;
import getsetStats.StatSub;
import getsetStats.StatSubIndx2;
import guiComponents.Images;
import ui.MonStatDisplay;
import ui.StatDisplay;
import ui.StatDisplayIndx2;

public abstract class Player {
	
	static PVPMode pvp = new PVPMode(); // calls pvp fight class for abilities
	protected BattleAlgorithms batChance = new BattleAlgorithms(); // calls battle algorithms for abilities
	protected StatDisplay dsp = new StatDisplay(); // calls display stats for abilities
	protected MonStatDisplay monDsp = new MonStatDisplay(); // calls monster display stats for abilities
	protected MonStatSub monSub = new MonStatSub(); // calls monssub for abilities
	protected StatDisplayIndx2 dspDex2 = new StatDisplayIndx2(); // call dex2 for abilties
	protected StatSubIndx2 subDex2 = new StatSubIndx2(); // call subdex2 for abilties
	protected StatSub sub = new StatSub(); // call statsub for abilties
	protected static Images img = new Images();

	String playName; // players name entered at beginning of game
	
	int str = 5; // strength stat set based on class selection
	int sma = 5; // intelligence stat set based on class selection
	int luc = 5; // intelligence stat set based on class selection
	int def = 5; // intelligence stat set based on class selection
	int spd = 5; // intelligence stat set based on class selection
	int hp = 100; // intelligence stat set based on class selection
	int sp = 100; // intelligence stat set based on class selection
	int maxHp = 100; // intelligence stat set based on class selection
	int maxSp = 100; // intelligence stat set based on class selection
	int xp = 0; // intelligence stat set based on class selection
	int lvl = 1; // intelligence stat set based on class selection
	int gold = 0; // intelligence stat set based on class selection
	int cordX; // intelligence stat set based on class selection
	int cordY; // intelligence stat set based on class selection
	int skillPoints;
	String ability1Name; // intelligence stat set based on class selection
	String ability2Name; // intelligence stat set based on class selection
	String ability3Name; // intelligence stat set based on class selection
	JLabel playImg;
	ImageIcon playImg2;
	
	/**
	 * THIS IS THE BASE COSNTRUCTOR CALLED BY ALL GAME CLASSES TO DEFINE STATS FOR KNIGHT, RANGER, THIEF, AND MAGE
	 * @param str
	 * @param sma
	 * @param luc
	 * @param def
	 * @param spd
	 * @param hp
	 * @param sp
	 * @param maxHp
	 * @param maxSp
	 * @param ability1Name
	 * @param ability2Name
	 * @param ability3Name
	 * @param gold
	 * @param playImg 
	 * @param skillPoints 
	 * @param playImg2 
	 */
	public Player(int str, int sma, int luc, int def, int spd, int hp, int sp, int maxHp, int maxSp, String ability1Name, String ability2Name, String ability3Name, int gold, JLabel playImg, int skillPoints, ImageIcon playImg2) {
		this.str = str;
		this.sma = sma;
		this.luc = luc;
		this.def = def;
		this.spd = spd;
		this.hp = hp;
		this.sp = sp;
		this.maxHp = maxHp;
		this.maxSp = maxSp;
		this.ability1Name = ability1Name;
		this.ability2Name = ability2Name;
		this.ability3Name = ability3Name;
		this.gold = gold;
		this.playImg = playImg;
		this.skillPoints = skillPoints;
		this.playImg2 = playImg2;
	}
	
	/**
	 * 
	 * @param player2
	 * @return
	 */
	
	/**
	 * overrides equals object to comapre and make sure an object being comapred is also a player class
	 */
	 @Override
	public boolean equals(Object player2) {
		if (player2.getClass().getSuperclass().equals(Player.class))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	 
	 /**
	  * overrides to string to call players names at begiinning of game
	  */
	 @Override
	 public String toString() 
	 {
		return playName.toUpperCase(); 
	 }
	/**
	 * gets gold
	 * @return
	 */
	public int getGold() {
		return gold;
	}
/**
 * sets gold
 * @param gold
 */
	public void setGold(int gold) {
		this.gold = gold;
	}
/**
 * gets strength
 * @return
 */
	public int getStr() {
		return str;
	}
	/**
	 * sets strength
	 * @param str
	 */
	public void setStr(int str) {
		this.str = str;
	}
	/**
	 * gets intelligence stat
	 * @return
	 */
	public int getSma() {
		return sma;
	}
	/**
	 * sets intelligence stats
	 * @param cha
	 */
	public void setSma(int cha) {
		this.sma = cha;
	}
	/**
	 * gets luck stat
	 * @return
	 */
	public int getLuc() {
		return luc;
	}
	/**
	 * sets luck stat
	 * @param luc
	 */
	public void setLuc(int luc) {
		this.luc = luc;
	}
	/**
	 * gets defense stat
	 * @return
	 */
	public int getDef() {
		return def;
	}
	/**
	 * sets defense stat
	 * @param def
	 */
	public void setDef(int def) {
		this.def = def;
	}
	/**
	 * gets speed
	 * @return
	 */
	public int getSpd() {
		return spd;
	}
	/**
	 * sets speed
	 * @param spd
	 */
	public void setSpd(int spd) {
		this.spd = spd;
	}
	/**
	 * gets hp stat
	 * @return
	 */
	public int getHp() {
		return hp;
	}
	/**
	 * sets hp stat
	 * @param hp
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	/**
	 * gets cordX of player
	 * @return
	 */
	public int getCordX() {
		return cordX;
	}
	/**
	 * sets cordX of player
	 * @param cordX
	 */
	public void setCordX(int cordX) {
		this.cordX = cordX;
	}
	/**
	 * gets cordy of player
	 * @return
	 */
	public int getCordY() {
		return cordY;
	}
	/**
	 * sets cordy of player
	 * @param cordY
	 */
	public void setCordY(int cordY) {
		this.cordY = cordY;
	}
	/**
	 * gets sp of player
	 * @return
	 */
	public int getSp() {
		return sp;
	}
	/**
	 * sets sp of player
	 * @param sp
	 */
	public void setSp(int sp) {
		this.sp = sp;
	}
	/**
	 * gets player name
	 * @return
	 */
	public String getPlayName() {
		return playName;
	}
	/**
	 * sets player name
	 * @param playName
	 */
	public void setPlayName(String playName) {
		this.playName = playName;
	}
/**
 * gets xp
 * @return
 */
	public int getXp() {
		return xp;
	}
/**
 * sets xp
 * @param xp
 */
	public void setXp(int xp) {
		this.xp = xp;
	}
/**
 * getslvl
 * @return
 */
	public int getLvl() {
		return lvl;
	}
/**
 * sets lvl
 * @param lvl
 */
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	/**
	 * gets maxHp
	 * @return
	 */
	public int getMaxHp() {
		return maxHp;
	}
	/**
	 * setsMaxHp
	 * @param maxHp
	 */
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	/**
	 * getsMaxSp
	 * @return
	 */
	public int getMaxSp() {
		return maxSp;
	}
/**
 * sets maxsp
 * @param maxSp
 */
	public void setMaxSp(int maxSp) {
		this.maxSp = maxSp;
	}
/**
 * does nothing
 * @param indx2
 * @return
 */
	public int ability1(boolean indx2) {
		return 0;
		// TODO Auto-generated method stub
		
	}
/**
 * does nothing
 * @param indx2
 * @return
 */
	public int ability2(boolean indx2) {
		return 0;
		// TODO Auto-generated method stub
		
	}
/**
 * does nothing
 * @param indx2
 * @return
 */
	public int ability3(boolean indx2) {
		return 0;
		// TODO Auto-generated method stub
		
	}
/**
 * get ability 1 name
 * @return
 */
	public String getAbility1Name() {
		return ability1Name;
	}
/**
 * sets ability 1 name
 * @param ability1Name
 */
	public void setAbility1Name(String ability1Name) {
		this.ability1Name = ability1Name;
	}
/**
 * gets ability 2 name
 * @return
 */
	public String getAbility2Name() {
		return ability2Name;
	}
/**
 * sets ability 2 name
 * @param ability2Name
 */
	public void setAbility2Name(String ability2Name) {
		this.ability2Name = ability2Name;
	}
/**
 * gets ability 3 name
 * @return
 */
	public String getAbility3Name() {
		return ability3Name;
	}
/**
 * sets ability3name
 * @param ability3Name
 */
	public void setAbility3Name(String ability3Name) {
		this.ability3Name = ability3Name;
	}
	public JLabel getPlayImg() {
		
		return playImg;
	}

	public void setPlayImg(JLabel playImg) {
		this.playImg = playImg;
	}

	public int getSkillPoints() {
		return skillPoints;
	}

	public void setSkillPoints(int skillPoints) {
		this.skillPoints = skillPoints;
	}

	public ImageIcon getPlayImg2() {
		return playImg2;
	}

	public ImageIcon getPlayImg3() {
		return playImg2;
	}
	public void setPlayImg2(ImageIcon playImg2) {
		this.playImg2 = playImg2;
	}
	
	
	
}
