
package mySets;

import java.awt.event.*;
import javax.swing.*;

public class myEvents {

    public static void navAction(JButton btn, JFrame thisFrame, JFrame thatFrame) {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thatFrame.setGUI();
                thisFrame.dispose();
            }
        });
    }
}
