package how.to.program.chapter5;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Пользователь on 01.06.2017.
 */
public class ConcentricCircles extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 1; i <= 12; i++) {
            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;

            g.drawOval(centerX - i * 5, centerY - i * 5, 10 * i, 10 * i);
        }
    }
}
