package guiComponents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class Btns {
	private JButton btnLay = new JButton();

	public JButton getBtnLay() {
		btnLay = new JButton();
		btnLay.setPreferredSize(new Dimension(200, 50));
		btnLay.setForeground(Color.white);
		btnLay.setBackground(new Color(129, 7, 0));
		btnLay.setFont(new Font("Courier New", Font.BOLD, 20));
		return btnLay;
	}


	
}
