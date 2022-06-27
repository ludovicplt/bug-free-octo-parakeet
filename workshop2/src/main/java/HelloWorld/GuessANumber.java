package HelloWorld;
import java.util.*;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int random = rand.nextInt(100);
        int get = 0;
        int tries = 0;
        while (true) {
            System.out.print("guess the number ");
            get = scan.nextInt();
            tries++;
            if (get == random) {
                System.out.println("bravo trouvé");
                break;
            } else if (get < random) {
                System.out.println("inferieur");
            } else {
                System.out.println("supperieur");
            }
        }
        System.out.println(String.format("you take %d tries", tries));
    }
}
