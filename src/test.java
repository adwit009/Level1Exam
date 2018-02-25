import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class test implements ActionListener {

	JFrame frame = new JFrame("Color Teacher");
	JPanel panel = new JPanel();
	JButton b1 = new JButton("yellow");
	JButton b2 = new JButton("red");
	JButton b3 = new JButton("blue");
	JButton b4 = new JButton("green");

	public test() {
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b1.setBackground(Color.YELLOW);
		b2.setBackground(Color.RED);
		b3.setBackground(Color.BLUE);
		b4.setBackground(Color.GREEN);
		b1.setOpaque(true);
		b2.setOpaque(true);
		b3.setOpaque(true);
		b4.setOpaque(true);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}

	public static void main(String[] args) {
test t = new test(); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			speak("yellow");
		}
		if (e.getSource() == b2) {
			speak("red");
		}
		if (e.getSource() == b3) {
			speak("blue");
		}
		if (e.getSource() == b4) {
			speak("green");
	}
	}

	void speak (String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
