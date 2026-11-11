
package com.tawkit;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(
                        UIManager.getSystemLookAndFeelClassName()
                );

                System.out.println("Tawkit application started!");

                // Main application window will be initialized here.

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
