package guiComponents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import console.GameStart;
import console.PlayerEntry;


public class StartWindow {

	private PlayerEntry getEntry = new PlayerEntry();
	private GameStart entryPoint = new GameStart();
	
	private static TutorialWindow tutWin = new TutorialWindow();
	
	private JFrame main = new JFrame("RPG Simulator");
	
	private JPanel start = new JPanel();
	
	private SpringLayout laySpr = new SpringLayout();
	
	JButton enter = new JButton("Enter");
	JButton startBtn = new JButton("Start Game");
	JButton tutBtn = new JButton("Tutorial");
	JButton exitBtn = new JButton("Exit");
	JLabel ask = new JLabel("<html><center>" + "Please Enter Amount Of Players" + "</center></html>");
	JTextField amount = new JTextField("enter amount here");
	
	GridBagLayout startGrid = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public void openStart () 
	{
	
		
		try {
		    main.setIconImage(ImageIO.read(getClass().getResourceAsStream("/console/resources/appIcon.jpg")));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		if (!main.isUndecorated()) {
		    main.setUndecorated(true);
		}
		if(!main.isVisible()){
		    main.setVisible(true);
		}
		
		main.setVisible(true);
		main.setExtendedState(JFrame.MAXIMIZED_BOTH);

		
		
	
		startBtn.setPreferredSize(new Dimension(main.getWidth()-100, main.getHeight()/6));
		startBtn.setForeground(Color.white);
		startBtn.setBackground(new Color(129, 7, 0));
		startBtn.setFont(new Font("Courier New", Font.BOLD, main.getHeight()/20));
		
		
		
		tutBtn.setPreferredSize(new Dimension(main.getWidth()-100, main.getHeight()/6));

		tutBtn.setForeground(Color.white);
		tutBtn.setBackground(new Color(129, 7, 0));
		tutBtn.setFont(new Font("Courier New", Font.BOLD, main.getHeight()/20));
		
		
		
		exitBtn.setPreferredSize(new Dimension(main.getWidth()-100, main.getHeight()/6));
		exitBtn.setForeground(Color.white);
		exitBtn.setBackground(new Color(129, 7, 0));
		exitBtn.setFont(new Font("Courier New", Font.BOLD, main.getHeight()/20));
		
		
		
		
		/**
		 * sets up the starting JFrame
		 */
	
		main.add(start);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * display panel inside of Main JFrame
		 */
		
		start.setSize(main.getWidth(), main.getHeight());
		start.setBackground(Color.black);
		start.setVisible(true);
		start.setLayout(startGrid);
		
			
		
		/**
		 * adds button to start panel
		 */
		gbc.gridx = 0;
		gbc.gridy = 0;
		start.add(startBtn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		start.add(tutBtn, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		start.add(exitBtn, gbc);

		

		
	    
	    startBtn.addActionListener(new ActionListener(){  
			
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
	    		startBtn.setVisible(false);
	    		tutBtn.setVisible(false);
	    		exitBtn.setVisible(false);
	    		askPlay();
			}
	    });
	    
		tutBtn.addActionListener(new ActionListener(){  
			
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
									try {
										tutWin.openTutWin();
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
			}
	    });
	    
	    exitBtn.addActionListener(new ActionListener(){  
			
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
	    });
	    
	    main.addComponentListener(new ComponentAdapter() {
	        @Override
	        public void componentResized(ComponentEvent e) {

	        }
	        @Override
	        public void componentMoved(ComponentEvent e) {
	          System.out.println("Moved to " + e.getComponent().getLocation());
	        }
	      });
	   
	}
	
	public void askPlay() {
		
		start.setSize(new Dimension(320, 250));
		
		enter.setPreferredSize(new Dimension(main.getWidth()-100, main.getHeight()/6));
		enter.setForeground(Color.white);
		enter.setBackground(new Color(129, 7, 0));
		enter.setFont(new Font("Courier New", Font.BOLD, main.getHeight()/15));
		
		
		
		ask.setForeground(Color.white);
		ask.setBackground(new Color(129, 7, 0));
		ask.setFont(new Font("Courier New", Font.BOLD, main.getHeight()/20));
		
		
		
		
		amount.setPreferredSize(new Dimension(main.getWidth()-100, main.getHeight()/6));
		amount.setForeground(Color.white);
		amount.setBackground(new Color(129, 7, 0));
		amount.setFont(new Font("Courier New", Font.BOLD, main.getHeight()/22));
		amount.setHorizontalAlignment(JTextField.CENTER);

		
	
		gbc.gridx = 0;
		gbc.gridy = 0;
		start.add(ask, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		start.add(amount, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		start.add(enter, gbc);
		
	    enter.addActionListener(new ActionListener(){  
			
	    	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
	    		int test = 0;
	    		boolean suc = false;
	    		while (true) {
	    		try{
	    		    test = Integer.valueOf(amount.getText());
	    		    main.dispose();
	    		    suc = true;
	    		    break;
	    		}catch (NumberFormatException ex) {
	    			suc = false;
	    			JFrame notOk = new JFrame();
	    			notOk.setVisible(true);
	    			notOk.setSize(200,100);
	    			JLabel why = new JLabel("TRY AGAIN! ONLY NUMBERS!");
	    			notOk.add(why);
	    			break;
	    		}
	    		}
	    		
	    		if (suc)
	    		{
				entryPoint.createCharacter(test);
	    		}
	    		else
	    		{
	    		askPlay();	
	    		}
			}
	    });
	}
	
	public void exitWin()
	{

	}
}
