package MatrixArithmeticOperations;
import java.util.Scanner;

public class ArithmeticMatrix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the size of the matrices (rows and columns)
            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = scanner.nextInt();

            // Declare two matrices
            int[][] matrix1 = new int[rows][cols];
            int[][] matrix2 = new int[rows][cols];
            int[][] result = new int[rows][cols];

            // Input values for matrix1
            System.out.println("Enter elements for first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            // Input values for matrix2
            System.out.println("Enter elements for second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            // Matrix Addition
            System.out.println("\nMatrix Addition:");
            addMatrices(matrix1, matrix2, result, rows, cols);
            printMatrix(result, rows, cols);

            // Matrix Subtraction
            System.out.println("\nMatrix Subtraction:");
            subtractMatrices(matrix1, matrix2, result, rows, cols);
            printMatrix(result, rows, cols);

            // Matrix Multiplication
            System.out.println("\nMatrix Multiplication:");
            multiplyMatrices(matrix1, matrix2, result, rows, cols);
            printMatrix(result, rows, cols);

            // Close the scanner
            scanner.close();
        }

        // Method for Matrix Addition
        public static void addMatrices(int[][] matrix1, int[][] matrix2, int[][] result, int rows, int cols) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }

        // Method for Matrix Subtraction
        public static void subtractMatrices(int[][] matrix1, int[][] matrix2, int[][] result, int rows, int cols) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }

        // Method for Matrix Multiplication
        public static void multiplyMatrices(int[][] matrix1, int[][] matrix2, int[][] result, int rows, int cols) {
            // For matrix multiplication, matrix1 should be (rows x cols) and matrix2 should also be (rows x cols)
            // This assumes the matrices are square (for simplicity).
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < cols; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }

        // Method to print the matrix
        public static void printMatrix(int[][] matrix, int rows, int cols) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
