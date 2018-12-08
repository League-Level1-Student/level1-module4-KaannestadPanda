import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
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
int types = 0;
Date timeAtStart = new Date();
int correctones = 0;
	public static void main(String[] args) {

		TypingTutor a = new TypingTutor();

		a.framefy();
		a.run();

	}

	void run() {
		if(types == 10) {
			showTypingSpeed(correctones);
			System.exit(0);
		}
		currentLetter = generateRandomLetter();
		letter.setText(currentLetter + "");
		
		
	
	
		
	}

	void framefy() {
	
		frame = new JFrame();
		panel = new JPanel();
		panel.setBackground(Color.blue);
		letter.setFont(letter.getFont().deriveFont(400.0f));
		letter.setHorizontalAlignment(JLabel.CENTER);
		frame.add(panel);
		panel.add(letter);
		frame.addKeyListener(this);
		frame.pack();
		frame.setSize(yeet);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	      Date timeAtEnd = new Date();
	      long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	      long gameInSeconds = (gameDuration / 1000) % 60;
	      double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	      int charactersPerMinute = (int) (charactersPerSecond * 60);
	      JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " CORRECT characters per minute.");
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
			correctones+=1;
		} 
		else {
			System.out.println("WRONG");
			panel.setBackground(Color.red);
		}
		
		
	//	panel.setBackground(Color.blue);
		types+=1;
		run();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		panel.setBackground(Color.blue);
	}
}
