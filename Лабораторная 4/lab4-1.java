import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean play_again = true;
        
        while (play_again) {
            int number_to_guess = random.nextInt(1000) + 1;
            int guess_count = 0;
            boolean guessed_correctly = false;
            
            System.out.println("Я загадал число от 1 до 1000. Попробуйте угадать его!");
            
            while (!guessed_correctly) {
                System.out.print("Ваша догадка: ");
                int guess = scanner.nextInt();
                guess_count++;
                
                if (guess == number_to_guess) {
                    System.out.println("Поздравляем! Вы угадали число!");
                    System.out.println("Количество попыток: " + guess_count);
                    guessed_correctly = true;
                } else {
                    int difference = Math.abs(guess - number_to_guess);
                    
                    if (difference <= 1) {
                        System.out.println("Очень горячо! Вы почти у цели!");
                    } else if (difference <= 5) {
                        System.out.println("Горячо! Вы очень близко.");
                    } else if (difference <= 10) {
                        System.out.println("Тепло.");
                    } else {
                        System.out.println("Холодно.");
                    }

                    if (guess < number_to_guess) {
                        System.out.println("Ваше число меньше загаданного.");
                    } else {
                        System.out.println("Ваше число больше загаданного.");
                    }
                }
            }
            
            System.out.print("Хотите сыграть снова? (1 - да, 0 - нет): ");
            int choice = scanner.nextInt();
            if (choice != 1) {
                play_again = false;
            }
        }
        
        scanner.close();
    }
}