import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char b;
	char currentLetter;
	JLabel letter = new JLabel();
	JFrame frame;
	JPanel panel;
Dimension yeet= new Dimension(500,500);
	public static void main(String[] args) {

		TypingTutor a = new TypingTutor();

		a.framefy();
		a.run();

	}

	void run() {
		
		currentLetter = generateRandomLetter();
		letter.setText(currentLetter + "");
	panel.setBackground(Color.gray);
	
		
	}

	void framefy() {
		currentLetter = generateRandomLetter();
		frame = new JFrame();
		panel = new JPanel();
		letter.setFont(letter.getFont().deriveFont(400.0f));
		letter.setHorizontalAlignment(JLabel.CENTER);
		frame.add(panel);
		panel.add(letter);
		letter.setText(currentLetter + "");
		frame.addKeyListener(this);
		frame.pack();
		frame.setSize(yeet);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	char generateRandomLetter() {
		Random r = new Random();

		return (char) (r.nextInt(26) + 'a');

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("you typed: " +e.getKeyChar());
		if (e.getKeyChar() == currentLetter) {
			System.out.println("CORRECT");
			panel.setBackground(Color.green);
			run();
		} else {
			System.out.println("WRONG");
			panel.setBackground(Color.red);

			run();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
