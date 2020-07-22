package l4forLoops;

public class Ex2 {

    public static void main(String[] args) {
        String line = "*----*";

        System.out.println(line);
        for(int i=1; i<=3; i++){
            printBodySegment();
        }
        System.out.println(line);
    }


    private static void printBodySegment() {
        String line2 = "\\   /";
        String line3 = "/   \\";
        System.out.println(line2);
        System.out.println(line3);
    }
}
