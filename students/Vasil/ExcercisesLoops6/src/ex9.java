import java.text.DecimalFormat;

public class ex9 {
    //////////////////////////////////////////////////////    Programa za spestoven vlog v banka
    private static DecimalFormat df2 = new DecimalFormat("0.00");
    public static final double InterestPercent = 6.5/100;
    public static int year;
    public static double CurrentBalance = 1000;
    public static double CurrentInterest;
    public static double NewDeposit = 0;
    public static double NewBalance = 0;



    public static void main(String[] args) {
        System.out.println();
        System.out.println("Year Current Balance Interest New Deposit New Balance");
        printInfo();
    }

    public static void printInfo(){
        for(year = 2000; year <= 2024; year++) {
            System.out.print(year);
            System.out.print("\t\t ");
            System.out.print(df2.format(CurrentBalance));
            System.out.print("\t");
            System.out.print(df2.format(ForCurrentInterest()));
            System.out.print("\t\t");
            if(year == 2000) {
                System.out.print(df2.format(NewDeposit));
            }else{
                System.out.print(df2.format(NewDeposit = 100));
            }
            System.out.print("\t  ");
            ForNewBalance();
        }
    //
    }

    public static double ForCurrentInterest(){
        CurrentInterest = CurrentBalance*InterestPercent;
        return CurrentInterest;
    }

    public static void ForNewBalance(){
        NewBalance = CurrentBalance + (CurrentInterest + NewDeposit);
        System.out.println(df2.format(NewBalance));
        CurrentBalance = NewBalance;
    }

}
