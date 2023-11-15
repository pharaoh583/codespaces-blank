package bo.edu.ucb;

import bo.edu.ucb.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extend BaseTest {
    @Test
    public void shouldValidateLogin() {
        //1. Prepare test
        //2. Test Logic
        String titlePageAuthorized =
                loginPage.
                    loginToPlatform("admin", "admin").
                    getTextTitleLoginPage();
        //3. Check results
        Assert.assertEquals(titlePageAuthorized, "CSES Problem Set");
    }
}