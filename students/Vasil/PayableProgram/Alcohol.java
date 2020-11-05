package PayableProgram;

public class Alcohol extends Drinks{

    private double promiles;

    Alcohol(String name, double promiles, String manufacturer, double price, String date, int amount) {
        this.name = name;
        this.promiles = promiles;
        this.manufacturer = manufacturer;
        this.price = price;
        this.expirationDate = date;
        this.amount = amount;
    }



    public String toString(){
        return "Name:" + this.name + "\tManufacturer: " + this.manufacturer + "\tExp.date: " + this.expirationDate +
                "\tPrice: " + this.price + "leva\tPromiles in: " + this.promiles + "\tAmount: " + this.amount + " pieces";
    }

}
