import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество минут за компьютером: ");
        int minutes = scanner.nextInt();

        int days = minutes / (24 * 60);
        int hours = (minutes % (24 * 60)) / 60;
        int remainingMinutes = minutes % 60;

        System.out.printf("%d минут это %d дней, %d часов и %d минут.\n", minutes, days, hours, remainingMinutes);

        if (minutes < 120) {
            System.out.println("Можно ещё поработать");
        } else if (minutes >= 120 && minutes <= 300) {
            System.out.println("Хороший рабочий день");
        } else {
            System.out.println("Сделай перерыв");
        }

        scanner.close();
    }
}