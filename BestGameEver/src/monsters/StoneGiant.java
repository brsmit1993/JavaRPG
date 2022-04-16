/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class StoneGiant extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public StoneGiant() {
		super();
		setMonsterName("Stone Giant"); // set monster name
		// set monster description
		setMonsterDesc("OH MY LANTA!!! IT'S A GIANT MADE OF STONE!");
		setSma(5); 
		setLuc(7); 
		setDef(10);
		setSpd(10);
		setHp(500);
		setSp(10);
		setStr(10);
		setXp(500);
		setStr(10);
		setMonImg(img.getImgStonegiant());
	}
}
