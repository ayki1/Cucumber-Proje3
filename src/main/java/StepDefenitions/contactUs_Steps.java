package StepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class contactUs_Steps {

    private WebDriver driver;

    @Given("navigate to Website")
    public void navigate_to_website() throws InterruptedException {
        driver= Driver.getDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");
        Thread.sleep(3000);
    }

    @Given("click on contact us button")
    public void click_on_contact_us_button() {

    }
    @Given("select Subject Heading")
    public void select_subject_heading() {

    }
    @Given("type Email")
    public void type_email() {

    }
    @Given("type Order reference {string}")
    public void type_order_reference(String string) {

    }
    @Given("type a message")
    public void type_a_message() {

    }
    @When("click on send button")
    public void click_on_send_button() {

    }
    @Then("verify success message")
    public void verify_success_message() {

    }
}
