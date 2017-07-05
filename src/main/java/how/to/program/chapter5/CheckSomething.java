package how.to.program.chapter5;

import java.util.Scanner;

/**
 * Created by Пользователь on 01.06.2017.
 */
public class CheckSomething {
    public static void main(String[] args) {
            for (int count = 1; count <= 10; count++) {
                if (count == 5)
                    count++; // skip remaining code in loop body if count is 5

                System.out.printf("%d ", count);
            }
        System.out.printf("%nUsed continue to skip printing 5%n");
    }
}
