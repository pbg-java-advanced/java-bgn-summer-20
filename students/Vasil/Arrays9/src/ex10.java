import java.util.Scanner;

public class ex10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] readyArray = merge(Array1(),Array2(), Array3());
        System.out.print("The mix of your two arrays is: [ ");
        for(int print = 0; print < readyArray.length; print++) {
            System.out.print(readyArray[print]);
            if (print != readyArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");

    }

    public static int[] Array1(){
        System.out.print("Enter number for reserved elements (first array): ");
        int numReserved = scanner.nextInt();
        int firstArray [] = new int [numReserved];

        for(int count = 0; count < firstArray.length; count++){
            System.out.print("Enter value for " + ++count + " element of the array: ");
            firstArray[--count] = scanner.nextInt();
        }
        System.out.println();
        return firstArray;
    }

    public static int[] Array2(){
        System.out.print("Enter number for reserved elements (second array): ");
        int numReserved = scanner.nextInt();
        int secondArray [] = new int [numReserved];

        for(int count = 0; count < secondArray.length; count++){
            System.out.print("Enter value for " + ++count + " element of the array: ");
            secondArray[--count] = scanner.nextInt();
        }
        System.out.println();
        return secondArray;
    }

    public static int[] Array3(){
        System.out.print("Enter number for reserved elements (third array): ");
        int numReserved = scanner.nextInt();
        int third [] = new int [numReserved];

        for(int count = 0; count < third.length; count++){
            System.out.print("Enter value for " + ++count + " element of the array: ");
            third[--count] = scanner.nextInt();
        }
        System.out.println();
        return third;
    }


//merging arrays
    public static int[] merge(int[] firstArray, int[] secondArray, int[] thirdArray){
        int mixArray [] = new int [firstArray.length + secondArray.length + thirdArray.length];

        //first array
        for(int save = 0; save < firstArray.length; save++){
            mixArray[save] = firstArray[save];
        }
        //second array
        for(int save = firstArray.length, secArrayEl = 0;/*condition*/ save < (firstArray.length + secondArray.length) /*end*/; save++, secArrayEl++){
            mixArray[save] = secondArray[secArrayEl];
        }
        //third array
        for(int save = (firstArray.length + secondArray.length), thiArrayEl = 0; /*condition*/ save < mixArray.length /*end*/ ; save++, thiArrayEl++){
              mixArray[save] = thirdArray[thiArrayEl];
        }
        return mixArray;
    }
}

