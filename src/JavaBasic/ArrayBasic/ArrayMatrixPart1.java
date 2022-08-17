package JavaBasic.ArrayBasic;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class ArrayMatrixPart1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //     System.out.println("Input Any Number: ");


        int[][] B = new int[2][3];
        int[][] A = new int[2][3];
        int[][] C = new int[2][3];

        System.out.println("Input Elements for A Matrix: ");
        // gating input for A matrix;
        for (int row = 0; row < 2; row++) {
            for (int columns = 0; columns < 3; columns++) {
                System.out.printf("A [%d] [%d] = ", row, columns);
                A[row][columns] = input.nextInt();
            }

        }

        // gating input for B matrix;
        System.out.println("Input Elements for B Matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int columns = 0; columns < 3; columns++) {
                System.out.printf("B [%d] [%d] = ", row, columns);
                B[row][columns] = input.nextInt();
            }

        }

        // Printing  A matrix
        for (int row = 0; row < 2; row++) {
            for (int columns = 0; columns < 3; columns++) {
                System.out.print("\t " + A[row][columns]);

            }
            System.out.println();
        }


        // Printing  B matrix
        System.out.print("B = ");
        for (int row = 0; row < 2; row++) {
            for (int columns = 0; columns < 3; columns++) {
                System.out.print("\t " + B[row][columns]);

            }
            System.out.println();
        }

        // Add A & B Matrix ;

        System.out.print("B = ");
        for (int row = 0; row < 2; row++) {
            for (int columns = 0; columns < 3; columns++) {
                System.out.print("\t " + (A[row][columns] +B [row] [columns]));

            }
            System.out.println();
        }

    }
}
