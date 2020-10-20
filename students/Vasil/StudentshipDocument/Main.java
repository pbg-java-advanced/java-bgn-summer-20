package StudentshipDocument_Ready;

import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Options options = new Options();
        Document document = new Document();

        Queue<Document> allNew = new LinkedList<>();
        ArrayList<Document> excellent = new ArrayList();
        LinkedList<Document> socialType = new LinkedList<>();
        Stack<Document> invalid = new Stack();
        ArrayList<Document> invalids = new ArrayList(); //helper for stack

        System.out.println();

        while(true) {
            try {
                System.out.println();
                System.out.println("Welcome to studentship system :) Please choose one of options below:");
                System.out.println("1. New request");
                System.out.println("2. Process new requests");
                System.out.println("3. Print all processed requests");
                System.out.println("4. Sort documents");
                System.out.println("5. Export processed requests");
                System.out.println("Wait for option: ");
                int option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        options.addNew(allNew);
                        break;
                    case 2:
                        options.processNew(excellent, socialType, invalid, allNew);
                        for (int i = 0; i < invalid.size(); i++) { //resave all invalid docs from stack in arraylist
                            invalids.add(invalid.pop());
                        }
                        break;
                    case 3:
                        options.printAll(excellent, socialType, invalids);
                        break;
                    case 4:
                        document.selectDocForSort(excellent, socialType, invalids);
                        break;
                    case 5:
                        options.exportProcessed(excellent, socialType, invalids);
                        break;
                    default:
                        System.out.println("Invalid option!");
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }



}
