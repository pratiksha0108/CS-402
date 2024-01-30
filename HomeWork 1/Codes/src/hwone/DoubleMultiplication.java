/*
 * Name: Pratiksha Vijay Shirsat
 * Description: CS402 Homework1 Question 2(a)
 * Double Matrix Multiplication with column in the inner loop
 * Date: 01/28/2024
 */

package hwone;

import java.util.Random;

public class DoubleMultiplication {
    public static void main(String[] args) {
        // Defining dimensions of matrices 
    	int rows1 = 9400, cols1 = 500, cols2 = 1280;

        // Create matrices to hold double elements
        double[][] matrix1 = new double[rows1][cols1];
        double[][] matrix2 = new double[cols1][cols2];
        double[][] product = new double[rows1][cols2];

        // Generate random doubles for matrix elements
        Random random = new Random();
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = random.nextDouble(); // Random doubles between 0.0 and 1.0
            }
        }
        for (int i = 0; i < cols1; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = random.nextDouble();
            }
        }

        // Perform matrix multiplication using the naive algorithm with column-based inner loop
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < rows1; i++) { // Iterate over rows of matrix1
            for (int j = 0; j < cols2; j++) { // Iterate over columns of matrix2
                for (int k = 0; k < cols1; k++) { // Inner loop for column-wise multiplication
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        long endTime = System.currentTimeMillis();

        // Calculate and print execution time in seconds
        double elapsedTime = (endTime - startTime) / 1000.0;
        System.out.println("Time taken for double matrix multiplication: " + elapsedTime + " seconds");
    }
}
