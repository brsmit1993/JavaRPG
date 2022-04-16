/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Bat extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Bat() {
		super();
		setMonsterName("Bat"); // set monster name
		// set monster description
		setMonsterDesc("Time for some more pest control!");
		setSma(3); 
		setLuc(3); 
		setDef(4);
		setSpd(8);
		setHp(50);
		setSp(10);
		setXp(75);
		setStr(3);
		setMonImg(img.getImgBat());
	}
}
