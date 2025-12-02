public class Main {
    public static void main(String[] args) {
        long n_factorial = 1;

        for (int n = 1; n <= 20; n++) {
            n_factorial *= n;
            System.out.print(n + ": " + n_factorial + " | ");
        }
    }
}