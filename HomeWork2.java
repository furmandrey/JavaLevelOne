/**
 * Java 1. HomeWork #2
 *
 *@author Andrei Furman
 *@version 12.12.2021
 */
public class HomeWork2 {
    public static void main(String[]args) {
        checkSum(10, 5);
        System.out.println(printSing(0));
        checkSing(0);
        printRow(6, "Hello");
        findYear(2020);

    }

    static boolean checkSum(int a, int b) {
        return (a + b >= 10 && a + b <= 20 ? true : false);
    }

    static String printSing(int a) {
        return (a >= 0 ? "positive" : "negative");
    }

    static boolean checkSing(int a) {
        return (a < 0 ? true : false);
    }

    static void printRow(int a, String row) {
        for (int i = 0; i < a; i++) {
            System.out.println(row);
        }

    }
    public static boolean findYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? true : false;
    }
}
