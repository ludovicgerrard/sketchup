package org.sketchup.ui;

import javax.swing.*;

public class Menu extends JMenuBar {

    public Menu() {
        JMenu file = new JMenu("Fichier");
        JMenuItem newFile = new JMenuItem("Nouveau");
        JMenuItem openFile = new JMenuItem("Ouvrir");

        file.add(newFile);
        file.addSeparator();
        file.add(openFile);
        this.add(file);
    }

}
