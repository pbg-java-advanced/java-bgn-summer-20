package sellers;

public class SellerTest {
    public static void main(String[] args) {
        Seller seller = new Seller("Ivan", "99999999999",2,"good");
        System.out.print("The name of the seller is: " + seller.getName() +"\n EGN: "
                + seller.getEgn() + "\n Shift: " + seller.getShiftNumber() + "\n Grade: " + seller.getGrade());
    }
}
