import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class practiceTestProgram implements ActionListener {

	JButton submit = new JButton("submit");
	JButton hint = new JButton("click for hint");
	JTextField answer=new JTextField();
	Dimension d = new Dimension(400,25);
	
	public static void main(String[] args) {
		practiceTestProgram a = new practiceTestProgram();
		a.build();
		
		
	}

	void build() {
		JFrame frame=new JFrame();
		JPanel panel = new JPanel();
		answer.setPreferredSize(d);
		JLabel label = new JLabel();
		
		frame.add(panel);
		label.setText("How many shrimps do you have to eat before you make your skin turn pink?");
		panel.add(label);
		submit.addActionListener(this);
		hint.addActionListener(this);
		panel.add(answer);
		panel.add(submit);
		panel.add(hint);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton test = (JButton) e.getSource();
		if(test==hint) {
			JOptionPane.showMessageDialog(null, "eat too much and you'll get ____");
		}
		else {
			if (answer.getText().equals ("eat too much and you'll get sick")) {
				JOptionPane.showMessageDialog(null, "ya got it");
			}
			else {
				JOptionPane.showMessageDialog(null, "ur no good");
			}
		}
	}
	
	
}