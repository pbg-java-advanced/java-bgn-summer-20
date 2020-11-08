package AniStorageProgram;

import java.util.HashMap;

public class Alcohol {

    static final HashMap<Byte,Alcohol> alcohols = new HashMap<>();

    private String name;
    private String price;
    private int amount;
    private int amountSold;
    private int lastSavedInStorage;
    private static String currency = "";

    private String priceFormat = "[0-9.,]+";
    private String amountFormat = "[0-9]+";

    Alcohol(){}

    Alcohol(String name, String price,int lastSavedInStorage, int amount, int amountSold){
        this.name = name;
        this.price = price.replaceAll(",",".");
        this.amount = amount;
        this.amountSold = amountSold;
        this.lastSavedInStorage = lastSavedInStorage;
    }

    public String toString(){
        return "Name: " + orderOutput(this.name.replaceAll("\\^"," ")) +
                " Price: " + orderOutput(this.price + currency) +
                " Amount available: " + orderOutput(String.valueOf(this.amount));
    }

    String orderOutput(String string){
        int width = 20;
        return String.format("%-" + width + "s", String.format("%" + (string.length() + (width - string.length()) / 2) + "s", string));
    }

    public String getName() {
        return name.replaceAll("\\s+", "\\^");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(int amountSold) {
        this.amountSold = amountSold;
    }

    public int getLastSavedInStorage() {
        return lastSavedInStorage;
    }

    public void setLastSavedInStorage(int lastSavedInStorage) {
        this.lastSavedInStorage = lastSavedInStorage;
    }

    public String getPriceFormat() {
        return priceFormat;
    }

    public void setPriceFormat(String priceFormat) {
        this.priceFormat = priceFormat;
    }

    public String getAmountFormat() {
        return amountFormat;
    }

    public void setAmountFormat(String amountFormat) {
        this.amountFormat = amountFormat;
    }

    public String getCurrency() {
        return Alcohol.currency;
    }

    public void setCurrency(String currency) {
        Alcohol.currency = currency;
    }
}
