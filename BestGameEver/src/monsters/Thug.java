/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Thug extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Thug() {
		super();
		setMonsterName("Thug"); // set monster name
		// set monster description
		setMonsterDesc("Just a normal person trying to rob you... slay him.");
		setSma(3); 
		setLuc(3); 
		setDef(3);
		setSpd(4);
		setHp(75);
		setSp(10);
		setXp(75);
		setStr(4);
		setMonImg(img.getImgThug());
	}
}
