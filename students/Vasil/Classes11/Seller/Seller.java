package Seller;

public class Seller {
    public String sellerName;
    private String egnNumber;
    private byte workShift;
    public double sellerRating;

    Seller(String name, String egn, byte shift, double rating){
        this.sellerName = name;

        if(egn.length() == 10){
            for(int i = 0; i < egn.length(); i++){
                if( !Character.isDigit((egn).charAt(i)) ){
                    System.err.println("Entered EGN number has one or more characters! All EGN number only has digits!\n Save declined!");
                    break;
                }
            }
        }
        this.egnNumber = egn;

        if(workShift == 1 || workShift == 2) {
            this.workShift = shift;
        }else{
            System.err.println("Invalid input for work shift! \nSave declined!");
        }

        if(0 < rating && 0 <= 5) {
            this.sellerRating = rating;
        }else{
            System.err.println("Saved rating is 3!");
        }
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getEgnNumber() {
        return egnNumber;
    }

    public void setEgnNumber(String egnNumber) {
        this.egnNumber = egnNumber;
    }

    public byte getWorkShift() {
        return workShift;
    }

    public void setWorkShift(byte workShift) {
        this.workShift = workShift;
    }

    public double getSellerRating() {
        return sellerRating;
    }

    public void setSellerRating(double sellerRating) {
        this.sellerRating = sellerRating;
    }
}
