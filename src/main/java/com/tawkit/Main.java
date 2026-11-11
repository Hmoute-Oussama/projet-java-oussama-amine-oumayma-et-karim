
package com.tawkit;

import com.tawkit.view.main.MainWindow;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(
                        UIManager.getSystemLookAndFeelClassName()
                );

                MainWindow mainWindow = new MainWindow();
                mainWindow.setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
