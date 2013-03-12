package guiDevelopment;
/*
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JFrameTest1 {
	public static void constructGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("My first Swing application");
//		frame.setTitle("My first Swing application"); //not needed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add JLabel that says welcome
		JLabel label = new JLabel("Welcome");
		frame.add(label);
//		frame.setSize(200,200);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				constructGUI(); //queue method to run after AWT events
			}
		});

	}

}
*/
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JFrameTest1 {
    private static void constructGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        Rectangle rect = new Rectangle(250,70);
        Dimension myDim = new Dimension(300,55);
        frame.setTitle("My First Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // add a JLabel that says Welcome
        JLabel label = new JLabel("Welcome");
        frame.add(label);
        frame.setBounds(rect);
        frame.setSize(200, 220);
        frame.setMinimumSize(myDim); //force a minimum size to fix problem
       
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                constructGUI();
            }
        });
    }
}

