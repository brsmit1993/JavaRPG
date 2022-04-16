/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * Stores all locations for easy access from a list 
 */
package locations;

import java.util.ArrayList;

public class LocationList {
	LocationTown localTown = new LocationTown(); //20
	LocationForest localForest = new LocationForest(); //21
	LocationShadow localShadow = new LocationShadow(); //22
	LocationGoblin localGoblin = new LocationGoblin(); //23
	LocationCoin localCoin = new LocationCoin(); //24
	
	/**
	 * this is a list... this list stores things... not just random things but specific things.. this list does not store players
	 * thi list does not store items... this list does not store monsters either... this list stores vehicles.... not really though
	 * THIS LIST STORES LOCATIONS
	 */
	private ArrayList<LocationBase> location = new ArrayList<LocationBase>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = -1840895795487270762L;

		{
			add(localTown); //0
			add(localForest); //1
			add(localShadow); //2
			add(localGoblin); //3
			add(localCoin); //4
		}
	};
	
	/**
	 * 
	 * @return list of all locations
	 */
	public ArrayList<LocationBase> getLocation() {
		return location;
	}

	
}
