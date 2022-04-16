/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * Essentially used to store events to be called later
 */
package getEvent;

import java.util.ArrayList;

public class EventList {
	
	private GetSurroundings event0 = new GetSurroundings(); // used for surroundings file
	private GetEvent eventGet = new GetEvent();
	
	private ArrayList<ListEventInterface> event = new ArrayList<ListEventInterface>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = -3524315965308122762L;

		{
			add(event0); //adds event0
			add(eventGet); //adds eventGet
		}




};

	/**
	 * used to call list of events
	 * @return
	 */
	public  ArrayList<ListEventInterface> getEvent() {
		return event;
	}

}