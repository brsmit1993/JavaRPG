/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster DrunkDwarf
 */
package monsters;

public class DrunkDwarf extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public DrunkDwarf() {
		super();
		setMonsterName("Drunk Dwarf"); // set monster name
		// set monster description
		setMonsterDesc("It looks like you ran into a Dwarf who's had a little to much mead and is looking for a fight. Prepare for battle!");
		setStr(4);
		setSma(2);
		setLuc(2);
		setDef(3);
		setSpd(2);
		setHp(75);
		setSp(10);
		setXp(90);
		setMonImg(img.getImgDrunkdwarf());
	}
}
