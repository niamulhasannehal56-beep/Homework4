
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p = input.nextInt(); // Laptop price
        int s = input.nextInt(); // Current savings
        int m = input.nextInt(); // Weekly savings

        int k = 0;

        while (s < p) {
            s += m;
            k++;
        }

        System.out.println("k = " + k);

        input.close();
    }
}
