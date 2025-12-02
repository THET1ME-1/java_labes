class Employee {
    private String first_name;
    private String last_name;
    private double monthly_salary;

    // Конструктор
    public Employee(String first_name, String last_name, double monthly_salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        set_monthly_salary(monthly_salary);
    }

    // Getter и Setter для first_name
    public String get_first_name() {
        return first_name;
    }

    public void set_first_name(String first_name) {
        this.first_name = first_name;
    }

    // Getter и Setter для last_name
    public String get_last_name() {
        return last_name;
    }

    public void set_last_name(String last_name) {
        this.last_name = last_name;
    }

    // Getter и Setter для monthly_salary
    public double get_monthly_salary() {
        return monthly_salary;
    }

    public void set_monthly_salary(double monthly_salary) {
        if (monthly_salary > 0) {
            this.monthly_salary = monthly_salary;
        }
    }

    // Метод для получения годовой зарплаты
    public double get_annual_salary() {
        return monthly_salary * 12;
    }
}

// Тестовое приложение EmployeeTest
public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("Тестирование класса Employee:");
        
        // Создание двух объектов
        Employee employee1 = new Employee("Джон", "Доу", 5000.0);
        Employee employee2 = new Employee("Джейн", "Доу", 6000.0);
        
        // Вывод годовой зарплаты
        System.out.println(employee1.get_first_name() + " " + employee1.get_last_name() + 
                          " - Годовая зарплата: " + employee1.get_annual_salary());
        System.out.println(employee2.get_first_name() + " " + employee2.get_last_name() + 
                          " - Годовая зарплата: " + employee2.get_annual_salary());
        
        // Увеличение зарплаты на 10%
        employee1.set_monthly_salary(employee1.get_monthly_salary() * 1.10);
        employee2.set_monthly_salary(employee2.get_monthly_salary() * 1.10);
        
        System.out.println();
        
        // Вывод обновленной годовой зарплаты
        System.out.println(employee1.get_first_name() + " " + employee1.get_last_name() + 
                          " - Новая годовая зарплата: " + employee1.get_annual_salary());
        System.out.println(employee2.get_first_name() + " " + employee2.get_last_name() + 
                          " - Новая годовая зарплата: " + employee2.get_annual_salary());
        
        // Тест с отрицательной зарплатой (не присваивается)
        employee1.set_monthly_salary(-1000.0);
        System.out.println(employee1.get_first_name() + " " + employee1.get_last_name() + 
                          " - Зарплата после установки отрицательного значения: " + 
                          employee1.get_monthly_salary()); // Остается прежней
    }
}