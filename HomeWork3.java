/**
 * Java 1. HomeWork #3
 *
 *@author Andrei Furman
 *@version 15.12.2021
 */
import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[]args) {
        invertBits();
        doFrom1to100();
        // doFrom1to100OneMore();
        multiplyUnderSixByTwo();
        diagonally();
        //System.out.println(Arrays.toString(createArray(12, 1)));
        createArray(12, 1);
        findMinMax();
    }

    static void invertBits() {
        int[]row = {
            1,
            1,
            0,
            0,
            1,
            0,
            1,
            1,
            0,
            0
        };
        System.out.println(Arrays.toString(row));
        for (int i = 0; i < row.length; i++) {
            row[i] = (row[i] + 1) % 2;
        }
        System.out.println(Arrays.toString(row));
    }

    static void doFrom1to100() {
        int[]ary = new int[100];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = i + 1;
        }
        System.out.println(Arrays.toString(ary));
    }

    // static void doFrom1to100OneMore() {
    //   int counter = 1;
    //   int[] ary = new int[100];
    //   for (int i = 0; i < ary.length; i++) {
    //   ary[i] = counter;
    //   counter++;
    //   }
    //   System.out.println(Arrays.toString(ary));
    // }

    static void multiplyUnderSixByTwo() {
        int[]ary = {
            1,
            5,
            3,
            2,
            11,
            4,
            5,
            2,
            4,
            8,
            9,
            1
        };
        System.out.println(Arrays.toString(ary));
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] < 6)
                ary[i] = ary[i] * 2;
            //else ary[i] = ary[i];
        }
        System.out.println(Arrays.toString(ary));
    }

    static void diagonally() {
        int a = 6;
        int[][]table = new int[a][a];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][i] = 1;
                table[i][a - 1 - i] = 1;
                //if (i == j ) table[i][j] = 1;
                System.out.print(table[i][j] + "  ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.deepToString(table));
    }

    static int[]createArray(int len, int initialValue) {
        int[]ary = new int[len];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = initialValue;
        }
        return ary;
    }

    static void findMinMax() {
        int[]array = new int[5];
        Random random = new Random();
        int max = 0;
        int min = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("In the array:");
        System.out.println(Arrays.toString(array));
        System.out.println("The maximal array element is: " + max);
        System.out.println("The munimal array element is: " + min);
        
    }
}
