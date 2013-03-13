package guiDevelopment;

import java.awt.Dimension;

import javax.swing.*;

public class FrameExample_Extended{

    private static void createAndShowGUI() {
    
        //This is to turn on the Default 'Look and Feel'.
        JFrame.setDefaultLookAndFeelDecorated(true);
        

        JFrame frame = new JFrame("[=] Hello World [=]");
        
        // To make sure the default operation on pressing the close button on the window-bar
        // is to exit the program.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setMinimumSize(new Dimension(400,100));
        // To size the window to fit all the widgets in, without working out the size manually.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}