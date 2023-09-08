package LabMatrix;

import java.util.Scanner;

public class Validation {

    public void Menu() {
        System.out.println("|=============Calculator Program===========|");
        System.out.println("| 1 . Addition Matrix                      |");
        System.out.println("| 2 . Subtraction Matrix                   |");
        System.out.println("| 3 . Multiplication Matrix                |");
        System.out.println("| 0 . Quit                                 |");
        System.out.println("|==========================================|");
    }

    public int getSize(String mess) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mess);
        int id = 0;
        while (true) {
            try {
                id = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Please try again!!");
            }
        }
        return id;
    }

    public int getChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice : ");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 0 && choice <= 3) {
                    break;
                } else {
                    System.out.println("Choice within 0 - 3");
                }
            } catch (Exception e) {
                System.out.println("Invalid Choice, please try again !!");
            }
        }
        return choice;
    }

    public void printMatrix(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]" + " \t");
            }
            System.out.println(" ");
        }
    }

    public int[][] getMatrix(int row, int col) {
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = getSize("Enter matrix[" + i + "][" + j + "] : ");
            }
        }
        return matrix;
    }
}
