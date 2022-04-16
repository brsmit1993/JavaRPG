/**
 * 
 * @author Brandon Smith
 *this class sets the stats and abilities for the knight player.
 */
package player;

import javax.swing.JLabel;

public class Knight extends player.Player implements Abilities {
	/**
	 * contstructo that sets the stats for the knight class based on paremeters defined by the player class
	 */
	public Knight()
	{
		
		super(10,7,3,8,4,120,50,120,50, "Power Attack", "Shield Bash", "Death Blow",0,img.getImgKnight(),0,img.getImgIconKnight());
	}

	@Override
	
	/**
	 * calls ability 1 based on index and indx2. indx2 is a bool that defines if it's player 1 or 2 during pvp.
	 * in monster battle indx2 is always set to false. in pvp mode indx2 becomes true if it's player 2 attacking
	 * and returns damage of ability based on the knights main stat which is strength.
	 * @param indx
	 * @param indx2
	 * @return
	 */
	public int ability1(boolean indx2) {
		if(pvp.isPvpEnabled() == false) // runs if monster fight
		{
			if(dsp.getSp() >= 10) {
			sub.setSp(10);
			return batChance.dmgModPlayAbil1(dsp.getStr(), dsp.getLuc(), monDsp.getDef());
			}
			else
			{
				return 0;
			}
			
		}
		
		if(pvp.isPvpEnabled() == true) // runs if pvp fight
		{
			if (indx2 == true) // runs if player2 attack
			{
				if(dspDex2.getSp() >= 10) {
					subDex2.setSp(10);
					return batChance.dmgModPlayAbil1(dspDex2.getStr(), dspDex2.getLuc(), dsp.getDef());
					}
					else
					{
						return 0;
					}
			}
			else //runs if player 1 attack
			{
				if(dsp.getSp() >= 10) {
					sub.setSp(10);
					return batChance.dmgModPlayAbil1(dsp.getStr(), dsp.getLuc(), dspDex2.getDef());
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
	 * and returns damage of ability based on the knights main stat which is strength.
	 * @param indx
	 * @param indx2
	 * @return
	 */
	@Override
	public int ability2(boolean indx2) {
		if(pvp.isPvpEnabled() == false) // runs if mosnter fight
		{
			if(dsp.getSp() >= 25) {
			sub.setSp(25);
			return batChance.dmgModPlayAbil2(dsp.getStr(), dsp.getLuc(), monDsp.getDef());
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
					subDex2.setSp(25);
					return batChance.dmgModPlayAbil2(dspDex2.getStr(), dspDex2.getLuc(), dsp.getDef());
					}
					else
					{
						return 0;
					}
			}
			else  // runs if player 1 attack
			{
				if(dsp.getSp() >= 25) {
					sub.setSp(25);
					return batChance.dmgModPlayAbil2(dsp.getStr(), dsp.getLuc(), dspDex2.getDef());
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
	 * and returns damage of ability based on the knights main stat which is strength.
	 * @param indx
	 * @param indx2
	 * @return
	 */
	@Override
	public int ability3(boolean indx2) {
		//runs during mosnter fights
		if(pvp.isPvpEnabled() == false) //runs if monster fight
		{
			if(dsp.getSp() >= 50) {
			sub.setSp(50);
			return batChance.dmgModPlayAbil3(dsp.getStr(), dsp.getLuc(), monDsp.getDef());
			}
			else
			{
				return 0;
			}
		}
		// runs during pvp fights
		if(pvp.isPvpEnabled() == true)
		{	
			//runs if player 2 is attacking
			if (indx2 == true) 
			{
				if(dspDex2.getSp() >= 50) {
					subDex2.setSp(50);
					System.out.println(dspDex2.getName() + " now has " + dspDex2.getSp() + "/" + dspDex2.getMaxSp() + " Sp left.");
					return batChance.dmgModPlayAbil3(dspDex2.getStr(), dspDex2.getLuc(), dsp.getDef());
					}
					else
					{
						return 0;
					}
			}
			else // runs if player 1 is attacking
			{
				if(dsp.getSp() >= 50) {
					sub.setSp(50);
					return batChance.dmgModPlayAbil3(dsp.getStr(), dsp.getLuc(), dspDex2.getDef());
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
