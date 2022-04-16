/**
 * 
 * @author Brandon Smith
 *this classs sets the stats for the mage player
 */
package player;



public class Mage extends player.Player implements Abilities  {
	/**
	 * contstructo that sets the stats for the knight class based on paremeters defined by the player class
	 */
	public Mage() 
	{
		super(5,10,7,5,8,110,150,110,150, "Fire Ball", "Ice Storm", "Summon Demon",0,img.getImgMage(),0,img.getImgIconMage());
		
	}
	
	/**
	 * calls ability 1 based on index and indx2. indx2 is a bool that defines if it's player 1 or 2 during pvp.
	 * in monster battle indx2 is always set to false. in pvp mode indx2 becomes true if it's player 2 attacking
	 * and returns damage of ability based on the Mages main stat which is Intelligence.
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
			return batChance.dmgModPlayAbil1(dsp.getSma(), dsp.getLuc(), monDsp.getDef());
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
					return batChance.dmgModPlayAbil1(dspDex2.getSma(), dspDex2.getLuc(), dsp.getDef());
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
					return batChance.dmgModPlayAbil1(dsp.getSma(), dsp.getLuc(), dspDex2.getDef());
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
	 * and returns damage of ability based on the Mages main stat which is Intelligence.
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
			return batChance.dmgModPlayAbil2(dsp.getSma(), dsp.getLuc(), monDsp.getDef());
			}
			else
			{
				return 0;
			}
		}
		
		if(pvp.isPvpEnabled() == true) // runs if pvp fight
		{
			if (indx2 == true) // runs if player 2 attack
			{
				if(dspDex2.getSp() >= 25) {
					subDex2.setSp(50);
					return batChance.dmgModPlayAbil2(dspDex2.getSma(), dspDex2.getLuc(), dsp.getDef());
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
					return batChance.dmgModPlayAbil2(dsp.getSma(), dsp.getLuc(), dspDex2.getDef());
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
	 * calls ability 1 based on index and indx2. indx2 is a bool that defines if it's player 1 or 2 during pvp.
	 * in monster battle indx2 is always set to false. in pvp mode indx2 becomes true if it's player 2 attacking
	 * and returns damage of ability based on the Mages main stat which is intelligence.
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
			return batChance.dmgModPlayAbil3(dsp.getSma(), dsp.getLuc(), monDsp.getDef());
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
					return batChance.dmgModPlayAbil3(dspDex2.getSma(), dspDex2.getLuc(), dsp.getDef());
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
					return batChance.dmgModPlayAbil3(dsp.getSma(), dsp.getLuc(), dspDex2.getDef());
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
