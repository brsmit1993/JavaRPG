/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *this file gets the current players stats
 */
package ui;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import gameMethods.MainGame;
import player.Player;

public class StatDisplay {
	
	private static MainGame game = new MainGame(); // calls current game file
	private static ArrayList<Player> player; // store current player list
	
	/**
	 * gets current player strength based on game curindx
	 * @return
	 */
	public int getStr() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getStr();
	}
	/**
	 * gets current player intelligence based on game curindx
	 * @return
	 */
	public int getSma() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getSma();
	}
	/**
	 * gets current player luck based on game curindx
	 * @return
	 */
	public int getLuc() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getLuc();
	}
	/**
	 * gets current player defense based on game curindx
	 * @return
	 */
	public int getDef() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getDef();
	}
	/**
	 * gets current player speed based on game curindx
	 * @return
	 */
	public int getSpd() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getSpd();
	}
	/**
	 * gets current player hit points based on game curindx
	 * @return
	 */
	public int getHp() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getHp();
	}
	/**
	 * gets current player special points based on game curindx
	 * @return
	 */
	public int getSp() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getSp();
	}
	/**
	 * gets current player max hitpoints based on game curindx
	 * @return
	 */
	public int getMaxHp() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getMaxHp();
	}
	/**
	 * gets current player max special points based on game curindx
	 * @return
	 */
	public int getMaxSp() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getMaxSp();
	}
	/**
	 * gets current player Xp based on game curindx
	 * @return
	 */
	public int getXp() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getXp();
	}
	/**
	 * gets current player level based on game curindx
	 * @return
	 */
	public int getLvl() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getLvl();
	}
	/**
	 * gets current player cordX based on game curindx
	 * @return
	 */
	public int getCordX() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getCordX();
	}
	/**
	 * gets current player cordY based on game curindx
	 * @return
	 */
	public int getCordY() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getCordY();
	}
	/**
	 * gets current player name based on game curindx
	 * @return
	 */
	public String getName() 
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getPlayName();
	}
	/**
	 * gets current player ability 1 name based on game curindx
	 * @return
	 */
	public String getAbil1()
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getAbility1Name();
		
	}
	/**
	 * gets current player ability 2 name based on game curindx
	 * @return
	 */
	public String getAbil2()
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getAbility2Name();
		
	}
	/**
	 * gets current player ability 3 name based on game curindx
	 * @return
	 */
	public String getAbil3()
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getAbility3Name();
		
	}
	/**
	 * gets current player gold amount based on game curindx
	 * @return
	 */
	public int getGold()
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getGold();
	}
	
	public JLabel getImg()
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getPlayImg();
	}
	
	public ImageIcon getImg2()
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getPlayImg2();
	}
	/**
	 * sets player list to current player list before displaying stats
	 * @param player
	 */
	public static void setPlayer(ArrayList<Player> player) {
		StatDisplay.player = player;
	}
	public int getSkillPoints()
	{
		StatDisplay.setPlayer(MainGame.getPlayer());
		return player.get(game.getCurIndx()).getSkillPoints();
	}
}
