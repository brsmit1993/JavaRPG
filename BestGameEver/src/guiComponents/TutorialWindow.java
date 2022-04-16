package guiComponents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class TutorialWindow {

	public void openTutWin() 
	{
		SpringLayout laySpr = new SpringLayout();
		GridBagLayout btnGrid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		
		
		
		JButton tut1 = new JButton("Player Classes");
		tut1.setPreferredSize(new Dimension(200, 50));
		tut1.setForeground(Color.white);
		tut1.setBackground(new Color(129, 7, 0));
		tut1.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut2 = new JButton("Player Abilities");
		tut2.setPreferredSize(new Dimension(200, 50));
		tut2.setForeground(Color.white);
		tut2.setBackground(new Color(129, 7, 0));
		tut2.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut3 = new JButton("Player Stats");
		tut3.setPreferredSize(new Dimension(200, 50));
		tut3.setForeground(Color.white);
		tut3.setBackground(new Color(129, 7, 0));
		tut3.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut4 = new JButton("Monster Battles");
		tut4.setPreferredSize(new Dimension(200, 50));
		tut4.setForeground(Color.white);
		tut4.setBackground(new Color(129, 7, 0));
		tut4.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut5 = new JButton("PVP Battles");
		tut5.setPreferredSize(new Dimension(200, 50));
		tut5.setForeground(Color.white);
		tut5.setBackground(new Color(129, 7, 0));
		tut5.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut6 = new JButton("Map Events");
		tut6.setPreferredSize(new Dimension(200, 50));
		tut6.setForeground(Color.white);
		tut6.setBackground(new Color(129, 7, 0));
		tut6.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut7 = new JButton("Inventory/Items");
		tut7.setPreferredSize(new Dimension(200, 50));
		tut7.setForeground(Color.white);
		tut7.setBackground(new Color(129, 7, 0));
		tut7.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut8 = new JButton("Game Hints");
		tut8.setPreferredSize(new Dimension(200, 50));
		tut8.setForeground(Color.white);
		tut8.setBackground(new Color(129, 7, 0));
		tut8.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut9 = new JButton("Towns");
		tut9.setPreferredSize(new Dimension(200, 50));
		tut9.setForeground(Color.white);
		tut9.setBackground(new Color(129, 7, 0));
		tut9.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut10 = new JButton("The Dark Forest");
		tut10.setPreferredSize(new Dimension(200, 50));
		tut10.setForeground(Color.white);
		tut10.setBackground(new Color(129, 7, 0));
		tut10.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut11 = new JButton("Shadows Pass");
		tut11.setPreferredSize(new Dimension(200, 50));
		tut11.setForeground(Color.white);
		tut11.setBackground(new Color(129, 7, 0));
		tut11.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut12 = new JButton("Goblin King");
		tut12.setPreferredSize(new Dimension(200, 50));
		tut12.setForeground(Color.white);
		tut12.setBackground(new Color(129, 7, 0));
		tut12.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut13 = new JButton("Leveling System");
		tut13.setPreferredSize(new Dimension(200, 50));
		tut13.setForeground(Color.white);
		tut13.setBackground(new Color(129, 7, 0));
		tut13.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut14 = new JButton("Gold");
		tut14.setPreferredSize(new Dimension(200, 50));
		tut14.setForeground(Color.white);
		tut14.setBackground(new Color(129, 7, 0));
		tut14.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut15 = new JButton("Items In Depth");
		tut15.setPreferredSize(new Dimension(200, 50));
		tut15.setForeground(Color.white);
		tut15.setBackground(new Color(129, 7, 0));
		tut15.setFont(new Font("Courier New", Font.BOLD, 15));
		
		JButton tut16 = new JButton("How To Win");
		tut16.setPreferredSize(new Dimension(200, 50));
		tut16.setForeground(Color.white);
		tut16.setBackground(new Color(129, 7, 0));
		tut16.setFont(new Font("Courier New", Font.BOLD, 15));
		
		
		JFrame tutFrame = new JFrame("RPG Simulator Tutorial");
		tutFrame.setSize(800,700);
		tutFrame.setVisible(true);
		tutFrame.setLayout(laySpr);
		
		try {
		    tutFrame.setIconImage(ImageIO.read(getClass().getResourceAsStream("/console/resources/appIcon.jpg")));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		JPanel tutBtns = new JPanel();
		tutBtns.setLayout(btnGrid);
		tutBtns.setBackground(Color.black);
		tutBtns.setPreferredSize(new Dimension(800 , 200));
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
	    gbc.gridx = 0;
	    gbc.gridy = 0;
		tutBtns.add(tut1, gbc);
		gbc.gridx = 1;
	    gbc.gridy = 0;
		tutBtns.add(tut2, gbc); 
		gbc.gridx = 2;
	    gbc.gridy = 0;
		tutBtns.add(tut3, gbc);
		gbc.gridx = 3;
	    gbc.gridy = 0;
		tutBtns.add(tut4, gbc);
		gbc.gridx = 0;
	    gbc.gridy = 1;
		tutBtns.add(tut5, gbc); 
		gbc.gridx = 1;
	    gbc.gridy = 1;
		tutBtns.add(tut6, gbc); 
		gbc.gridx = 2;
	    gbc.gridy = 1;
		tutBtns.add(tut7, gbc); 
		gbc.gridx = 3;
	    gbc.gridy = 1;
		tutBtns.add(tut8, gbc);
		gbc.gridx = 0;
	    gbc.gridy = 2;
		tutBtns.add(tut9, gbc); 
		gbc.gridx = 1;
	    gbc.gridy = 2;
		tutBtns.add(tut10, gbc);
		gbc.gridx = 2;
	    gbc.gridy = 2;
		tutBtns.add(tut11, gbc); 
		gbc.gridx = 3;
	    gbc.gridy = 2;
		tutBtns.add(tut12, gbc); 
		gbc.gridx = 0;
	    gbc.gridy = 3;
		tutBtns.add(tut13, gbc);
		gbc.gridx = 1;
	    gbc.gridy = 3;
		tutBtns.add(tut14, gbc); 
		gbc.gridx = 2;
	    gbc.gridy = 3;
		tutBtns.add(tut15, gbc); 
		gbc.gridx = 3;
	    gbc.gridy = 3;
		tutBtns.add(tut16, gbc);
		
		JPanel tutDisplay = new JPanel();
		tutDisplay.setBackground(Color.black);
		tutDisplay.setPreferredSize(new Dimension(800 , 800));
		tutDisplay.setLocation(0, 200);

		JEditorPane editorPane = new JEditorPane();
		
		editorPane.setEditable(false);
		
		
		
		
	    tut1.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/PlayerClasses.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        });  
		
	    tut2.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/Abilities.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
		
	    tut3.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/Stats.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    
	    tut4.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/Battles.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    
	    tut5.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/Pvp.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    
	    tut6.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/Events.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    
	    tut7.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/Inventory.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    
	    tut8.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/Hints.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    
	    tut9.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/Towns.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    
	    tut10.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/DarkForrest.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    
	    tut11.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/ShadowsPass.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    
	    tut12.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/GoblinKing.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    
	    tut13.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/Leveling.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    
	    tut14.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/Gold.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    
	    tut15.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/Items.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    
	    tut16.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				java.net.URL helpURL = TutorialWindow.class.getResource(
                        "/guiComponents/resources/Win.html");
				
				if (helpURL != null) {
				    try {
				        editorPane.setPage(helpURL);
				    } catch (IOException e) {
				        System.err.println("Attempted to read a bad URL: " + helpURL);
				    }
				} else {
				    System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
				}
				
			}  
	        }); 
	    		
       editorPane.setSize(800,800);
       editorPane.setBackground(Color.black);
		tutFrame.add(tutBtns);
		tutFrame.add(tutDisplay);
		
		
;
       tutDisplay.add(editorPane);
		
		laySpr.putConstraint(SpringLayout.NORTH, tutDisplay, 0, SpringLayout.SOUTH, tutBtns);
	}
}
