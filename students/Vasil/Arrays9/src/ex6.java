import java.util.Scanner;

public class ex6 {
    public static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        checkArrays();
    }

    public static void checkArrays(){
        System.out.print("Enter number elements for first array: ");
        int numberElementsFirstArr = read.nextInt();
        int firstArr [] = new int [numberElementsFirstArr];

        // save values for first array
        for(int i = 0; i < firstArr.length; i++){
            System.out.print("Enter value for element " + ++i + " of the array: ");
            firstArr[--i] = read.nextInt();
        }
        System.out.println();

        System.out.print("Enter number elements for second array: ");
        int numberElementsSecondArr = read.nextInt();
        int secondArr [] = new int [numberElementsSecondArr];

        // save values for second array
        for(int i = 0; i < secondArr.length; i++){
            System.out.print("Enter value for element " + ++i + " of the array: ");
            secondArr[--i] = read.nextInt();
        }
        System.out.println();

        checkEqualValues(firstArr,secondArr);
    }

    public static void checkEqualValues(int [] firstArr, int [] secondArr){
        if(firstArr.length > secondArr.length){
            for(int check = 0; check < firstArr.length; check++){

                if(check > secondArr.length-1 || secondArr[check] != firstArr[check]){
                    System.out.println("Arrays are not the same!");
                    System.exit(0);
                }
            }
            System.out.println("Arrays are same!");

        }else{
            for(int check = 0; check < secondArr.length; check++){
                if(check > firstArr.length-1 || firstArr[check] != secondArr[check]){
                    System.out.println("Arrays are not same!");
                    System.exit(0);
                }
            }
            System.out.println("Arrays are same!");
        }
    }
}
