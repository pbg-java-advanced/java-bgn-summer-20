package PayableProgram;

public class DairyProducts extends Goods{

    DairyProducts(String name, String manufacturer, double price, String date, int amount){
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.expirationDate = date;
        this.amount = amount;
    }

    public String toString(){
        return "Name:" + this.name + "\tManufacturer: " + this.manufacturer + "\tExp.date: " + this.expirationDate +
                "\tPrice: " + this.price + "leva\tAmount: " + this.amount + " pieces";
    }

}
