package DominikBernas.tests;

import DominikBernas.basetest.BaseTest;
import DominikBernas.models.FirstUserModel;
import DominikBernas.models.RegisterModelFaker;
import DominikBernas.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateContactInfoTest extends BaseTest {
    @Test
    public void clickUpdateContactInfo() {
        FirstUserModel firstUserModel = new FirstUserModel();
        RegisterModelFaker registerModelFaker = new RegisterModelFaker();
        new HomePage(driver)
                .clickRegisterButton()
                .registerWithSameUsername(firstUserModel)
                .clickRegisterButtonWithValidData()
                .clickLogoutButton();
        String updateProfileTitle = new HomePage(driver)
                .loginWithCorrectData(firstUserModel)
                .clickUpdateContactInfo()
                .updateProfil(registerModelFaker)
                .updateProfileTitle();
        Assert.assertEquals(updateProfileTitle, "Your updated address and phone number have been added to the system.");
        

    }
}

