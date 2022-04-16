/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class ShadowDemon extends Monster {
	/**
	 * sets stats for  monster using monster constructor
	 */
	public ShadowDemon() {
		super();
		setMonsterName("Shadow Demon"); // set monster name
		// set monster description
		setMonsterDesc("I mean good luck I guess...");
		setSma(5); 
		setLuc(7); 
		setDef(7);
		setSpd(8);
		setHp(250);
		setSp(10);
		setXp(250);
		setStr(9);
		setMonImg(img.getImgShadowdemon());
	}
}
