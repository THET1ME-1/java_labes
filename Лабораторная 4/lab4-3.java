import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] seats = new boolean[10]; // false - свободно, true - занято
        
        while (true) {
            System.out.println("Пожалуйста, введите 1 для бизнес-класса");
            System.out.println("Пожалуйста, введите 2 для эконом-класса");
            System.out.print("Ваш выбор: ");
            int class_choice = scanner.nextInt();
            
            if (class_choice == 1) { // Бизнес-класс
                int seat = assign_seat(seats, 0, 4); // Места 1-5
                if (seat == -1) {
                    System.out.println("Места в бизнес-классе отсутствуют.");
                    System.out.print("Хотите место в эконом-классе? (1 - да, 0 - нет): ");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        seat = assign_seat(seats, 5, 9); // Места 6-10
                        if (seat != -1) {
                            print_boarding_pass(seat + 1, "эконом");
                        } else {
                            System.out.println("Следующий рейс отправляется через 3 часа.");
                        }
                    } else {
                        System.out.println("Следующий рейс отправляется через 3 часа.");
                    }
                } else {
                    print_boarding_pass(seat + 1, "бизнес");
                }
            } else if (class_choice == 2) { // Эконом-класс
                int seat = assign_seat(seats, 5, 9); // Места 6-10
                if (seat == -1) {
                    System.out.println("Места в эконом-классе отсутствуют.");
                    System.out.print("Хотите место в бизнес-классе? (1 - да, 0 - нет): ");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        seat = assign_seat(seats, 0, 4); // Места 1-5
                        if (seat != -1) {
                            print_boarding_pass(seat + 1, "бизнес");
                        } else {
                            System.out.println("Следующий рейс отправляется через 3 часа.");
                        }
                    } else {
                        System.out.println("Следующий рейс отправляется через 3 часа.");
                    }
                } else {
                    print_boarding_pass(seat + 1, "эконом");
                }
            } else {
                System.out.println("Неверный выбор. Пожалуйста, введите 1 или 2.");
            }
            
            // Проверка, все ли места заняты
            boolean all_seats_taken = true;
            for (boolean seat : seats) {
                if (!seat) {
                    all_seats_taken = false;
                    break;
                }
            }
            
            if (all_seats_taken) {
                System.out.println("Все места заняты. Следующий рейс отправляется через 3 часа.");
                break;
            }
        }
        
        scanner.close();
    }
    
    private static int assign_seat(boolean[] seats, int start_index, int end_index) {
        for (int i = start_index; i <= end_index; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return i;
            }
        }
        return -1; // Нет свободных мест
    }
    
    private static void print_boarding_pass(int seat_number, String class_type) {
        System.out.println("Ваше место забронировано!");
        System.out.println("Класс: " + class_type);
        System.out.println("Номер места: " + seat_number);
    }
}