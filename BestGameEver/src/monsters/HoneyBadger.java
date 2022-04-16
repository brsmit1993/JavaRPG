/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class HoneyBadger extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public HoneyBadger() {
		super();
		setMonsterName("Honey Badger"); // set monster name
		// set monster description
		setMonsterDesc("Yeah... I'd run.");
		setSma(10); 
		setLuc(10); 
		setDef(10);
		setSpd(10);
		setHp(3000);
		setSp(10);
		setXp(10000);
		setStr(20);
		setMonImg(img.getImgHoneybadger());
	}
}
