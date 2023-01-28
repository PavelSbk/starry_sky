package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Main {

    public static void main(String[] args) {

        final int screenWidth = 1200;
        final int screenHeight = 800;

        JFrame frame = new JFrame();
        frame.setSize(screenWidth, screenHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BufferedImage image = new BufferedImage(
                screenWidth, screenHeight, BufferedImage.TYPE_INT_ARGB);

        ImageIcon imageIcon = new ImageIcon(image);
        JLabel picLabel = new JLabel(imageIcon);

        BorderLayout borderLayout = new BorderLayout();
        frame.getContentPane().setLayout(borderLayout);
        frame.getContentPane().add(picLabel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}