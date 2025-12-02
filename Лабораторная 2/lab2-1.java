class Invoice {
    private String part_number;
    private String description;
    private int quantity;
    private double price_per_item;

    // Конструктор
    public Invoice(String part_number, String description, int quantity, double price_per_item) {
        this.part_number = part_number;
        this.description = description;
        set_quantity(quantity);
        set_price_per_item(price_per_item);
    }

    // Getter и Setter для part_number
    public String get_part_number() {
        return part_number;
    }

    public void set_part_number(String part_number) {
        this.part_number = part_number;
    }

    // Getter и Setter для description
    public String get_description() {
        return description;
    }

    public void set_description(String description) {
        this.description = description;
    }

    // Getter и Setter для quantity
    public int get_quantity() {
        return quantity;
    }

    public void set_quantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    // Getter и Setter для price_per_item
    public double get_price_per_item() {
        return price_per_item;
    }

    public void set_price_per_item(double price_per_item) {
        if (price_per_item < 0) {
            this.price_per_item = 0.0;
        } else {
            this.price_per_item = price_per_item;
        }
    }

    // Метод для вычисления суммы счета
    public double get_invoice_amount() {
        return quantity * price_per_item;
    }
}

// Тестовое приложение InvoiceTest
class InvoiceTest {
    public static void main(String[] args) {
        System.out.println("Тестирование класса Invoice:");
        
        Invoice invoice1 = new Invoice("121212", "Кебаб", 10, 5.99);
        System.out.println("Номер детали: " + invoice1.get_part_number());
        System.out.println("Описание: " + invoice1.get_description());
        System.out.println("Количество: " + invoice1.get_quantity());
        System.out.println("Цена за единицу: " + invoice1.get_price_per_item());
        System.out.println("Сумма счета: " + invoice1.get_invoice_amount());
        
        System.out.println();
        
        Invoice invoice2 = new Invoice("31890", "Дом", -5, 2.50);
        System.out.println("Номер детали: " + invoice2.get_part_number());
        System.out.println("Описание: " + invoice2.get_description());
        System.out.println("Количество: " + invoice2.get_quantity()); // 0
        System.out.println("Цена за единицу: " + invoice2.get_price_per_item());
        System.out.println("Сумма счета: " + invoice2.get_invoice_amount()); // 0.0
        
        System.out.println();
        
        Invoice invoice3 = new Invoice("11111", "Шар для боулинга", 3, -1.0);
        System.out.println("Номер детали: " + invoice3.get_part_number());
        System.out.println("Описание: " + invoice3.get_description());
        System.out.println("Количество: " + invoice3.get_quantity());
        System.out.println("Цена за единицу: " + invoice3.get_price_per_item()); // 0.0
        System.out.println("Сумма счета: " + invoice3.get_invoice_amount()); // 0.0
    }
}