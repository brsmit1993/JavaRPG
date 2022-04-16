/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file defines the abilities for the player classes
 */
package player;

import gameMethods.DisplayStats;

public interface Abilities {

	//bool index 2 is to define if index1 player or index 2 palyer in pvp.
	public int ability1(boolean indx2);
	public int ability2(boolean indx2);
	public int ability3(boolean indx2);

}
