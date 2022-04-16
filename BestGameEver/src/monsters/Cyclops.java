/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Cyclops extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Cyclops() {
		super();
		setMonsterName("Cyclops"); // set monster name
		// set monster description
		setMonsterDesc("If you just poke it in the eye you'll be good.");
		setSma(5); 
		setLuc(7); 
		setDef(8);
		setSpd(5);
		setHp(150);
		setSp(10);
		setXp(150);
		setStr(6);
		setMonImg(img.getImgCyclops());
	}
}
