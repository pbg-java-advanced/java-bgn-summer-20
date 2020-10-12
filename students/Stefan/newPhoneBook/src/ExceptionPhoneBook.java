public class ExceptionPhoneBook extends Exception {

    @Override
    public String getMessage() {
        return "Not able to write the item in the file! Please try again.";
    }
}
