import java.awt.Color;
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
	public static void main(String[] args) {
		TypingTutor a = new TypingTutor();
a.run();
		
		
		
		
	}
	
	void run() {
		currentLetter = generateRandomLetter();
frame=new JFrame();
		JPanel panel = new JPanel();
		
		letter.setFont(letter.getFont().deriveFont(400.0f));
		letter.setHorizontalAlignment(JLabel.CENTER);
		frame.add(panel);
		panel.add(letter);
		letter.setText(currentLetter+"");
		frame.addKeyListener(this);
		frame.pack();
		frame.setVisible(true);
		
		String j =JOptionPane.showInputDialog("");
		
		b=j.charAt(0);
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
		System.out.println("you typed: "+b);
		if(b==currentLetter) {
			System.out.println("CORRECT");
			frame.setBackground(Color.green);
		}
		else {
			System.out.println("WRONG");
			frame.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter=generateRandomLetter();
		letter.setText(currentLetter+"");
	}
}
