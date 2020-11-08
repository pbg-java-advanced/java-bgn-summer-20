package AniStorageProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;

public class LoadProgram {

    private static String userName = "";

    public void loadInfo() throws IOException {
        Alcohol alc = new Alcohol();
        File alcoholsInfo = new File("D:\\storage info.txt");

        if (alcoholsInfo.exists()) { //loading app ready for work
            Scanner scannerFile = new Scanner(alcoholsInfo);
            setUserName(scannerFile.nextLine());
            System.out.println("Hi again, " + getUserName() + "! :)");
            alc.setCurrency(scannerFile.nextLine());

            while(scannerFile.hasNext()){
                String templine = scannerFile.nextLine();
                String[] temp = templine.split("\\s+");
                Byte key = Byte.parseByte(temp[0]);
                alc = new Alcohol(temp[1], temp[2],Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]) );

                Alcohol.alcohols.put(key,alc);
            }


        } else { //loading app as a new
            System.out.println("Reserve alcohol app...");
            System.out.println();
            System.out.println("Hi there,");
            System.out.println("Let's start and add alcohols for reserving");
            System.out.println("Follow instructions... ");

            new Options().addProduct();
            ////////////////////////////////////////////

            while(true) {  //wait for valid currency format
                System.out.println("Enter type of currency: example --> BGN USD EU JY BP ...");
                String currency = Options.scanner.nextLine().replaceAll("\\s+","");
                if(!(currency.length() == 0 || currency.matches("[^A-Za-z]+")) ){
                    alc.setCurrency(currency);
                    break;
                }else{
                    System.out.println("Invalid input!");
                }
            }

            System.out.println("Enter name of user:");
            setUserName(Options.scanner.nextLine());

            alcoholsInfo.createNewFile();
            saveNewInfo();
        }
    }

    public void saveNewInfo(){
        try {
            File alcoholsInfo = new File("D:\\storage info.txt");
            PrintStream printStream = new PrintStream(alcoholsInfo);
            printStream.println(getUserName());
            printStream.println(new Alcohol().getCurrency());

            for (Map.Entry<Byte, Alcohol> temp : Alcohol.alcohols.entrySet()) {
                printStream.println(temp.getKey() + " " + temp.getValue().getName() + " " +
                        temp.getValue().getPrice() + " " + temp.getValue().getLastSavedInStorage() + " " +
                        temp.getValue().getAmount() + " " + temp.getValue().getAmountSold() );
            }

            printStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("All necessary information saved successfully!");
    }


    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
