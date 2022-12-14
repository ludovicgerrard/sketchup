package org.sketchup;

import org.sketchup.ui.Menu;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class AppWindow extends JFrame {

    public AppWindow() {
        Menu menuBar = new Menu();

        this.setJMenuBar(menuBar);
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(1200, 720));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
