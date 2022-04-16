/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Vulture extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Vulture() {
		super();
		setMonsterName("Vulture"); // set monster name
		// set monster description
		setMonsterDesc("I thought these things only attack things that are about to die... oh wait I understand now.");
		setSma(5); 
		setLuc(7); 
		setDef(2);
		setSpd(10);
		setHp(60);
		setSp(10);
		setXp(60);
		setStr(3);
		setMonImg(img.getImgVulture());
	}
}
