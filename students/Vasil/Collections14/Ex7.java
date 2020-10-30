import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        Ex7 ex7 = new Ex7();
        byte number;

        while(true) {
            try {
                System.out.println("How many words will you enter?");
                number = Byte.parseByte(scanner.nextLine());
                break;
            }catch (Exception e){
                System.out.println("Invalid input!");
            }
        }
        for(byte i = 0; i < number; i++){
            System.out.println("Enter word (" + (i+1) + "):");
            list.add(scanner.nextLine());
        }

        ex7.removeEvenLength(list);
    }

    void removeEvenLength(ArrayList<String> list){

        System.out.println("Before removing:\n" + list.toString());

        for(byte i = 0; i < list.size(); i++){
            if(list.get(i).length() % 2 == 0){
                list.remove(i);
            }
        }

        System.out.println("After removing:\n" + list.toString());
    }


}
