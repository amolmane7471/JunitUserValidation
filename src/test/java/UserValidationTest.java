import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserValidationTest {

    @Test
    public void testFirstName() {
        UserValidation user = new UserValidation();
        boolean check = user.firstName("Am");
        Assert.assertSame(true, check);
    }
}
