package guiDevelopment;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class MyFrame extends JFrame  {
	public MyFrame() {
		super();
		init();
	}
	public MyFrame(String title) {
		super(title);
		init();
	}
	
	public void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("JFrame Test3");
		this.setLayout(new GridLayout(3,2)); 	//3 rows, 2 columns
		this.add(new JLabel("First Name:")); 	//r1_c1
		this.add(new JTextField()); 		  	//r1_c2
		this.add(new JLabel("Last Name:"));  	//r2_c1
		this.add(new JTextField()); 			//r2_c2
		this.add(new JButton("Register")); 	//r3

		int frameWidth = 200;
		int frameHeight = 100;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int)screenSize.getWidth() - (frameWidth+10),20,
				frameWidth,frameHeight);
		this.setVisible(true);
	}
}

/*
 * Private members.
 * In Java, scopes are based on classes, not objects. If something is private, 
 * it means it is visible to code defined in that class - even if it's a field 
 * of an instance, and the code is executing in another instance (same type).
 * 
 * By declaring the field private you prevent a user from accessing the 
 * variable directly. By providing getters and setters you control exactly 
 * how a user may control the variable.
 * 
 * Not having private members/fields is considered bad mainly because you 
 * lose control over who can change the value and what happens when the value 
 * changes

You can perhaps think of objects of the same class as being like twins who share everything with each other, but who will keep most things hidden from everyone else
 */
public class JFrameTest3 {
	private static void constructGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		MyFrame frame = new MyFrame();
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
