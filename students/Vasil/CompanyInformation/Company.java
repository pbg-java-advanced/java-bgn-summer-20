package CompanyInformation;

import java.util.Scanner;

public class Company {

    private static Scanner scanner = new Scanner(System.in);
    private static String companyName;
    private static String foundationDate;
    private static String bulstatNumber;

    public void Company(){

        System.out.print("Enter the company name: ");
        this.companyName = scanner.nextLine();

        while(true) {
            System.out.print("Enter the date of foundation - valid format(mm.dd.yy): ");
            foundationDate = scanner.nextLine();
            if(checkFoundationDate(foundationDate) == true) {
                break;
            }

        }

        while(true) {
            System.out.print("Enter the bulstat number: ");
            bulstatNumber = scanner.nextLine();
            if (bulstatNumber.length() == 10) {
                break;
            } else {
                System.out.println("Invalid input! Bulstat number should contain ten symbols!");
            }
        }

    }

    private boolean checkFoundationDate(String date){
        boolean isValidDate = true;
        int month = Integer.valueOf(date.substring(0,2));
        int day = Integer.valueOf(date.substring(3,5));
        int year = Integer.valueOf(date.substring(6));

            if(0 < month && month < 13){
               if(checkDayNumberByMonth(month,day) == true){
                   if(1800 < year && year < 2021){

                   }else{
                       System.out.println("No company registered before 1800!");
                       isValidDate = false;
                   }
                }else{
                   System.out.println("Invalid day input!");
                   isValidDate = false;
               }
            }else{
                System.out.println("Invalid month input!");
                isValidDate = false;
            }
            return isValidDate;
    }

    private boolean checkDayNumberByMonth(int month, int day){
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(0 < day && day < 32){ return true; }
            case 4:
            case 6:
            case 9:
            case 11:
                if(0 < day && day < 31){ return true; }
            default:
                if(0 < day && day < 28){ return true; }
        }

        return false;
    }

}
