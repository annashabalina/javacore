package how.to.program.chapter5;

/**
 * Created by Пользователь on 01.06.2017.
 */
public class FiveIntegersPerLine {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            System.out.printf("%d", i);
            System.out.printf("\t");
            if (i % 5 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
