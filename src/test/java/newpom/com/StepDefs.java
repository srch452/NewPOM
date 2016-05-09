package newpom.com;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by suzi on 09/05/16.
 */
public class StepDefs {


    static WebDriver driver;



    @Before
    public void beforeStep() {
        driver = new FirefoxDriver();
        driver.get("http://sriram-001-site1.ctempurl.com/");
        driver.manage().window().maximize();
        WebDriver.Timeouts timeout = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void afterStep() {
        driver.close();

    }


    @Given("^Admin is on the homepage$")
    public void adminIsOnTheHomepage() throws Throwable {
        driver.get("http://sriram-001-site1.ctempurl.com/");
    }

    @When("^Admin enter username$")
    public void adminEnterUsername() throws Throwable {
        driver.findElement(By.id("txtUserId")).sendKeys("Admin");
    }

    @And("^Admin enter password$")
    public void adminEnterPassword() throws Throwable {
        driver.findElement(By.id("txtPassword")).sendKeys("admin");
    }

    @And("^Admin click login button$")
    public void adminClickLoginButton() throws Throwable {
        driver.findElement(By.id("btnSubmit")).click();
    }


    @Then("^Admin can enter employment management system$")
    public void adminCanEnterEmploymentManagementSystem() throws Throwable {


    }

}
