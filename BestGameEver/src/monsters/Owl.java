/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Owl extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Owl() {
		super();
		setMonsterName("Owl"); // set monster name
		// set monster description
		setMonsterDesc("Yup an owl... I don't know what else to say.");
		setSma(5); 
		setLuc(7); 
		setDef(2);
		setSpd(10);
		setHp(50);
		setSp(10);
		setXp(60);
		setStr(3);
		setMonImg(img.getImgOwl());
	}
}
