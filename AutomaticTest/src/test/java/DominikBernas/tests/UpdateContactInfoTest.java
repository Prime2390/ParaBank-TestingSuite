package DominikBernas.tests;

import DominikBernas.basetest.BaseTest;
import DominikBernas.models.FirstUserModel;
import DominikBernas.models.RegisterModelFaker;
import DominikBernas.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class  UpdateContactInfoTest extends BaseTest {
    @Test
    public void clickUpdateContactInfoWithValidData() {
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
    @Test
    public void clickUpdateContactInfoWithoutData() {
        FirstUserModel firstUserModel = new FirstUserModel();
        new HomePage(driver)
                .clickRegisterButton()
                .registerWithSameUsername(firstUserModel)
                .clickRegisterButtonWithValidData()
                .clickLogoutButton();
        List<WebElement> errorList = new HomePage(driver)
                .loginWithCorrectData(firstUserModel)
                .clickUpdateContactInfo()
                .updateProfilWithoutData()
                .getErrorMessage();
        System.out.println(errorList.get(0).getText());
        System.out.println(errorList.get(1).getText());
        System.out.println(errorList.get(2).getText());
        System.out.println(errorList.get(3).getText());
        System.out.println(errorList.get(4).getText());
        System.out.println(errorList.get(5).getText());
        Assert.assertTrue(errorList.get(0).getText().contains("First name is required."));
        Assert.assertTrue(errorList.get(1).getText().contains("Last name is required."));
        Assert.assertTrue(errorList.get(2).getText().contains("Address is required."));
        Assert.assertTrue(errorList.get(3).getText().contains("City is required."));
        Assert.assertTrue(errorList.get(4).getText().contains("State is required."));
        Assert.assertTrue(errorList.get(5).getText().contains("Zip Code is required."));

    }
}

