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

}
