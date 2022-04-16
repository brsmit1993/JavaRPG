package guiComponents;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class PlayerLbls {
private JLabel statLbl = new JLabel();
private JLabel nameLbl = new JLabel();

public JLabel getStatLbl() {
	statLbl = new JLabel();
	statLbl.setForeground(Color.white);
	statLbl.setFont(new Font("Courier New", Font.BOLD, 20));
	return statLbl;
}

public JLabel getNameLbl() {
	nameLbl.setForeground(Color.white);
	nameLbl.setFont(new Font("Courier New", Font.BOLD, 35));
	return nameLbl;
}

public JLabel getNameLbl2() {
	nameLbl.setForeground(Color.white);
	nameLbl.setFont(new Font("Courier New", Font.BOLD, 35));
	return nameLbl;
}

}
