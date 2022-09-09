import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static boolean firstName(String firstName) {
            String pattern = "^[A-Z]{1}[a-z]{2,}$";
            Pattern firstN= Pattern.compile(pattern);
            Matcher match = firstN.matcher(firstName);
            if (match.matches()) {
                return true;
            }
            return false;
        }

    public static boolean lastName(String lastName) {
        String pattern = "^[A-Z]{1}[a-z]{2,}$";
        Pattern lastN= Pattern.compile(pattern);
        Matcher match = lastN.matcher(lastName);
        if (match.matches()) {
            return true;
        }
        return false;
    }

    public static boolean email(String email) {
        String pattern = "^[a-z]+[.][a-z]+[@][a-z]+[.][a-z]+[.][a-z]+$";
        Pattern emailVal= Pattern.compile(pattern);
        Matcher match = emailVal.matcher(email);
        if (match.matches()) {
            return true;
        }
        return false;
    }
        public static void main(String[] args) {
            System.out.println(firstName("Amol"));
            System.out.println(lastName("Mane"));
            System.out.println(email("abc.xyz@bl.co.in"));
        }
    }

