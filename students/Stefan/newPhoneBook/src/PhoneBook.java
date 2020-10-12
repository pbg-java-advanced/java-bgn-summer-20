import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    private String userName;
    private String userNumber;

    public PhoneBook() {
    }

    public PhoneBook(String userName, String userNumber) {
        this.userName = userName;
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public static String correctNumberFormat (String userNumber){
        String correctedNumber=null;
        if (userNumber.startsWith("00") && userNumber.length() == 14) {
            correctedNumber = userNumber.replaceFirst("00", "+");
        } else if (userNumber.startsWith("0") && userNumber.length() == 10) {
            correctedNumber = userNumber.replaceFirst("0", "+359");
        } else {
            correctedNumber = userNumber;
        }
        if(checkNumber(correctedNumber)){
            System.out.println("The number is valid and it is added to the registry");
            return correctedNumber;
        }
        return "The number is not correct";

    }

    public static Boolean checkNumber (String userNumberCorrected) {
        Boolean userNumberCorrect;
        String regex = "\\+(359)[8][7-9][2-9][0-9]{6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userNumberCorrected);
        if (matcher.matches()) {
            userNumberCorrect = true;
        } else {
            System.err.println("The number you have entered is not valid");
            userNumberCorrect = false;
        }
        return userNumberCorrect;
    }

    @Override
    public String toString() {
        return userName + "*" + userNumber;
    }
}
