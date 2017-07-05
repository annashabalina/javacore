package how.to.program.chapter5;

import java.util.Scanner;

/**
 * Created by Пользователь on 07.06.2017.
 */
public class BarChartDisplayProgram {
    public static int firstInput;
    public static int secondInput;
    public static int thirdInput;
    public static int fourthInput;
    public static int fifthInput;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Enter your %dth : ", i);
            switch (i) {
                case (1):
                    firstInput = scanner.nextInt();
                    break;
                case (2):
                    secondInput = scanner.nextInt();
                    break;
                case (3):
                    thirdInput = scanner.nextInt();
                    break;
                case (4):
                    fourthInput = scanner.nextInt();
                    break;
                case (5):
                    fifthInput = scanner.nextInt();
                    break;
            }
        }

        for(int i=1;i<=firstInput;i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i=1;i<=secondInput;i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i=1; i<=thirdInput;i++){
            System.out.print("*");
        }

        System.out.println();

        for(int i=1;i<=fourthInput;i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i=1;i<=fifthInput;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
