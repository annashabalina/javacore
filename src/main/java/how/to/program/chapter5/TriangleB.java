package how.to.program.chapter5;

/**
 * Created by Пользователь on 04.06.2017.
 */
public class TriangleB {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 5; i >= 1; i--) {
            while (counter <= i) {
                System.out.print("*");
                counter++;
            }
            System.out.println();
            counter = 1;
        }
    }
}
