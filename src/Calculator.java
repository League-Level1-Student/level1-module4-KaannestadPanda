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
	static Dimension g = new Dimension(600,100);
JButton multbutton = new JButton("mult");
JButton divbutton = new JButton("div");
JButton addbutton = new JButton("add");
JButton subbutton = new JButton("sub");

JTextField field = new JTextField();

JTextField field2 = new JTextField();

JTextField answerfield = new JTextField();


	public static void main(String[] args) {
		Calculator a = new Calculator();
a.build();
		
		
	}
	void build() {
		JFrame frame = new JFrame("yeet");
		JPanel panel = new JPanel();
		
		frame.add(panel);
		
		field.setPreferredSize(d);
		field2.setPreferredSize(d);
		answerfield.setText("answer");
		answerfield.setPreferredSize(d);
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
		panel.add(answerfield);
		frame.setPreferredSize(g);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	void doTheDub() {
		String string1 = field.getText();
		double number1 =Double.parseDouble(string1);
		num1=number1;
		
		String string2= field2.getText();
		double number2 =Double.parseDouble(string2);
		num2=number2;
	}
	
	void mult() {
		 num3 = num1 * num2;
		answerfield.setText(num3+" ");

	}

	void div() {
		 num3 = num1 / num2;
		 answerfield.setText(num3+" ");

	}

	void add() {
		 num3 = num1 += num2;
		 answerfield.setText(num3+" ");

	}

	void sub() {
		 num3 = num1 -= num2;
		 answerfield.setText(num3+" ");

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		doTheDub();
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
