/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 */
package inventory;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import console.GameStart;
import gameMethods.MainGame;
import guiComponents.Btns;
import guiComponents.PlayerLbls;



public class Map extends Item {
	
	private static Btns btns = new Btns();
	private static PlayerLbls lbl = new PlayerLbls();
	
	private JFrame mapFrame = new JFrame();
	private JScrollPane scrollPane = new JScrollPane();
	private JPanel mapPanel = new JPanel();
	private JPanel mapPanel2 = new JPanel();
	private JPanel mapPanel3 = new JPanel();

	private JLabel labels[];
	
	private JLabel townKey;
	private JLabel shadowKey;
	private JLabel coinKey;
	private JLabel goblinKey;
	private JLabel forrestKey;
	
	private JButton close;
	
	boolean called = false;
	
	public Map () 
	{
		setItemName("Map"); // sets name
		setItemValue(5000); // sets value in shop
		setConsumeable(false); // does not get removed after use
	}
	/**
	 * gives information based on how the map works
	 */

	
	@Override
	public void statEffect(int dex, boolean p2) 
	{
		mapFrame.remove(scrollPane);
		mapPanel.removeAll();
		mapPanel.repaint();
		mapPanel2.removeAll();
		mapPanel2.repaint();
		mapPanel3.removeAll();
		mapPanel3.repaint();
		
		GridBagLayout mapGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		if (!mapFrame.isUndecorated()) {
		    mapFrame.setUndecorated(true);
		}
		if(!mapFrame.isVisible()){
		    mapFrame.setVisible(true);
		}
		mapFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		mapFrame.setAlwaysOnTop(true);
		mapFrame.setLayout(new BorderLayout());
		
		scrollPane = new JScrollPane(mapPanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		mapPanel.setBackground(Color.black);
		mapPanel.setLayout(mapGrid);
		
		mapPanel2.setLayout(mapGrid);
		mapPanel2.setBackground(Color.black);
		
		mapPanel3.setLayout(mapGrid);
		mapPanel3.setBackground(Color.black);

		
		townKey = new JLabel(img.getImgKeyTown());
		townKey.setText(" = Town ");
		townKey.setForeground(Color.white);
		townKey.setFont(new Font("Courier New", Font.BOLD, 20));
		
		shadowKey = new JLabel(img.getImgKeyShadowpass());
		shadowKey.setText(" = Shadow Pass ");
		shadowKey.setForeground(Color.white);
		shadowKey.setFont(new Font("Courier New", Font.BOLD, 20));
		
		coinKey = new JLabel(img.getImgKeyCoinshop());
		coinKey.setText(" = Coin Shop ");
		coinKey.setForeground(Color.white);
		coinKey.setFont(new Font("Courier New", Font.BOLD, 20));
		
		goblinKey = new JLabel(img.getImgKeyCoinshop());
		goblinKey.setText(" = Goblin King Palace ");
		goblinKey.setForeground(Color.white);
		goblinKey.setFont(new Font("Courier New", Font.BOLD, 20));
		
		forrestKey = new JLabel(img.getImgKeyDarkforrest());
		forrestKey.setText(" = Dark Forrest ");
		forrestKey.setForeground(Color.white);
		forrestKey.setFont(new Font("Courier New", Font.BOLD, 20));

		close = btns.getBtnLay();
		close.setText("Close Map");
		
	
		gbc.fill = GridBagConstraints.VERTICAL;
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    mapPanel3.add(close, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    mapPanel2.add(coinKey, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 1;
	    mapPanel2.add(townKey, gbc);
	    gbc.gridx = 2;
	    gbc.gridy = 1;
	    mapPanel2.add(forrestKey, gbc);
	    gbc.gridx = 3;
	    gbc.gridy = 1;
	    mapPanel2.add(shadowKey, gbc);
	    gbc.gridx = 4;
	    gbc.gridy = 1;
	    mapPanel2.add(goblinKey, gbc);
	    
	
		generateMap();
	
		
		mapFrame.add(mapPanel2, BorderLayout.NORTH);
	    mapFrame.add(scrollPane, BorderLayout.CENTER);
	    mapFrame.add(mapPanel3, BorderLayout.SOUTH);
	    
	    refresh();
	    
	    close.addActionListener(new ActionListener(){  
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
	    		mapFrame.remove(scrollPane);
	    		mapFrame.dispose();
	    		mapPanel.removeAll();
	    		mapPanel.repaint();
	    		mapPanel2.removeAll();
	    		mapPanel2.repaint();
	    		mapPanel3.removeAll();
	    		mapPanel3.repaint();
			}
	    });
	    
	}

	
	public void refresh()
	{
		mapFrame.validate();
		mapPanel.validate();
		mapPanel2.validate();
		mapPanel3.validate();
	}
	public void generateMap()
	{
		GridBagLayout mapGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		labels = new JLabel[MainGame.getMapSize() + (MainGame.getMapSize()/ GameStart.getPlayer().size() + 1)];
		

		
		int iMap = 0;
		for(int yMap = 1; yMap <= MainGame.getMaxY(); ++yMap) {
		
			for(int xMap = 1; xMap <= MainGame.getMaxX(); ++xMap)
			{
//START CHECKS************************************************************************************************
//************************************************************************************************************
//************************************************************************************************************
				boolean checkLocal = true; // prevents double dispaly of directions
				

				
				
				while (checkLocal) // prevents double dispaly of directions
				{


					
				// at boss location
				if (xMap == (MainGame.getMaxX()/2) && yMap == (MainGame.getMaxY()/2))
				{
					labels[iMap] = new JLabel(img.getImgMapGoblinkingdom());
					checkLocal = false;
					break;
				}
				
				// one to two spots out from bosses location
				if
				(
				xMap == (MainGame.getMaxX()/2 + 2) && yMap == (MainGame.getMaxY()/2) ||
				xMap == (MainGame.getMaxX()/2 - 2) && yMap == (MainGame.getMaxY()/2) ||
				xMap == (MainGame.getMaxX()/2) && yMap == (MainGame.getMaxY()/2 + 2) ||
				xMap == (MainGame.getMaxX()/2) && yMap == (MainGame.getMaxY()/2 - 2) ||
				
				xMap == (MainGame.getMaxX()/2 - 1) && yMap == (MainGame.getMaxY()/2 - 1) ||
				xMap == (MainGame.getMaxX()/2 - 1) && yMap == (MainGame.getMaxY()/2 - 2) ||
				xMap == (MainGame.getMaxX()/2 - 2) && yMap == (MainGame.getMaxY()/2 - 1) ||
				xMap == (MainGame.getMaxX()/2 - 2) && yMap == (MainGame.getMaxY()/2 - 2) ||
				
				xMap == (MainGame.getMaxX()/2 + 1) && yMap == (MainGame.getMaxY()/2 + 1) ||
				xMap == (MainGame.getMaxX()/2 + 1) && yMap == (MainGame.getMaxY()/2 + 2) ||
				xMap == (MainGame.getMaxX()/2 + 2) && yMap == (MainGame.getMaxY()/2 + 1) ||
				xMap == (MainGame.getMaxX()/2 + 2) && yMap == (MainGame.getMaxY()/2 + 2) ||
				
				xMap == (MainGame.getMaxX()/2 - 1) && yMap == (MainGame.getMaxY()/2 + 1) ||
				xMap == (MainGame.getMaxX()/2 - 1) && yMap == (MainGame.getMaxY()/2 + 2) ||
				xMap == (MainGame.getMaxX()/2 - 2) && yMap == (MainGame.getMaxY()/2 + 1) ||
				xMap == (MainGame.getMaxX()/2 - 2) && yMap == (MainGame.getMaxY()/2 + 2) ||
				
				xMap == (MainGame.getMaxX()/2 + 1) && yMap == (MainGame.getMaxY()/2 - 1) ||
				xMap == (MainGame.getMaxX()/2 + 1) && yMap == (MainGame.getMaxY()/2 - 2) ||
				xMap == (MainGame.getMaxX()/2 + 2) && yMap == (MainGame.getMaxY()/2 - 1) ||
				xMap == (MainGame.getMaxX()/2 + 2) && yMap == (MainGame.getMaxY()/2 - 2) 
				)
				{
					labels[iMap] = new JLabel(img.getImgMapShadowpass());
					checkLocal = false;
					break;
				}
				
				if (xMap == (MainGame.getMaxX()/2) && yMap == (MainGame.getMaxY()/2 + 1))
				{
					labels[iMap] = new JLabel(img.getImgMapShadowpass());
					checkLocal = false;
					break;
				}
				
				if (xMap == (MainGame.getMaxX()/2 - 1) && yMap == (MainGame.getMaxY()/2))
				{
					labels[iMap] = new JLabel(img.getImgMapShadowpass());
					checkLocal = false;
					break;
				}
				
				if (xMap == (MainGame.getMaxX()/2 + 1) && yMap == (MainGame.getMaxY()/2))
				{
					labels[iMap] = new JLabel(img.getImgMapShadowpass());
					checkLocal = false;
					break;
				}
				
				if (xMap == (MainGame.getMaxX()/2) && yMap == (MainGame.getMaxY()/2 - 1))
				{
					labels[iMap] = new JLabel(img.getImgMapShadowpass());
					checkLocal = false;
					break;
				}
				
				if (
					xMap == (MainGame.getMaxX()/2) && yMap == (MainGame.getMaxY()/2 + 3) ||
					xMap == (MainGame.getMaxX()/2 - 1) && yMap == (MainGame.getMaxY()/2 + 3) ||
					xMap == (MainGame.getMaxX()/2 - 2) && yMap == (MainGame.getMaxY()/2 + 3) ||
					xMap == (MainGame.getMaxX()/2 + 1) && yMap == (MainGame.getMaxY()/2 + 3) ||
					xMap == (MainGame.getMaxX()/2 + 2) && yMap == (MainGame.getMaxY()/2 + 3)	
					)
				{
					labels[iMap] = new JLabel(img.getImgMapShadowpass());
					checkLocal = false;
					break;
				}
				
				if (
						xMap == (MainGame.getMaxX()/2) && yMap == (MainGame.getMaxY()/2 - 3) ||
						xMap == (MainGame.getMaxX()/2 - 1) && yMap == (MainGame.getMaxY()/2 - 3) ||
						xMap == (MainGame.getMaxX()/2 - 2) && yMap == (MainGame.getMaxY()/2 - 3) ||
						xMap == (MainGame.getMaxX()/2 + 1) && yMap == (MainGame.getMaxY()/2 - 3) ||
						xMap == (MainGame.getMaxX()/2 + 2) && yMap == (MainGame.getMaxY()/2 - 3)	
						)
					{
					labels[iMap] = new JLabel(img.getImgMapShadowpass());
					checkLocal = false;
					break;
					}
				
				if (
						xMap == (MainGame.getMaxX()/2 + 3) && yMap == (MainGame.getMaxY()/2) ||
						xMap == (MainGame.getMaxX()/2 + 3) && yMap == (MainGame.getMaxY()/2 - 1) ||
						xMap == (MainGame.getMaxX()/2 + 3) && yMap == (MainGame.getMaxY()/2 - 2) ||
						xMap == (MainGame.getMaxX()/2 + 3) && yMap == (MainGame.getMaxY()/2 + 1) ||
						xMap == (MainGame.getMaxX()/2 + 3) && yMap == (MainGame.getMaxY()/2 + 2)	
						)
					{
					labels[iMap] = new JLabel(img.getImgMapShadowpass());
					checkLocal = false;
					break;
					}
				
				if (
						xMap == (MainGame.getMaxX()/2 - 3) && yMap == (MainGame.getMaxY()/2) ||
						xMap == (MainGame.getMaxX()/2 - 3) && yMap == (MainGame.getMaxY()/2 - 1) ||
						xMap == (MainGame.getMaxX()/2 - 3) && yMap == (MainGame.getMaxY()/2 - 2) ||
						xMap == (MainGame.getMaxX()/2 - 3) && yMap == (MainGame.getMaxY()/2 + 1) ||
						xMap == (MainGame.getMaxX()/2 - 3) && yMap == (MainGame.getMaxY()/2 + 2)	
						)
					{
					labels[iMap] = new JLabel(img.getImgMapShadowpass());
					checkLocal = false;
					break;
					}
				
				if (xMap == (MainGame.getMaxX()/2 + 3) && yMap == (MainGame.getMaxY()/2 + 3))
				{
					labels[iMap] = new JLabel(img.getImgMapShadowpass());
					checkLocal = false;
					break;
				}
				
				if (xMap == (MainGame.getMaxX()/2 + 3) && yMap == (MainGame.getMaxY()/2 - 3))
				{
					labels[iMap] = new JLabel(img.getImgMapShadowpass());
					checkLocal = false;
					break;
				}
				
				if (xMap == (MainGame.getMaxX()/2 - 3) && yMap == (MainGame.getMaxY()/2 + 3))
				{
					labels[iMap] = new JLabel(img.getImgMapShadowpass());
					checkLocal = false;
					break;
				}
				
				if (xMap == (MainGame.getMaxX()/2 - 3) && yMap == (MainGame.getMaxY()/2 - 3))
				{
					labels[iMap] = new JLabel(img.getImgMapShadowpass());
					checkLocal = false;
					break;
				}
				
				
				
				//outside of shadows pass check
				if (xMap == (MainGame.getMaxX()/2 - 4) && yMap == (MainGame.getMaxY()/2) ||
					xMap == (MainGame.getMaxX()/2 - 4) && yMap == (MainGame.getMaxY()/2 + 1) || 
					xMap == (MainGame.getMaxX()/2 - 4) && yMap == (MainGame.getMaxY()/2 + 2) ||
					xMap == (MainGame.getMaxX()/2 - 4) && yMap == (MainGame.getMaxY()/2 + 3) || 
					xMap == (MainGame.getMaxX()/2 - 4) && yMap == (MainGame.getMaxY()/2 - 1) ||
					xMap == (MainGame.getMaxX()/2 - 4) && yMap == (MainGame.getMaxY()/2 - 2) || 
					xMap == (MainGame.getMaxX()/2 - 4) && yMap == (MainGame.getMaxY()/2 - 3)
					)
				{
					for (int x = 5; x < MainGame.getMaxX(); x = x + 5)
					{
						
						if (x == xMap)
						{
							for (int y = 5; y < MainGame.getMaxY(); y = y + 5)
							{
								if (y == yMap)
								{
									labels[iMap] = new JLabel(img.getImgMapTown());
									checkLocal = false;
									break;
								}
								if ((y - 1) == yMap)
								{
									labels[iMap] = new JLabel(img.getImgMapDarkforrest());
									checkLocal = false;
									break;
								}
								if ((y + 1) == yMap)
								{
									labels[iMap] = new JLabel(img.getImgMapDarkforrest());
									checkLocal = false;
									break;
								}
							}
						}
					}

					for (int y1 = 5; y1 < MainGame.getMaxY(); y1 = y1 + 5)
						{
							if (y1 == yMap)
							{
								for (int x1 = 5; x1 < MainGame.getMaxX(); x1 = x1 + 5)
								{
									if ((x1 - 1) == xMap)
									{
										labels[iMap] = new JLabel(img.getImgMapDarkforrest());
										checkLocal = false;
										break;
									}
									if ((x1 + 1) == xMap)
									{
										labels[iMap] = new JLabel(img.getImgMapDarkforrest());
										checkLocal = false;
										break;
									}
								}
							}
						}
					if (checkLocal)
					{
						labels[iMap] = new JLabel(img.getImgMapDarkforrest());
						checkLocal = false;
						break;	
					}
					break;	
				}
				
				if (xMap == (MainGame.getMaxX()/2 + 4) && yMap == (MainGame.getMaxY()/2) ||
						xMap == (MainGame.getMaxX()/2 + 4) && yMap == (MainGame.getMaxY()/2 + 1) || 
						xMap == (MainGame.getMaxX()/2 + 4) && yMap == (MainGame.getMaxY()/2 + 2) ||
						xMap == (MainGame.getMaxX()/2 + 4) && yMap == (MainGame.getMaxY()/2 + 3) || 
						xMap == (MainGame.getMaxX()/2 + 4) && yMap == (MainGame.getMaxY()/2 - 1) ||
						xMap == (MainGame.getMaxX()/2 + 4) && yMap == (MainGame.getMaxY()/2 - 2) || 
						xMap == (MainGame.getMaxX()/2 + 4) && yMap == (MainGame.getMaxY()/2 - 3)
						)
					{
					for (int x = 5; x < MainGame.getMaxX(); x = x + 5)
					{
						
						if (x == xMap)
						{
							for (int y = 5; y < MainGame.getMaxY(); y = y + 5)
							{
								if (y == yMap)
								{
									labels[iMap] = new JLabel(img.getImgMapTown());
									checkLocal = false;
									break;
								}
								if ((y - 1) == yMap)
								{
									labels[iMap] = new JLabel(img.getImgMapDarkforrest());
									checkLocal = false;
									break;
								}
								if ((y + 1) == yMap)
								{
									labels[iMap] = new JLabel(img.getImgMapDarkforrest());
									checkLocal = false;
									break;
								}
							}
						}
					}

					for (int y1 = 5; y1 < MainGame.getMaxY(); y1 = y1 + 5)
						{
							if (y1 == yMap)
							{
								for (int x1 = 5; x1 < MainGame.getMaxX(); x1 = x1 + 5)
								{
									if ((x1 - 1) == xMap)
									{
										labels[iMap] = new JLabel(img.getImgMapDarkforrest());
										checkLocal = false;
										break;
									}
									if ((x1 + 1) == xMap)
									{
										labels[iMap] = new JLabel(img.getImgMapDarkforrest());
										checkLocal = false;
										break;
									}
								}
							}
						}
					if (checkLocal)
					{
						labels[iMap] = new JLabel(img.getImgMapDarkforrest());
						checkLocal = false;
						break;	
					}
					break;
					}
				
				if (yMap == (MainGame.getMaxY()/2 - 4) && xMap == (MainGame.getMaxX()/2) ||
						yMap == (MainGame.getMaxY()/2 - 4) && xMap == (MainGame.getMaxX()/2 + 1) || 
						yMap == (MainGame.getMaxY()/2 - 4) && xMap == (MainGame.getMaxX()/2 + 2) ||
						yMap == (MainGame.getMaxY()/2 - 4) && xMap == (MainGame.getMaxX()/2 + 3) || 
						yMap == (MainGame.getMaxY()/2 - 4) && xMap == (MainGame.getMaxX()/2 - 1) ||
						yMap == (MainGame.getMaxY()/2 - 4) && xMap == (MainGame.getMaxX()/2 - 2) || 
						yMap == (MainGame.getMaxY()/2 - 4) && xMap == (MainGame.getMaxX()/2 - 3)
						)
					{
					for (int x = 5; x < MainGame.getMaxX(); x = x + 5)
					{
						
						if (x == xMap)
						{
							for (int y = 5; y < MainGame.getMaxY(); y = y + 5)
							{
								if (y == yMap)
								{
									labels[iMap] = new JLabel(img.getImgMapTown());
									checkLocal = false;
									break;
								}
								if ((y - 1) == yMap)
								{
									labels[iMap] = new JLabel(img.getImgMapDarkforrest());
									checkLocal = false;
									break;
								}
								if ((y + 1) == yMap)
								{
									labels[iMap] = new JLabel(img.getImgMapDarkforrest());
									checkLocal = false;
									break;
								}
							}
						}
					}

					for (int y1 = 5; y1 < MainGame.getMaxY(); y1 = y1 + 5)
						{
							if (y1 == yMap)
							{
								for (int x1 = 5; x1 < MainGame.getMaxX(); x1 = x1 + 5)
								{
									if ((x1 - 1) == xMap)
									{
										labels[iMap] = new JLabel(img.getImgMapDarkforrest());
										checkLocal = false;
										break;
									}
									if ((x1 + 1) == xMap)
									{
										labels[iMap] = new JLabel(img.getImgMapDarkforrest());
										checkLocal = false;
										break;
									}
								}
							}
						}
					if (checkLocal)
					{
						labels[iMap] = new JLabel(img.getImgMapDarkforrest());
						checkLocal = false;
						break;	
					}
					break;
					}
				
				if (yMap == (MainGame.getMaxY()/2 + 4) && xMap == (MainGame.getMaxX()/2) ||
					yMap == (MainGame.getMaxY()/2 + 4) && xMap == (MainGame.getMaxX()/2 + 1) || 
					yMap == (MainGame.getMaxY()/2 + 4) && xMap == (MainGame.getMaxX()/2 + 2) ||
					yMap == (MainGame.getMaxY()/2 + 4) && xMap == (MainGame.getMaxX()/2 + 3) || 
					yMap == (MainGame.getMaxY()/2 + 4) && xMap == (MainGame.getMaxX()/2 - 1) ||
					yMap == (MainGame.getMaxY()/2 + 4) && xMap == (MainGame.getMaxX()/2 - 2) || 
					yMap == (MainGame.getMaxY()/2 + 4) && xMap == (MainGame.getMaxX()/2 - 3)
						)
					{
					for (int x = 5; x < MainGame.getMaxX(); x = x + 5)
					{
						
						if (x == xMap)
						{
							for (int y = 5; y < MainGame.getMaxY(); y = y + 5)
							{
								if (y == yMap)
								{
									labels[iMap] = new JLabel(img.getImgMapTown());
									checkLocal = false;
									break;
								}
								if ((y - 1) == yMap)
								{
									labels[iMap] = new JLabel(img.getImgMapDarkforrest());
									checkLocal = false;
									break;
								}
								if ((y + 1) == yMap)
								{
									labels[iMap] = new JLabel(img.getImgMapDarkforrest());
									checkLocal = false;
									break;
								}
							}
						}
					}

					for (int y1 = 5; y1 < MainGame.getMaxY(); y1 = y1 + 5)
						{
							if (y1 == yMap)
							{
								for (int x1 = 5; x1 < MainGame.getMaxX(); x1 = x1 + 5)
								{
									if ((x1 - 1) == xMap)
									{
										labels[iMap] = new JLabel(img.getImgMapDarkforrest());
										checkLocal = false;
										break;
									}
									if ((x1 + 1) == xMap)
									{
										labels[iMap] = new JLabel(img.getImgMapDarkforrest());
										checkLocal = false;
										break;
									}
								}
							}
						}
					if (checkLocal)
					{
						labels[iMap] = new JLabel(img.getImgMapDarkforrest());
						checkLocal = false;
						break;	
					}
					break;
					}
				
		//START OF NOTHING STRINGS -------------------------------------------------------------------------------------------------------------------	
				
				// check for shops first!!!
				if (xMap == (1) && yMap == (1))
				{
					labels[iMap] = new JLabel(img.getImgMapCoinshop());
					checkLocal = false;
					break;
				}	
				if (xMap == (MainGame.getMaxX()) && yMap == (1))
				{
					labels[iMap] = new JLabel(img.getImgMapCoinshop());
					checkLocal = false;
					break;
				}
				if (xMap == (1) && yMap == (MainGame.getMaxY()))
				{
					labels[iMap] = new JLabel(img.getImgMapCoinshop());
					checkLocal = false;
					break;
				}
				if (xMap == (MainGame.getMaxX()) && yMap == (MainGame.getMaxY()))
				{
					labels[iMap] = new JLabel(img.getImgMapCoinshop());
					checkLocal = false;
					break;
				}
				
				if (xMap == (MainGame.getMaxX() - 1) && yMap == (MainGame.getMaxY()))
				{
					labels[iMap] = new JLabel(img.getImgMapDarkforrest());
					checkLocal = false;
					break;
				}
				
				if (xMap == (MainGame.getMaxX()) && yMap == (MainGame.getMaxY() - 1))
				{
					labels[iMap] = new JLabel(img.getImgMapDarkforrest());
					checkLocal = false;
					break;
				}
				

								
				if (xMap == (MainGame.getMaxX() - 1) && yMap == (1))
				{
					labels[iMap] = new JLabel(img.getImgMapDarkforrest());
					checkLocal = false;
					break;
				}
				
				if (xMap == (MainGame.getMaxX()) && yMap == (2))
				{
					labels[iMap] = new JLabel(img.getImgMapDarkforrest());
					checkLocal = false;
					break;
				}
				

				if (xMap == (1) && yMap == (MainGame.getMaxY() - 1))
				{
					labels[iMap] = new JLabel(img.getImgMapDarkforrest());
					checkLocal = false;
					break;
				}
				
				if (xMap == (2) && yMap == (MainGame.getMaxY()))
				{
					labels[iMap] = new JLabel(img.getImgMapDarkforrest());
					checkLocal = false;
					break;
				}
				

				
				if (xMap == (2) && yMap == (1))
				{
					labels[iMap] = new JLabel(img.getImgMapDarkforrest());
					checkLocal = false;
					break;
				}
				
				if (xMap == (1) && yMap == (2))
				{
					labels[iMap] = new JLabel(img.getImgMapDarkforrest());
					checkLocal = false;
					break;
				}
				

				
				for (int x = 5; x < MainGame.getMaxX(); x = x + 5)
				{
					
					if (x == xMap)
					{
						for (int y = 5; y < MainGame.getMaxY(); y = y + 5)
						{
							if (y == yMap)
							{
								labels[iMap] = new JLabel(img.getImgMapTown());
								checkLocal = false;
								break;
							}
							if ((y - 1) == yMap)
							{
								labels[iMap] = new JLabel(img.getImgMapDarkforrest());
								checkLocal = false;
								break;
							}
							if ((y + 1) == yMap)
							{
								labels[iMap] = new JLabel(img.getImgMapDarkforrest());
								checkLocal = false;
								break;
							}
						}
					}
				}
				
				for (int y1 = 5; y1 < MainGame.getMaxY(); y1 = y1 + 5)
					{
						if (y1 == yMap)
						{
							for (int x1 = 5; x1 < MainGame.getMaxX(); x1 = x1 + 5)
							{
								if ((x1 - 1) == xMap)
								{
									labels[iMap] = new JLabel(img.getImgMapDarkforrest());
									checkLocal = false;
									break;
								}
								if ((x1 + 1) == xMap)
								{
									labels[iMap] = new JLabel(img.getImgMapDarkforrest());
									checkLocal = false;
									break;
								}
							}
						}	
				} // end of main forloop
				
				if (checkLocal) {	
				if (yMap == 1 && xMap != 1 && xMap != MainGame.getMaxX())
				{
					labels[iMap] = new JLabel(img.getImgMapDarkforrest());
					break;
				}
				
				if (yMap != MainGame.getMaxY() && yMap != 1 && xMap == 1 )
				{
					labels[iMap] = new JLabel(img.getImgMapDarkforrest());
					break;
				}
				
				if (yMap == MainGame.getMaxY() && xMap != 1 && xMap != MainGame.getMaxX() )
				{
					labels[iMap] = new JLabel(img.getImgMapDarkforrest());
					break;
				}
				
				if (xMap == MainGame.getMaxX() && yMap != 1 && yMap != MainGame.getMaxY())
				{
					labels[iMap] = new JLabel(img.getImgMapDarkforrest());
					break;
				}	
				else
				{
					labels[iMap] = new JLabel(img.getImgMapDarkforrest());
					break;
				}
				}
				} // end while
			
				checkLocal = true;
							
				
//************************************************************************************************************
//***********************************************************************************************************
//************************************************************************************************************
		
			gbc.fill = GridBagConstraints.BOTH;
		    gbc.gridx = xMap ;
		    gbc.gridy = yMap ;
			mapPanel.add(labels[iMap], gbc);
			++iMap;
			}
		}
	
	}
}
