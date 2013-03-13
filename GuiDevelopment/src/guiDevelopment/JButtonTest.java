package guiDevelopment;

import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class JButtonTest extends JFrame{
	
	private static void constructGUI() {
		//JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3,2)); 	//2 rows, 2 columns
		frame.setTitle("JButton Test");
		
		ImageIcon imageIcon = new ImageIcon("C:\\eclipse\\open_icon_library-win\\icons\\48x48\\emotes\\face-angel.jpg");
		JButton loginButton = new JButton("login",imageIcon);
		ImageIcon imageIcon2= new ImageIcon("C:\\eclipse\\open_icon_library-win\\icons\\48x48\\emotes\\facedevilgrin.jpg");
		JButton loginButton2 = new JButton("login2",imageIcon2);
		ImageIcon imageIcon3= new ImageIcon("C:/Users/DAD/Desktop/ellie.gif");
		JButton loginButton3 = new JButton("login2",imageIcon3);
		
		frame.add(loginButton);
		frame.add(loginButton2);
		frame.add(loginButton3);
		frame.pack();
		frame.setVisible(true);
		
	}
//		label4.setIcon(new ImageIcon("C:\\eclipse\\open_icon_library-win\\icons\\48x48\\emotes\\face-angel.jpg"));
	
	public static void main(String[] args) {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
			System.out.println("Nimbus theme not available?");
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}	
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			  constructGUI();
			}
		});
	}

}
