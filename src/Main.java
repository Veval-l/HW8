public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();

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

        int[] arr1 = new int[3];
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {4, 8, 0, 2, 1, 0};

        System.out.println();
    }

    public static void task2() {
        /**
         *Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
         */
        System.out.println("Задача 2");

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int n = 0; n < 3; n++) {
            System.out.print(arr1[n]);
            if (n != (arr1.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();


    double[] arr2 = {1.57, 7.654, 9.986};
        for (int n = 0; n < arr2.length; n++) {
            System.out.print(arr2[n]);
            if (n != (arr2.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();

    int[] arr3 = {4, 8, 0, 2, 1, 0};
        for (int n = 0; n < arr3.length; n++) {
            System.out.print(arr3[n]);
            if (n != (arr3.length - 1)) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println();
    }

    static public void task3() {
        /**
         *Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
         */
        System.out.println("Задача 3");

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int n = arr1.length - 1; n >= 0; n--) {
            System.out.print(arr1[n]);
            if (n != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = arr2.length - 1; i >= arr2.length; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        char[] arr3 = {4, 8, 0, 2, 1, 0};
        for (int p = arr1.length - 1; p >= 0; p--) {
            System.out.print(arr1[p]);
            if (p != 0) {
                System.out.print(", ");

                System.out.println();
            }
        }
    }

}