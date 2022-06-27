package HelloWorld;

public class Fibonacci {

    private static int reccurcive_fibonacci(int nm) {
        if (nm > 2) {
            return ( reccurcive_fibonacci(nm - 1) + reccurcive_fibonacci(nm - 2));
        } else {
            if (nm == 0 | nm == 1) {
                return (1);
            }
        }
        return (1);
    }

    private  static int fibonacci(int nm) {
        int nb = 0;
        int nb_1 = 0;
        int nb_2 = 1;
        for (int i = 1; i < nm; i++) {
            nb = nb_1 + nb_2;
            nb_1 = nb_2;
            nb_2 = nb;
        }
        return (nb);
    }

    public static void main(String[] args) {
        int number = 10;
        if (args.length > 1) {
            number = Integer.parseInt(args[1]);
        }
        System.out.println(String.format("Recurcive fibonacci(%d)", reccurcive_fibonacci(number)));
        System.out.println(String.format("fibonacci(%d)", fibonacci(number)));
    }
}
