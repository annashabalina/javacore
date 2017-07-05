package how.to.program.chapter5;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Пользователь on 01.06.2017.
 */
public class ShapesTest {
    public static void main(String[] args) {
        String choice = JOptionPane.showInputDialog("Enter 1 to draw rectangles, \n" +
                "Enter 2 to draw ovals,\n" +
                "Enter 3 to draw both");

        Shapes shapes = new Shapes(Integer.parseInt(choice));
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(shapes);
    }
}
