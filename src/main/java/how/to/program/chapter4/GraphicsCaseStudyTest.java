package how.to.program.chapter4;

import javax.swing.*;

/**
 * Created by Пользователь on 15.05.2017.
 */
public class GraphicsCaseStudyTest {
    public static void main(String[] args) {
        GraphicsCaseStudy graphicsObj = new GraphicsCaseStudy();

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.add(graphicsObj);
    }
}
