package mySets;

import java.awt.*;
import javax.swing.*;

public class Txt {

    JTextField txt;
    Font sml, med, lrg;
    int smlFont, medFont, lrgFont;

    public Txt() {
        txt = new JTextField();
        
        smlFont=12;
        medFont=16;
        lrgFont=20;
    }
    
    public void sml() {
        sml = new Font("Arial", Font.PLAIN, smlFont);
        this.txt.setFont(sml);
    }

    public void smlBold() {
        sml = new Font("Arial", Font.BOLD, smlFont);
        this.txt.setFont(sml);
    }

    public void med() {
        med = new Font("Arial", Font.PLAIN, medFont);
        this.txt.setFont(med);
    }

    public void medBold() {
        med = new Font("Arial", Font.BOLD, medFont);
        this.txt.setFont(med);
    }

    public void lrg() {
        lrg = new Font("Arial", Font.PLAIN, lrgFont);
        this.txt.setFont(lrg);
    }

    public void lrgBold() {
        lrg = new Font("Arial", Font.BOLD, lrgFont);
        this.txt.setFont(lrg);
    }
    
    public void smlTxt(JTextField txt, int width){
        this.txt=txt;
        this.txt.setPreferredSize(new Dimension(width, 30));
        this.txt.setBorder(null);
        smlBold();
    }
    
    public void medTxt(JTextField txt, int width){
        this.txt=txt;
        this.txt.setPreferredSize(new Dimension(width, 45));
        this.txt.setBorder(null);
        medBold();
    }
    
    public void lrgTxt(JTextField txt, int width){
        this.txt=txt;
        this.txt.setPreferredSize(new Dimension(width, 60));
        this.txt.setBorder(null);
        lrgBold();
    }
    
    public void myTxt(JTextField txt, int width, int height){
        this.txt=txt;
        this.txt.setPreferredSize(new Dimension(width, height));
        this.txt.setBorder(null);
        
        if(height>=55){
        lrgBold();
        }
        else if (height>=45){
        medBold();
        }
        else if (height>=35){
        smlBold();
        }
    }
}
