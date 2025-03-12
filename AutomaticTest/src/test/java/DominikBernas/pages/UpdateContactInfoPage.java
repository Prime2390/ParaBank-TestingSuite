package DominikBernas.pages;

import DominikBernas.models.RegisterModelFaker;
import DominikBernas.utils.SeleniumWaiter;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class UpdateContactInfoPage {
    WebDriver driver;

    @FindBy(id = "customer.firstName")
    private WebElement firstNameInput;

    @FindBy(id = "customer.lastName")
    private WebElement lastNameInput;

    @FindBy(id = "customer.address.street")
    private WebElement addressInput;

    @FindBy(id = "customer.address.city")
    private WebElement cityInput;

    @FindBy(id = "customer.address.state")
    private WebElement stateInput;

    @FindBy(id = "customer.address.zipCode")
    private WebElement zipCodeInput;

    @FindBy(id = "customer.phoneNumber")
    private WebElement phoneNumberInput;

    @FindBy(css = "input.button[value='Update Profile']")
    private WebElement updateProfileButton;

    @FindBy(xpath = "//div[@id='updateProfileResult']//p")
    private WebElement profileUpdatedMessage;

    @FindBy(className = "error")
    private List<WebElement> errorMessage;

    public UpdateContactInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public UpdateContactInfoPage updateProfil(RegisterModelFaker registerModelFaker) {
        firstNameInput.clear();
        lastNameInput.clear();
        addressInput.clear();
        cityInput.clear();
        stateInput.clear();
        zipCodeInput.clear();
        phoneNumberInput.clear();

        firstNameInput.sendKeys(registerModelFaker.getFirstName());
        lastNameInput.sendKeys(registerModelFaker.getLastName());
        addressInput.sendKeys(registerModelFaker.getAddress());
        cityInput.sendKeys(registerModelFaker.getCity());
        zipCodeInput.sendKeys(registerModelFaker.getZipCode());
        stateInput.sendKeys(registerModelFaker.getState());
        phoneNumberInput.sendKeys(registerModelFaker.getPhoneNumber());
        SeleniumWaiter.waitForEnabled(updateProfileButton, driver);
        updateProfileButton.click();
        return this;
    }
    public UpdateContactInfoPage updateProfilWithoutData() {
        firstNameInput.clear();
        lastNameInput.clear();
        addressInput.clear();
        cityInput.clear();
        stateInput.clear();
        zipCodeInput.clear();
        phoneNumberInput.clear();
        updateProfileButton.click();
        return this;
    }
    public String updateProfileTitle() {
        new SeleniumWaiter().waitForVisible(profileUpdatedMessage, driver);
        return profileUpdatedMessage.getText();
    }
    public List<WebElement> getErrorMessage() {
        return errorMessage.stream().map(element -> element).collect(Collectors.toList());
    }
}
