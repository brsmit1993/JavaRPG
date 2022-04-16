/**
 * 
 * @author Brandon Smith
 *this class sets the stats for the ranger player
 */
package player;

public class Ranger extends Player implements Abilities  {
	/**
	 * contstructo that sets the stats for the Rangers class based on paremeters defined by the player class
	 */
	public Ranger()
	{
		super(8,8,10,6,9,110,50,110,50, "Triple Shot", "Shower Of Arrows", "Death Of A 1000 Cuts",0,img.getImgRanger(),0,img.getImgIconRanger());
	}
	/**
	 * calls ability 1 based on index and indx2. indx2 is a bool that defines if it's player 1 or 2 during pvp.
	 * in monster battle indx2 is always set to false. in pvp mode indx2 becomes true if it's player 2 attacking
	 * and returns damage of ability based on the Rangers main stat which is speed.
	 * @param indx
	 * @param indx2
	 * @return
	 */
	@Override
	public int ability1(boolean indx2) {
		if(pvp.isPvpEnabled() == false) //runs if mosnter fight
		{
			if(dsp.getSp() >= 10) {
			sub.setSp(10);
			return batChance.dmgModPlayAbil1(dsp.getSpd(), dsp.getLuc(), monDsp.getDef());
			}
			else
			{
				return 0;
			}
		}
		
		if(pvp.isPvpEnabled() == true)// runs if pvp fight
		{
			if (indx2 == true) // runs if player 2 attack
			{
				if(dspDex2.getSp() >= 10) {
					subDex2.setSp(10);
					return batChance.dmgModPlayAbil1(dspDex2.getSpd(), dspDex2.getLuc(), dsp.getDef());
					}
					else
					{
						return 0;
					}
			}
			else // runs if player 1 attack
			{
				if(dsp.getSp() >= 10) {
					sub.setSp(10);
					return batChance.dmgModPlayAbil1(dsp.getSpd(), dsp.getLuc(), dspDex2.getDef());
					}
					else
					{
						return 0;
					}
			}
		}
		return 0;
	}
	/**
	 * calls ability 2 based on index and indx2. indx2 is a bool that defines if it's player 1 or 2 during pvp.
	 * in monster battle indx2 is always set to false. in pvp mode indx2 becomes true if it's player 2 attacking
	 * and returns damage of ability based on the Rangers main stat which is speed.
	 * @param indx
	 * @param indx2
	 * @return
	 */
	@Override
	public int ability2(boolean indx2) {
		if(pvp.isPvpEnabled() == false) //runs if mosnter fight
		{
			if(dsp.getSp() >= 25) {
			sub.setSp(25);
			return batChance.dmgModPlayAbil2(dsp.getSpd(), dsp.getLuc(), monDsp.getDef());
			}
			else
			{
				return 0;
			}
		}
		
		if(pvp.isPvpEnabled() == true)// runs if pvp fight
		{
			if (indx2 == true) // runs if player 2 attack
			{
				if(dspDex2.getSp() >= 25) {
					subDex2.setSp(25);
					return batChance.dmgModPlayAbil2(dspDex2.getSpd(), dspDex2.getLuc(), dsp.getDef());
					}
					else
					{
						return 0;
					}
			}
			else // runs if player 1 attack
			{
				if(dsp.getSp() >= 25) {
					sub.setSp(25);
					return batChance.dmgModPlayAbil2(dsp.getSpd(), dsp.getLuc(), dspDex2.getDef());
					}
					else
					{
						return 0;
					}
			}
		}
		return 0;
	}
	/**
	 * calls ability 3 based on index and indx2. indx2 is a bool that defines if it's player 1 or 2 during pvp.
	 * in monster battle indx2 is always set to false. in pvp mode indx2 becomes true if it's player 2 attacking
	 * and returns damage of ability based on the Rangers main stat which is speed.
	 * @param indx
	 * @param indx2
	 * @return
	 */
	@Override
	public int ability3(boolean indx2) {
		if(pvp.isPvpEnabled() == false) //runs if mosnter fight 
		{
			if(dsp.getSp() >= 50) {
			sub.setSp(50);
			return batChance.dmgModPlayAbil3(dsp.getSpd(), dsp.getLuc(), monDsp.getDef());
			}
			else
			{
				return 0;
			}
		}
		
		if(pvp.isPvpEnabled() == true) // runs if pvp fight
		{
			if (indx2 == true) //runs if player 2 attack
			{
				if(dspDex2.getSp() >= 50) {
					subDex2.setSp(50);
					return batChance.dmgModPlayAbil3(dspDex2.getSpd(), dspDex2.getLuc(), dsp.getDef());
					}
					else
					{
						return 0;
					}
			}
			else // runs if palyer 1 attack
			{
				if(dsp.getSp() >= 50) {
					sub.setSp(50);
					return batChance.dmgModPlayAbil3(dsp.getSpd(), dsp.getLuc(), dspDex2.getDef());
					}
					else
					{
						return 0;
					}
			}
		}
		return 0;
	}
}
