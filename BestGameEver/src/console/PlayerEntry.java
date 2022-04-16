/**
 * 
 * @author Brandon Smith
 * @version V 1.0A
 * @since 2019.03.18
 * This file is meant to run the players text entries through a list of checks to make sure that they have entered the right string
 */

package console;

import java.util.Scanner;
import gameMethods.DisplayStats;
import gameMethods.MainGame;
import guiComponents.StartWindow;
import inventory.InventoryMethod;


/*************** ************* ************* ************* ************* ************* ************* ************* ************* ************* ************* 
 * ************* ************* ************* ************* ************* ************* ************* ************* ************* ************* ************* 
 ************* ************* ************* ************* ************* ************* ************* ************* ************* ************* ************* 
 * IMPORTANT PLEASE READ FIRST  * IMPORTANT PLEASE READ FIRST  * IMPORTANT PLEASE READ FIRST * IMPORTANT PLEASE READ FIRST * IMPORTANT PLEASE READ FIRST
 ************** ************* ************* ************* ************* ************* ************* ************* ************* ************* ************* 
 ************** ************* ************* ************* ************* ************* ************* ************* ************* ************* *************
 ************** ************* ************* ************* ************* ************* ************* ************* ************* ************* ************* 
 * ALL METHODS IN THIS FILE ARE IDENTICAL WITH THE SINGLE VARIATION FOUND IN THE LAST WHILE LOOP OF THE METHOD THAT IS ONLY CHANGED BY ADDING AN EXTRA CHECK
 * FOR !"#".equals(playResp) IF YOU CHANGE ONE METHOD IT IS BEST YOU CHANGE ALL METHODS SO THEY ALL CONTINUE TO FUNCTION THE SAME! THE METHOD NAME ALSO INFORMS
 * THE PROGRAMMER WHAT NUMBERS ARE ACCEPTED SO getEntry2 ONLY ACCPETS 1 & 2 AND getEntry3 ONLY ACCEPTS 1 & 2 & 3 AND SO ON. AS OF 3.31.2019 CURRENT METHODS ALLOW
 * UPTO 12.
 */
public class PlayerEntry {
	
	private DisplayStats stats = new DisplayStats(); // instantiated to display current players stats
	private static MainGame game = new MainGame();
	private static StartWindow retry = new StartWindow();
	
	private InventoryMethod inven = new InventoryMethod(); //inatntiated to call current players inventory
	
	private String playResp; //stores player response
	
	/**
	 * returns players response based on entry and checks
	 * @param extrcmds
	 * @return
	 */

/**
 * used only in GameStart to get players name!!!
 * @return
 */
	public String getStringEntry() {
		String playResp = "0";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		playResp = sc.next();
		
		return playResp;
	}
	
	public int getPlayNum (String amount)
	{
		int playRespInt = 0;
		
		try{
		    int test = Integer.valueOf(amount);
		    playRespInt = test;
		}catch (NumberFormatException ex) {
		}
		retry.exitWin();
		return playRespInt;
		
	}
}
