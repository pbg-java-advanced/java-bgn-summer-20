package InstrumentsInfo;

public class ElectricBassGuitar extends StringedInstrument{

    String name;
    int numberOfStrings;

    ElectricBassGuitar(){
        this.name = "Bass Guitar";
        this.numberOfStrings = 6;
    }

    ElectricBassGuitar(int numberOfStrings){
        this.name = "Bass Guitar";
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println(new ElectricBassGuitar().toString());
        System.out.println(new ElectricBassGuitar(4).toString());
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " Number of Strings: " + this.numberOfStrings;
    }

}
