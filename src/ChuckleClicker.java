import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton joke = new JButton("joke");
	JButton punchline = new JButton("punchline");
public static void main(String[] args) {
	
	ChuckleClicker a=new ChuckleClicker();
	
	a.makeButtons();
	
}


JFrame makeButtons() {
	JFrame frame=new JFrame();
	JPanel panel = new JPanel();
	
	joke.addActionListener(this);
	
	punchline.addActionListener(this);
	frame.add(panel);
	panel.add(joke);
	panel.add(punchline);
	frame.pack();
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
