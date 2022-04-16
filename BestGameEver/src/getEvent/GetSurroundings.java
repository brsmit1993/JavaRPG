/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * This file gets the players surrounding based on their current location and the location names
 */
package getEvent;

import java.util.ArrayList;


import locations.LocationBase;
import locations.LocationList;

import ui.StatDisplay;

public class GetSurroundings implements ListEventInterface{
	
	private StatDisplay dsp = new StatDisplay(); // called to get current player cords
	private LocationList locate = new LocationList(); // gets location list
	private ArrayList<LocationBase> local = locate.getLocation(); //stores locations in list
	private static String north;
	private static String south;
	private static String west;
	private static String east;
	
	/**
	 * Essentailly checks the current players surroundings and informs them what is in each direction.
	 */
	@Override
	public void eventGet(int maxX, int maxY, int ChanceNum) {
		boolean checkLocal = true; // prevents double dispaly of directions
		
		while (checkLocal) // prevents double dispaly of directions
		{

		// at boss location
		if (dsp.getCordX() == (maxX/2) && dsp.getCordY() == (maxY/2))
		{
			setNorth(local.get(2).getlocalName());
			setSouth(local.get(2).getlocalName());
			setWest(local.get(2).getlocalName());
			setEast(local.get(2).getlocalName());
			checkLocal = false;
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
			setNorth(local.get(2).getlocalName());
			setSouth(local.get(2).getlocalName());
			setWest(local.get(2).getlocalName());
			setEast(local.get(2).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (maxX/2) && dsp.getCordY() == (maxY/2 + 1))
		{
			setNorth(local.get(2).getlocalName());
			setSouth(local.get(3).getlocalName());
			setWest(local.get(2).getlocalName());
			setEast(local.get(2).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (maxX/2 - 1) && dsp.getCordY() == (maxY/2))
		{
			setNorth(local.get(2).getlocalName());
			setSouth(local.get(2).getlocalName());
			setWest(local.get(2).getlocalName());
			setEast(local.get(3).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (maxX/2 + 1) && dsp.getCordY() == (maxY/2))
		{
			setNorth(local.get(2).getlocalName());
			setSouth(local.get(2).getlocalName());
			setWest(local.get(3).getlocalName());
			setEast(local.get(2).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (maxX/2) && dsp.getCordY() == (maxY/2 - 1))
		{
			setNorth(local.get(3).getlocalName());
			setSouth(local.get(2).getlocalName());
			setWest(local.get(2).getlocalName());
			setEast(local.get(2).getlocalName());
			checkLocal = false;
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
			for (int x = 5; x < maxX; x = x + 5)
			{
				
				if (x == dsp.getCordX())
				{
					for (int y = 5; y < maxY; y = y + 5)
					{
						if (y == dsp.getCordY())
						{
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(2).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y - 1) == dsp.getCordY())
						{
							setNorth(local.get(0).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(2).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y + 1) == dsp.getCordY())
						{
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(2).getlocalName());
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
								setNorth(local.get(1).getlocalName());
								setSouth(local.get(2).getlocalName());
								setWest(local.get(2).getlocalName());
								setEast(local.get(2).getlocalName());
								checkLocal = false;
								break;
							}
							if ((x1 + 1) == dsp.getCordX())
							{
								setNorth(local.get(1).getlocalName());
								setSouth(local.get(2).getlocalName());
								setWest(local.get(2).getlocalName());
								setEast(local.get(2).getlocalName());
								checkLocal = false;
								break;
							}
						}
					}
				}
			if (checkLocal)
			{
				setNorth(local.get(1).getlocalName());
				setSouth(local.get(2).getlocalName());
				setWest(local.get(2).getlocalName());
				setEast(local.get(2).getlocalName());
				checkLocal = false;
				break;	
			}
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
			for (int x = 5; x < maxX; x = x + 5)
			{
				
				if (x == dsp.getCordX())
				{
					for (int y = 5; y < maxY; y = y + 5)
					{
						if (y == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(2).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y - 1) == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(2).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y + 1) == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(0).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(2).getlocalName());
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
								setNorth(local.get(2).getlocalName());
								setSouth(local.get(1).getlocalName());
								setWest(local.get(2).getlocalName());
								setEast(local.get(2).getlocalName());
								checkLocal = false;
								break;
							}
							if ((x1 + 1) == dsp.getCordX())
							{
								setNorth(local.get(2).getlocalName());
								setSouth(local.get(1).getlocalName());
								setWest(local.get(2).getlocalName());
								setEast(local.get(2).getlocalName());
								checkLocal = false;
								break;
							}
						}
					}
				}
			if (checkLocal)
			{
				setNorth(local.get(2).getlocalName());
				setSouth(local.get(1).getlocalName());
				setWest(local.get(2).getlocalName());
				setEast(local.get(2).getlocalName());
				checkLocal = false;
				break;	
			}
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
			for (int x = 5; x < maxX; x = x + 5)
			{
				
				if (x == dsp.getCordX())
				{
					for (int y = 5; y < maxY; y = y + 5)
					{
						if (y == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(1).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y - 1) == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(1).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y + 1) == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(1).getlocalName());
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
								setNorth(local.get(2).getlocalName());
								setSouth(local.get(2).getlocalName());
								setWest(local.get(2).getlocalName());
								setEast(local.get(0).getlocalName());
								checkLocal = false;
								break;
							}
							if ((x1 + 1) == dsp.getCordX())
							{
								setNorth(local.get(2).getlocalName());
								setSouth(local.get(2).getlocalName());
								setWest(local.get(2).getlocalName());
								setEast(local.get(1).getlocalName());
								checkLocal = false;
								break;
							}
						}
					}
				}
			if (checkLocal)
			{
				setNorth(local.get(2).getlocalName());
				setSouth(local.get(2).getlocalName());
				setWest(local.get(2).getlocalName());
				setEast(local.get(1).getlocalName());
				checkLocal = false;
				break;	
			}
			break;
			}
		
		if (
				dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2) ||
				dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2 - 1) ||
				dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2 - 2) ||
				dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2 + 1) ||
				dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2 + 2)	
				)
			{
			for (int x = 5; x < maxX; x = x + 5)
			{
				
				if (x == dsp.getCordX())
				{
					for (int y = 5; y < maxY; y = y + 5)
					{
						if (y == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(2).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y - 1) == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(2).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y + 1) == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(2).getlocalName());
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
								setNorth(local.get(2).getlocalName());
								setSouth(local.get(2).getlocalName());
								setWest(local.get(1).getlocalName());
								setEast(local.get(2).getlocalName());
								checkLocal = false;
								break;
							}
							if ((x1 + 1) == dsp.getCordX())
							{
								setNorth(local.get(2).getlocalName());
								setSouth(local.get(2).getlocalName());
								setWest(local.get(0).getlocalName());
								setEast(local.get(2).getlocalName());
								checkLocal = false;
								break;
							}
						}
					}
				}
			if (checkLocal)
			{
				setNorth(local.get(2).getlocalName());
				setSouth(local.get(2).getlocalName());
				setWest(local.get(1).getlocalName());
				setEast(local.get(2).getlocalName());
				checkLocal = false;
				break;	
			}
			break;
			}
		
		if (dsp.getCordX() == (maxX/2 + 3) && dsp.getCordY() == (maxY/2 + 3))
		{
			for (int x = 5; x < maxX; x = x + 5)
			{
				
				if (x == dsp.getCordX())
				{
					for (int y = 5; y < maxY; y = y + 5)
					{
						if (y == dsp.getCordY())
						{
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(1).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y - 1) == dsp.getCordY())
						{
							setNorth(local.get(0).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(1).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y + 1) == dsp.getCordY())
						{
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(1).getlocalName());
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
								setNorth(local.get(1).getlocalName());
								setSouth(local.get(2).getlocalName());
								setWest(local.get(2).getlocalName());
								setEast(local.get(1).getlocalName());
								checkLocal = false;
								break;
							}
							if ((x1 + 1) == dsp.getCordX())
							{
								setNorth(local.get(1).getlocalName());
								setSouth(local.get(2).getlocalName());
								setWest(local.get(2).getlocalName());
								setEast(local.get(1).getlocalName());
								checkLocal = false;
								break;
							}
						}
					}
				}
			if (checkLocal)
			{
				setNorth(local.get(1).getlocalName());
				setSouth(local.get(2).getlocalName());
				setWest(local.get(2).getlocalName());
				setEast(local.get(1).getlocalName());
				checkLocal = false;
				break;	
			}
			break;
		}
		
		if (dsp.getCordX() == (maxX/2 + 3) && dsp.getCordY() == (maxY/2 - 3))
		{
			for (int x = 5; x < maxX; x = x + 5)
			{
				
				if (x == dsp.getCordX())
				{
					for (int y = 5; y < maxY; y = y + 5)
					{
						if (y == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(1).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y - 1) == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(1).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y + 1) == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(0).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(1).getlocalName());
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
								setNorth(local.get(2).getlocalName());
								setSouth(local.get(1).getlocalName());
								setWest(local.get(2).getlocalName());
								setEast(local.get(1).getlocalName());
								checkLocal = false;
								break;
							}
							if ((x1 + 1) == dsp.getCordX())
							{
								setNorth(local.get(2).getlocalName());
								setSouth(local.get(1).getlocalName());
								setWest(local.get(2).getlocalName());
								setEast(local.get(1).getlocalName());
								checkLocal = false;
								break;
							}
						}
					}
				}
			if (checkLocal)
			{
				setNorth(local.get(2).getlocalName());
				setSouth(local.get(1).getlocalName());
				setWest(local.get(2).getlocalName());
				setEast(local.get(1).getlocalName());
				checkLocal = false;
				break;	
			}
			break;
		}
		
		if (dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2 + 3))
		{
			for (int x = 5; x < maxX; x = x + 5)
			{
				
				if (x == dsp.getCordX())
				{
					for (int y = 5; y < maxY; y = y + 5)
					{
						if (y == dsp.getCordY())
						{
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(2).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y - 1) == dsp.getCordY())
						{
							setNorth(local.get(0).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(2).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y + 1) == dsp.getCordY())
						{
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(2).getlocalName());
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
								setNorth(local.get(1).getlocalName());
								setSouth(local.get(2).getlocalName());
								setWest(local.get(1).getlocalName());
								setEast(local.get(2).getlocalName());
								checkLocal = false;
								break;
							}
							if ((x1 + 1) == dsp.getCordX())
							{
								setNorth(local.get(1).getlocalName());
								setSouth(local.get(2).getlocalName());
								setWest(local.get(0).getlocalName());
								setEast(local.get(2).getlocalName());
								checkLocal = false;
								break;
							}
						}
					}
				}
			if (checkLocal)
			{
				setNorth(local.get(1).getlocalName());
				setSouth(local.get(2).getlocalName());
				setWest(local.get(1).getlocalName());
				setEast(local.get(2).getlocalName());
				checkLocal = false;
				break;	
			}
			break;
		}
		
		if (dsp.getCordX() == (maxX/2 - 3) && dsp.getCordY() == (maxY/2 - 3))
		{
			for (int x = 5; x < maxX; x = x + 5)
			{
				
				if (x == dsp.getCordX())
				{
					for (int y = 5; y < maxY; y = y + 5)
					{
						if (y == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(2).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y - 1) == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(2).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y + 1) == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(0).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(2).getlocalName());
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
								setNorth(local.get(2).getlocalName());
								setSouth(local.get(1).getlocalName());
								setWest(local.get(1).getlocalName());
								setEast(local.get(2).getlocalName());
								checkLocal = false;
								break;
							}
							if ((x1 + 1) == dsp.getCordX())
							{
								setNorth(local.get(2).getlocalName());
								setSouth(local.get(1).getlocalName());
								setWest(local.get(0).getlocalName());
								setEast(local.get(2).getlocalName());
								checkLocal = false;
								break;
							}
						}
					}
				}
			if (checkLocal)
			{
				setNorth(local.get(2).getlocalName());
				setSouth(local.get(1).getlocalName());
				setWest(local.get(1).getlocalName());
				setEast(local.get(2).getlocalName());
				checkLocal = false;
				break;	
			}
			break;
		}
		
		
		
		//outside of shadows pass check
		if (dsp.getCordX() == (maxX/2 - 4) && dsp.getCordY() == (maxY/2) ||
			dsp.getCordX() == (maxX/2 - 4) && dsp.getCordY() == (maxY/2 + 1) || 
			dsp.getCordX() == (maxX/2 - 4) && dsp.getCordY() == (maxY/2 + 2) ||
			dsp.getCordX() == (maxX/2 - 4) && dsp.getCordY() == (maxY/2 + 3) || 
			dsp.getCordX() == (maxX/2 - 4) && dsp.getCordY() == (maxY/2 - 1) ||
			dsp.getCordX() == (maxX/2 - 4) && dsp.getCordY() == (maxY/2 - 2) || 
			dsp.getCordX() == (maxX/2 - 4) && dsp.getCordY() == (maxY/2 - 3)
			)
		{
			for (int x = 5; x < maxX; x = x + 5)
			{
				
				if (x == dsp.getCordX())
				{
					for (int y = 5; y < maxY; y = y + 5)
					{
						if (y == dsp.getCordY())
						{
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(2).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y - 1) == dsp.getCordY())
						{
							setNorth(local.get(0).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(2).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y + 1) == dsp.getCordY())
						{
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(0).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(2).getlocalName());
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
								setNorth(local.get(1).getlocalName());
								setSouth(local.get(1).getlocalName());
								setWest(local.get(1).getlocalName());
								setEast(local.get(2).getlocalName());
								checkLocal = false;
								break;
							}
							if ((x1 + 1) == dsp.getCordX())
							{
								setNorth(local.get(1).getlocalName());
								setSouth(local.get(1).getlocalName());
								setWest(local.get(0).getlocalName());
								setEast(local.get(2).getlocalName());
								checkLocal = false;
								break;
							}
						}
					}
				}
			if (checkLocal)
			{
				setNorth(local.get(1).getlocalName());
				setSouth(local.get(1).getlocalName());
				setWest(local.get(1).getlocalName());
				setEast(local.get(2).getlocalName());
				checkLocal = false;
				break;	
			}
			break;	
		}
		
		if (dsp.getCordX() == (maxX/2 + 4) && dsp.getCordY() == (maxY/2) ||
				dsp.getCordX() == (maxX/2 + 4) && dsp.getCordY() == (maxY/2 + 1) || 
				dsp.getCordX() == (maxX/2 + 4) && dsp.getCordY() == (maxY/2 + 2) ||
				dsp.getCordX() == (maxX/2 + 4) && dsp.getCordY() == (maxY/2 + 3) || 
				dsp.getCordX() == (maxX/2 + 4) && dsp.getCordY() == (maxY/2 - 1) ||
				dsp.getCordX() == (maxX/2 + 4) && dsp.getCordY() == (maxY/2 - 2) || 
				dsp.getCordX() == (maxX/2 + 4) && dsp.getCordY() == (maxY/2 - 3)
				)
			{
			for (int x = 5; x < maxX; x = x + 5)
			{
				
				if (x == dsp.getCordX())
				{
					for (int y = 5; y < maxY; y = y + 5)
					{
						if (y == dsp.getCordY())
						{
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(1).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y - 1) == dsp.getCordY())
						{
							setNorth(local.get(0).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(1).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y + 1) == dsp.getCordY())
						{
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(0).getlocalName());
							setWest(local.get(2).getlocalName());
							setEast(local.get(1).getlocalName());
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
								setNorth(local.get(1).getlocalName());
								setSouth(local.get(1).getlocalName());
								setWest(local.get(2).getlocalName());
								setEast(local.get(1).getlocalName());
								checkLocal = false;
								break;
							}
							if ((x1 + 1) == dsp.getCordX())
							{
								setNorth(local.get(1).getlocalName());
								setSouth(local.get(1).getlocalName());
								setWest(local.get(2).getlocalName());
								setEast(local.get(1).getlocalName());
								checkLocal = false;
								break;
							}
						}
					}
				}
			if (checkLocal)
			{
				setNorth(local.get(1).getlocalName());
				setSouth(local.get(1).getlocalName());
				setWest(local.get(2).getlocalName());
				setEast(local.get(1).getlocalName());
				checkLocal = false;
				break;	
			}
			break;
			}
		
		if (dsp.getCordY() == (maxY/2 - 4) && dsp.getCordX() == (maxX/2) ||
				dsp.getCordY() == (maxY/2 - 4) && dsp.getCordX() == (maxX/2 + 1) || 
				dsp.getCordY() == (maxY/2 - 4) && dsp.getCordX() == (maxX/2 + 2) ||
				dsp.getCordY() == (maxY/2 - 4) && dsp.getCordX() == (maxX/2 + 3) || 
				dsp.getCordY() == (maxY/2 - 4) && dsp.getCordX() == (maxX/2 - 1) ||
				dsp.getCordY() == (maxY/2 - 4) && dsp.getCordX() == (maxX/2 - 2) || 
				dsp.getCordY() == (maxY/2 - 4) && dsp.getCordX() == (maxX/2 - 3)
				)
			{
			for (int x = 5; x < maxX; x = x + 5)
			{
				
				if (x == dsp.getCordX())
				{
					for (int y = 5; y < maxY; y = y + 5)
					{
						if (y == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(1).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y - 1) == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(1).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y + 1) == dsp.getCordY())
						{
							setNorth(local.get(2).getlocalName());
							setSouth(local.get(0).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(1).getlocalName());
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
								setNorth(local.get(2).getlocalName());
								setSouth(local.get(1).getlocalName());
								setWest(local.get(1).getlocalName());
								setEast(local.get(1).getlocalName());
								checkLocal = false;
								break;
							}
							if ((x1 + 1) == dsp.getCordX())
							{
								setNorth(local.get(2).getlocalName());
								setSouth(local.get(1).getlocalName());
								setWest(local.get(0).getlocalName());
								setEast(local.get(1).getlocalName());
								checkLocal = false;
								break;
							}
						}
					}
				}
			if (checkLocal)
			{
				setNorth(local.get(2).getlocalName());
				setSouth(local.get(1).getlocalName());
				setWest(local.get(1).getlocalName());
				setEast(local.get(1).getlocalName());
				checkLocal = false;
				break;	
			}
			break;
			}
		
		if (dsp.getCordY() == (maxY/2 + 4) && dsp.getCordX() == (maxX/2) ||
			dsp.getCordY() == (maxY/2 + 4) && dsp.getCordX() == (maxX/2 + 1) || 
			dsp.getCordY() == (maxY/2 + 4) && dsp.getCordX() == (maxX/2 + 2) ||
			dsp.getCordY() == (maxY/2 + 4) && dsp.getCordX() == (maxX/2 + 3) || 
			dsp.getCordY() == (maxY/2 + 4) && dsp.getCordX() == (maxX/2 - 1) ||
			dsp.getCordY() == (maxY/2 + 4) && dsp.getCordX() == (maxX/2 - 2) || 
			dsp.getCordY() == (maxY/2 + 4) && dsp.getCordX() == (maxX/2 - 3)
				)
			{
			for (int x = 5; x < maxX; x = x + 5)
			{
				
				if (x == dsp.getCordX())
				{
					for (int y = 5; y < maxY; y = y + 5)
					{
						if (y == dsp.getCordY())
						{
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(1).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y - 1) == dsp.getCordY())
						{
							setNorth(local.get(0).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(1).getlocalName());
							checkLocal = false;
							break;
						}
						if ((y + 1) == dsp.getCordY())
						{
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(2).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(1).getlocalName());
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
								setNorth(local.get(1).getlocalName());
								setSouth(local.get(2).getlocalName());
								setWest(local.get(1).getlocalName());
								setEast(local.get(1).getlocalName());
								checkLocal = false;
								break;
							}
							if ((x1 + 1) == dsp.getCordX())
							{
								setNorth(local.get(1).getlocalName());
								setSouth(local.get(2).getlocalName());
								setWest(local.get(0).getlocalName());
								setEast(local.get(1).getlocalName());
								checkLocal = false;
								break;
							}
						}
					}
				}
			if (checkLocal)
			{
				setNorth(local.get(1).getlocalName());
				setSouth(local.get(2).getlocalName());
				setWest(local.get(1).getlocalName());
				setEast(local.get(1).getlocalName());
				checkLocal = false;
				break;	
			}
			break;
			}
		
