/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Giant
 */
package monsters;

public class Giant extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Giant() {
		super();
		setMonsterName("Giant"); // set monster name
		// set monster description
		setMonsterDesc("You shouldn't have come here now you have to fight a Giant. He looks human but he's 5X your size. Which isn't quite as big as you think"
				+ "because you're tiny and puny... but he's still pretty big.");
		setStr(9);
		setSma(5);
		setLuc(6);
		setDef(8);
		setSpd(3);
		setHp(400);
		setSp(10);
		setXp(500);
		setMonImg(img.getImgGiant());
	}
}
