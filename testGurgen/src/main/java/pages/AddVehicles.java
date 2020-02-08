package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddVehicles {

    WebDriver webDriver;

    public AddVehicles(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//*[@id=\"_idlocation\"]")
    WebElement location;
    @FindBy(css = ".b > button:nth-child(1)")
    WebElement cont;
    @FindBy(css = "#_idmileage")
    WebElement millage;
    @FindBy(css = "#_idprice")
    WebElement price;
    @FindBy(css = "#_iddescription")
    WebElement description;
    @FindBy(css = "#_idyour_name")
    WebElement namefield;
    @FindBy(css = "#postaction__form_action0")
    WebElement previewButton;
    @FindBy(id = "idstatus0")
    WebElement radioOwner;
    @FindBy(id = "idstatus1")
    WebElement radioDealer;
    @FindBy(id = "ad_type")
    WebElement offer;
    @FindBy(id = "ad_type_1")
    WebElement exchange;
    @FindBy(id = "ad_type_2")
    WebElement wanted;

    public void clickLocation() {
        location.click();
    }

    public void clickContinue() {
        cont.click();
    }

    public void setMillage(String string) {
        millage.sendKeys(string);
    }

    public void setPrice(String string) {
        price.sendKeys(string);
    }

    public void addDescription(String string) {
        description.sendKeys(string);
    }

    public void clickradioOwner() {
        radioOwner.click();
    }

    public void clickradioDealer() {
        radioDealer.click();
    }


    public void clickOffer() {
        offer.click();
    }

    public void clickExchange() {
        exchange.click();
    }

    public void clickwanted() {
        wanted.click();
    }


    public void setNamefield(String string) {
        namefield.sendKeys(string);
    }

    public void clickPreviewButton() {
        previewButton.click();
    }

    public void selectLocation(String location) {
        Select dropboxLocation = new Select(webDriver.findElement(By.id("_idlocation")));
        dropboxLocation.selectByVisibleText(location);
    }

    public void selectMake(String make) {
        Select drpMake = new Select(webDriver.findElement(By.id("_idmake")));
        drpMake.selectByVisibleText(make);
    }

    public void selectModel(String model) {
        Select drpModel = new Select(webDriver.findElement(By.id("_idmodel")));
        drpModel.selectByVisibleText(model);
    }

    public void selectBodyType(String type) {

        Select drpBodyType = new Select(webDriver.findElement(By.id("_idbody_type")));
        drpBodyType.selectByVisibleText(type);
    }

    public void selectYear(String year) {
        Select drpYear = new Select(webDriver.findElement(By.id("_idyear")));
        drpYear.selectByVisibleText(year);
    }


    public void selectEngineType(String engineType) {

        Select drpengineType = new Select(webDriver.findElement(By.id("_idengine_type")));
        drpengineType.selectByVisibleText(engineType);
    }

    public void selectEngineSize(String engineSize) {

        Select drpengineSize = new Select(webDriver.findElement(By.id("_idengine_size")));
        drpengineSize.selectByVisibleText(engineSize);
    }


    public void selectTransmission(String transmisson) {
        Select drpTransmission = new Select(webDriver.findElement(By.id("_idtransmission")));
        drpTransmission.selectByVisibleText(transmisson);
    }

    public void selectStreeringwheel(String steeringWheel) {

        Select drpSteeringwheel = new Select(webDriver.findElement(By.id("_idsteering_wheel")));
        drpSteeringwheel.selectByVisibleText(steeringWheel);
    }

    public void selectCustoms(String customs) {
        Select drpcustoms = new Select(webDriver.findElement(By.id("_idcleared_customs")));
        drpcustoms.selectByVisibleText(customs);
    }

    public void selectDriveType(String driveType) {
        Select drpDriveType = new Select(webDriver.findElement(By.id("_iddrive_type")));
        drpDriveType.selectByVisibleText(driveType);
    }

    public void selectColor(String color) {
        Select drpColor = new Select(webDriver.findElement(By.id("_idcolor")));
        drpColor.selectByVisibleText(color);
    }


    public void selectCurrency(String currency) {
        Select drpCrrency = new Select(webDriver.findElement(By.id("_idcurrency")));
        drpCrrency.selectByVisibleText(currency);
    }

}









