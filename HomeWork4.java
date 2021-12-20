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

public class HomeWork4 {

    final char CHAR_X = 'x';
    final char CHAR_O = 'O';
    final char CHAR_VOID = '*';
    char[][]field;
    Scanner sc;
    Random random;

    public static void main(String[]args) {
        new HomeWork4().game();

    }

    HomeWork4() {
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
        int x, y;
        do {
            System.out.println("Please enter X →. The numbers from 1 to 3:   ");
            x = sc.nextInt() - 1;
            System.out.println("Please enter Y ↓. The numbers from 1 to 3:   ");
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        field[y][x] = CHAR_X;
    }

    void turnComputer() {
        int x,y;
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
