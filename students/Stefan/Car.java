package cars;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int power;
    private String engineType;
    private String gearboxType;
    private int productionYear;

    public Car() {
    }

    public Car(String brand, String model, String color, int power, String engineType, String gearboxType, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.power = power;
        this.engineType = engineType;
        this.gearboxType = gearboxType;
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    public int getProductionYear() {
        return productionYear;
    }


    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public static Car[] sortCarByBrandFirstLetter(Car[] arrayOfCars, char firstLetter) {
        String tempCarBrand;
        char firstBrandLetter;
        int count = 0;
        Car[] newArrayWithCars = new Car[arrayOfCars.length];
        for (int i = 0; i < arrayOfCars.length; i++) {
            tempCarBrand = arrayOfCars[i].getBrand().toLowerCase();
            firstBrandLetter = tempCarBrand.charAt(0);
            if (firstBrandLetter == firstLetter) {
                    newArrayWithCars[count] = arrayOfCars[i];
                    count++;
            }
        } return newArrayWithCars;
    }
}
