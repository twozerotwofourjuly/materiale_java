package org.java.book;

import org.java.book.swing_application.EventDemo;
import org.java.book.swing_application.SwingDemo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new SwingDemo();
                new EventDemo();
            }
        });
    }
}