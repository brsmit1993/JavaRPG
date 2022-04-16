/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Frog extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Frog() {
		super();
		setMonsterName("Frog"); // set monster name
		// set monster description
		setMonsterDesc("Just a tiny frog... stomp on it!!!");
		setSma(1); 
		setLuc(1); 
		setDef(1);
		setSpd(10);
		setHp(25);
		setSp(10);
		setXp(25);
		setStr(3);
		setMonImg(img.getImgFrog());
	}
}
