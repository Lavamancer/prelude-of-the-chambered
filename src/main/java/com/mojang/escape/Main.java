package com.mojang.escape;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EscapeComponent game = new EscapeComponent();

        JFrame frame = new JFrame("Prelude of the Chambered!");

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(game, BorderLayout.CENTER);

        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        game.start();
    }
}
