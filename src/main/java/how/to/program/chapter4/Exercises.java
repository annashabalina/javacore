package how.to.program.chapter4;

/**
 * Created by Пользователь on 15.05.2017.
 */
public class Exercises {
    public static void main(String[] args) {
        /*int total = 0;
        int i = 0;
        while (i <= 10) {
            total += i;
            i++;
        }
        System.out.printf("total now is %d", total);*/
        int x = 1;
        int total = 0;
        while (x <= 10) {
            int y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }
        System.out.printf("Total is %d%n", total);
    }
}
