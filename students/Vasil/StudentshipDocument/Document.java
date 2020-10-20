package StudentshipDocument_Ready;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Document {

    private String documentNumber;
    private double averageSuccess;
    private double income;
    private boolean checked;

    public Document(){}

    public Document(String documentNumber, double averageSuccess, double income, boolean checked) {
        this.documentNumber = documentNumber;
        this.averageSuccess = averageSuccess;
        this.income = income;
        this.checked = checked;
    }

    public String toString(Document document){
        return "Document number: " + document.getDocumentNumber() + " Average success: " + document.getAverageSuccess() +
                " Income: " + document.getIncome();
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public double getAverageSuccess() {
        return averageSuccess;
    }

    public double getIncome() {
        return income;
    }

    public boolean isChecked() {
        return checked;
    }



    /////// used in Options class - sortDocs method
    public void selectDocForSort(ArrayList<Document> excellent, LinkedList<Document> social, ArrayList<Document>invalids){
        Options options = new Options();
        Scanner scanner = new Scanner(System.in);

        ArrayList<Document> socialType = new ArrayList<>(); // use it for better control over data
        socialType.addAll(social);

        System.out.println("Which documents to be sorted?");
        System.out.println("1.Excellent success");
        System.out.println("2.Social type");
        System.out.println("3.Invalid docs");
        while(true) {
            System.out.println("Enter:");
            try {
                byte option = Byte.parseByte(scanner.nextLine());
                if(0 < option && option < 4) {
                    options.sortDocs(excellent, socialType, invalids, option);
                    break;
                }else {
                    System.out.println("Invalid option!");
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }

    }

    public byte criterionDoc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criterion?");
        System.out.println("1.Success");
        System.out.println("2.Income");
        while (true) {
            try {
                System.out.println("Enter:");
                byte criterion = Byte.parseByte(scanner.nextLine());
                switch (criterion) {
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    default:
                        System.out.println("Invalid option!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            }
        }
    }



}
