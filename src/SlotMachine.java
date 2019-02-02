import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	AudioClip sound;
	int wins=0;
	JLabel winCounter=new JLabel("Wins: "+wins);
	JLabel banana = new JLabel(); 
	JLabel cherry = new JLabel();
	JLabel apple=new JLabel();
	JButton button=new JButton();
	JFrame frame = new JFrame("yeet");
	JPanel panel = new JPanel();
Dimension g = new Dimension(1050,400);

	public static void main(String[] args) {
		SlotMachine a = new SlotMachine();
		a.build();
	
	}
	
	void build() {
		
		
		frame.add(panel);
		frame.setPreferredSize(g);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		button.addActionListener(this);
		panel.add(button);
		panel.add(banana);
		panel.add(cherry);
		panel.add(apple);
		panel.add(winCounter);
				frame.pack();
	}
	
	
	
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	
	void spin() {
		Random ran = new Random();
		int raan=ran.nextInt(3);
		int raaan=ran.nextInt(3);
		int raaaan=ran.nextInt(3);
		panel.remove(banana);
		panel.remove(cherry);
		panel.remove(apple);
		System.out.println(raan+raaan+raaaan);
	if(raan==0) {
		banana=loadImageFromComputer("istock-183380744.jpg");
	}
	else if(raan==1) {
		banana=loadImageFromComputer("Cherry_Stella444.jpg");	
	}
	else {
		banana=loadImageFromComputer("6000195494285_R.jpg");
	}
	panel.add(banana);
	
	if(raaan==0) {
		cherry=loadImageFromComputer("istock-183380744.jpg");
	}
	else if(raaan==1) {
		cherry=loadImageFromComputer("Cherry_Stella444.jpg");	
	}
	else {
		cherry=loadImageFromComputer("6000195494285_R.jpg");
	}
	panel.add(cherry);
	
	if(raaaan==0) {
		apple=loadImageFromComputer("istock-183380744.jpg");
	}
	else if(raaaan==1) {
		apple=loadImageFromComputer("Cherry_Stella444.jpg");	
	}
	else {
		apple=loadImageFromComputer("6000195494285_R.jpg");
	}
	panel.add(apple);
	frame.pack();
	
	if(raan==raaan&&raan==raaaan) {
		sound = JApplet.newAudioClip(getClass().getResource("scream.wav"));
		sound.play();

	JOptionPane.showMessageDialog(null, "YOU WIIIIIN");	
		wins++;
	winCounter.setText("Wins: "+wins);
	}
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		spin();
	}
	
	
	
	
	
	
	
	
	
	}

