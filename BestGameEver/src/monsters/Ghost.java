/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Ghost extends Monster {
	/**
	 * sets stats for monster using monster constructor
	 */
	public Ghost() {
		super();
		setMonsterName("Ghost"); // set monster name
		// set monster description
		setMonsterDesc("How do you even hit it?");
		setSma(5); 
		setLuc(7); 
		setDef(4);
		setSpd(6);
		setHp(175);
		setSp(10);
		setXp(175);
		setStr(6);
		setMonImg(img.getImgGhost());
	}
}
