public class Main {
    public static void main(String[] args) {
    
        // Квадрат - создание циклами
        System.out.println("Квадрат:");
        
        int square_length = 9;
        int square_height = 8;
        
        // Цикл создания прямоугольника
        for (int i = 1; i <= square_height; i++){
            for (int j = 1; j <= square_length; j++){
                if (i == 1 || i == square_height || j == 1 || j == square_length){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
	        System.out.println();
	    }
	    
	    // Перенос на новую строку для удобства
        System.out.println();

// --------------------------------------------

        // Овал - с помощью \n
        System.out.println("Овал:");
        System.out.println("  ***\n *   *\n*     *\n*     *\n*     *\n*     *\n *   *\n  ***");
        
        // Перенос на новую строку для удобства
        System.out.println();
        
// --------------------------------------------

        // Стрелка - гибридный способ
        int tr_height = 7;  // Высота треугольника
        
        System.out.println("Стрелка:");
        System.out.println("  *  \n ***\n*****"); // Шапка стрелы
        
        // Тело стрелы
        for (int i = 0; i < tr_height; i++) {
            System.out.println("  *");
        }
        
        // Перенос на новую строку для удобства
        System.out.println();
        
// --------------------------------------------

		// Ромб
		System.out.println("Ромб:");
		
		System.out.println("    *  ");
		System.out.println("   * * ");
		System.out.println("  *   *");
		System.out.println(" *     *");
		System.out.println("*       *");
		System.out.println(" *     *");
		System.out.println("  *   *");
		System.out.println("   * * ");
		System.out.println("    *  ");
    }
}