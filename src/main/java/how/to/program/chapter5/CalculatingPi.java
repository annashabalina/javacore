package how.to.program.chapter5;

/**
 * Created by Пользователь on 07.06.2017.
 */
public class CalculatingPi {
    public static void main(String[] args) {
        double pi = 4;
        int flag = 1;
        int counter = 3;
        while (counter <= 150001) {
            switch (flag) {
                case (1):
                    pi -= (double)4 / counter;
                    System.out.println(pi);
                    flag = 0;
                    break;
                case (0):
                    pi += (double)4 / counter;
                    System.out.println(pi);
                    flag = 1;
                    break;
            }
            counter += 2;
        }

        System.out.printf("Pi is: %f", pi);
    }
}
