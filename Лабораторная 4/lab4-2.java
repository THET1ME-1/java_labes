import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random_generator = new Random();
        
        int number_of_rolls = 36000000;
        int[] sum_counts = new int[13];

        // Начало симуляции
        for (int i = 0; i < number_of_rolls; i++) {
            int die1_value = random_generator.nextInt(6) + 1;
            int die2_value = random_generator.nextInt(6) + 1;
            int current_sum = die1_value + die2_value;

            sum_counts[current_sum]++;
        }


        // Начало вывода результатов
        System.out.println("Результаты симуляции:");
        System.out.println("Сумма\tКоличество\tПроцент");
        System.out.println("-----\t-----------\t-------");


        for (int sum = 2; sum <= 12; sum++) {

            int count = sum_counts[sum];
            double count_as_decimal = count;
            double percentage = (count_as_decimal / number_of_rolls) * 100;
            
            System.out.println(sum + "\t" + count + "\t\t" + percentage + "%");
        }
    }
}