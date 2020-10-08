public class PhoneBook {

    private String name;
    private String number;

    public PhoneBook(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static void validateNumber(String number) throws NumberLenghtException{
        if(number.startsWith("+",0)){
            if(number.length() != 12){
                throw new NumberLenghtException();
            }
        }else if(number.startsWith("0", 0)){
            if(number.length() != 10){
                throw new NumberLenghtException();
            }
        }else {
            throw new NumberLenghtException();
        }
    }

    @Override
    public String toString() {
        return name + "*" + number;
    }
}
