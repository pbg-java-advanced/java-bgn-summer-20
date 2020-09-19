package exCandy;

public class Candy {
    private String name;
    private double sugar = 500;
    private double flour = 300;
    private double colorant = 0.5;
    private double filling = 300;
    private double price;

    public Candy(String name, double sugar, double flour, double colorant, double filling, double price){
        this.name = name;
        if(sugar < this.sugar){
            this.sugar = sugar;
        }

        if(flour < this.flour){
            this.flour = flour;
        }

        if(colorant < this.colorant){
            this.colorant = colorant;
        }

        if(filling < this.filling){
            this.filling = filling;
        }

        this.price = price;
    }

    Candy(){
    }

    Candy(Candy candy) {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSugar() {
        return sugar;
    }
    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getFlour() {
        return flour;
    }
    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getColorant() {
        return colorant;
    }
    public void setColorant(double colorant) {
        this.colorant = colorant;
    }

    public double getFilling() {
        return filling;
    }
    public void setFilling(double filling) {
        this.filling = filling;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

}
