import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {
        createMatrix();
    }

    public static void createMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rows will contain the matrix? --> ");
        int rowsInfo = scanner.nextInt();
        System.out.print("How many colomns will contain the matrix? --> ");
        int colomnsInfo = scanner.nextInt();

        //create the array
        int[][] matrix = new int[rowsInfo][colomnsInfo];

        fillMatrixElements(rowsInfo, colomnsInfo, matrix);
        //
    }

    public static void fillMatrixElements(int rowsInfo, int colomnsInfo, int[][] matrix) {
        int number = 1, oldValueNumber;

        for (int getRowIndex = 0; getRowIndex < rowsInfo; getRowIndex++) {
            oldValueNumber = number;
            for (int getColomnIndex = 0; getColomnIndex < colomnsInfo; getColomnIndex++) {
                matrix[getRowIndex][getColomnIndex] = number;
                number += 4;

            }
            number = ++oldValueNumber;
        }

        //save length of last number to size matrix right

        printMatrix(rowsInfo, colomnsInfo, matrix);
        //
    }


    public static void printMatrix(int rowsInfo, int colomnsInfo, int[][] matrix) {
        //get length of last number of matrix
        int lastElement = matrix[rowsInfo-1][colomnsInfo-1];
        int lengthNumber = 0;
        while(lastElement > 0 ){
            lengthNumber++;
            lastElement /= 10;
        }

        forBounds(colomnsInfo,lengthNumber);
        for (int row = 0; row < rowsInfo; row++) {
            System.out.print("|");
            for (int colomn = 0; colomn < colomnsInfo; colomn++) {
                System.out.print(String.format("%02d", matrix[row][colomn]) + "|");
            }
            System.out.println();
            forBounds(colomnsInfo,lengthNumber);
        }
        //
    }

    public static void forBounds(int colomnsInfo,int lengthNumber) {
        switch (lengthNumber) {
            case 2:
            case 3:
            for (int print = 0; print < colomnsInfo; print++) {
                System.out.print("---");
            }
            System.out.println("-");
            break;

        }
    }
}


