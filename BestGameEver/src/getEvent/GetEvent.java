/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * files used to call events based on location using palyers cordX and cordY
 */
package getEvent;

import java.util.ArrayList;

import locations.LocationBase;
import locations.LocationList;
import ui.StatDisplay;

public class GetEvent implements ListEventInterface {
	
	private StatDisplay dsp = new StatDisplay(); // called to get current player cords
	private LocationList locate = new LocationList(); // gets location list
	
	private ArrayList<LocationBase> local = locate.getLocation(); //stores locations in list
	
	@Override
	public void eventGet(int maxX, int maxY, int chanceNum) {
		boolean checkLocal = true;
		
		while (checkLocal)
		{
		// at boss location
		if (dsp.getCordX() == (maxX/2) && dsp.getCordY() == (maxY/2))
		{
			local.get(3).event(chanceNum);
			break;
		}
		
		// one to two spots out from bosses location
		if
		(
		dsp.getCordX() == (maxX/2 + 2) && dsp.getCordY() == (maxY/2) ||
		dsp.getCordX() == (maxX/2 - 2) && dsp.getCordY() == (maxY/2) ||
		dsp.getCordX() == (maxX/2) && dsp.getCordY() == (maxY/2 + 2) ||
		dsp.getCordX() == (maxX/2) && dsp.getCordY() == (maxY/2 - 2) ||
		
		dsp.getCordX() == (maxX/2 - 1) && dsp.getCordY() == (maxY/2 - 1) ||
		dsp.getCordX() == (maxX/2 - 1) && dsp.getCordY() == (maxY/2 - 2) ||
		dsp.getCordX() == (maxX/2 - 2) && dsp.getCordY() == (maxY/2 - 1) ||
		dsp.getCordX() == (maxX/2 - 2) && dsp.getCordY() == (maxY/2 - 2) ||
		
		dsp.getCordX() == (maxX/2 + 1) && dsp.getCordY() == (maxY/2 + 1) ||
		dsp.getCordX() == (maxX/2 + 1) && dsp.getCordY() == (maxY/2 + 2) ||
		dsp.getCordX() == (maxX/2 + 2) && dsp.getCordY() == (maxY/2 + 1) ||
		dsp.getCordX() == (maxX/2 + 2) && dsp.getCordY() == (maxY/2 + 2) ||
		
		dsp.getCordX() == (maxX/2 - 1) && dsp.getCordY() == (maxY/2 + 1) ||
		dsp.getCordX() == (maxX/2 - 1) && dsp.getCordY() == (maxY/2 + 2) ||
		dsp.getCordX() == (maxX/2 - 2) && dsp.getCordY() == (maxY/2 + 1) ||
		dsp.getCordX() == (maxX/2 - 2) && dsp.getCordY() == (maxY/2 + 2) ||
		
		dsp.getCordX() == (maxX/2 + 1) && dsp.getCordY() == (maxY/2 - 1) ||
		dsp.getCordX() == (maxX/2 + 1) && dsp.getCordY() == (maxY/2 - 2) ||
		dsp.getCordX() == (maxX/2 + 2) && dsp.getCordY() == (maxY/2 - 1) ||
		dsp.getCordX() == (maxX/2 + 2) && dsp.getCordY() == (maxY/2 - 2) 
		)
		{
			local.get(2).event(chanceNum); //shaodw pass
			break;
		}
		
		if (dsp.getCordX() == (maxX/2) && dsp.getCordY() == (maxY/2 + 1))
		{
			local.get(2).event(chanceNum);//shaodw pass
			break;
		}
		
		if (dsp.getCordX() == (maxX/2 - 1) && dsp.getCordY() == (maxY/2))
		{
			local.get(2).event(chanceNum);//shaodw pass
			break;
		}
		
		if (dsp.getCordX() == (maxX/2 + 1) && dsp.getCordY() == (maxY/2))
		{
			local.get(2).event(chanceNum);//shaodw pass
			break;
		}
		
		if (dsp.getCordX() == (maxX/2) && dsp.getCordY() == (maxY/2 - 1))
		{
			local.get(2).event(chanceNum);//shaodw pass
			break;
		}
		
		if (
			dsp.getCordX() == (maxX/2) && dsp.getCordY() == (maxY/2 + 3) ||
			dsp.getCordX() == (maxX/2 - 1) && dsp.getCordY() == (maxY/2 + 3) ||
			dsp.getCordX() == (maxX/2 - 2) && dsp.getCordY() == (maxY/2 + 3) ||
			dsp.getCordX() == (maxX/2 + 1) && dsp.getCordY() == (maxY/2 + 3) ||
			dsp.getCordX() == (maxX/2 + 2) && dsp.getCordY() == (maxY/2 + 3)	
			)
		{
			local.get(2).event(chanceNum);//shaodw pass
			break;
		}
		
		if (
				dsp.getCordX() == (maxX/2) && dsp.getCordY() == (maxY/2 - 3) ||
				dsp.getCordX() == (maxX/2 - 1) && dsp.getCordY() == (maxY/2 - 3) ||
				dsp.getCordX() == (maxX/2 - 2) && dsp.getCordY() == (maxY/2 - 3) ||
				dsp.getCordX() == (maxX/2 + 1) && dsp.getCordY() == (maxY/2 - 3) ||
				dsp.getCordX() == (maxX/2 + 2) && dsp.getCordY() == (maxY/2 - 3)	
				)
			{
			local.get(2).event(chanceNum);//shaodw pass
				break;
			}
		
		if (
				dsp.getCordX() == (maxX/2 + 3) && dsp.getCordY() == (maxY/2) ||
				dsp.getCordX() == (maxX/2 + 3) && dsp.getCordY() == (maxY/2 - 1) ||
				dsp.getCordX() == (maxX/2 + 3) && dsp.getCordY() == (maxY/2 - 2) ||
				dsp.getCordX() == (maxX/2 + 3) && dsp.getCordY() == (maxY/2 + 1) ||
				dsp.getCordX() == (maxX/2 + 3) && dsp.getCordY() == (maxY/2 + 2)	
				)
			{
				local.get(2).event(chanceNum);//shaodw pass
				break;
			}
		
		if (
				dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2) ||
				dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2 - 1) ||
				dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2 - 2) ||
				dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2 + 2) ||
				dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2 + 3)	
				)
			{
				local.get(2).event(chanceNum);//shaodw pass
				break;
			}
		
		if (dsp.getCordX() == (maxX/2 + 3) && dsp.getCordY() == (maxY/2 + 3))
		{
			local.get(2).event(chanceNum);//shaodw pass
			break;
		}
		
		if (dsp.getCordX() == (maxX/2 + 3) && dsp.getCordY() == (maxY/2 - 3))
		{
			local.get(2).event(chanceNum);//shaodw pass
			break;
		}
		
		if (dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2 + 3))
		{
			local.get(2).event(chanceNum);//shaodw pass
			break;
		}
		
		if (dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2 - 3))
		{
			local.get(2).event(chanceNum);//shaodw pass
			break;
		}
		
		// check for shops first!!!
		
		if (dsp.getCordX() == (maxX) && dsp.getCordY() == (maxY))
		{
			local.get(4).event(chanceNum);// coin shop
			break;
		}
		
		if (dsp.getCordX() == (maxX - 1) && dsp.getCordY() == (maxY))
		{
			local.get(1).event(chanceNum); //forest
			break;
		}
		
		if (dsp.getCordX() == (maxX) && dsp.getCordY() == (maxY - 1))
		{
			local.get(1).event(chanceNum); //forest
			break;
		}
		
		if (dsp.getCordX() == (maxX) && dsp.getCordY() == (1))
		{
			local.get(4).event(chanceNum);// coin shop
			break;
		}
		
		if (dsp.getCordX() == (maxX) && dsp.getCordY() == (1))
		{
			local.get(4).event(chanceNum);// coin shop
			break;
		}
		
		if (dsp.getCordX() == (maxX - 1) && dsp.getCordY() == (1))
		{
			local.get(1).event(chanceNum); //forest
			break; 
		}
		
		if (dsp.getCordX() == (maxX) && dsp.getCordY() == (2))
		{
			local.get(1).event(chanceNum); //forest
			break;
		}
		
		if (dsp.getCordX() == (1) && dsp.getCordY() == (maxY))
		{
			local.get(4).event(chanceNum); // coin shop
			break;
		}
		
		if (dsp.getCordX() == (1) && dsp.getCordY() == (maxY - 1))
		{
			local.get(1).event(chanceNum); //forest
			break;
		}
		
		if (dsp.getCordX() == (2) && dsp.getCordY() == (maxY))
		{
			local.get(1).event(chanceNum); //forest
			break;
		}
		
		if (dsp.getCordX() == (1) && dsp.getCordY() == (1))
		{
			local.get(4).event(chanceNum); // coin shop
			break;
		}
		
		if (dsp.getCordX() == (2) && dsp.getCordY() == (1))
		{
			local.get(1).event(chanceNum); //forest
			break;
		}
		
		if (dsp.getCordX() == (1) && dsp.getCordY() == (2))
		{
			local.get(1).event(chanceNum); //forest
			break;
		}
		

		
		for (int x = 5; x < maxX; x = x + 5)
		{
			
			if (x == dsp.getCordX())
			{
				for (int y = 5; y < maxY; y = y + 5)
				{
					if (y == dsp.getCordY())
					{
						local.get(0).event(chanceNum); // town
						checkLocal = false;
						break;
					}
					if ((y - 1) == dsp.getCordY()) 
					{
						local.get(1).event(chanceNum); //forest
						checkLocal = false;
						break;
					}
					if ((y + 1) == dsp.getCordY())
					{
						local.get(1).event(chanceNum); //forest
						checkLocal = false;
						break;
					}
				}
			}
		}

		for (int y1 = 5; y1 < maxY; y1 = y1 + 5)
			{
				if (y1 == dsp.getCordY())
				{
					for (int x1 = 5; x1 < maxX; x1 = x1 + 5)
					{
						if ((x1 - 1) == dsp.getCordX())
						{
							local.get(1).event(chanceNum); //forest
							checkLocal = false;
							break;
						}
						if ((x1 + 1) == dsp.getCordX())
						{
							local.get(1).event(chanceNum); //forest
							checkLocal = false;
							break;
						}
					}
				}	
		} // end of main forloop
		if (checkLocal) {	
		if (dsp.getCordY() == 1 && dsp.getCordX() != 1 && dsp.getCordX() != maxX)
		{
			local.get(1).event(chanceNum); //forest
			break;
		}
		
		if (dsp.getCordY() != maxY && dsp.getCordY() != 1 && dsp.getCordX() == 1 )
		{
			local.get(1).event(chanceNum); //forest
			break;
		}
		
		if (dsp.getCordY() == maxY && dsp.getCordX() != 1 && dsp.getCordX() != maxX )
		{
			local.get(1).event(chanceNum); //forest
			break;
		}
		
		if (dsp.getCordX() == maxX && dsp.getCordY() != 1 && dsp.getCordY() != maxY)
		{
			local.get(1).event(chanceNum); //forest
			break;
		}	
		else
		{
			local.get(1).event(chanceNum); //forest
			break;
		}
		}
		} // end while
		checkLocal = true;
		
	}

}
