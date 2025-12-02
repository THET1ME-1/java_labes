class Date {
    private int month;
    private int day;
    private int year;

    // Конструктор
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Getter и Setter для month
    public int get_month() {
        return month;
    }

    public void set_month(int month) {
        this.month = month;
    }

    // Getter и Setter для day
    public int get_day() {
        return day;
    }

    public void set_day(int day) {
        this.day = day;
    }

    // Getter и Setter для year
    public int get_year() {
        return year;
    }

    public void set_year(int year) {
        this.year = year;
    }

    // Метод для отображения даты
    public void display_date() {
        System.out.println(month + "/" + day + "/" + year);
    }
}

// Тестовое приложение DateTest
public class DateTest {
    public static void main(String[] args) {
        System.out.println("Тестирование класса Date:");
        
        // Создание объекта
        Date date = new Date(10, 19, 2025);
        
        // Вывод с помощью display_date
        System.out.print("Дата: ");
        date.display_date();
        
        System.out.println();
        
        // Демонстрация getter/setter
        System.out.println("Месяц: " + date.get_month());
        System.out.println("День: " + date.get_day());
        System.out.println("Год: " + date.get_year());
        
        // Изменение значений
        date.set_month(12);
        date.set_day(31);
        date.set_year(2025);
        
        System.out.println();
        System.out.print("Обновленная дата: ");
        date.display_date();
    }
}
