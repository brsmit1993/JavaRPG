/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster GiantSpider
 */
package monsters;

public class GiantSpider extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public GiantSpider() {
		super();
		setMonsterName("Giant Spider"); // set monster name
		// set monster description
		setMonsterDesc("Looks like you finally have to face your fear of spiders! You ran into a giant spider! It looks pretty angry! Probably because you keep"
				+ "killing it's babies... you monster.");
		setStr(5);
		setSma(1);
		setLuc(4);
		setDef(4);
		setSpd(5);
		setHp(150);
		setSp(10);
		setXp(200);
		setStr(5);
		setMonImg(img.getImgGiantspider());
	}
}
