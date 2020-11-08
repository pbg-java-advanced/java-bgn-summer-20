package AniStorageProgram;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) throws Exception {

        new LoadProgram().loadInfo();
        Options options = new Options();

        while(true) {
            try {
                System.out.println("Main menu");
                System.out.println("1.Add new alcohol product");
                System.out.println("2.Add new alcohol amount");
                System.out.println("3.Remove alcohol product");
                System.out.println("4.Reserve alcohol amount");
                System.out.println("5.Change currency");
                System.out.println("6.Finish work or peek at sales");
                System.out.println("7.Close app");
                System.out.println("Choose option:");
                byte option = Byte.parseByte(Options.scanner.nextLine());

                switch (option) {
                    case 1:
                        options.addProduct();
                        break;
                    case 2:
                        options.addAmount();
                        break;
                    case 3:
                        options.removeProduct();
                        break;
                    case 4:
                        options.reserveAmount();
                        break;
                    case 5:
                        options.changeCurrency();
                        break;
                    case 6:
                        options.finishWork();
                        break;
                    case 7:
                        System.exit(0);
                }


            }catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Invalid option!");
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }



}
