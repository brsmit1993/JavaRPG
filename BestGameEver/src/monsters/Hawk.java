/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Hawk extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Hawk() {
		super();
		setMonsterName("Hawk"); // set monster name
		// set monster description
		setMonsterDesc("Hmm another flying creature to destroy.");
		setSma(7); 
		setLuc(5); 
		setDef(4);
		setSpd(7);
		setHp(75);
		setSp(10);
		setXp(80);
		setStr(3);
		setMonImg(img.getImgHawk());
	}
}
