/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class GiantScorpion extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public GiantScorpion() {
		super();
		setMonsterName("Giant Scorpion"); // set monster name
		// set monster description
		setMonsterDesc("I mean just don't let it sting you and you'll be good. :D");
		setSma(5); 
		setLuc(7); 
		setDef(8);
		setSpd(8);
		setHp(150);
		setSp(10);
		setXp(200);
		setStr(6);
		setMonImg(img.getImgGiantscorpion());
	}
}
