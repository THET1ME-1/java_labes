import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total_sum = 0.0;

        while (true) {
            System.out.print("Введите номер товара (1-5, 0 - конец ввода): ");
            int product_number = scanner.nextInt();

            if (product_number == 0) {
                break;
            }

            System.out.print("Введите количество проданных единиц: ");
            int quantity = scanner.nextInt();

            double price;

            switch (product_number) {
                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
                default:
                    System.out.println("Неверный номер товара, строка пропущена.");
                    continue;
            }

            double cost = price * quantity;
            total_sum = total_sum + cost;

            System.out.println("Стоимость по этому товару: " + cost);
        }

        System.out.println("Общая стоимость всех проданных товаров: " + total_sum);

        scanner.close();
    }
}