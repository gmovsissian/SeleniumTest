package tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.*;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {

    public static WebDriver webdriver;
    ProfilePage profilePage = new ProfilePage(webdriver);
    Date date = new Date();

    @BeforeClass
    public static void setup() {
        webdriver = new FirefoxDriver();
        webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webdriver.get("https://www.list.am/");
    }

    @AfterClass
    public static void cleanup() {
        webdriver.quit();
    }

    @org.junit.Test
    public void login() {

        String model = "Accord";
        String make = "Honda";
        String year = "2010";
        MainPage mainPage = new MainPage(webdriver);
        LoginPage loginPage = new LoginPage(webdriver);
        PreviewPage previewPage = new PreviewPage(webdriver);
        AddPost addPost = new AddPost(webdriver);
        AddVehicles addVehicles = new AddVehicles(webdriver);

        mainPage.clickMyPage();
        loginPage.setLoginField("gourgenmovsissian@gmail.com");
        loginPage.setPasswordField("gourgen");

        loginPage.clickLoginButton();
        String url = webdriver.getCurrentUrl();
        Assert.assertEquals("https://www.list.am/my", url);
        profilePage.clickAddpost();
        addPost.clickMarketplace();
        addPost.clickVehicles();
        addPost.clickPassengercars();
        addVehicles.clickContinue();

        addVehicles.selectLocation("Արաբկիր");
        addVehicles.selectMake(make);
        addVehicles.selectModel(model);

        addVehicles.selectBodyType("Սեդան");
        addVehicles.selectYear(year);
        addVehicles.setMillage("60000");

        addVehicles.selectEngineType("Բենզին");
        addVehicles.selectEngineSize("2.5 L");
        addVehicles.selectTransmission("Ավտոմատ");
        addVehicles.selectStreeringwheel("Ձախ");

        addVehicles.selectCustoms("Այո");
        addVehicles.selectDriveType("Առջևի");
        addVehicles.selectColor("Սպիտակ");
        addVehicles.setPrice("15000");
        addVehicles.selectCurrency("USD");

        addVehicles.addDescription(date.toString() + " ");
        addVehicles.clickradioDealer();
        addVehicles.clickExchange();
        addVehicles.clickPreviewButton();

        Assert.assertTrue(webdriver.getCurrentUrl().contains("https://www.list.am/add/"));
        Assert.assertTrue(previewPage.isChangeButtonVisible());
        Assert.assertTrue(previewPage.isAddPostVisible());
        Assert.assertTrue(previewPage.isCancelPostVisiblw());

        Assert.assertEquals(make + " " + model + "," + " " + year + " " + "թ" + ".", previewPage.getHeader());
        previewPage.clickChangepost();
    }
}
