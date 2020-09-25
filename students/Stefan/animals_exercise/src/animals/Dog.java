package animals;

public class Dog extends Animal{

    private String dogName;
    private String dogOwnersName;
    private int humanYears;
    private String breed;
    private String sex;

    public Dog(String kind, String dogName, String dogOwnersName, int humanYears, String breed, String sex) {
        super(kind);
        this.dogName = dogName;
        this.dogOwnersName = dogOwnersName;
        this.humanYears = humanYears;
        this.breed = breed;
        this.sex = sex;
    }

    public int getHumanYears() {
        return humanYears;
    }

    public static boolean dogLovesOwner (int humanYears) {
        int dogYears = humanYears*7;
        if(dogYears >= 16) {
            System.out.println("The dog loves and thinks like you");
            return true;
        } else {
            System.out.println("It is too early to say if the dog loves and thinks like you");
            return false ;
        }
    }
}
