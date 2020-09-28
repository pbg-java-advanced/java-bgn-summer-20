package CheckTVPrice;

public class PriceErrorException extends Exception {

    private String message;

    public PriceErrorException(String message){
        this.message = message;
    }

    public PriceErrorException(){
        this.message = "Good price";
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
