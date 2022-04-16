/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster WereWolf
 */
package monsters;

public class WereWolf extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public WereWolf() {
		super();
		setMonsterName("WereWolf"); // set monster name
		// set monster description
		setMonsterDesc("I thought these were only legend but apparently not. Prepare to fight a WereWolf!");
		setStr(8);
		setSma(3);
		setLuc(5);
		setDef(7);
		setSpd(8);
		setHp(300);
		setSp(10);
		setXp(400);
		setMonImg(img.getImgWerewolf());
	}
}
