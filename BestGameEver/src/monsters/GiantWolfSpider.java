/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class GiantWolfSpider extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public GiantWolfSpider() {
		super();
		setMonsterName("Giant WolfS pider"); // set monster name
		// set monster description
		setMonsterDesc("It's giant... it has the word wolf its name and it wants to fight... also it's a spider.");
		setSma(5); 
		setLuc(5); 
		setDef(5);
		setSpd(6);
		setHp(100);
		setSp(10);
		setXp(100);
		setStr(6);
		setMonImg(img.getImgGiantwolfspider());
	}
}
