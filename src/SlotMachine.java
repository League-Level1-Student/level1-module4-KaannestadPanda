import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SlotMachine {
Dimension g = new Dimension(600,300);
	public static void main(String[] args) {
		SlotMachine a = new SlotMachine();
		a.build();
	
	}
	
	void build() {
		JFrame frame = new JFrame("yeet");
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setPreferredSize(g);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
}
