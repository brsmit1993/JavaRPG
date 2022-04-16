/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

import javax.swing.JLabel;

import guiComponents.Images;
import ui.StatDisplay;

public abstract class Monster {
	protected static Images img = new Images();
	protected StatDisplay dsp = new StatDisplay(); // called to display and get stats from player class
	
	
	String monsterName; // name of monster
	String monsterDesc; // description of what monster is
	int str = 5; // strength stat
	int sma = 5; // intelligence stat
	int luc = 5; // luck stat
	int def = 5; // defense stat
	int spd = 5; // speed stat
	int hp = 100; // hp stat
	int sp = 100; // sp stat
	int xp = 0; // amount of xp monster gives player
	
	public JLabel getMonImg() {
		return monImg;
	}
	public void setMonImg(JLabel monImg) {
		this.monImg = monImg;
	}
	JLabel monImg;
	
	/**
	 * 
	 * @return monsters name
	 */
	public String getMonsterName() {
		return monsterName;
	}
	/**
	 * sets mosnters name
	 * @param monsterName
	 */
	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}
	/**
	 * gets monster strength
	 * @return
	 */
	public int getStr() {
		return str;
	}
	/**
	 * sets monsters strength
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
	 * sets intelligence stat
	 * @param sma
	 */
	public void setSma(int sma) {
		this.sma = sma;
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
	 * gets Defense stat
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
	 * gets speed stat
	 * @return
	 */
	public int getSpd() {
		return spd;
	}
	/**
	 * sets speed stat
	 * @param spd
	 */
	public void setSpd(int spd) {
		this.spd = spd;
	}
	/**
	 * gets HP stat
	 * @return
	 */
	public int getHp() {
		return hp;
	}
	/**
	 * sets HP stat
	 * @param hp
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	/**
	 * gets speed stat
	 * @return
	 */
	public int getSp() {
		return sp;
	}
	/**
	 * sets SP stat
	 * @param sp
	 */
	public void setSp(int sp) {
		this.sp = sp;
	}
	/**
	 * gets XP stat
	 * @return
	 */
	public int getXp() {
		return xp;
	}
	/**
	 * sets XP stat
	 * @param xp
	 */
	public void setXp(int xp) {
		this.xp = xp;
	}
	/**
	 * gets monster description
	 * @return
	 */
	public String getMonsterDesc() {
		return monsterDesc;
	}
	/**
	 * sets monster description
	 * @param monsterDesc
	 */
	public void setMonsterDesc(String monsterDesc) {
		this.monsterDesc = monsterDesc;
	}
	
}
