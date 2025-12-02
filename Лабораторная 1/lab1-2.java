import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Цена одной книги: ");
        double price = scanner.nextDouble();

        System.out.print("Количество книг: ");
        int kol_vo = scanner.nextInt();

        System.out.print("Скидка на книгу в процентах: ");
        double percent = scanner.nextDouble();

        double shop_info = price * kol_vo * (1 - percent / 100);
        System.out.println("Итоговая стоимость: " + shop_info + "$");

        if (shop_info > 100) {
            System.out.println("Вы получили подарочный купон.");
        }

        scanner.close();
    }
}