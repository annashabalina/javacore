package how.to.program.chapter5;

import javax.swing.*;

/**
 * Created by Пользователь on 01.06.2017.
 */
public class ConcentricCirclesTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ConcentricCircles());
    }
}
