package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLaunchApplication();
    }

    @When("user enters valid admin username and password")
    public void user_enters_valid_admin_username_and_password() {
        LoginPage login= new LoginPage();
//        WebElement username = driver.findElement(By.id("txtUsername"));
        login.usernameField.sendKeys(ConfigReader.getPropertyValue("username"));
//        WebElement password = driver.findElement(By.id("txtPassword"));
        login.passwordField.sendKeys(ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        LoginPage login= new LoginPage();
//        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        login.loginbtn.click();
    }

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        System.out.println("Test passed");
    }

    @Then("user close the browser")
    public void user_close_the_browser() {
        closeBrowser();
    }

    @When("user enters valid ess username and password")
    public void user_enters_valid_ess_username_and_password() {
        System.out.println("hello");
    }

    @When("user enters different {string} and {string} and verify the {string} for all the combinations")
    public void user_enters_different_and_and_verify_the_for_all_the_combinations
            (String usernameValue, String passwordValue, String error) {
        LoginPage login= new LoginPage();
//        WebElement username = driver.findElement(By.id("txtUsername"));
        login.usernameField.sendKeys(usernameValue);
//        WebElement password = driver.findElement(By.id("txtPassword"));
        login.passwordField.sendKeys(passwordValue);
//        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        login.loginbtn.click();

//        WebElement errorMessage = driver.findElement(By.id("spanMessage"));
        String errorActual = login.errorMessage.getText();
        Assert.assertEquals("values do not match", error, errorActual);
    }

    @When("user enters different {string} and {string}")
    public void user_enters_different_and(String usernameValue, String passwordValue) {
        LoginPage login= new LoginPage();
//        WebElement username = driver.findElement(By.id("txtUsername"));
        login.usernameField.sendKeys(usernameValue);
//        WebElement password = driver.findElement(By.id("txtPassword"));
        login.passwordField.sendKeys(passwordValue);
    }


    @Then("{string} user is successfully logged in")
    public void user_is_successfully_logged_in(String admin) {
        WebElement dashboardMessage = driver.findElement(By.id("welcome"));
        Assert.assertTrue(dashboardMessage.isDisplayed());
    }


}

