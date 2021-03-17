package forgotpassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.SentEmailPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTest {
    @Test
    public void retrievePassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        SentEmailPage sentEmailPage = forgotPasswordPage.clickRetrieveButton();
        sentEmailPage.getAlert();
        assertTrue(sentEmailPage.getAlert().contains("email sent"), "email not sent");
    }
}
