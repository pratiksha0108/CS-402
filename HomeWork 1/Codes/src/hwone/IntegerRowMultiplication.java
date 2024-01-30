/*
 * Name: Pratiksha Vijay Shirsat
 * Description: CS402 Homework1 Question 2(b)
 * Integer Matrix Multiplication with row in the inner loop
 * Date: 01/28/2024
 */

package hwone;

import java.util.Random;


public class IntegerRowMultiplication {
    public static void main(String[] args) {
        // Defining dimensions of matrices 
        int rows1 = 9400, cols1 = 500, rows2 = 500, cols2 = 1280;

        // Create matrices to hold integer elements
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] product = new int[rows1][cols2];

        // Generate random integers for matrix elements
        Random random = new Random();
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = random.nextInt(100); // Random integers between 0 and 99
            }
        }
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = random.nextInt(100);
            }
        }

        // Perform matrix multiplication using the naive algorithm with row-based inner loop
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < rows1; i++) { // Iterate over rows of matrix1
            for (int j = 0; j < cols2; j++) { // Iterate over columns of matrix2
                for (int k = 0; k < cols1; k++) { // Inner loop for row-wise multiplication
                    product[i][j] += matrix1[i][k] * matrix2[k][j]; // Access rows of matrix2
                }
            }
        }
        long endTime = System.currentTimeMillis();

        // Calculate and print execution time in seconds
        double elapsedTime = (endTime - startTime) / 1000.0;
        System.out.println("Time taken for integer matrix multiplication: " + elapsedTime + " seconds");
    }
}
