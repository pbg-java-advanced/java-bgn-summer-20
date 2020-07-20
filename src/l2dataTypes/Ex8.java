package l2dataTypes;

public class Ex8 {
    public static void main(String[] args) {
        int a1 = 3;
        int a2 = 5;
        System.out.println("a1 = " + a1 + ", a2 = " + a2);

        int temp = a1;
        a1 = a2;
        a2 = temp;

        System.out.println("a1 = " + a1 + ", a2 = " + a2);
    }
}
