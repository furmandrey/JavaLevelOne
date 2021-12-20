<<<<<<< HEAD
import java.util.*;


public class ForTest {
    //public static void main(String[]args) {
      //  Scanner sc = new Scanner(System.in);
      //   System.out.println("Введите число: ");
      //   int a = sc.nextInt();
      //   a *= 2;
      //   System.out.println("Введенное вами число, умноженное на 2, равно " + a);
      //   sc.close();
 //public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      
     int[] arr = createRandomeArray(10);
      printArray(arr);
  
      
      
      //printArray(arr);  // Массив передается как параметр метода, переданный параметр является адресом памяти массива
      //diagonally();
    }
  public static void printArray(int[] arr) {
   //int[] arr = {1, 2, 3, 4};
          for (int i = 0; i < arr.length; i++) {
           //System.out.print('1');
           //arr[i] = 1;
           System.out.print(arr[i] + " ");
       }
       //System.out.println();
    }    

        // int d = getNumberFromScanner("Введите число в пределах от 5 до 10", 5, 10);
        // System.out.println("d = " + d);
        // // invertBits();
=======
import java.util.Arrays;
import java.util.Random;

public class ForTest {
    public static void main(String[]args) {
        // invertBits();
>>>>>>> 5eee55bd5a96abc980624633b7a6bf5b7a0013d3
        // doFrom1to100();
        // doFrom1to100OneMore();
        // multiplyUnderSixByTwo();
        //diagonally();
<<<<<<< HEAD
//         //System.out.println(Arrays.toString(createArray(12, 1)));
//         // createArray(12, 1);
//         // findMinMax(createRandomeArray);
//         createRandomeArray(10);
       
//         // //   int counter = 1;
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
//     public static void printArr(int[] arr) {
//     for (int i = 0; i < arr.length; i++) {
         
//             System.out.print(arr[i]);
//         }
//         System.out.println();
//     }



//     //  static int getNumberFromScanner(String message, int min, int max) {
//     //     int x;
//     //     do {
//     //         System.out.println(message);
//     //         x = sc.nextInt();
//     //     } while (x < min || x > max);
//     //     return x;
//     // }

=======
        //System.out.println(Arrays.toString(createArray(12, 1)));
        //createArray(12, 1);
        findMinMax(createRandomeArray);
        createRandomeArray(100);
        //   int counter = 1;
        //   int[][] table = new int[4][4];
        //   for (int i = 0; i < 4; i++) {
        //       for (int j = 0; j < 4; j++) {
        //           table[i][j] = counter;
        //           System.out.print(table[i][j] + "    ");
        //           //counter++;
        //       }
        //       System.out.println();
        //   }
        // System.out.println(Arrays.deepToString(table));
    }
>>>>>>> 5eee55bd5a96abc980624633b7a6bf5b7a0013d3
    static int[] createRandomeArray (int len) {
        int[] array = new int[len];
        Random random = new Random();
            for (int i = 0; i < array.length; i++) {
<<<<<<< HEAD
            array[i] = random.nextInt(1000);   
=======
            array[i] = random.nextInt(100);   
>>>>>>> 5eee55bd5a96abc980624633b7a6bf5b7a0013d3
        }
        //System.out.println(Arrays.toString(array));
        return(array);
    }

<<<<<<< HEAD
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
=======
    // static void invertBits() {
    //   int[] row = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    //   System.out.println(Arrays.toString(row));
    //   for (int i = 0; i < row.length; i++) {
    //     row[i] = (row[i]+1) % 2;
    //   }
    //   System.out.println(Arrays.toString(row));
    // }

    // static void doFrom1to100() {
    //   int[] ary = new int[100];
    //   for (int i = 0; i < ary.length; i++) {
    //   ary[i] = i + 1;
    //   }
    //   System.out.println(Arrays.toString(ary));
    // }

    // static void doFrom1to100OneMore() {
    //   int counter = 1;
    //   int[] ary = new int[100];
    //   for (int i = 0; i < ary.length; i++) {
    //   ary[i] = counter;
    //   counter++;
    //   }
    //   System.out.println(Arrays.toString(ary));
    // }

    // static void multiplyUnderSixByTwo() {
    // int[] ary = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    // for (int i = 0; i < ary.length; i++){
    //   if (ary[i] < 6) ary[i] = ary[i]*2;
    //    else ary[i] = ary[i];

    // }
    // System.out.println(Arrays.toString(ary));
    // }
>>>>>>> 5eee55bd5a96abc980624633b7a6bf5b7a0013d3

    // static void diagonally() {
    //   int a = 6;
    //     int[][] table = new int[a][a];
    //     for (int i = 0; i < table.length; i++) {
    //       for (int j = 0; j < table.length; j++) {
    //          table[i][i] = 1;
    //          table[i][a-1-i] = 1;
    //          //if (i == j ) table[i][j] = 1;

    //           System.out.print(table[i][j] + "  ");

    //       }
    //       System.out.println();
    //  }
<<<<<<< HEAD
    // }

//     // System.out.println(Arrays.deepToString(table));
//     //}
//     // // static int[] createArray (int len, int initialValue) {
//     // //  int[] ary = new int[len];
//     // //  for (int i = 0; i < ary.length; i++) {
//     // //  ary[i] = initialValue;
//     // //  }
//     // //   return ary;
//     // // }
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
//     //   static void findMinMax(int[] array = createRandomeArray) {

//     //       Random random = new Random();
//     //  int max = 0;
//     //  int min = 100;
//     //  for (int i = 0; i < array.length; i++) {
//     //    array[i] = random.nextInt(100);
//     // if (array[i] > max) max = array[i];
//     // if (array[i] < min) min = array[i];
//     //  }
//     //       System.out.println("The maximal array element is: " + max);
//     //  System.out.println("The munimal array element is: " + min);
//     // System.out.println(Arrays.toString(array));
//     //   }
=======
    // System.out.println(Arrays.deepToString(table));
    //}
    // static int[] createArray (int len, int initialValue) {
    //  int[] ary = new int[len];
    //  for (int i = 0; i < ary.length; i++) {
    //  ary[i] = initialValue;
    //  }
    //   return ary;
    // }
    //   static void findMinMax() {

    //  int[] array = new int[5];
    //  Random random = new Random();
    //  int max = 0;
    //  int min = 100;
    //  for (int i = 0; i < array.length; i++) {
    //    array[i] = random.nextInt(100);
    // if (array[i] > max) max = array[i];
    // if (array[i] < min) min = array[i];
    //  }
    //  System.out.println("The maximal array element is: " + max);
    //  System.out.println("The munimal array element is: " + min);
    // System.out.println(Arrays.toString(array));
    //   }
      static void findMinMax(int[] array = createRandomeArray) {

          Random random = new Random();
     int max = 0;
     int min = 100;
     for (int i = 0; i < array.length; i++) {
       array[i] = random.nextInt(100);
    if (array[i] > max) max = array[i];
    if (array[i] < min) min = array[i];
     }
          System.out.println("The maximal array element is: " + max);
     System.out.println("The munimal array element is: " + min);
    System.out.println(Arrays.toString(array));
      }
>>>>>>> 5eee55bd5a96abc980624633b7a6bf5b7a0013d3
}
