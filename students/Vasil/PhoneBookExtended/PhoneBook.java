package PhoneBookExtended;


import java.util.regex.Pattern;

public class PhoneBook {

    private String name;
    private String number;
    private String operator;
    boolean isSaved;

    private final String regexFirst = "^08[789]8[2-9][0-9][0-9][0-9][0-9][0-9]";
    private final String regexSecond = "^003598[789][2-9][0-9][0-9][0-9][0-9][0-9][0-9]";
    private final String regexThird = "^(\\+)3598[789][2-9][0-9][0-9][0-9][0-9][0-9][0-9]";

    public PhoneBook(String name, String number) {
        try {
            String operator = checkPhoneNumber(number);
            if (isSaved) {
                this.name = name;
                this.number = number;
                this.operator = operator;
            }
        }catch (PhoneNumberException e){
            System.out.println(e.getMessage());
        }

    }

    public String toString(){
        return name + "*" + number + "*" + operator;
    }

    String checkPhoneNumber(String number) throws PhoneNumberException {
        isSaved = false;

        if(Pattern.matches(regexFirst,number) || Pattern.matches(regexSecond,number) || Pattern.matches(regexThird,number)){
            number = "0" + number.substring(1);
        }else{
            throw new PhoneNumberException();
        }

        for(int i = 1; i < 6; i++) {
            switch (number.substring(i, i+2)) {
                case "87":
                    isSaved = true;
                    return "Vivacom";
                case "88":
                    isSaved = true;
                    return "A1";
                case "89":
                    isSaved = true;
                    return "Telenor";
                default:
                    if(i == 5) {
                        throw new PhoneNumberException();
                    }
            }
        }
        return new PhoneNumberException().getMessage();
    }

}
