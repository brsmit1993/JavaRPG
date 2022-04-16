/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * file used to store all objects used in location
 */
package locations;

import battleMode.MonsterBattle;
import getEvent.DarkForestEvents;
import getEvent.HintEvent;
import getEvent.ShadowPassEvents;
import getEvent.ShopEvent;
import getEvent.TownEvents;

public abstract class Location {
	
	protected MonsterBattle battle = new MonsterBattle();
	protected DarkForestEvents forrestEvent = new DarkForestEvents();
	protected ShadowPassEvents shadowEvent = new ShadowPassEvents();
	protected TownEvents townEvent = new TownEvents();
	protected ShopEvent shopEvent = new ShopEvent();
	protected HintEvent hint = new HintEvent();

}
