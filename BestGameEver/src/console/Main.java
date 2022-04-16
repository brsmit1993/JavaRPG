/**
 * 
 * @author Brandon Smith
 * @version v1
 * @since 2019.03.18
 * runs gameintro and outro as well as character creation and the MainGame.
 */

package console;


import java.io.IOException;
import java.net.URISyntaxException;


import gameMethods.MainGame;
import guiComponents.StartWindow;


public class Main  {
	
	/**
	 * 
	 * @param args
	 */
	
	
	

	

	private static StartWindow intro = new StartWindow();
	

	/**
	 * runs gameintro and outro as well as character creation and the MainGame.
	 * @param args
	 * @throws URISyntaxException 
	 * @throws IOException 
	 */
	public static void main (String[] args)
	{	
		intro.openStart(); // runs intro
	}

}
