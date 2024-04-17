package mySets;

import java.awt.*;

public class Colours {

    public static Color limeGreen;
    public static Color limeGreenLight;
    public static Color darkGrey;
    public static Color darkerGrey;

    public Colours() {

    }

    public static Color limeGreen() {
        return limeGreen = new Color(4, 228, 116);
    }
    
    public static Color limeGreenLight() {
        return limeGreenLight = new Color(60, 250, 130);
    }

    public static Color darkGrey() {
        return darkGrey = new Color(20, 20, 20);
    }

    public static Color darkerGrey() {
        return darkerGrey = new Color(10, 10, 10);
    }
}