//START OF NOTHING STRINGS -------------------------------------------------------------------------------------------------------------------	
		
		// check for shops first!!!
		if (dsp.getCordX() == (maxX) && dsp.getCordY() == (maxY))
		{
			setNorth("NOTHING");
			setSouth(local.get(1).getlocalName());
			setWest(local.get(1).getlocalName());
			setEast("NOTHING");
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (maxX - 1) && dsp.getCordY() == (maxY))
		{
			setNorth("NOTHING");
			setSouth(local.get(1).getlocalName());
			setWest(local.get(1).getlocalName());
			setEast(local.get(4).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (maxX) && dsp.getCordY() == (maxY - 1))
		{
			setNorth(local.get(4).getlocalName());
			setSouth(local.get(1).getlocalName());
			setWest(local.get(1).getlocalName());
			setEast("NOTHING");
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (maxX) && dsp.getCordY() == (1))
		{
			setNorth(local.get(1).getlocalName());
			setSouth("NOTHING");
			setWest(local.get(1).getlocalName());
			setEast("NOTHING");
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (maxX) && dsp.getCordY() == (1))
		{
			setNorth(local.get(1).getlocalName());
			setSouth("NOTHING");
			setWest(local.get(1).getlocalName());
			setEast("NOTHING");
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (maxX - 1) && dsp.getCordY() == (1))
		{
			setNorth(local.get(1).getlocalName());
			setSouth("NOTHING");
			setWest(local.get(1).getlocalName());
			setEast(local.get(4).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (maxX) && dsp.getCordY() == (2))
		{
			setNorth(local.get(1).getlocalName());
			setSouth(local.get(4).getlocalName());
			setWest("NOTHING");
			setWest(local.get(1).getlocalName());
			setEast("NOTHING");
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (1) && dsp.getCordY() == (maxY))
		{
			setNorth("NOTHING");
			setSouth(local.get(1).getlocalName());
			setWest("NOTHING");
			setEast(local.get(1).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (1) && dsp.getCordY() == (maxY - 1))
		{
			setNorth(local.get(4).getlocalName());
			setSouth(local.get(1).getlocalName());
			setWest("NOTHING");
			setEast(local.get(1).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (2) && dsp.getCordY() == (maxY))
		{
			setNorth("NOTHING");
			setSouth(local.get(1).getlocalName());
			setWest(local.get(4).getlocalName());
			setEast(local.get(1).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (1) && dsp.getCordY() == (1))
		{
			setNorth(local.get(1).getlocalName());
			setSouth("NOTHING");
			setWest("NOTHING");
			setEast(local.get(1).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (2) && dsp.getCordY() == (1))
		{
			setNorth(local.get(1).getlocalName());
			setSouth("NOTHING");
			setWest(local.get(4).getlocalName());
			setEast(local.get(1).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == (1) && dsp.getCordY() == (2))
		{
			setNorth(local.get(1).getlocalName());
			setSouth(local.get(4).getlocalName());
			setWest("NOTHING");
			setEast(local.get(1).getlocalName());
			checkLocal = false;
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
						setNorth(local.get(1).getlocalName());
						setSouth(local.get(1).getlocalName());
						setWest(local.get(1).getlocalName());
						setEast(local.get(1).getlocalName());
						checkLocal = false;
						break;
					}
					if ((y - 1) == dsp.getCordY())
					{
						setNorth(local.get(0).getlocalName());
						setSouth(local.get(1).getlocalName());
						setWest(local.get(1).getlocalName());
						setEast(local.get(1).getlocalName());
						checkLocal = false;
						break;
					}
					if ((y + 1) == dsp.getCordY())
					{
						setNorth(local.get(1).getlocalName());
						setSouth(local.get(0).getlocalName());
						setWest(local.get(1).getlocalName());
						setEast(local.get(1).getlocalName());
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
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(1).getlocalName());
							setEast(local.get(0).getlocalName());
							checkLocal = false;
							break;
						}
						if ((x1 + 1) == dsp.getCordX())
						{
							setNorth(local.get(1).getlocalName());
							setSouth(local.get(1).getlocalName());
							setWest(local.get(0).getlocalName());
							setEast(local.get(1).getlocalName());
							checkLocal = false;
							break;
						}
					}
				}	
		} // end of main forloop
		if (checkLocal) {	
		if (dsp.getCordY() == 1 && dsp.getCordX() != 1 && dsp.getCordX() != maxX)
		{
			setNorth(local.get(1).getlocalName());
			setSouth("NOTHING");
			setWest(local.get(1).getlocalName());
			setEast(local.get(1).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordY() != maxY && dsp.getCordY() != 1 && dsp.getCordX() == 1 )
		{
			setNorth(local.get(1).getlocalName());
			setSouth(local.get(1).getlocalName());
			setWest("NOTHING");
			setEast(local.get(1).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordY() == maxY && dsp.getCordX() != 1 && dsp.getCordX() != maxX )
		{
			setNorth("NOTHING");
			setSouth(local.get(1).getlocalName());
			setWest(local.get(1).getlocalName());
			setEast(local.get(1).getlocalName());
			checkLocal = false;
			break;
		}
		
		if (dsp.getCordX() == maxX && dsp.getCordY() != 1 && dsp.getCordY() != maxY)
		{
			setNorth(local.get(1).getlocalName());
			setSouth(local.get(1).getlocalName());
			setWest(local.get(1).getlocalName());
			setEast("NOTHING");
			checkLocal = false;
			break;
		}	
		else
		{
			setNorth(local.get(1).getlocalName());
			setSouth(local.get(1).getlocalName());
			setWest(local.get(1).getlocalName());
			setEast(local.get(1).getlocalName());
			checkLocal = false;
			break;
		}
		}
		} // end while
		checkLocal = true;
		
		
	}

	public String getNorth() {
		return north;
	}

	public void setNorth(String north) {
		GetSurroundings.north = north;
	}

	public String getSouth() {
		return south;
	}

	public void setSouth(String south) {
		GetSurroundings.south = south;
	}

	public String getWest() {
		return west;
	}

	public void setWest(String west) {
		GetSurroundings.west = west;
	}

	public String getEast() {
		return east;
	}

	public void setEast(String east) {
		GetSurroundings.east = east;
	}

	
	}

