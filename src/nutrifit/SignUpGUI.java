package nutrifit;

import mySets.myFrame;
import mySets.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignUpGUI extends JFrame {

    JButton btnExit, btnSignUp;
    JPanel pnlCenter;

    Btn btn = new Btn();

    LoginGUI login = new LoginGUI();

    public SignUpGUI() {
        super(myFrame.frameTitle("Sign Up"));
        btnExit = new JButton("Exit");

        btnSignUp = new JButton("Sign Up");
        btnSignUp = new JButton("Sign Up");
        btn.lrgBtnBlack(btnExit);
        btn.lrgBtnBlack(btnSignUp);

        pnlCenter = new JPanel();
    }

    public void setGUI() {
        myFrame.smlFrame(this);

        pnlCenter.setLayout(new FlowLayout());

        pnlCenter.add(btnExit);
        pnlCenter.add(btnSignUp);

        this.add(pnlCenter);
    }
}
