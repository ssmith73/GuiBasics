package guiDevelopment;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class JFrameTest2 {

	private static void constructGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("JFrame Test2");
		frame.setLayout(new GridLayout(3,2)); 	//3 rows, 2 columns
		frame.add(new JLabel("First Name:")); 	//r1_c1
		frame.add(new JTextField()); 		  	//r1_c2
		frame.add(new JLabel("Last Name:"));  	//r2_c1
		frame.add(new JTextField()); 			//r2_c2
		frame.add(new JButton("Register")); 	//r3
		
		int frameWidth = 200;
		int frameHeight = 100;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds((int)screenSize.getWidth() - (frameWidth+10),20,
				frameWidth,frameHeight);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				constructGUI();
			}
		});
	}
}
