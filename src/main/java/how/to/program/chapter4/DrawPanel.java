package how.to.program.chapter4;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Пользователь on 13.05.2017.
 */
public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
    }
}
