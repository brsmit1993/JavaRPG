/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Goblin
 */
package monsters;

public class Goblin extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Goblin() {
		super();
		setMonsterName("Goblin"); // set monster name
		// set monster description
		setMonsterDesc("A wild goblin appears! You know what to do...");
		setStr(4);
		setSma(2);
		setLuc(4);
		setDef(5);
		setSpd(5);
		setHp(100);
		setSp(10);
		setXp(150);
		setMonImg(img.getImgGoblin());
	}

}
