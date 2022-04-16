/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Bunny extends Monster{
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Bunny() {
		super();
		setMonsterName("Bunny"); // set monster name
		// set monster description
		setMonsterDesc("OH MY! It seems you've ran into a hostile Bunny. This bunny may be infected with rabies. But it's definantly took an interest in you. "
				+ "I'm sure a big strong adventurer like you can take care of this pesky little wabbit. Prepare for battle!");
		setSma(5); 
		setLuc(7); 
		setDef(2);
		setSpd(10);
		setHp(50);
		setSp(10);
		setXp(60);
		setStr(3);
		setMonImg(img.getImgBunny());
	}
}
