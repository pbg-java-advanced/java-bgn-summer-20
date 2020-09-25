package animals;

public class Cat extends Animal{

    private String catName;
    private String catOwnersName;
    private int years;
    private String breed;
    private String sex;


    public Cat(String kind, String catName, String catOwnersName, int years, String breed, String sex) {
        super(kind);
        this.catName = catName;
        this.catOwnersName = catOwnersName;
        this.years = years;
        this.breed = breed;
        this.sex = sex;
    }

    public int getYears() {
        return years;
    }

    public static boolean catLovesOwner (int humanYears) {
        int dogYears = humanYears*7;
        if(dogYears >= 16) {
            System.out.println("The cat loves and thinks like you");
            return true;
        } else {
            System.out.println("It is too early to say if the cat loves and thinks like you");
            return false;
        }
    }
}
