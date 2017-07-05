package how.to.program.chapter5;

/**
 * Created by Пользователь on 04.06.2017.
 */
public class TriangleA {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 1; i <= 5; i++) {
            while(counter<=i){
                System.out.print("*");
                counter++;
            }
            System.out.println();
            counter=1;
        }
    }
}
