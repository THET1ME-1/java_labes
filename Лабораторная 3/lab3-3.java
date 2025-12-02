public class Main {
    public static void main(String[] args) {
        final int max_terms = 200000; // максимум членов ряда
        double sum = 0.0;
        double sign = 1.0;

        double target_pi = 3.14159;
        int terms_for_target = -1;

        System.out.println("Число членов    Приближённое π");
        System.out.println("");

        for (int n = 1; n <= max_terms; n++) {
            double denominator = 2.0 * n - 1.0;
            double term = sign * (1.0 / denominator);

            sum = sum + term;
            sign = -sign; // меняем знак на противоположный

            double pi_approx = 4.0 * sum;

            System.out.println(n + "              " + pi_approx);

            // первая точка, где π ≈ 3.14159 (до 5 знаков после запятой)
            if (terms_for_target == -1) {
                double rounded = Math.round(pi_approx * 100000.0) / 100000.0;
                if (rounded == target_pi) {
                    terms_for_target = n;
                }
            }
        }

        System.out.println();
        if (terms_for_target != -1) {
            System.out.println("Впервые значение 3.14159 получается после "
                    + terms_for_target + " членов ряда.");
        } else {
            System.out.println("За " + max_terms
                    + " членов ряда значение 3.14159 не было достигнуто.");
        }
    }
}