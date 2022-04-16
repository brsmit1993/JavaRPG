/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Wolf extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Wolf() {
		super();
		setMonsterName("Wolf"); // set monster name
		// set monster description
		setMonsterDesc("PUPPY!!! Oh wait it's a wolf and it wants to rip your throat out...");
		setSma(8); 
		setLuc(8); 
		setDef(4);
		setSpd(10);
		setHp(150);
		setSp(10);
		setXp(150);
		setStr(6);
		setMonImg(img.getImgWolf());
	}
}
