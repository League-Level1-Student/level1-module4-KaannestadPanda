import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton joke = new JButton("joke");
	Dimension buttonSize=new Dimension(500,500);
	JButton punchline = new JButton("punchline");
public static void main(String[] args) {
	
	ChuckleClicker a=new ChuckleClicker();
	
	a.makeButtons();
	
}


JFrame makeButtons() {
	JFrame frame=new JFrame();
	
	JPanel panel = new JPanel();
	
	joke.addActionListener(this);
	joke.setPreferredSize(buttonSize);
	punchline.setPreferredSize(buttonSize);
	punchline.addActionListener(this);
	frame.add(panel);
	panel.add(joke);
	panel.add(punchline);
	frame.setSize(1000,1050);
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	return frame;
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==joke) {
		JOptionPane.showMessageDialog(null, "ABCDEFGHIJKLMNOPQRSTUVWXY");
	}
	else if (e.getSource()==punchline) {
		JOptionPane.showMessageDialog(null, "Z");
	}
}

}
