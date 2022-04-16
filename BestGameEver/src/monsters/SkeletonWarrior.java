/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class SkeletonWarrior extends Monster {
	/**
	 * sets stats for monster using monster constructor
	 */
	public SkeletonWarrior() {
		super();
		setMonsterName("Skeleton Warrior"); // set monster name
		// set monster description
		setMonsterDesc("I don't know how you kill the undead but find a way.");
		setSma(3); 
		setLuc(3); 
		setDef(5);
		setSpd(5);
		setHp(150);
		setSp(10);
		setXp(150);
		setStr(6);
		setMonImg(img.getImgSkeletonwarrior());
	}
}
