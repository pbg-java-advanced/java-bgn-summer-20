import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Read post below for better understanding
// https://www.geeksforgeeks.org/how-to-validate-a-password-using-regular-expressions-in-java/
public class UsernameValidator {

    private static Pattern pattern;
    private static Matcher matcher;
//declare a string pattern for username.
    private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";

    public static void main(String[] args) {
        System.out.println(validateUserName("testUser133"));
    }

    public static boolean validateUserName(final String username){
        pattern = Pattern.compile(USERNAME_PATTERN);
        matcher = pattern.matcher(username);
        return matcher.matches();
    }
}
