/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Spider
 */
package monsters;

public class Spider extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Spider() {
		super();
		setMonsterName("Spider"); // set monster name
		// set monster description
		setMonsterDesc("You scream in terror as you realize what stands before you! IT'S A BABY SPIDER! Coward... go on kill it if you dare.");
		setStr(1);
		setSma(1);
		setLuc(2);
		setDef(2);
		setSpd(10);
		setHp(30);
		setSp(10);
		setXp(50);
		setMonImg(img.getImgSpider());
	}
}
