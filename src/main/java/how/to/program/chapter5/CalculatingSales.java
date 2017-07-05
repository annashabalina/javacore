package how.to.program.chapter5;

import java.util.Scanner;

/**
 * Created by Пользователь on 07.06.2017.
 */
public class CalculatingSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productNum;
        int qty;
        double totalSales = 0.0;
        double totalFromOneSale=0.0;

        System.out.println("Enter product number and quantity sold. To stop entering numbers type <Ctrl> z then press Enter.");
        System.out.println("Enter product number and then quantity sold: ");


        while (scanner.hasNextInt()) {
            //System.out.println("Enter product number: ");
            productNum = scanner.nextInt();
            //System.out.println("Enter quantity sold: ");
            qty = scanner.nextInt();
            switch (productNum) {
                case (1):
                    totalFromOneSale = 2.98 * qty;
                    System.out.printf("Total from selling %d items of product #1 is %.2f %n", qty, totalFromOneSale);
                    totalSales += totalFromOneSale;
                    break;
                case (2):
                    totalFromOneSale = 4.5 * qty;
                    System.out.printf("Total from selling %d items of product #2 is %.2f %n", qty, totalFromOneSale);
                    totalSales += totalFromOneSale;
                    break;
                case (3):
                    totalFromOneSale = 9.98 * qty;
                    System.out.printf("Total from selling %d items of product #3 is %.2f %n", qty, totalFromOneSale);
                    totalSales += totalFromOneSale;
                    break;
                case (4):
                    totalFromOneSale = 4.49 * qty;
                    System.out.printf("Total from selling %d items of product #4 is %.2f %n", qty, totalFromOneSale);
                    totalSales += totalFromOneSale;
                    break;
                case (5):
                    totalFromOneSale = 6.87 * qty;
                    System.out.printf("Total from selling %d items of product #5 is %.2f %n", qty, totalFromOneSale);
                    totalSales += totalFromOneSale;
                    break;
                default:
                    System.out.println("No such item");
            }
        }

        System.out.printf("Total from all sales is %.2f dollars", totalSales);
    }
}
