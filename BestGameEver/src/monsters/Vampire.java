/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Vampire extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Vampire() {
		super();
		setMonsterName("Vampire"); // set monster name
		// set monster description
		setMonsterDesc("I thought these were only a myth. Hope you have some garlic.");
		setSma(7); 
		setLuc(7); 
		setDef(5);
		setSpd(7);
		setHp(150);
		setSp(10);
		setXp(150);
		setStr(7);
		setMonImg(img.getImgVampire());
	}
}
