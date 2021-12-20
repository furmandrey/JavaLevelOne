/**
 * Java 1. HomeWork #4
 *
 *@author Andrei Furman
 *@version 20.12.2021
 */
//Крестики - Нолики

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ForTest {

    final char CHAR_X = 'x';
    final char CHAR_O = 'O';
    final char CHAR_VOID = '*';
    char[][]field;
    Scanner sc;
    Random random;

    public static void main(String[]args) {
        new ForTest().game();

    }

    ForTest() {
        field = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }

    void game() {
        initField();
        printField();
        while (true) {
            turnPlayer();
            if (isWin(CHAR_X)) {
                System.out.println();
                System.out.println("You WON!!!");
                break;
            }
            if (isFieldFull()) {
                System.out.println();
                System.out.println("It is DRAW Bro");
                break;
            }
            turnComputer();
            printField();
            if (isWin(CHAR_O)) {
                System.out.println();
                System.out.println("You lose! I won! :-)");
                break;
            }
            if (isFieldFull()) {
                System.out.println();
                System.out.println("*It is DRAW Bro*");
                break;
            }
        }
        printField();
    }

    void initField() {
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field.length; x++) {
                field[y][x] = CHAR_VOID;
            }
        }
    }

    void printField() {
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field.length; x++) {
                System.out.print(field[y][x] + "  ");
            }
            System.out.println();
        }
    }

    void turnPlayer() {
        int x,
        y;
        do {
            System.out.println("Please enter X →. The numbers from 1 to 3:   ");
            x = sc.nextInt() - 1;
            System.out.println("Please enter Y ↓. The numbers from 1 to 3:   ");
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        field[y][x] = CHAR_X;
    }

    void turnComputer() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValidC(x, y));
        field[y][x] = CHAR_O;
    }

    
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            System.out.println("Wrong cell! ");
            return false;
        }
        if (field[y][x] == CHAR_X || field[y][x] == CHAR_O) {
          System.out.println("Cell occupied! ");
         return false;
        }

        return field[y][x] == CHAR_VOID;
    }

     boolean isCellValidC(int x, int y) {
             return field[y][x] == CHAR_VOID;
    }

    boolean isWin(char ch) {
        int checkBackslashline = 0;
        int checkSlashline = 0;
        for (int y = 0; y < field.length; y++) {
            int checkXline = 0;
            int checkYline = 0;

            for (int x = 0; x < field.length; x++) {
                if (field[y][x] == ch) {
                    checkXline++;
                    if (checkXline == 3)
                        return true;
                }
                if (field[x][y] == ch) {
                    checkYline++;
                    if (checkYline == 3)
                        return true;
                }
               
            }
            if (field[y][y] == ch) {
                checkBackslashline++;
                if (checkBackslashline == 3)
                    return true;
            }
            if (field[y][2 - y] == ch) {
                checkSlashline++;
                if (checkSlashline == 3)
                    return true;
            }
        }
        //if (field[0][0] == ch && field[0][1] == ch && field[0][2] == ch) return true;
        //if (field[1][0] == ch && field[1][1] == ch && field[1][2] == ch) return true;
        //if (field[2][0] == ch && field[2][1] == ch && field[2][2] == ch) return true;
        //
        //if (field[0][0] == ch && field[1][0] == ch && field[2][0] == ch) return true;
        // if (field[0][1] == ch && field[1][1] == ch && field[2][1] == ch) return true;
        //if (field[0][2] == ch && field[1][2] == ch && field[2][2] == ch) return true;
        //
        //if (field[0][0] == ch && field[1][1] == ch && field[2][2] == ch) return true;
        //if (field[2][0] == ch && field[1][1] == ch && field[0][2] == ch) return true;

        return false;

    }

    boolean isFieldFull() {
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field.length; x++) {
                if (field[y][x] == CHAR_VOID) {
                    return false;
                }
            }
        }
        return true;
    }

}

//**********************************************************************
// <<<<<<< HEAD
// import java.util.*;


// public class ForTest {
//     //public static void main(String[]args) {
//       //  Scanner sc = new Scanner(System.in);
//       //   System.out.println("Введите число: ");
//       //   int a = sc.nextInt();
//       //   a *= 2;
//       //   System.out.println("Введенное вами число, умноженное на 2, равно " + a);
//       //   sc.close();
//  //public static Scanner sc = new Scanner(System.in);

//     public static void main(String[] args) {
      
//      int[] arr = createRandomeArray(10);
//       printArray(arr);
  
      
      
//       //printArray(arr);  // Массив передается как параметр метода, переданный параметр является адресом памяти массива
//       //diagonally();
//     }
//   public static void printArray(int[] arr) {
//    //int[] arr = {1, 2, 3, 4};
//           for (int i = 0; i < arr.length; i++) {
//            //System.out.print('1');
//            //arr[i] = 1;
//            System.out.print(arr[i] + " ");
//        }
//        //System.out.println();
//     }    

