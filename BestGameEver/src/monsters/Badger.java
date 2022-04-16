/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Badger extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Badger() {
		super();
		setMonsterName("Badger"); // set monster name
		// set monster description
		setMonsterDesc("Oh thank god it's not a honey badger! Deal with this creature.");
		setSma(3); 
		setLuc(3); 
		setDef(3);
		setSpd(6);
		setHp(75);
		setSp(10);
		setXp(75);
		setStr(2);
		setMonImg(img.getImgBadger());
	}
}
