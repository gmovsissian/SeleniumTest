package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPost {
    WebDriver webDriver;

    public AddPost(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(css = "#c0_0 > a:nth-child(1)")
    WebElement marketplace;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div[1]/a[2]")
    WebElement vehicles;
    @FindBy(css = "#c2_16 > span:nth-child(1) > span:nth-child(2) > a:nth-child(1)")
    WebElement passengerCars;

    public void clickMarketplace() {
        marketplace.click();
    }

    public void clickVehicles() {
        vehicles.click();
    }

    public void clickPassengercars() {
        passengerCars.click();
    }
}
