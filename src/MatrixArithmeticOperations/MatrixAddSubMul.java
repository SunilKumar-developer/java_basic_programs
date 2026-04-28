package MatrixArithmeticOperations;

import java.util.Scanner;

public class MatrixAddSubMul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=scan.nextInt();
        System.out.println("Enter the number of columns");
        int columns= scan.nextInt();
        int[][] matrix1=new int[rows][columns];
        int[][] matrix2=new int[rows][columns];
        int[][] result=new int[rows][columns];
        System.out.println("Enter the elements for 1st matrix");
        for(int i= 0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print("Enter the elements[" +(i+1)+(j+1)+ "]");
                matrix1[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter the element of 2nd matrix");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print("Enter the elements[" +(i+1)+(j+1)+ "]");
                matrix2[i][j]= scan.nextInt();
            }
        }
        System.out.println("\n Addition");
        addmatrix(matrix1,matrix2,result,rows,columns);
        printMatrix(result,rows,columns);

        System.out.println("\n Subtraction:");
        subtractmatrix(matrix1,matrix2,result,rows,columns);
        printMatrix(result,rows,columns);

        System.out.println("\n Multipication");
        multiplicatonmatrix(matrix1,matrix2,result,rows,columns);
        printMatrix(result,rows,columns);

    }

    public static void addmatrix(int[][] matrix1,int[][] matrix2,int[][] result, int rows, int columns) {
        for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
    }
    public static void subtractmatrix(int[][] matrix1,int[][] matrix2,int[][] result, int rows, int columns) {
        for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
    }
    public static void multiplicatonmatrix(int[][] matrix1,int[][] matrix2,int[][] result, int rows, int columns) {
        for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                result[i][j]=0;
                for (int k=0;k<columns;k++){
                    result[i][j]=matrix1[i][j]+matrix2[i][j];

                }
            }
        }
    }
    public static void printMatrix(int[][] result,int rows,int columns){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(+result[i][j]+ " ");
            }
        }
        System.out.println();
    }
}
