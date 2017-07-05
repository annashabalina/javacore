package how.to.program.chapter5;

/**
 * Created by Пользователь on 01.06.2017.
 */
public class InterestRates {
    public static int initialInvestment = 1000;
    public static float yieldedAmount = 0.0f;
    public static float interestRate = 5;

    public static void main(String[] args) {
        System.out.printf("%s %6s %13s %14s %14s %14s %14s %14s %14s %14s %14s", "Year ->", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        System.out.printf("%n%s%n", "Rate");
        for (int y = 5; y <= 10; y++) {
            interestRate = y;
            System.out.printf("%2d",y);
            for (int i = 1; i <= 10; i++) {
                yieldedAmount += (initialInvestment * Math.pow(1 + interestRate / 100, i));
                System.out.printf("%15.2f", yieldedAmount);
                yieldedAmount = 0.0f;
            }
            System.out.println();
        }
    }
}
