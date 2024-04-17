package mySets;

import java.awt.*;
import javax.swing.*;

public class Btn {

    JButton btn;
    Font sml, med, lrg;
    int minWidth, minHeight;
    int smlFont, medFont, lrgFont;

    public Btn() {
        btn = new JButton();

        smlFont = 18;
        medFont = 24;
        lrgFont = 30;
    }

    public void sml() {
        sml = new Font("Arial", Font.BOLD, smlFont);
        this.minWidth = 150;
        this.minHeight = 40;
        this.btn.setFont(sml);
    }

    public void med() {
        med = new Font("Arial", Font.BOLD, medFont);
        this.minWidth = 200;
        this.minHeight = 50;
        this.btn.setFont(med);
    }

    public void lrg() {
        lrg = new Font("Arial", Font.BOLD, lrgFont);
        this.minWidth = 250;
        this.minHeight = 60;
        this.btn.setFont(lrg);
    }

    public void autoAdjust() {
        if (this.btn.getPreferredSize().width > minWidth) {
            this.btn.setPreferredSize(new Dimension(this.btn.getPreferredSize().width, minHeight));
        } else if (this.btn.getPreferredSize().height > minHeight) {
            this.btn.setPreferredSize(new Dimension(minWidth, this.btn.getPreferredSize().height));
        } else if (this.btn.getPreferredSize().width > minWidth & this.btn.getPreferredSize().height > minHeight) {
            this.btn.setPreferredSize(new Dimension(this.btn.getPreferredSize().width, this.btn.getPreferredSize().height));
        } else {
            this.btn.setPreferredSize(new Dimension(minWidth, minHeight));
        }
    }

    public void smlBtnBlack(JButton btn) {
        this.btn = btn;
        this.sml();
        this.btn.setForeground(Color.white);
        this.btn.setBackground(Colours.darkerGrey());
        this.autoAdjust();
    }

    public void smlBtnGreen(JButton btn) {
        this.btn = btn;
        this.sml();
        this.btn.setForeground(Colours.darkerGrey());
        this.btn.setBackground(Colours.limeGreen());
        this.autoAdjust();
    }

    public void medBtnBlack(JButton btn) {
        this.btn = btn;
        this.med();
        this.btn.setForeground(Color.white);
        this.btn.setBackground(Colours.darkerGrey());
        this.autoAdjust();
    }

    public void medBtnGreen(JButton btn) {
        this.btn = btn;
        this.med();
        this.btn.setForeground(Colours.darkerGrey());
        this.btn.setBackground(Colours.limeGreen());
        this.autoAdjust();
    }

    public void lrgBtnBlack(JButton btn) {
        this.btn = btn;
        this.lrg();
        this.btn.setForeground(Color.white);
        this.btn.setBackground(Colours.darkerGrey());
        this.autoAdjust();
    }

    public void lrgBtnGreen(JButton btn) {
        this.btn = btn;
        this.lrg();
        this.btn.setForeground(Colours.darkerGrey());
        this.btn.setBackground(Colours.limeGreen());
        this.autoAdjust();
    }

    public void myBtnGreen(JButton btn, int width, int height) {
        this.btn = btn;
        this.btn.setForeground(Colours.darkerGrey());
        this.btn.setBackground(Colours.limeGreen());
        this.btn.setPreferredSize(new Dimension(width, height));

        if (height >= 60) {
            lrg();
        } else if (height >= 50) {
            med();
        } else if (height >= 40) {
            sml();
        }
    }

    public void myBtnBlack(JButton btn, int width, int height) {
        this.btn = btn;
        this.btn.setForeground(Color.white);
        this.btn.setBackground(Colours.darkerGrey());
        this.btn.setSize(new Dimension(width, height));

        if (height >= 60) {
            lrg();
        } else if (height >= 50) {
            med();
        } else if (height >= 40) {
            sml();
        }
    }
}
