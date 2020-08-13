package l5whileLoops;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

         int grade = 2;
        Scanner scanner = new Scanner(System.in);

        while(grade >= 2 && grade <= 6){
            System.out.println("Enter grade: ");
            grade = scanner.nextInt();
            switch(grade){
                case 2:
                    System.out.println("Fail");
                    break;
                case 3:
                    System.out.println("Fair");
                    break;
                case 4:
                    System.out.println("Good");
                    break;
                case 5:
                    System.out.println("Very good");
                    break;
                case 6:
                    System.out.println("Excellent");
                    break;
            }
        }
        if(grade< 2){
            System.out.println("Grade is less than 2");
        }else
            System.out.println("Grade is more than 6");

    }
}
