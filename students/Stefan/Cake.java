package Cakes;

public class Cake {
    private String name;
    private int nesessarySugarQuantity = 100; // grams
    private int necessaryFlourQuantity = 500; // grams
    private int necessaryColorCake = 50; // grams
    private int necessaryFiller = 150;//grams
    private double price;

    public Cake() {
    }

    public Cake(String name, int nesessarySugarQuantity, int necessaryFlourQuantity, int necessaryColorCake, int necessaryFiller, double price) {
        this.name = name;
        if(nesessarySugarQuantity > this.nesessarySugarQuantity) {
            System.err.println("ERROR - the entered sugar quantity is more than the necessary one!");
        }else {
            this.nesessarySugarQuantity = nesessarySugarQuantity;
        }
        this.necessaryFlourQuantity = necessaryFlourQuantity;
        this.necessaryColorCake = necessaryColorCake;
        this.necessaryFiller = necessaryFiller;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNesessarySugarQuantity() {
        return nesessarySugarQuantity;
    }

    public void setNesessarySugarQuantity(int nesessarySugarQuantity) {
        this.nesessarySugarQuantity = nesessarySugarQuantity;
    }

    public int getNecessaryFlourQuantity() {
        return necessaryFlourQuantity;
    }

    public void setNecessaryFlourQuantity(int necessaryFlourQuantity) {
        this.necessaryFlourQuantity = necessaryFlourQuantity;
    }

    public int getNecessaryColorCake() {
        return necessaryColorCake;
    }

    public void setNecessaryColorCake(int necessaryColorCake) {
        this.necessaryColorCake = necessaryColorCake;
    }

    public int getNecessaryFiller() {
        return necessaryFiller;
    }

    public void setNecessaryFiller(int necessaryFiller) {
        this.necessaryFiller = necessaryFiller;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
