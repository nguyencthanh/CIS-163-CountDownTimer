package Project1;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CountDownTimerGUISwing {
    public CountDownTimerGUISwing() {
    }

    public static void main(String[] arg) {
        JMenu fileMenu = new JMenu("File");
        JMenuItem quitItem = new JMenuItem("Quit");
        JCheckBoxMenuItem suspendItem = new JCheckBoxMenuItem("Suspend");
        fileMenu.add(suspendItem);
        fileMenu.add(quitItem);
        JMenuBar menus = new JMenuBar();
        menus.add(fileMenu);
        JFrame gui = new JFrame("Count Down Timer");
        gui.setDefaultCloseOperation(3);
        CountDownTimerPanelMainSwing panel = new CountDownTimerPanelMainSwing(quitItem, suspendItem);
        gui.getContentPane().add(panel);
        gui.setSize(600, 400);
        gui.setJMenuBar(menus);
        gui.pack();
        gui.setVisible(true);
    }
}
