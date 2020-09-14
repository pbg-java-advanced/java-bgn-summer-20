
public class ex1 {
        public static void main(String[] args) {
            for(int i = 1; i <= 2; i++) {
                Top();
                Side();
            }
        }
        public static void Top (){
            System.out.println("+------+");
        }
        public static void Side () {
            for (int i = 1; i <= 2; i++) {
                System.out.println("|      |");
            }
            Top();
            System.out.println();
        }
    }

