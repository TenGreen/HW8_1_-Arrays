import java.util.Arrays;

public class Main {
    private static final int[] weight = new int[]{1, 2, 3};
    private static final double[] theCommaFloats = {1.57d, 7.654d, 9.986d};
    private static final String[] allMonthsOfTheYear = new String[]{"January",
            "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        System.out.println("Определил массивы как свойства класса Main," +
                " чтобы появилась возможность обращаться к ним из методов");
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < theCommaFloats.length; i++) {
            System.out.print(theCommaFloats[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = 0; i < allMonthsOfTheYear.length; i++) {
            System.out.print(allMonthsOfTheYear[i]);
            if (i != allMonthsOfTheYear.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }


    public static void task3() {
        System.out.println("Задача 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = theCommaFloats.length - 1; i >= 0; i--) {
            System.out.print(theCommaFloats[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = allMonthsOfTheYear.length - 1; i >= 0; i--) {
            System.out.print(allMonthsOfTheYear[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 == 1) {
                weight[i] = weight[i] + 1;
            }
        }
        System.out.println(Arrays.toString(weight));
    }
}