package how.to.program.chapter4;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Пользователь on 15.05.2017.
 */
public class GraphicsCaseStudy extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        int i = 0;
        while (i < width) {
            g.drawLine(0, i, i, height);
            g.drawLine(width, i, width - i, height);
            g.drawLine(0, height - i, i, 0);
            g.drawLine(width, height - i, width - i, 0);
            i += 10;
        }
    }
}
