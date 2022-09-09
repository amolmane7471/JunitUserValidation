import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {

    @Test
    public void testFirstName() {
        UserValidation user = new UserValidation();
        boolean check = user.firstName("Amol");
        Assertions.assertSame(true, check);

    }
    @Test
    public void testLastName() {
        UserValidation user = new  UserValidation();
        boolean check = user.lastName("Mane");
        Assertions.assertSame(true, check);
    }
    @Test
    public void testEmail() {
        UserValidation user = new  UserValidation();
        boolean check = user.email("abc.xyz@bl.co.in");
        Assertions.assertSame(true, check);
    }
    @Test
    public void testMobileValidate() {
        UserValidation user = new  UserValidation();
        boolean check = user.mobileValidate("91 8830937474");
        Assertions.assertSame(true, check);
    }
    @Test
    public void testPasswordValidate() {
        UserValidation user = new  UserValidation();
        boolean check = user.passwordValidate("@molmane@74");
        Assertions.assertSame(true, check);
    }
}
