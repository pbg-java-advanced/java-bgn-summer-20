package l3conditionals;

public class Demo_5 {
    public static void main(String[] args) {
        int number = 14;
        switch (number) {
            case 1:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("Числото не е просто!");
                break;
            case 2:
            case 3:
            case 5:
            case 7:
                System.out.println("Числото е просто!");
                break;
            default:
                System.out.println("Не знам какво е това число!");
        }
    }
}
