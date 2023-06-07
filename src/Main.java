public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    static public void task1() {
        /**
         *Объявите три массива:
         * Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
         * Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
         * Произвольный массив. Тип и количество данных определите сами.
         * Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
         */
        System.out.println("Задача 1");

        int[] number = new int[3];
        double[] variable = {1.57, 7.654, 9.986};
        int[] apple = {4, 8, 0, 2, 1, 0};

        System.out.println();
    }

    public static void task2() {
        /**
         *Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
         */
        System.out.println("Задача 2");

        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int n = 0; n < 3; n++) {
            System.out.print(number[n] + ", ");
        }
        System.out.println();

    double[] variable = {1.57, 7.654, 9.986};
        for(double i = 0; i < variable.length; i++) {
            System.out.print(variable[(int) i] + ", ");
    }
        System.out.println();

    int[] apple = {4, 8, 0, 2, 1, 0};
        for(int a = 0; a < apple.length; a++) {
        System.out.print(apple[(int) a] + ", ");
    }

        System.out.println();
        System.out.println();
    }

    static public void task3() {
        /**
         *Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
         */
        System.out.println("Задача 3");



        System.out.println( );
    }
    static public void task4() {
        /**
         *
         */
        System.out.println("Задача 4");



        System.out.println( );
    }

}