
package com.tawkit.view.main;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        initializeWindow();
    }

    private void initializeWindow() {
        setTitle("Tawkit Desktop");
        setSize(1200, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(900, 600));

        initializeComponents();
    }

    private void initializeComponents() {
        JPanel mainPanel = new JPanel(new BorderLayout());

        JLabel title = new JLabel(
                "Welcome to Tawkit",
                SwingConstants.CENTER
        );

        title.setFont(new Font("Arial", Font.BOLD, 28));

        mainPanel.add(title, BorderLayout.CENTER);

        setContentPane(mainPanel);
    }
}
