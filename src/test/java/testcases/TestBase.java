package testcases;

import drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.Homepage;
import pages.LoginPage;
import pages.RegisterationPage;

import java.time.Duration;

import static drivers.DriverHolder.getDriver;
import static drivers.DriverHolder.setDriver;

public class TestBase {
  //static WebDriver driver ;

    @Parameters("browsername")
    @BeforeTest
    public void setupDriver(String browsername) {
        // driver =new ChromeDriver();
        // driver.manage().window().maximize();

        setDriver(DriverFactory.getNewInstance(browsername));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        getDriver().get("https://tutorialsninja.com/demo/index.php?route=common/home");


}

   @AfterTest
    public  void Teardown(){
    getDriver().quit();


}





}
