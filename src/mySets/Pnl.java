
package mySets;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Pnl {

    public Pnl(){

    }

    public static void pnlWhite(JPanel pnl){
        pnl.setBackground(Color.white);
    }

    public static void pnlGreen(JPanel pnl){
        pnl.setBackground(Colours.limeGreen());
    }

    public static void pnlBlack(JPanel pnl){
        pnl.setBackground(Colours.darkerGrey());
    }

    public static void pnlWhite(JPanel pnl, int width, int height){
        pnl.setPreferredSize(new Dimension(width, height));
        pnl.setBackground(Color.white);
    }

    public static void pnlGreen(JPanel pnl, int width, int height){
        pnl.setPreferredSize(new Dimension(width, height));
        pnl.setBackground(Colours.limeGreen());
    }

    public static void pnlBlack(JPanel pnl, int width, int height){
        pnl.setPreferredSize(new Dimension(width, height));
        pnl.setBackground(Colours.darkerGrey());
    }
    
}
