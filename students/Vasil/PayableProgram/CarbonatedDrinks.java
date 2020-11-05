package PayableProgram;

public class CarbonatedDrinks extends Drinks{

    private boolean isCarbonated;

    CarbonatedDrinks(String name, String manufacturer, double price, boolean isCarbonated, String date, int amount){
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.isCarbonated = isCarbonated;
        this.expirationDate = date;
        this.amount = amount;

    }

    public String toString(){
        return "Name:" + this.name + "\tManufacturer: " + this.manufacturer + "\tExp.date: " + this.expirationDate +
                " \tPrice: " + this.price + "leva\tCarbonated: " + this.isCarbonated + "\tAmount: " + this.amount + " pieces";
    }

}
