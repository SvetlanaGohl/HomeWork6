public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();


    }
        public static void task1 () {

        System.out.println("ЗАДАЧА 1");
            for ( int i = 1; i <= 10; i = i + 1) {
                System.out.println("Число " + i);
            }
    }

    public static void task2 () {

        System.out.println("ЗАДАЧА 2");
        for ( int i = 10; i >= 1; i = i - 1) {
            System.out.println("Число " + i);
        }
    }

    public static void task3 () {

        System.out.println("ЗАДАЧА 3");
        for ( int i = 0; i <= 17; i = i + 2) {
            System.out.println("Число " + i);
        }
    }
    public static void task4 () {

        System.out.println("ЗАДАЧА 4");
        for ( int i = 10; i >= -10; i = i - 1) {
            System.out.println("Число " + i);
        }
    }
    public static void task5 () {

        System.out.println("ЗАДАЧА 5");
        for ( int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 00 || year % 400 == 0) {
                System.out.println(year + " год является високосным.");
            }
        }
    }
    public static void task6 () {

        System.out.println("ЗАДАЧА 6");
        for ( int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task7 () {

        System.out.println("ЗАДАЧА 7");
        for ( int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task8 () {

        System.out.println("ЗАДАЧА 8");
        int deposit = 29000;
        int capital = 0;
        for ( int i = 1; i <= 12; i = i + 1){
            capital = capital + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + capital + " рублей.");
        }
    }
    public static void task9 () {

        System.out.println("ЗАДАЧА 9");
        int deposit = 29000;
        int capital = 0;
        for ( int i = 1; i <= 12; i = i + 1){
            capital = capital + capital/100;
            capital = capital + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + capital + " рублей.");
        }
    }
    public static void task10 () {

        System.out.println("ЗАДАЧА 10");
        int number = 2;
        for ( int i = 1; i <= 10; i++) {
           System.out.println("2 * " + i + " = " + number*i);
        }
    }
}