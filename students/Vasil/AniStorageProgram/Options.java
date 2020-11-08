package AniStorageProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;

public class Options {

    static final Scanner scanner = new Scanner(System.in);

    void addProduct() {
        Alcohol alc = new Alcohol();
        byte numberAlc;

        while(true) {
            System.out.println("How many alcohol products will add?");
            try {
                numberAlc = Byte.parseByte(scanner.nextLine());
                if(0 > numberAlc) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
        System.out.println();
        System.out.println("Valid format for adding: name-price(don't enter currency)-amount  *(do not forget the dashes)");
        System.out.println("After enter this information press 'Enter' to continue adding next alcohol product information");
        System.out.println();

        byte lastMemberofMap = 0;
        for(Map.Entry<Byte,Alcohol> temp : Alcohol.alcohols.entrySet()){
            ++lastMemberofMap;
        }

        for (byte i = 1; i <= numberAlc; i++) { // add new alcohol products

            try {
                System.out.println("Alcohol № " + i + " :");
                String newAlc = scanner.nextLine();
                String[] check = newAlc.split("\\-");

                int amount = Integer.parseInt(check[2]);

                if (!(check[0].equals("\\s+")) && check[1].matches(alc.getPriceFormat()) && check[2].matches(alc.getAmountFormat())) {
                    alc = new Alcohol(check[0].replaceAll("\\s+","\\^") /*name*/, check[1]/*price*/, Integer.parseInt(check[2])/*amount*/, Integer.parseInt(check[2])/*amount in storage*/, 0/*sold*/);
                    Alcohol.alcohols.put(++lastMemberofMap, alc); // add created object to hashmap on last position
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Invalid input for one or more fields! Try again!");
                i--;
            }
        }

        if(!(new Alcohol().getCurrency().equals("")) )
        new LoadProgram().saveNewInfo();
    }

    void addAmount() {
        for(Map.Entry<Byte,Alcohol> temp : Alcohol.alcohols.entrySet()){
            System.out.println(temp.getKey() + ". " + temp.getValue().toString());
        }

        byte validOption = 0;
        while(true) {
            System.out.println("Enter the number of alcohol:");
            try {
                byte number = Byte.parseByte(scanner.nextLine());
                if(!(Alcohol.alcohols.containsKey(number)) ){
                    throw new Exception();
                }
                validOption = number;
                break;
            }catch (Exception e){
                System.out.println("Invalid option");
            }
        }

        System.out.println("What amount should be added?");
        int newAmount = Integer.parseInt(scanner.nextLine());

        Alcohol.alcohols.get(validOption).setAmount(Alcohol.alcohols.get(validOption).getAmount() + newAmount);
        Alcohol.alcohols.get(validOption).setLastSavedInStorage(Alcohol.alcohols.get(validOption).getLastSavedInStorage() + newAmount);
        System.out.println("New amount " + Alcohol.alcohols.get(validOption).getAmount() + " of " + Alcohol.alcohols.get(validOption).getName());

        new LoadProgram().saveNewInfo();
    }

    void removeProduct() {
        for(Map.Entry<Byte,Alcohol> temp : Alcohol.alcohols.entrySet()){
            System.out.println(temp.getKey() + ". " + temp.getValue().toString());
        }

        System.out.println("Which alcohol product should be removed?");
        byte removeElement;
        while(true) {
            System.out.println("Enter the number of alcohol:");
            try {
                byte number = Byte.parseByte(scanner.nextLine());
                if(!(Alcohol.alcohols.containsKey(number)) ){
                    throw new Exception();
                }
                removeElement = number;
                break;
            }catch (Exception e){
                System.out.println("Invalid option");
            }
        }

        System.out.println(Alcohol.alcohols.get(removeElement).getName().replaceAll("\\^","") + " will not exist in list of alcohols!");

        for(byte i = removeElement; i <= Alcohol.alcohols.size(); i++){
                Alcohol.alcohols.put(i, Alcohol.alcohols.get((byte)(i+1)) );
        }

        Alcohol.alcohols.remove((byte)(Alcohol.alcohols.size()));

        new LoadProgram().saveNewInfo();
    }

    void reserveAmount() throws InterruptedException {
            System.out.println();
            for (Map.Entry<Byte, Alcohol> temp : Alcohol.alcohols.entrySet()) {
                System.out.println(temp.getKey() + ". " + temp.getValue().getName().replaceAll("\\^", " "));
            }

            byte option;
            while (true) {
                try {
                    System.out.println("Choose type of alcohol to reserve: (enter number)");
                    option = Byte.parseByte(scanner.nextLine());
                    if (!(1 <= option && option <= Alcohol.alcohols.size())) {
                        throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid option!");
                }
            }

            for (Map.Entry<Byte, Alcohol> temp : Alcohol.alcohols.entrySet()) {
                if (temp.getKey().equals(option)) {
                    System.out.println(temp.getValue().toString());

                    int reserve;
                    while (true) {
                        try {
                            System.out.println("How many pieces should be reserved?");
                            reserve = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input!");
                        }
                    }

                    int amount = temp.getValue().getAmount();

                    if (amount >= reserve) {
                        temp.getValue().setAmount(amount - reserve);
                        temp.getValue().setAmountSold(temp.getValue().getAmountSold() + reserve);
                        System.out.println("Asked amount of " + temp.getValue().getName().replaceAll("\\^", " ") + " reserved! :)");
                    } else {
                        System.err.println("Reservation cannot be performed! Storage is out of this alcohol!");
                        System.err.println("Amount available: " + amount);
                        Thread.sleep(2000);
                    }
                    break;
                }
            }

        new LoadProgram().saveNewInfo();
    }

    void changeCurrency(){
        System.out.println("Last saved currency is: " + new Alcohol().getCurrency());
        System.out.println("Enter the new currency symbols:");
        String newCurrency = scanner.nextLine();
        new Alcohol().setCurrency(newCurrency);
        System.out.println("New currency saved!");

        new LoadProgram().saveNewInfo();
    }

    void finishWork() throws FileNotFoundException {
        System.out.println("May be your shift is over for today :)");
        System.out.println("Here is what you sold:");

        File finishWork = new File("D:\\Work day result.txt");
        PrintStream printStream = new PrintStream(finishWork);
        printStream.println(new LoadProgram().getUserName());
        printStream.println(new Alcohol().getCurrency());

        for(Map.Entry<Byte,Alcohol> temp : Alcohol.alcohols.entrySet()){
            String toOutput = temp.getValue().toString() + " Last saved amount in storage: " +
                    new Alcohol().orderOutput(String.valueOf(temp.getValue().getLastSavedInStorage()) ) +
                    " Sold amount: " + new Alcohol().orderOutput(String.valueOf(temp.getValue().getAmountSold()) );

            printStream.println(toOutput);
            System.out.println(toOutput);

        }
        printStream.close();

        String answer = "";
        while(!answer.equals("no")) {
            System.out.println("Should app be closed(yes) or you have just peeked at sales till now(no)?");
            answer = scanner.nextLine().toLowerCase().replaceAll("\\s+","");
            switch (answer) {
                case "yes":
                    System.exit(0);
                case "no":
                    break;
                default:
                    System.out.println("Invalid answer!");
            }
        }


    }

}
