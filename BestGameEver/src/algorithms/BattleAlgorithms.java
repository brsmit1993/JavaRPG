/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * This file controls all damage done in battles based on multiple calculations returing the final result to be applied in both battleMode.MonsterBattle
 * as well as battleMode.PVPMode
 */

package algorithms;

import java.util.Random;

public class BattleAlgorithms {
	
	static Random rand = new Random(); // insantiates the Random class for use in multiple methods
	/**
	 * 
	 * @param playLuck
	 * @param monsterLuck
	 * @return
	 * Controls when a player attempts to escape if hes successfuly or not.
	 * The end number returned is modified by both the players luck as well as the monster or other players luck.
	 */
	public int escapeChance(int playLuck, int monsterLuck) {
		double chance; // instantiates chance variable
		double luckPerc = 0; // instantiates luckPerc variable
		chance = (int) (Math.random() * 100 + 1); // generates a number between 1 - 100 and set it to chance variable
		luckPerc = playLuck / 10; // divides players luck by 10 and sets to luck perc
		chance = chance + (chance * luckPerc); // times chance number by luck perc and boosts chance
		luckPerc = monsterLuck / 10; // divides mosnters luck by l0 and gets luckperc
		chance = chance + (chance * luckPerc); // sets chance to chance times luckperc + chance
		
		return (int) chance;	// returns chance variable in int form
	}
	/**
	 * 
	 * @param playStrength
	 * @param playLuck
	 * @param monsterDefense
	 * @return
	 * When player performs a basic attack this is the method that returns the damage amount. This is for regular attakcs.
	 */
	public int dmgModPlayBase (int playStrength, int playLuck, int monsterDefense)  // calls current players strength, luck and monster or other players defense
	{
		int dmgMod = playStrength; // sets dmgmod to players strength
		int defMod = monsterDefense / 3; // set def mod to mosnters defense divided by 3
		int lucMod = playLuck / 3; //sets luck mod to players luck divided by 3
		int random = rand.nextInt((5 - 0) + 1) + 0; // generates a random number between 5 and 0
		dmgMod = dmgMod + lucMod - defMod - random; // sets dmgmod to dmgmod + luckmod - defmod - randomly generated number
		if (dmgMod < 0) // prevents dmg from being negative
		{dmgMod = 0;} // if dmg is below 0 sets the dmg to 0
		return dmgMod; // returns the final variable
	} // end method
	
	public int dmgModMonst (int monsterStr, int monsterLuc, int playerDef) // calls mosnters str, luc and players defense
	{
		int dmgMod = monsterStr; // sets dmg mod to monsters str
		int defMod = playerDef / 3; // sets defmod to players defense divided by 3
		int lucMod = monsterLuc / 3; // sets lucmod to monsters luck divided by 3
		int random = rand.nextInt((5 - 0) + 1) + 0; // returns a random number between 5 and 0
		dmgMod = dmgMod + lucMod - defMod - random; // sets dmg mod to dmg mod + luck mod - defmod - randomly generated number
		if (dmgMod < 0) // prevents dmgmod from being returned below 0
		{dmgMod = 0;} // if dmg mod is below 0 ses dmg mod to 0
		return dmgMod; // returns finally variable dmgmod
	} // end method
	/**
	 * 
	 * @param playStat
	 * @param playLuck
	 * @param monsterDefense
	 * @return
	 * when player ability is called this is the algorithm used to find the dmg amount.
	 * playStat is what ever the players class main stat is defined in the abilities method in the class file.
	 */
	public int dmgModPlayAbil1 (int playStat, int playLuck, int monsterDefense) // calls players main stat, luck, and monsters defense
	{
		int dmgMod = playStat * 2; // modifies the dmg by the players main stat times 2
		int defMod = monsterDefense / 3; // gets defmod by dividing monsters defense by 3
		int lucMod = playLuck / 3; // gets luc mod by divinding the players luck by 3
		int random = rand.nextInt((5 - 0) + 1) + 0; // generates a number between 5 and 0
		dmgMod = dmgMod + lucMod - defMod - random; // finds final dmg mod by taking all variables int account
		if (dmgMod < 0) // if dmgmod ends below 0 prevents a number less than 0 from being returned
		{dmgMod = 0;} // if dmg mod is below 0 sets dmgmod to 0
		return dmgMod; // returns final variable
	} // end method
	/**
	 * 
	 * @param playStat
	 * @param playLuck
	 * @param monsterDefense
	 * @return
	 * returns the damage variable for players second ability. Playstat is what ever the players classes main stat is set to.
	 * main stat is defined in the abilities method in the class file.
	 */
	public int dmgModPlayAbil2 (int playStat, int playLuck, int monsterDefense) //calls players main stat, luck , and monsters defense
	{
		int dmgMod = playStat * 3; // sets dmg mod to players main stat * 3
		int defMod = monsterDefense / 3; // sets defmod to monsters defense / 3
		int lucMod = playLuck / 3; // sets luck mod to pleyers luck / 3
		int random = rand.nextInt((5 - 0) + 1) + 0; // generates a random number between 5 and 0
		dmgMod = dmgMod + lucMod - defMod - random; // returns a final value based on earlier values
		if (dmgMod < 0) // if damage ends below 0 prevents it from being returned as a negative
		{dmgMod = 0;} // sets dmg mod to 0 if it ends in a negative
		return dmgMod; // returns final variable
	} // end method
	/**
	 * 
	 * @param playStat
	 * @param playLuck
	 * @param monsterDefense
	 * @return
	 * returns the damage for the players 3rd abiltiy. play stat is what ever the palyers classes main stat is set to
	 * main stat is defined in the abilities method in the class file.
	 */
	public int dmgModPlayAbil3 (int playStat, int playLuck, int monsterDefense) // calls the players main stat, luck, and monsters defense
	{
		int dmgMod = playStat * 4; // dmg mod is set to the players main stat * 4
		int defMod = monsterDefense / 3; // def mod is mosnters defense / 3
		int lucMod = playLuck / 3; // luck mod is players luck / 3
		int random = rand.nextInt((5 - 0) + 1) + 0; // returns a random number between 5 and 0
		dmgMod = dmgMod + lucMod - defMod - random; // sets dmg mod based on previous variables
		if (dmgMod < 0) // prevents dmgmod from being returned as a negative
		{dmgMod = 0;} // if dmgmod ends negative sets it back to 0
		return dmgMod; // returns final variable
	} // end method
	
	

} // end class
