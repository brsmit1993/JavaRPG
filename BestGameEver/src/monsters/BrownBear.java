/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class BrownBear extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public BrownBear() {
		super();
		setMonsterName("Brown Bear"); // set monster name
		// set monster description
		setMonsterDesc("Looks like you stumbled upon a wild bears den... and it's not happy.");
		setSma(3); 
		setLuc(3); 
		setDef(6);
		setSpd(6);
		setHp(200);
		setSp(10);
		setXp(200);
		setStr(8);
		setMonImg(img.getImgBrownbear());
	}
}
