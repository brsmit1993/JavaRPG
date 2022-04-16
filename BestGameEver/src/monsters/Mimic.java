/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file sets the information for the monster Bunny
 */
package monsters;

public class Mimic extends Monster {
	/**
	 * sets stats for Bunny monster using monster constructor
	 */
	public Mimic() {
		super();
		setMonsterName("Mimic"); // set monster name
		// set monster description
		setMonsterDesc("Is that your reflection? Oh no it's a mimic... fight your self.");
		setSma(dsp.getSma()); 
		setLuc(dsp.getLuc()); 
		setDef(dsp.getDef());
		setSpd(dsp.getSpd());
		setHp(dsp.getHp());
		setSp(dsp.getSp());
		setXp(dsp.getXp());
		setStr(dsp.getStr());
		setMonImg(dsp.getImg());
	}
}
