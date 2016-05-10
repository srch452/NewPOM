package newpom.com;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
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


    @Given("^Admin should be in the EMS homepage$")
    public void adminShouldBeInTheEMSHomepage() throws Throwable {
        driver.get("http://sriram-001-site1.ctempurl.com/");
    }

    @When("^Admin select EIM module$")
    public void adminSelectEIMModule() throws Throwable {
        driver.findElement(By.xpath("//*[@id='ctl00_EM']/a/span")).click();
    }

    @And("^Admin click Employee Master$")
    public void adminClickEmployeeMaster() throws Throwable {
        driver.findElement(By.xpath("//*[@id='ctl00_EM']/ul/li[1]/a")).click();

    }

    @And("^Click add button$")
    public void clickAddButton() throws Throwable {
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgbtnAdd")).click();

    }

    @And("^Add all employee details$")
    public void addAllEmployeeDetails() throws Throwable {
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFirstName")).sendKeys("jala");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMiddleName")).sendKeys("Rani");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLastname")).sendKeys("Rani");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGender")).isSelected();
        driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ddlGender']/option[3]")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDOB")).sendKeys("01/01/1990");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDOJ")).sendKeys("01/01/2015");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEmailId")).sendKeys("jala@yahoo.com");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPhoneNo1")).sendKeys("9876543210");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPhoneNo2")).sendKeys("9876543220");
        driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_txtPermanentAddress']")).sendKeys("2,north street,India");
        driver.findElement(By.xpath(("//*[@id='ctl00_ContentPlaceHolder1_txtContactAddress']"))).sendKeys("2,north street,India");
        driver.findElement(By.className("dropdown")).click();
        driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ddlQualification']/option[2]")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtYearOfPass")).sendKeys("01/01/2013");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtNameOfCollege")).sendKeys("UEL");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPercentageOfGrade")).sendKeys("A");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtOrganization")).sendKeys("Global Tec");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDesignation")).sendKeys("Software Lead");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFromdate")).sendKeys("01/01/2014");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTodate")).sendKeys("01/10/2014");


    }

    @And("^Click save$")
    public void clickSave() throws Throwable {
        driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_btnSave']")).click();
        WebDriver.Timeouts timeout = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @And("^Logged in with valid details$")
    public void loggedInWithValidDetails() throws Throwable {
        driver.findElement(By.id("txtUserId")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin");
        driver.findElement(By.id("btnSubmit")).click();
        driver.get("http://sriram-001-site1.ctempurl.com/DashBoard.aspx");
    }

    @Then("^Admin should be able to see the message \"([^\"]*)\"$")
    public void adminShouldBeAbleToSeeTheMessage(String arg0) throws Throwable {
        String message = "Registration Successfully Completed";
        System.out.println(message);
        String expected = message;
        String actual = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_lblMsg']")).getText();
        Assert.assertEquals(expected, actual);
    }

    @And("^Admin click view employee additional information$")
    public void adminClickViewEmployeeAdditionalInformation() throws Throwable {
        driver.findElement(By.xpath("//*[@id='ctl00_EM']/ul/li[2]/a")).click();
    }

    @When("^Click employee select button$")
    public void clickEmployeeSelectButton() throws Throwable {
        driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ddlEmployeeDtls']")).click();
    }

    @And("^Select an employee$")
    public void selectAnEmployee() throws Throwable {
        driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ddlEmployeeDtls']/option[51]")).click();
    }

    @Then("^Admin should able to see employee additional information$")
    public void adminShouldAbleToSeeEmployeeAdditionalInformation() throws Throwable {

    }
}
