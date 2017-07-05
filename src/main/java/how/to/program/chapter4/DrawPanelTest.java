package how.to.program.chapter4;

import javax.swing.*;

/**
 * Created by Пользователь on 13.05.2017.
 */
public class DrawPanelTest {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();

        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(250, 250);
        app.setVisible(true);
    }
}
