package InstrumentsInfo;

public class ElectricGuitar extends StringedInstrument{

    String name;
    int numberOfStrings;

    ElectricGuitar(){
        this.name = "Guitar";
        this.numberOfStrings = 6;
    }

    ElectricGuitar(int numberOfStrings){
        this.name = "Guitar";
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println(new ElectricGuitar().toString());
        System.out.println(new ElectricGuitar(8).toString());
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " Number of Strings: " + this.numberOfStrings;
    }

}
