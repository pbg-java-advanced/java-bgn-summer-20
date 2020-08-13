package l5whileLoops;

public class Ex1 {
    public static void main(String[] args) {
        int num = 5;
//        for (int i = 1; i <= num ; i++) {
//            System.out.print(i);
//            if (i!=num){
//                System.out.print(", ");
//            }
//        }
        for (int i = 1; i < num ; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(num);
    }
}
