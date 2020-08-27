package l8numSys;

public class Demo_1 {
    public static void main(String[] args) {
        short a = 3; // 0000 0011 = 3
        short b = 5; // 0000 0101 = 5
       
        System.out.println( a | b); // 0000 0111 = 7
        System.out.println( a & b); // 0000 0001 = 1
        System.out.println( a ^ b); // 0000 0110 = 6   // XOR   exclusive OR
        System.out.println(~a);     // 1111 1100 = -4   // !(true) = false   !(false) = true
        System.out.println(~a & b); // 0000 0100 = 4
        System.out.println(a << 1); // 0000 0110 = 6
        System.out.println(a << 2); // 0000 1100 = 12
        System.out.println(a >> 1); // 0000 0001 = 1
    }
}
