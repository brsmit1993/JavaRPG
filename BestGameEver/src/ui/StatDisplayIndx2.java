/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file gets player index 2s stats
 */
package ui;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import battleMode.PVPMode;
import gameMethods.MainGame;
import player.Player;

public class StatDisplayIndx2 {
	
	private static PVPMode pvp = new PVPMode(); // calls PVPMode
	private static ArrayList<Player> player; // store current player list
	
	/**
	 * returns index2 players strength
	 * @return
	 */
	public int getStr() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getStr(); 
	}
	/**
	 * returns index2 intelligence strength
	 * @return
	 */
	public int getSma() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getSma();
	}
	/**
	 * returns index2 luck strength
	 * @return
	 */
	public int getLuc() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getLuc();
	}
	/**
	 * returns index2 players defense
	 * @return
	 */
	public int getDef() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getDef();
	}
	/**
	 * returns index2 players speed
	 * @return
	 */
	public int getSpd() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getSpd();
	}
	/**
	 * returns index2 players hit points
	 * @return
	 */
	public int getHp() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getHp();
	}
	/**
	 * returns index2 players special points
	 * @return
	 */
	public int getSp() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getSp();
	}
	/**
	 * returns index2 players max hit points
	 * @return
	 */
	public int getMaxHp() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getMaxHp();
	}
	/**
	 * returns index2 players max special points
	 * @return
	 */
	public int getMaxSp() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getMaxSp();
	}
	/**
	 * returns index2 players Xp
	 * @return
	 */
	public int getXp() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getXp();
	}
	/**
	 * returns index2 players lvl
	 * @return
	 */
	public int getLvl() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getLvl();
	}
	/**
	 * returns index2 players cordX
	 * @return
	 */
	public int getCordX() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getCordX();
	}
	/**
	 * returns index2 players CordY
	 * @return
	 */
	public int getCordY() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getCordY();
	}
	/**
	 * returns index2 players name
	 * @return
	 */
	public String getName() 
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getPlayName();
	}
	/**
	 * returns index2 players ability 1 name
	 * @return
	 */
	public String getAbil1()
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getAbility1Name();
		
	}
	/**
	 * returns index2 players ability 2 name
	 * @return
	 */
	public String getAbil2()
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getAbility2Name();
		
	}
	/**
	 * returns index2 players ability 3 name
	 * @return
	 */
	public String getAbil3()
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getAbility3Name();
	}
	public int getGold()
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getGold();
	}
	public JLabel getImg()
	{
		
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getPlayImg();
	}
	public ImageIcon getImg2()
	{
		StatDisplayIndx2.setPlayer(MainGame.getPlayer());
		return player.get(pvp.getCurIndx2()).getPlayImg2();
	}
	/**
	 * sets player list to current player list before displaying stats
	 * @param player
	 */
	public static void setPlayer(ArrayList<Player> player) {
		StatDisplayIndx2.player = player;
	}
}
