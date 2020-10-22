package PhoneBookExtended;

public class PhoneNumberException extends Exception{

    @Override
    public String getMessage(){
        return "Entered phone number does not match bulgarians format! Contact was not saved!" ;
    }

}
