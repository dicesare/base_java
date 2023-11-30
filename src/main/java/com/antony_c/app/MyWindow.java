package com.antony_c.app;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;


public class MyWindow {
    /**
     * @param title  The title of the window
     * @param width  The width of the window
     * @param height The height of the window
     * @param x      The x position of the window
     * @param y      The y position of the window
     */
    public JFrame mainFrame = null;
    private JLabel label;
    private JPanel panel;

    public MyWindow() {
        mainFrame = new JFrame("My First Window");
        label = new JLabel("Hello, World!");
        panel = new JPanel();
        panel.add(label);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        int a = 9, b = 0, c = 0, d = 0;
        c = a + 1 + 1 * 0;
        addLabel("La valeur de c pré incrément : " + c); // 10
        b = c++;
        addLabel("La valeur de b = c++ : " + b); // 10
        d = ++b;
        addLabel("La valeur de d : " + d); // 11
        addLabel("La valeur de a : " + a); // 9
        addLabel("La valeur de ++b : " + b); // 11
        addLabel("La valeur de c++ : " + c); // 11
        // Exemple d'utilisation des opérateurs <<= et >>=
        int e = 3; // Essayez avec une valeur différente pour voir les effets
        e <<= 10; // Décalage de 10 bits vers la gauche
        addLabel("a <<= 10: " + e);

        e = 256; // Réinitialiser la valeur de a
        e >>= 2; // Décalage de 2 bits vers la droite
        addLabel("a >>= 10: " + e);
        
        mainFrame.add(panel);
        mainFrame.setSize(500, 500);
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    private void addLabel(String text) {
        JLabel label = new JLabel(text);
        panel.add(label);
        // mainFrame.add(panel);
    }

    // Getter public pour mainFrame
    public JFrame getMainFrame() {
        return mainFrame;
    }

    public void show() {
        mainFrame.setVisible(true);
    }
}
