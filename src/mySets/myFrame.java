package mySets;

import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class myFrame {

    public static ImageIcon icon = new ImageIcon("D:\\NutriFit Code\\NutriFit\\icons\\Nutri_Fit_Icon.png");

    public myFrame() {
    }

    public static String frameTitle(String name) {
        return "Nutrifit™: " + name;
    }

    public static void smlFrame(JFrame frame) {
        frame.pack();
        frame.setSize(925, 700);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());
    }

    public static void medFrame(JFrame frame) {
        frame.pack();
        frame.setSize(1200, 775);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());
    }

    public static void lrgFrame(JFrame frame) {
        frame.pack();
        frame.setSize(1600, 850);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());
    }

    public static void Frame(JFrame frame, int width, int height, boolean resize) {
        frame.pack();
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setResizable(resize);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());
    }

}
