package guiDevelopment;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class AWTFrameTest extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		AWTFrameTest frame = new AWTFrameTest();
		Color bgColour = Color.GREEN;
		Color fgColour = Color.BLUE;
		int style = Font.BOLD | Font.ITALIC;
		Font font = new Font("Garamond",style,18);
		frame.setTitle("My AWT Frame");
		frame.setSize(300,80);
		frame.setLayout(new FlowLayout());
		frame.setFont(font);
		frame.setResizable(false);
		//add components (JFrame, JDialog etc)
		Label label = new Label("Name");
		frame.add(label);
		TextField textField = new TextField();
		frame.add(textField);
		Button button = new Button("Register");
		frame.add(button);
		Checkbox checkbox = new Checkbox();
		frame.add(checkbox);
		frame.setForeground(fgColour);
		frame.setBackground(bgColour);
		
		frame.setVisible(true);
	}
}
