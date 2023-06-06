package org.java.book.swing_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
    JLabel jLabel;

    public EventDemo() {
        // Create a new JFrame container
        JFrame jFrame= new JFrame("An Event Example");

        // Specify FlowLayout fot the layout manager
        jFrame.setLayout(new FlowLayout());

        // Give the frame an initial size
        jFrame.setSize(220, 90);

        // Terminate the program when the user close the application
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make two buttons
        JButton jAlphaButton = new JButton("Alpha");
        JButton jBetaButton = new JButton("Beta");

        // Add action listener for Alpha
        jAlphaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Alpha was pressed!");
                System.out.println("Alpha was pressed!");
            }
        });

        // Add action listener for Beta
        jBetaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Beta was pressed!");
                System.out.println("Beta was pressed!");
            }
        });

        // Add the buttons to the content pane
        jFrame.add(jAlphaButton);
        jFrame.add(jBetaButton);

        // Create a text based label
        jLabel = new JLabel("Press the button");

        // Add the label to the content
        jFrame.add(jLabel);

        // Display the frame
        jFrame.setVisible(true);
    }
}
