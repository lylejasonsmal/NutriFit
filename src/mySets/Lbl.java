package mySets;

import javax.swing.*;
import java.awt.*;

public class Lbl {

    JLabel lbl;
    Font sml, med, lrg;
    int smlFont, medFont, lrgFont;

    public Lbl() {
        lbl = new JLabel();

        smlFont = 14;
        medFont = 18;
        lrgFont = 22;
    }

    public void sml() {
        sml = new Font("Arial", Font.PLAIN, smlFont);
        this.lbl.setFont(sml);
    }

    public void smlBold() {
        sml = new Font("Arial", Font.BOLD, smlFont);
        this.lbl.setFont(sml);
    }

    public void med() {
        med = new Font("Arial", Font.PLAIN, medFont);
        this.lbl.setFont(med);
    }

    public void medBold() {
        med = new Font("Arial", Font.BOLD, medFont);
        this.lbl.setFont(med);
    }

    public void lrg() {
        lrg = new Font("Arial", Font.PLAIN, lrgFont);
        this.lbl.setFont(lrg);
    }

    public void lrgBold() {
        lrg = new Font("Arial", Font.BOLD, lrgFont);
        this.lbl.setFont(lrg);
    }

    public void smlLblWhite(JLabel lbl) {
        this.lbl = lbl;
        this.sml();
        this.lbl.setForeground(Color.white);
    }

    public void smlLblWhiteBold(JLabel lbl) {
        this.lbl = lbl;
        this.smlBold();
        this.lbl.setForeground(Color.white);
    }

    public void smlLblBlack(JLabel lbl) {
        this.lbl = lbl;
        this.sml();
        this.lbl.setForeground(Colours.darkerGrey());
    }

    public void smlLblBlackBold(JLabel lbl) {
        this.lbl = lbl;
        this.smlBold();
        this.lbl.setForeground(Colours.darkerGrey());
    }

    public void smlLblGreen(JLabel lbl) {
        this.lbl = lbl;
        this.sml();
        this.lbl.setForeground(Colours.limeGreen());
    }

    public void smlLblGreenBold(JLabel lbl) {
        this.lbl = lbl;
        this.smlBold();
        this.lbl.setForeground(Colours.limeGreen());
    }

    public void medLblWhite(JLabel lbl) {
        this.lbl = lbl;
        this.med();
        this.lbl.setForeground(Color.white);
    }

    public void medLblWhiteBold(JLabel lbl) {
        this.lbl = lbl;
        this.medBold();
        this.lbl.setForeground(Color.white);
    }

    public void medLblBlack(JLabel lbl) {
        this.lbl = lbl;
        this.med();
        this.lbl.setForeground(Colours.darkerGrey());
    }

    public void medLblBlackBold(JLabel lbl) {
        this.lbl = lbl;
        this.medBold();
        this.lbl.setForeground(Colours.darkerGrey());
    }

    public void medLblGreen(JLabel lbl) {
        this.lbl = lbl;
        this.med();
        this.lbl.setForeground(Colours.limeGreen());
    }

    public void medLblGreenBold(JLabel lbl) {
        this.lbl = lbl;
        this.medBold();
        this.lbl.setForeground(Colours.limeGreen());
    }

    public void lrgLblWhite(JLabel lbl) {
        this.lbl = lbl;
        this.lrg();
        this.lbl.setForeground(Color.white);
    }

    public void lrgLblWhiteBold(JLabel lbl) {
        this.lbl = lbl;
        this.lrgBold();
        this.lbl.setForeground(Color.white);
    }

    public void lrgLblBlack(JLabel lbl) {
        this.lbl = lbl;
        this.lrg();
        this.lbl.setForeground(Colours.darkerGrey());
    }

    public void lrgLblBlackBold(JLabel lbl) {
        this.lbl = lbl;
        this.lrgBold();
        this.lbl.setForeground(Colours.darkerGrey());
    }

    public void lrgLblGreen(JLabel lbl) {
        this.lbl = lbl;
        this.lrg();
        this.lbl.setForeground(Colours.limeGreen());
    }

    public void lrgLblGreenBold(JLabel lbl) {
        this.lbl = lbl;
        this.lrgBold();
        this.lbl.setForeground(Colours.limeGreen());
    }

    public void myLblWhite(JLabel lbl, int fontSize, boolean bold) {
        Font font;
        this.lbl = lbl;
        this.lbl.setForeground(Color.white);
        if (bold != true) {
            font = new Font("Arial", Font.PLAIN, fontSize);
        } else {
            font = new Font("Arial", Font.BOLD, fontSize);
        }

        this.lbl.setFont(font);
    }

    public void myLblBlack(JLabel lbl, int fontSize, boolean bold) {
        Font font;
        this.lbl = lbl;
        this.lbl.setForeground(Colours.darkerGrey());
        if (bold != true) {
            font = new Font("Arial", Font.PLAIN, fontSize);
        } else {
            font = new Font("Arial", Font.BOLD, fontSize);
        }

        this.lbl.setFont(font);
    }

    public void myLblGreen(JLabel lbl, int fontSize, boolean bold) {
        Font font;
        this.lbl = lbl;
        this.lbl.setForeground(Colours.limeGreen());
        if (bold != true) {
            font = new Font("Arial", Font.PLAIN, fontSize);
        } else {
            font = new Font("Arial", Font.BOLD, fontSize);
        }

        this.lbl.setFont(font);
    }
}
