/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class FlyingSword extends Monster  {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public FlyingSword() {
		super();
		setMonsterName("Flying Sword"); // set monster name
		// set monster description
		setMonsterDesc("I don't think these things are supposed to fly but this sword is looking for a fight!");
		setSma(2); 
		setLuc(5); 
		setDef(4);
		setSpd(8);
		setHp(100);
		setSp(10);
		setXp(100);
		setStr(5);
		setMonImg(img.getImgFlyingsword());
	}
}
