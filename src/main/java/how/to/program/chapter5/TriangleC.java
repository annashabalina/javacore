package how.to.program.chapter5;

/**
 * Created by Пользователь on 04.06.2017.
 */
public class TriangleC {
    public static void main(String[] args) {
        int asteriksCounter = 5;
        for (int i = 5; i >= 1; i--) {
            if (asteriksCounter > i) {
                while (asteriksCounter > i) {
                    System.out.print(" ");
                    asteriksCounter--;
                }
            }
            while (asteriksCounter >= 1) {
                System.out.print("*");
                asteriksCounter--;
            }
            System.out.println();
            asteriksCounter = 5;
        }
    }
}
