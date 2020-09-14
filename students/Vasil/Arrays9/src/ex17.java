import java.util.Scanner;

public class ex17 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        declareArray();
    }

    //create an array
    public static void declareArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rows will have the matrix? --> ");
        int rows = scanner.nextInt();
        System.out.print("How many colomns will have the matrix? --> ");
        int colomns = scanner.nextInt();
        int[][] matrix = new int[rows][colomns];
        getValuesAndSave(matrix, rows, colomns);

    }

    //fill array elements with values from user
    public static void getValuesAndSave(int[][] matrix, int rows, int colomns){
        int elementNumber = 1;
        for(int row = 0; row < rows; row++){
            for(int colomn = 0; colomn < colomns; colomn++){
                System.out.print("Enter value for element " + elementNumber++ + " : ");
                matrix[row][colomn] = scanner.nextInt();
            }

        }
        startFindingMaxSquare(matrix,rows,colomns);

    }

    //calculate the sum of all small (2x2) matrices
    public static void startFindingMaxSquare(int[][] matrix, int rows, int colomns){
        int[][] sumsOfAllMatrices = new int[rows-1][colomns-1];

        //get number of row by order
        for(int getRow = 0; getRow < rows-1; getRow++){

            //get number of colomn by order
            for(int getColomn = 0; getColomn < colomns-1; getColomn++){

                //get needed elements, calculate the sum and save the sum in the array
                int sumOfElementsUp = matrix[getRow][getColomn++] + matrix[getRow][getColomn];
                int sumOfElementsDown = matrix[++getRow][--getColomn] + matrix[getRow][++getColomn];
                int sumOfThem = sumOfElementsUp + sumOfElementsDown;

                // loops variables get their old values
                getRow--;
                getColomn--;

                sumsOfAllMatrices[getRow][getColomn] = sumOfThem;

            }
        }
        searchForMaxSumIndeces(sumsOfAllMatrices,rows,colomns);

    }

    //search for max sum and save its indeces
    public static void searchForMaxSumIndeces(int[][] sumsOfAllMatrices, int rows, int colomns){
        int row = 0;
        int colomn = 0;
        int saveMaxSum = sumsOfAllMatrices[0][0];
        //start finding the max sum
        for(int getRowIndex = 0; getRowIndex < rows-1; getRowIndex++){
            for(int getColomnIndex = 0; getColomnIndex < colomns-1; getColomnIndex++){
                if(sumsOfAllMatrices[getRowIndex][getColomnIndex] > saveMaxSum){
                    saveMaxSum = sumsOfAllMatrices[getRowIndex][getColomnIndex];
                    //if max sum is found row and colomn get element indeces
                    row = getRowIndex;
                    colomn = getColomnIndex;
                }
            }
        }
        printNeededInfo(saveMaxSum, row, colomn);

    }

    //print what is needed
    public static void printNeededInfo(int saveMaxSum, int row, int colomn){
        System.out.println("The maximum sum is: " + saveMaxSum + " at starting point of matrix [ " + ++row + ", " + ++colomn + " ]");
    }

}
