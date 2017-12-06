import java.util.Scanner;

/**
 *
 * @author Sergey Smirnov
 */
public class ReadClass {

    public double readNextDouble() {

        Scanner sc = new Scanner(System.in);
        double i = 0;
        if(sc.hasNextDouble()) {
            i = sc.nextDouble();
        }
        else {
            System.out.println("Вы ввели не вещественное число");
        }
        return i;

    }

}
