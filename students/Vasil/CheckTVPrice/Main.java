package CheckTVPrice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws PriceErrorException{
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter price of your TV: ");
        double price = Double.parseDouble(scanner.nextLine());
        try {
            main.checkPrice(price);
        }catch(PriceErrorException e){
            System.out.println(e.getMessage());
        }
    }

    public void checkPrice(double price) throws PriceErrorException{
        if(price < 100){
           throw new PriceErrorException("TV is too cheap!");
        }else if(price > 500){
            throw new PriceErrorException("TV is too expensive!");
        }else{
            System.out.println("Good Price!");
        }
    }

}
