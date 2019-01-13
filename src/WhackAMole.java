import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WhackAMole implements ActionListener {
	JFrame frame;
	Date g=new Date();
	Dimension d = new Dimension(300,300);
	int successfulWhacks = 0;
	public static void main(String[] args) {
		WhackAMole a = new WhackAMole();
		a.drawButtons();
		
		
	}
	
	
	void drawButtons() {
		
		frame = new JFrame();
		frame.setPreferredSize(d);
		JPanel panel = new JPanel();
		
		Random ran = new Random();
		int h=ran.nextInt(24);
		
		for(int i = 0;i<24;i++) {
			JButton button;
			if(i==h) {
				button = new JButton("mole");
			}
			else {
		button = new JButton();
		
			}
			button.addActionListener(this);
			panel.add(button);
		}
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton check = (JButton) e.getSource();
		if(check.getText()=="mole"){
			frame.dispose();
			if(successfulWhacks==9) {
				
				endGame(g,successfulWhacks);
			}
			else {
				successfulWhacks++;
			drawButtons();
			}
		}
		else {
			Random ron = new Random();
			int o=ron.nextInt(5);
			if(o==0) {
				speak("suck");
			}
			else if(o==1) {
				speak("bad");
			}
			else if(o==2) {
				speak("terrible");
			}
			else if(o==3) {
				speak("trash");
			}
			else if(o==4) {
				speak("garbage");
			}
			
		}
	}
	
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	
}


