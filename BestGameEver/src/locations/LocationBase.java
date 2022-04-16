/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * Used to define the layout for every object file
 */
package locations;

public interface LocationBase {
	public void event(int chanceNum); // calls event 1
	public String getlocalName();
	public int getBattleDif();
}
