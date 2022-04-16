/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class AwakenedShrub extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public AwakenedShrub() {
		super();
		setMonsterName("Awakened Shrub"); // set monster name
		// set monster description
		setMonsterDesc("Why is that shrub talking to you??? BURN IT!!!");
		setSma(3); 
		setLuc(3); 
		setDef(3);
		setSpd(3);
		setHp(100);
		setSp(10);
		setXp(100);
		setStr(3);
		setMonImg(img.getImgShrub());
	}
}
