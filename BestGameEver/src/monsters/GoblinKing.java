/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster GoblinKing
 */
package monsters;

public class GoblinKing extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public GoblinKing() {
		super();
		setMonsterName("GoblinKing"); // set monster name
		// set monster description
		setMonsterDesc("YOU'VE FINALLY REACHED THE END! CAN YOU DEFEAT THE GOBLIN KING!!!");
		setStr(10);
		setSma(10);
		setLuc(10);
		setDef(10);
		setSpd(10);
		setHp(1000);
		setSp(10);
		setXp(1000);
		setMonImg(img.getImgGoblinking());

	}
}
