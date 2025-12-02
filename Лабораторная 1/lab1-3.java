import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Say My Name: ");
        String name = scanner.nextLine();

        System.out.print("Возраст: ");
        int age = scanner.nextInt();

        String second_name = "";
        
        if (age < 18) {
            second_name = "Junior";
        } else if (age >= 18 & age <= 40) {
            second_name = "Pro";
        } else {
            second_name = "Boss";
        }

        System.out.println("Прозвище: " + name + " " + second_name);

        scanner.close();
    }
}