public class ex5 {
    public static void main(String[] args) {
        int [] array = new int [20];

        for(int count = 0; count < array.length; count++){
            array[count] = count*5;
        }

        for(int print = 0; print < array.length; print++){
            System.out.println("'" + print + "' element saves " + array[print]);
        }

    }
}
