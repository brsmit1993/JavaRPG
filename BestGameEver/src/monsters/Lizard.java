/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Lizard extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Lizard() {
		super();
		setMonsterName("Lizard"); // set monster name
		// set monster description
		setMonsterDesc("So tiny.. so cute... destroy it.");
		setSma(3); 
		setLuc(3); 
		setDef(3);
		setSpd(3);
		setHp(25);
		setSp(10);
		setXp(30);
		setStr(2);
		setMonImg(img.getImgLizard());
	}
}
