package guiDevelopment;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class ContainersTest {
	private static void constructGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		Containers container = new Containers();
		//MyFrame frame = new MyFrame();
		container.setVisible(true);
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