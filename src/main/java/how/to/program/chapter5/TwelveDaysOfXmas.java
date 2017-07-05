package how.to.program.chapter5;

/**
 * Created by Пользователь on 07.06.2017.
 */
public class TwelveDaysOfXmas {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%s", "On the ");
            switch (i) {
                case (1):
                    System.out.print("first ");
                    break;
                case (2):
                    System.out.print("second ");
                    break;
                case (3):
                    System.out.print("third ");
                    break;
                case (4):
                    System.out.print("fourth ");
                    break;
                case (5):
                    System.out.print("fifth ");
                    break;
                case (6):
                    System.out.print("sixth ");
                    break;
                case (7):
                    System.out.print("seventh ");
                    break;
                case (8):
                    System.out.print("eighth ");
                    break;
                case (9):
                    System.out.print("ninth ");
                    break;
                case (10):
                    System.out.print("tenth ");
                    break;
                case (11):
                    System.out.print("eleventh ");
                    break;
                case (12):
                    System.out.print("twelfth ");
                    break;

            }
            System.out.printf("%s %n", "day of Christmas my true love sent to me");

            switch (i) {
                case (12):
                    System.out.printf("%s %n", "Twelve Drummers Drumming,");
                case (11):
                    System.out.printf("%s %n", "Eleven Pipers Piping,");
                case (10):
                    System.out.printf("%s %n", "Ten Lords a-Leaping,");
                case (9):
                    System.out.printf("%s %n", "Nine Ladies Dancing,");
                case (8):
                    System.out.printf("%s %n", "Eight Maids a-Milking,");
                case (7):
                    System.out.printf("%s %n", "Seven Swans a-Swimming,");
                case (6):
                    System.out.printf("%s %n", "Six Geese a-Laying,");
                case (5):
                    System.out.printf("%s %n", "Five Gold Rings,");
                case (4):
                    System.out.printf("%s %n", "Four Calling Birds,");
                case (3):
                    System.out.printf("%s %n", "Three French Hens,");
                case (2):
                    System.out.printf("%s %n%s", "Two Turtle Doves", "and ");
                default:
                    System.out.printf("%s %n", "a Partridge in a Pear Tree.");
            }
            System.out.println();
        }
    }
}
