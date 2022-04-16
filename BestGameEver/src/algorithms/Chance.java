/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * This file returns random numbers ranging from 500 to 1 depending on the methods parameters and variables. This file is known as chance file because it 
 * decides most events through out the game using these methods.
 */

package algorithms;


public class Chance {
	

	/**
	 * 
	 * @param luck
	 * @return
	 * returns a number based on players luck and a random number generated between 500 and 1
	 */
	public int getChance500(int luck) // calls players luck
	{	
		double chance;
		double luckPerc = 0;
		chance = (int) (Math.random() * 500 + 1); // generates number randomly using math.random between 500 and 1
		luck = (int) luckPerc; 
		luckPerc = luckPerc / 10; 
		chance = chance + chance * luckPerc;
		return (int) chance;	
	} // end of method
/**
 * 
 * @param luck
 * @return
 * returns a random number between 300 and 1 while running a math equation that takes the players luck into account
 */
	public int getChance300(int luck) // calls palyers luck
	{	
		double chance;
		double luckPerc = 0;
		chance = (int) (Math.random() * 300 + 1); // generates a random number between 300 and 1
		luck = (int) luckPerc;
		luckPerc = luckPerc / 10;
		chance = chance + chance * luckPerc;
		return (int) chance;	
	} // end of method
/**
 * 
 * @param luck
 * @return
 * returns a random number between 1 and 100 while taking the players luck into account through a basic algorithm
 */
	public int getChance100(int luck) 
	{	
		double chance;
		double luckPerc = 0;
		chance = (int) (Math.random() * 100 + 1); // generates number between 100 and 1
		luck = (int) luckPerc;
		luckPerc = luckPerc / 10;
		chance = chance + chance * luckPerc;
		return (int) chance;	
	} // end of method
	/**
	 * 
	 * @return
	 * returns a random number between 1 and 100 with out using the luck stat
	 */
	public int getChance100noluck() 
	{	
		int chance;
		chance = (int) (Math.random() * 100 + 1); // generates random number between 100 and 1
		return (int) chance;	
	} // end of method
	/**
	 * 
	 * @return
	 * generates a random number between 1 and 10 without taking players account into luck 
	 * 
	 */
	public int getChance30noluck() 
	{	
		int chance;
		chance = (int) (Math.random() * 30 + 1); // generates number between 1 and 30
		return (int) chance;	
	} // end of method
	
	
} // end of class
