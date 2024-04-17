package nutrifit;

import mySets.*;
import mySets.myFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginGUI extends JFrame {

    JButton btnLogin;
    JLabel lblUsername, lblUsernameValid, lblPassword, lblPasswordValid, lblSignUpQuery, lblSignUp, logo;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JPanel pnlLeft, pnlRight, pnlLogin, pnlLoginInput, pnlLoginSubmit, pnlBtn, pnlQuery;

    int logoGap = 100;
    int pnlGap = 65;
    int gap = 50;
    
    ImageIcon logoIcon = new ImageIcon("D:\\NutriFit Code\\NutriFit\\icons\\Nutri_Fit_Logo_Round.png");

    Btn btn = new Btn();
    Lbl lbl = new Lbl();
    Txt txt = new Txt();

    public LoginGUI() {
        super(myFrame.frameTitle("Login"));

        Image logoImg = logoIcon.getImage().getScaledInstance(425, 425, Image.SCALE_SMOOTH);
        ImageIcon logoIconRe = new ImageIcon(logoImg);

        //JButton
        btnLogin = new JButton("Login");
        btn.lrgBtnGreen(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtUsername.getText().equals("") && txtPassword.getText().equals("")) {
                    lblUsernameValid.setText("*Fill in this required field");
                    lblPasswordValid.setText("*Fill in this required field");
                } else if (txtUsername.getText().equals("")) {
                    lblUsernameValid.setText("*Fill in this required field");
                    lblPasswordValid.setText("");
                } else if (txtPassword.getText().equals("")) {
                    lblUsernameValid.setText("");
                    lblPasswordValid.setText("*Fill in this required field");
                } else {
                    //Sign in
                    lblUsernameValid.setText("");
                    lblPasswordValid.setText("");
                }
            }
        });
        btnLogin.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                btn.lrgBtnBlack(btnLogin);
            }
        });

        //JLabel
        lblUsername = new JLabel("Username");
        lbl.medLblGreenBold(lblUsername);

        lblPassword = new JLabel("Password");
        lbl.medLblGreenBold(lblPassword);

        lblSignUpQuery = new JLabel("Don't have an account?");
        lbl.smlLblGreen(lblSignUpQuery);

        lblSignUp = new JLabel("Sign Up");
        lbl.smlLblWhiteBold(lblSignUp);
        lblSignUp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SignUpGUI frame = new SignUpGUI();
                frame.setGUI();

                dispose();
            }
        });

        logo = new JLabel(logoIconRe);

        //JTextField
        txtUsername = new JTextField();
        txt.medTxt(txtUsername, 350);

        lblUsernameValid = new JLabel();
        lbl.smlLblWhite(lblUsernameValid);

        //JPasswordField
        txtPassword = new JPasswordField();
        txt.medTxt(txtPassword, 350);

        lblPasswordValid = new JLabel();
        lbl.smlLblWhite(lblPasswordValid);

        //JPanel
        pnlLeft = new JPanel();
        Pnl.pnlGreen(pnlLeft, 450, 650);

        pnlRight = new JPanel();
        Pnl.pnlGreen(pnlRight, 450, 650);

        pnlLogin = new JPanel();
        Pnl.pnlBlack(pnlLogin, 430, 525);
        pnlLogin.addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {
                btn.lrgBtnGreen(btnLogin);
            }
        });

        pnlLoginInput = new JPanel();
        Pnl.pnlBlack(pnlLoginInput);

        pnlLoginSubmit = new JPanel();
        Pnl.pnlBlack(pnlLoginSubmit);

        pnlBtn = new JPanel();
        Pnl.pnlBlack(pnlBtn);

        pnlQuery = new JPanel();
        Pnl.pnlBlack(pnlQuery);
    }

    public void setGUI() {
        myFrame.smlFrame(this);

        GroupLayout left = new GroupLayout(pnlLeft);
        pnlLeft.setLayout(left);

        left.setAutoCreateGaps(true);
        left.setAutoCreateContainerGaps(true);

        left.setHorizontalGroup(left.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(logo));

        left.setVerticalGroup(left.createSequentialGroup()
                .addGap(logoGap)
                .addComponent(logo)
                .addGap(logoGap));

        GroupLayout right = new GroupLayout(pnlRight);
        pnlRight.setLayout(right);

        right.setAutoCreateGaps(true);
        right.setAutoCreateContainerGaps(true);

        right.setHorizontalGroup(right.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(pnlLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE));

        right.setVerticalGroup(right.createSequentialGroup()
                .addGap(pnlGap)
                .addComponent(pnlLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(pnlGap));

        GroupLayout login = new GroupLayout(pnlLogin);
        pnlLogin.setLayout(login);

        login.setAutoCreateGaps(true);
        login.setAutoCreateContainerGaps(true);

        login.setHorizontalGroup(login.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(pnlLoginInput)
                .addComponent(pnlLoginSubmit));

        login.setVerticalGroup(login.createSequentialGroup()
                .addGap(gap)
                .addComponent(pnlLoginInput)
                .addComponent(pnlLoginSubmit)
                .addGap(gap));

        GroupLayout loginInp = new GroupLayout(pnlLoginInput);
        pnlLoginInput.setLayout(loginInp);

        loginInp.setAutoCreateGaps(true);
        loginInp.setAutoCreateContainerGaps(true);

        loginInp.setHorizontalGroup(loginInp.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(lblUsername)
                .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(lblUsernameValid)
                .addComponent(lblPassword)
                .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(lblPasswordValid));

        loginInp.setVerticalGroup(loginInp.createSequentialGroup()
                .addComponent(lblUsername)
                .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(lblUsernameValid)
                .addComponent(lblPassword)
                .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(lblPasswordValid));

        pnlLoginSubmit.add(pnlBtn, BorderLayout.NORTH);
        pnlLoginSubmit.add(pnlQuery, BorderLayout.SOUTH);

        pnlBtn.setLayout(new FlowLayout());
        pnlBtn.add(btnLogin);

        pnlQuery.setLayout(new FlowLayout());
        pnlQuery.add(lblSignUpQuery);
        pnlQuery.add(lblSignUp);

        this.add(pnlLeft);
        this.add(pnlRight);
        this.setLayout(new GridLayout(1, 2));
    }
}