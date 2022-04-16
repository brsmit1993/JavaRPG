/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Troll
 */
package monsters;

public class Troll extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Troll() {
		super();
		setMonsterName("Troll"); // set monster name
		// set monster description
		setMonsterDesc("Normally you find these things under a bridge but apparently today this troll is out for stroll and you're the unlucky"
				+ "sap it ran into. Prepare for battle!");
		setStr(6);
		setSma(1);
		setLuc(4);
		setDef(5);
		setSpd(5);
		setHp(200);
		setSp(10);
		setXp(250);
		setMonImg(img.getImgTroll());
	}
}
