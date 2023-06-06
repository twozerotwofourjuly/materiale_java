package org.java.book.swing_application;

import javax.swing.*;

/**
 * @A Simple Swing Application
 * @Page- 1026
 * @Chapter-31
 *
 * @Java The complete reference(Ninth Edition)
 * @JDK8
 */
public class SwingDemo {

    public SwingDemo() {
        // Create a new JFrame Container
        JFrame jFrame = new JFrame("A Simple Swing Application");

        // Give the frame an initial size
        jFrame.setSize(275, 100);

        // Terminate the program when users close the application
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label
        JLabel jLabel = new JLabel(" Swing means powerful GUIs");

        // Add the label to content pane
        jFrame.add(jLabel);


        // Display the frame
        jFrame.setVisible(true);
    }

//    public static void main(String[] args) {
//        // Create frame on the event dispatching thread
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new SwingDemo();
//            }
//        });
//    }
}

