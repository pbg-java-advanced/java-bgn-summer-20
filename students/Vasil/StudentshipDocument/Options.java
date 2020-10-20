package StudentshipDocument_Ready;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class Options {

    private Scanner scanner = new Scanner(System.in);

    public void addNew(Queue<Document> newDocs){
        String number;
        double success, income;
        boolean checked;

        System.out.print("How many new docs: ");
        byte numberNew = Byte.parseByte(scanner.nextLine());

        for(int i = 0; i < numberNew; i++) {
            System.out.println("Document " + (i+1) + " : ");
            while(true) {
                System.out.print("Enter document number: ");
                number = scanner.nextLine().replaceAll("\\s+", "");
                if (number.equals("")) {
                    System.out.println("Invalid document number!");
                    continue;
                }
                break;
            }
            while(true) {
                System.out.print("Enter average success of student: ");
                success = Double.parseDouble((scanner.nextLine().replaceAll("\\,","\\.")));
                if(success < 2 || 6 < success){
                    System.out.println("Invalid average success of student!");
                    continue;
                }
                break;
            }
            while(true) {
                System.out.print("Enter income: ");
                income = Double.parseDouble((scanner.nextLine().replaceAll("\\,","\\.")));
                if(income < 100){
                    System.out.println("Invalid income value!");
                    continue;
                }
                break;
            }
            checked = true;
            Document document = new Document(number, success, income, checked);
            newDocs.add(document);
        }
        System.out.println("New docs saved successfully!");
    }

    public void processNew(ArrayList<Document> excellent, LinkedList<Document>social, Stack<Document> invalid, Queue<Document>newDocs){
        while(newDocs.size() != 0){
            double success = newDocs.peek().getAverageSuccess();
            double income = newDocs.peek().getIncome();
            if((4.5 < success && success < 5.5) && (income < 450)){
                social.add(newDocs.peek());
            }else if(5.5 < success){
                excellent.add(newDocs.peek());
            }else{
                invalid.add(newDocs.peek());
            }
            newDocs.poll();
        }
        System.out.println("All new docs were processed successfully!");

    }

    public void printAll(ArrayList<Document> excellent, LinkedList<Document>social, ArrayList<Document>invalids){
        if ( !(excellent.isEmpty() && social.isEmpty() && invalids.isEmpty()) ) {
            Document document = new Document();
            System.out.println();
            System.out.println("Students with excellent: ");
            for (int i = 0; i < excellent.size(); i++) {
                System.out.println(document.toString(excellent.get(i)));
            }
            System.out.println();

            System.out.println("Students with social: ");
            for (int i = 0; i < social.size(); i++) {
                System.out.println(document.toString(social.get(i)));
            }
            System.out.println();

            System.out.println("Students with invalid docs: ");
            for (Document doc : invalids) {
                System.out.println(document.toString(doc));
            }

        }else {
            System.out.println("No docs saved!");
        }
    }

    public void sortDocs(ArrayList<Document> excellent, ArrayList<Document>social, ArrayList<Document>invalids, byte option) {
        Document document = new Document();
        byte criterion = 0;

        switch (option) {
            case 1: // compare excellent success docs
                if(excellent.isEmpty()) {
                    System.out.println("No excellent success docs found!");
                    break;
                }
                criterion = document.criterionDoc();
                    switch (criterion) {
                        case 1:
                            Collections.sort(excellent, new CompareBySuccess());
                            break;
                        case 2:
                            Collections.sort(excellent, new CompareByIncome());
                            break;
                    }
                    for (Document doc : excellent) {
                        System.out.println("Document number: " + doc.getDocumentNumber() + " Income: " + doc.getIncome()
                                + " Success: " + doc.getAverageSuccess());
                    }
            break;
            case 2: // compare social type docs
                if(social.isEmpty()) {
                    System.out.println("No social type docs found!");
                    break;
                }
                criterion = document.criterionDoc();
                switch (criterion) {
                    case 1:
                        Collections.sort(social, new CompareBySuccess());
                        break;
                    case 2:
                        Collections.sort(social, new CompareByIncome());
                        break;
                }
                for(Document doc : social){
                    System.out.println("Document number: " + doc.getDocumentNumber() + " Income: " + doc.getIncome()
                            + " Success: " + doc.getAverageSuccess());
                }
            break;
            case 3: // compare invalid docs
                if(invalids.isEmpty()) {
                    System.out.println("No invalid docs found!");
                    break;
                }
                criterion = document.criterionDoc();
                switch (criterion) {
                    case 1:
                        Collections.sort(invalids, new CompareBySuccess());
                        break;
                    case 2:
                        Collections.sort(invalids, new CompareByIncome());
                        break;
                }
                for(Document doc : invalids){
                    System.out.println("Document number: " + doc.getDocumentNumber() + " Income: " + doc.getIncome()
                            + " Success: " + doc.getAverageSuccess());
                }
            break;
        }
    }

    public void exportProcessed(ArrayList<Document> excellent, LinkedList<Document>social, ArrayList<Document>invalids){
        Document document = new Document();
        try {
            File studentshipDocs = new File("D:\\studentshipDocs.txt");
            PrintStream printStream = new PrintStream(studentshipDocs);

            for(int i = 0; i < excellent.size(); i++) {
                printStream.println(document.toString(excellent.get(i)));
            }
            printStream.println();
            for(int i = 0; i < social.size(); i++){
                printStream.println(document.toString(social.get(i)));
            }
            printStream.println();
            for(int i = 0; i < invalids.size(); i++){
                printStream.println(document.toString(invalids.get(i)));
            }
            printStream.close();
        }catch (IOException e){
            System.out.println("IOException");
        }finally {
            System.out.println("All documents saved in file with path: 'D:\\studentshipDocs'");
            System.out.println("First are with excellent success, second are - social type and last are invalid docs!");
        }
    }


}