//         // int d = getNumberFromScanner("Введите число в пределах от 5 до 10", 5, 10);
//         // System.out.println("d = " + d);
//         // // invertBits();
// =======
// import java.util.Arrays;
// import java.util.Random;

// public class ForTest {
//     public static void main(String[]args) {
//         // invertBits();
// >>>>>>> 5eee55bd5a96abc980624633b7a6bf5b7a0013d3
//         // doFrom1to100();
//         // doFrom1to100OneMore();
//         // multiplyUnderSixByTwo();
//         //diagonally();
// <<<<<<< HEAD
// //         //System.out.println(Arrays.toString(createArray(12, 1)));
// //         // createArray(12, 1);
// //         // findMinMax(createRandomeArray);
// //         createRandomeArray(10);
       
// //         // //   int counter = 1;
// //         //   int[][] table = new int[4][4];
// //         //   for (int i = 0; i < 4; i++) {
// //         //       for (int j = 0; j < 4; j++) {
// //         //           table[i][j] = counter;
// //         //           System.out.print(table[i][j] + "    ");
// //         //           //counter++;
// //         //       }
// //         //       System.out.println();
// //         //   }
// //         // System.out.println(Arrays.deepToString(table));
// //     }
// //     public static void printArr(int[] arr) {
// //     for (int i = 0; i < arr.length; i++) {
         
// //             System.out.print(arr[i]);
// //         }
// //         System.out.println();
// //     }



// //     //  static int getNumberFromScanner(String message, int min, int max) {
// //     //     int x;
// //     //     do {
// //     //         System.out.println(message);
// //     //         x = sc.nextInt();
// //     //     } while (x < min || x > max);
// //     //     return x;
// //     // }

// =======
//         //System.out.println(Arrays.toString(createArray(12, 1)));
//         //createArray(12, 1);
//         findMinMax(createRandomeArray);
//         createRandomeArray(100);
//         //   int counter = 1;
//         //   int[][] table = new int[4][4];
//         //   for (int i = 0; i < 4; i++) {
//         //       for (int j = 0; j < 4; j++) {
//         //           table[i][j] = counter;
//         //           System.out.print(table[i][j] + "    ");
//         //           //counter++;
//         //       }
//         //       System.out.println();
//         //   }
//         // System.out.println(Arrays.deepToString(table));
//     }
// >>>>>>> 5eee55bd5a96abc980624633b7a6bf5b7a0013d3
//     static int[] createRandomeArray (int len) {
//         int[] array = new int[len];
//         Random random = new Random();
//             for (int i = 0; i < array.length; i++) {
// <<<<<<< HEAD
//             array[i] = random.nextInt(1000);   
// =======
//             array[i] = random.nextInt(100);   
// >>>>>>> 5eee55bd5a96abc980624633b7a6bf5b7a0013d3
//         }
//         //System.out.println(Arrays.toString(array));
//         return(array);
//     }

// <<<<<<< HEAD
// //     // static void invertBits() {
// //     //   int[] row = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
// //     //   System.out.println(Arrays.toString(row));
// //     //   for (int i = 0; i < row.length; i++) {
// //     //     row[i] = (row[i]+1) % 2;
// //     //   }
// //     //   System.out.println(Arrays.toString(row));
// //     // }

// //     // static void doFrom1to100() {
// //     //   int[] ary = new int[100];
// //     //   for (int i = 0; i < ary.length; i++) {
// //     //   ary[i] = i + 1;
// //     //   }
// //     //   System.out.println(Arrays.toString(ary));
// //     // }

// //     // static void doFrom1to100OneMore() {
// //     //   int counter = 1;
// //     //   int[] ary = new int[100];
// //     //   for (int i = 0; i < ary.length; i++) {
// //     //   ary[i] = counter;
// //     //   counter++;
// //     //   }
// //     //   System.out.println(Arrays.toString(ary));
// //     // }

// //     // static void multiplyUnderSixByTwo() {
// //     // int[] ary = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
// //     // for (int i = 0; i < ary.length; i++){
// //     //   if (ary[i] < 6) ary[i] = ary[i]*2;
// //     //    else ary[i] = ary[i];

// //     // }
// //     // System.out.println(Arrays.toString(ary));
// //     // }
// =======
//     // static void invertBits() {
//     //   int[] row = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//     //   System.out.println(Arrays.toString(row));
//     //   for (int i = 0; i < row.length; i++) {
//     //     row[i] = (row[i]+1) % 2;
//     //   }
//     //   System.out.println(Arrays.toString(row));
//     // }

