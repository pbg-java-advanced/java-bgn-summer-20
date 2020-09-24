package Animals;

public class Cat extends Animal{

    private String name;
    private String ownerName;
    private String breed;
    private String gender;

    public Cat(String name, String ownerName,String breed, String gender) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;
        this.gender = gender;
    }

    public void checkAge(double age){
        if((Math.log(age)+31) >= 16){
            System.out.println("Your cat does love you and even think like you!");
        }else{
            System.out.println("Your cat does love you but it is not old enough to understand you!");
        }
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }
}
