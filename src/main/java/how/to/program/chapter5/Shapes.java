package how.to.program.chapter5;

import sun.java2d.pipe.SpanClipRenderer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Пользователь on 01.06.2017.
 */
public class Shapes extends JPanel {
    private int userChoice;

    public Shapes() {
    }

    public Shapes(int userChoice) {
        this.userChoice = userChoice;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 10; i++) {
            switch (userChoice) {
                case 1:
                    g.drawRect(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    break;
                case 2:
                    g.drawOval(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    break;
                case 3:
                    g.drawRect(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    g.drawOval(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
            }
        }
    }
}
