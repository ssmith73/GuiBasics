package guiDevelopment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JLabelTest extends JFrame{
	public JLabelTest() {
		

		JFrame frame1 = new JFrame();
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Load");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Save");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Sean");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Smith");
		mnNewMenu_1.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Done");
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		//frame1.add(menuBar);
		frame1.add(mnNewMenu);
		frame1.add(mnNewMenu_1);
		frame1.add(mnNewMenu_2);
		frame1.add(mntmNewMenuItem);
		frame1.add(mntmNewMenuItem_1);
		frame1.add(mntmNewMenuItem_2);
		frame1.pack();
		frame1.setVisible(true);
		
/*		
		JLabel lblTest = new JLabel("How does this work?");
		lblTest.setHorizontalAlignment(SwingConstants.CENTER);
		lblTest.setForeground(Color.RED);
		lblTest.setIcon(new ImageIcon("C:\\eclipse\\open_icon_library-win\\icons\\48x48\\emotes\\face-angel.jpg"));
		getContentPane().add(lblTest, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("New label");
		getContentPane().add(lblNewLabel, BorderLayout.SOUTH);
		*/
	}
	
	private static final long serialVersionUID = 1L;
	
	private static void constructGUI() {
		
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setTitle("JLabel Test");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label1 = new JLabel("First Name");
		label1.setFont(new Font("Courier New",Font.ITALIC,12));
		label1.setForeground(Color.GRAY);
		
		JLabel label2 = new JLabel();
		label2.setText(
				"<html>Last Name<br><font face='courer new'"
			+ " color=red>(mandatory)</font></html>");
		JLabel label3 = new JLabel();
		label3.setText(
				"<html>Last Name<br><font face=garamond"
			+ " color=red>(mandatory)</font></html>");
		
		JLabel label4 = new JLabel();
		label4.setIcon(new ImageIcon("C:\\eclipse\\open_icon_library-win\\icons\\48x48\\emotes\\face-angel.jpg"));
		
		JLabel label5 = new JLabel("Sean",SwingConstants.LEFT);
		label5.setIcon(new ImageIcon("C:\\eclipse\\open_icon_library-win\\icons\\48x48\\emotes\\face-angel.jpg"));
		
		frame.getContentPane().add(label1);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(label3);
		frame.getContentPane().add(label4);
		frame.getContentPane().add(label5);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		JLabelTest jlabelTest = new JLabelTest();
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				constructGUI();
			}
		});
	}	
}
