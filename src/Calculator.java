import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	double num1;
	double num2;
	double num3;
	static Dimension d = new Dimension(100,25);
JButton multbutton = new JButton("mult");
JButton divbutton = new JButton("div");
JButton addbutton = new JButton("add");
JButton subbutton = new JButton("sub");

	public static void main(String[] args) {
		Calculator a = new Calculator();
a.build();
		
		
	}
	void build() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField field = new JTextField();
		field.setPreferredSize(d);
		JTextField field2 = new JTextField();
		field2.setPreferredSize(d);
		JTextField answerfield = new JTextField();
		answerfield.setText("answer:");
		answerfield.setPreferredSize(d);
		frame.add(panel);
		panel.add(field);
		panel.add(field2);
		multbutton.addActionListener(this);
		divbutton.addActionListener(this);
		addbutton.addActionListener(this);
		subbutton.addActionListener(this);
		panel.add(multbutton);
		panel.add(divbutton);
		panel.add(addbutton);
		panel.add(subbutton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	double mult() {
		 num3 = num1 * num2;
		return num3;

	}

	double div() {
		 num3 = num1 / num2;
		return num3;

	}

	double add() {
		 num3 = num1 += num2;
		return num3;

	}

	double sub() {
		 num3 = num1 -= num2;
		return num3;

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton checkbutton = (JButton) e.getSource();
		if(checkbutton==multbutton) {
			mult();
		}
		else if (checkbutton==divbutton) {
			div();
		}
		else if (checkbutton==addbutton) {
			add();
		}
		else{
			sub();
		}
	}

}
