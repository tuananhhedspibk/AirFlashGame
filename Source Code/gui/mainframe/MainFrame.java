package gui.mainframe;

import auxiliary.Auxiliary;
import gui.makemenu.MakeMenu;
import gui.makepane.MakePane;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class MainFrame implements MainFrameInterface{

    public MainFrame(int i){
        frame.setBackground(new Color(205, 220, 213));
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setSize(1075, 610);
        frame.setContentPane(makePane.pane);
        frame.setJMenuBar(makeMenu.menuBar);
        aux.delay = i;
    }
}
