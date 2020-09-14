import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number as a limit: ");
        int limit = scanner.nextInt();
        int arrayColomns = 20;
        int arrayRows = 20;
        int[][] arrayPrimeNumbers = new int[arrayRows][arrayColomns];

        int startNumberCheck = 2;
        boolean continueCheck = true;

        for(int row = 0; row < arrayRows; row++) {
            for(int colomn = 0; colomn < arrayColomns; colomn++) {
                colomn = checkNumber(startNumberCheck,arrayPrimeNumbers,row,colomn,limit);
                    ++startNumberCheck;
                if(startNumberCheck > limit){
                    continueCheck = false;
                    break;
                }
            }
            if(continueCheck == false){
                break;
            }
        }
        printArrayPrimeNumbers(arrayPrimeNumbers,arrayRows,arrayColomns);

    }

    public static int checkNumber(int startNumberCheck, int[][] arrayPrimeNumbers, int row, int colomn, int limit){
        //initializr first element of the array to 2
        if(startNumberCheck == 2){
            arrayPrimeNumbers[row][colomn] = startNumberCheck;
        }
        //save the number in the array if it is prime
        boolean answear = checkifPrime(startNumberCheck);
        if(answear == false){
            arrayPrimeNumbers[row][colomn] = startNumberCheck;
        }
        //if the number was 'prime' the cell if busy (do nothing)
        if(arrayPrimeNumbers[row][colomn] == 0){
            --colomn;
        }
        return colomn;
    }

    public static boolean checkifPrime(int startNumberCheck) {
        boolean findAnotherNumberToNonPrime = false;
        for (int i = 2; i <= startNumberCheck / 2; ++i) {
            // condition for nonprime number
            if (startNumberCheck % i == 0) {
                findAnotherNumberToNonPrime = true;
                break;
            }
        }
        return findAnotherNumberToNonPrime;
    }

    public static void printArrayPrimeNumbers(int[][] arrayPrimeNumbers,int arrayRows, int arrayColomns){
        for(int row = 0; row < arrayRows; row++) {
            for(int colomn = 0; colomn < arrayColomns; colomn++) {
                if(arrayPrimeNumbers[row][colomn] == 0){
                    System.exit(0);
                }
                System.out.print(arrayPrimeNumbers[row][colomn] + "\t\t");
                if(colomn == arrayColomns-1){
                    System.out.println();
                }

            }
        }
    }
}

