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

        public static void main(String[] args) {
            System.out.println(firstName("Amol"));
        }
    }

