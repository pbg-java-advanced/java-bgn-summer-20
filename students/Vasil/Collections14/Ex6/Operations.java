package Ex6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Operations {

    private static HashMap<String,String> contacts = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    void addContact(){
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:");
        String number = scanner.nextLine();
        number = checkPhoneNumber(number);
        if(number.length() == 10) {
            contacts.put(number, name);
            System.out.println("New contact saved successfully!");
        }
    }

    String checkPhoneNumber(String number){
        String numDigOnly = "";
        String firstValid = "^08[789][2-9][0-9][0-9][0-9][0-9][0-9][0-9]";
        String validation = "[0-9\\s\\-]{1,}";

        try {

            if(!(number.matches(validation)) ){
                throw new Exception();
            }

            for (char c : number.toCharArray()) {
                if (c == '-' || c == ' ') {
                    continue;
                }
                numDigOnly += c;
            }
            number = numDigOnly;

            if (!(number.length() == 10)) {
                throw new Exception();
            } else {
                if (!(number.matches(firstValid)) ) {
                    throw new Exception();
                }
            }
            return number;

        }catch (Exception e){
            System.out.println("Invalid format of phone number!\nContact not saved!");
        }

        return "";
    }


    void deleteContact() {
        if (showAllContacts()) {
            boolean deleted = false;

            System.out.println("Enter contact name for delete: ");
            String name = scanner.nextLine();
            for (Map.Entry<String, String> temp : contacts.entrySet()) {
                if (temp.getValue().equals(name)) {
                    contacts.remove(temp.getKey());
                    deleted = true;
                    System.out.println("Contact deleted!");
                }
            }

            if (!(deleted)){
                System.out.println("Contact not found!");
            }

        }
    }

    void findNameByNumber(){
        System.out.println("Enter phone number:");
        String number = scanner.nextLine();
        number = checkPhoneNumber(number);

        for(Map.Entry<String,String> temp : contacts.entrySet()){
            if(temp.getKey().equals(number)){
                orderOutputInfo(temp.getValue());
                orderOutputInfo(temp.getKey());
                System.out.println();
            }
        }

    }

    void findNumberByName(){
        System.out.println("(Shows all similar contacts names!)");
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        for(Map.Entry<String,String> temp : contacts.entrySet()){
            if(String.valueOf(temp.getValue()).contains(name)){
                orderOutputInfo(temp.getValue());
                orderOutputInfo(temp.getKey());
                System.out.println();
            }
        }

    }

    boolean showAllContacts(){
        if(contacts.isEmpty()) {
            System.out.println("Empty contacts book!");
            return false;
        }else {
            for (Map.Entry<String, String> temp : contacts.entrySet()) {
               orderOutputInfo(temp.getValue());
               orderOutputInfo(temp.getKey());
               System.out.println();
            }
            return true;
        }
    }

    void orderOutputInfo(String string){
        int width = 30;
        System.out.print(String.format("%-" + width + "s", String.format("%" + (string.length() + (width - string.length()) / 2) + "s", string)));
    }

}
