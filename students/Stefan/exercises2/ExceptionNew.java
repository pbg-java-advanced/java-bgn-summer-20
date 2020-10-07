package exercises2;

public class ExceptionNew extends Exception {
    @Override
    public String getMessage () {
        return "The number length is not correct!";
    }

}
