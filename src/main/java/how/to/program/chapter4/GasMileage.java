package how.to.program.chapter4;

import java.util.Scanner;

/**
 * Created by Пользователь on 15.05.2017.
 */
public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter you miles and gallons or \"q\" to quit");
        String input = scanner.nextLine();
        while (!(input.equalsIgnoreCase("q"))) {
            System.out.println("enter your gallons: ");
            int gallons = scanner.nextInt();

            System.out.println("enter your miles");
            int miles = scanner.nextInt();
            float calcForTrip = calculate(miles, gallons);
            System.out.printf("In this trip, you made %f.2 miles per gallon", calcForTrip);
        }
    }

    public static float calculate(int miles, int gallons) {
        return (float) miles / gallons;
    }
}
