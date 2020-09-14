public class ex7 {
    public static void main(String[] args) {
        char start = 1040;
        char end = 1103;

        for(int count = start; count <= end; count++){
            System.out.println("This number code " + "("+(int)count + ") "+ " contains " + "'" + (char)count + "'");
        }
    }
}