//     // static void doFrom1to100() {
//     //   int[] ary = new int[100];
//     //   for (int i = 0; i < ary.length; i++) {
//     //   ary[i] = i + 1;
//     //   }
//     //   System.out.println(Arrays.toString(ary));
//     // }

//     // static void doFrom1to100OneMore() {
//     //   int counter = 1;
//     //   int[] ary = new int[100];
//     //   for (int i = 0; i < ary.length; i++) {
//     //   ary[i] = counter;
//     //   counter++;
//     //   }
//     //   System.out.println(Arrays.toString(ary));
//     // }

//     // static void multiplyUnderSixByTwo() {
//     // int[] ary = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//     // for (int i = 0; i < ary.length; i++){
//     //   if (ary[i] < 6) ary[i] = ary[i]*2;
//     //    else ary[i] = ary[i];

//     // }
//     // System.out.println(Arrays.toString(ary));
//     // }
// >>>>>>> 5eee55bd5a96abc980624633b7a6bf5b7a0013d3

//     // static void diagonally() {
//     //   int a = 6;
//     //     int[][] table = new int[a][a];
//     //     for (int i = 0; i < table.length; i++) {
//     //       for (int j = 0; j < table.length; j++) {
//     //          table[i][i] = 1;
//     //          table[i][a-1-i] = 1;
//     //          //if (i == j ) table[i][j] = 1;

//     //           System.out.print(table[i][j] + "  ");

//     //       }
//     //       System.out.println();
//     //  }
// <<<<<<< HEAD
//     // }

// //     // System.out.println(Arrays.deepToString(table));
// //     //}
// //     // // static int[] createArray (int len, int initialValue) {
// //     // //  int[] ary = new int[len];
// //     // //  for (int i = 0; i < ary.length; i++) {
// //     // //  ary[i] = initialValue;
// //     // //  }
// //     // //   return ary;
// //     // // }
// //     //   static void findMinMax() {

// //     //  int[] array = new int[5];
// //     //  Random random = new Random();
// //     //  int max = 0;
// //     //  int min = 100;
// //     //  for (int i = 0; i < array.length; i++) {
// //     //    array[i] = random.nextInt(100);
// //     // if (array[i] > max) max = array[i];
// //     // if (array[i] < min) min = array[i];
// //     //  }
// //     //  System.out.println("The maximal array element is: " + max);
// //     //  System.out.println("The munimal array element is: " + min);
// //     // System.out.println(Arrays.toString(array));
// //     //   }
// //     //   static void findMinMax(int[] array = createRandomeArray) {

// //     //       Random random = new Random();
// //     //  int max = 0;
// //     //  int min = 100;
// //     //  for (int i = 0; i < array.length; i++) {
// //     //    array[i] = random.nextInt(100);
// //     // if (array[i] > max) max = array[i];
// //     // if (array[i] < min) min = array[i];
// //     //  }
// //     //       System.out.println("The maximal array element is: " + max);
// //     //  System.out.println("The munimal array element is: " + min);
// //     // System.out.println(Arrays.toString(array));
// //     //   }
// =======
//     // System.out.println(Arrays.deepToString(table));
//     //}
//     // static int[] createArray (int len, int initialValue) {
//     //  int[] ary = new int[len];
//     //  for (int i = 0; i < ary.length; i++) {
//     //  ary[i] = initialValue;
//     //  }
//     //   return ary;
//     // }
//     //   static void findMinMax() {

//     //  int[] array = new int[5];
//     //  Random random = new Random();
//     //  int max = 0;
//     //  int min = 100;
//     //  for (int i = 0; i < array.length; i++) {
//     //    array[i] = random.nextInt(100);
//     // if (array[i] > max) max = array[i];
//     // if (array[i] < min) min = array[i];
//     //  }
//     //  System.out.println("The maximal array element is: " + max);
//     //  System.out.println("The munimal array element is: " + min);
//     // System.out.println(Arrays.toString(array));
//     //   }
//       static void findMinMax(int[] array = createRandomeArray) {

//           Random random = new Random();
//      int max = 0;
//      int min = 100;
//      for (int i = 0; i < array.length; i++) {
//        array[i] = random.nextInt(100);
//     if (array[i] > max) max = array[i];
//     if (array[i] < min) min = array[i];
//      }
//           System.out.println("The maximal array element is: " + max);
//      System.out.println("The munimal array element is: " + min);
//     System.out.println(Arrays.toString(array));
//       }
// >>>>>>> 5eee55bd5a96abc980624633b7a6bf5b7a0013d3
// }
//////////***********************************************
/**
 * Java 1. HomeWork #4
 *
 *@author Andrei Furman
 *@version 18.12.2021
 */
//Крестики - Нолики

