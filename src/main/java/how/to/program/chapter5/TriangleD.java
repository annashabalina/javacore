package how.to.program.chapter5;

/**
 * Created by Пользователь on 04.06.2017.
 */
public class TriangleD {
    public static void main(String[] args) {
        int expectedAsteriksCounter = 5;
        for (int i = 1; i <= 5; i++) {
            if (expectedAsteriksCounter >= i) {
                while (expectedAsteriksCounter > i) {
                    System.out.print(" ");
                    expectedAsteriksCounter--;
                }
                while (expectedAsteriksCounter >= 1) {
                    System.out.print("*");
                    expectedAsteriksCounter--;
                }
            }
            System.out.println();
            expectedAsteriksCounter = 5;
        }
    }
}
