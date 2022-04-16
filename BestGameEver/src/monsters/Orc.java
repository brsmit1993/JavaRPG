/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Orc
 */
package monsters;

public class Orc extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Orc() {
		super();
		setMonsterName("Orc"); // set monster name
		// set monster description
		setMonsterDesc("Ooooohhhh it looks like a big goblin.. but it's not a goblin it's an orc... fight it!");
		setStr(8);
		setSma(3);
		setLuc(5);
		setDef(7);
		setSpd(5);
		setHp(250);
		setSp(10);
		setXp(300);
		setStr(7);
		setMonImg(img.getImgOrc());
	}
}
