import java.util.Scanner;

public class ex7_Rectangle {
    public static void mainn(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width --> ");
        int width = scanner.nextInt();
        System.out.print("Enter length --> ");
        int length = scanner.nextInt();

        forlengthTop(length);
        forwidth(width, length);
        forlengthDown(length);

    }

    public static void forwidth(int width, int length) {
        while ((width - 1) / 2 != 0) {
            for (int print = 1; print <= length; print++) {
                if (print == 1 || print == length) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            --width;
        }
        if (width - 1 == 0) {
            System.exit(0);
        }
    }

    public static void forlengthTop(int length) {
        System.out.print("┎");
        for (int print = 2; print <= length - 1; print++) {
            System.out.print("-");
        }
        System.out.print("┒");
        System.out.println();
    }

    public static void forlengthDown(int length) {
        System.out.print("┗");
        for (int print = 2; print <= length - 1; print++) {
            System.out.print("-");
        }
        System.out.print("┛");
        System.out.println();
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width --> ");
        int width = scanner.nextInt();
        System.out.print("Enter length --> ");
        int length = scanner.nextInt() * 2;
        if(width == 0 && length == 0){
            System.exit(0);
        }
        length(length,1);
        width(width, length);
    }

    public static void width(int width, int length) {
        do {
            for (int print = 1; print <= length + 3; print++) {
                if (print == 1 || print == length + 3) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            width--;
        }while ((width) / 2 != 0);
            length(length,2);
    }

    public static void length(int length,int count) {
        if (count == 1) {
            System.out.print("┎");
            for (int print = 2; print <= length + 1; print++) {
                System.out.print("-");
            }
            System.out.print("-");
            System.out.print("┒");
            System.out.println();
        } else {
            System.out.print("┗");
            for (int print = 2; print <= length + 1; print++) {
                System.out.print("-");
            }
            System.out.print("-");
            System.out.print("┛");
            System.out.println();
        }
    }

}




