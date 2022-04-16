/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Chicken
 */
package monsters;

public class Chicken extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Chicken() {
		super();
		setMonsterName("Chicken"); // set monster name
		// set monster description
		setMonsterDesc("OH GOSH! It seems one of the farmers chickens got lose again. Time for some pest control. Prepare for battle!");
		setStr(2);
		setSma(2);
		setLuc(3);
		setDef(2);
		setSpd(4);
		setHp(60);
		setSp(10);
		setXp(75);
		setMonImg(img.getImgChicken());
	}
}
