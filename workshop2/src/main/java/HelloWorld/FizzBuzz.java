package HelloWorld;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            System.out.print(i);
            if ((i % 3) == 0 && (i % 5 == 0)) {
                System.out.print(" -> Fizzbuzz");
            } else if ((i % 3) == 0) {
                System.out.print(" -> Fizz");
            } else if ((i % 5) == 0) {
                System.out.print(" -> Buzz");
            }
            System.out.print("\n");
        }
    }
}
