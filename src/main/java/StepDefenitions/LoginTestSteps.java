package StepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class LoginTestSteps {

    private WebDriver driver;

    @Given("Amazon sitesine git")
    public void amazon_sitesine_git() throws InterruptedException {
        driver= Driver.getDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        Thread.sleep(3000);
        System.out.println("Amazon.com Siteye gidildi");
    }

    @Given("login butonuna tıkla")
    public void login_butonuna_tıkla() {
        System.out.println("Btn tıklandı");
    }

    @Given("isim gir")
    public void isim_gir() {
        System.out.println("isim girildi");
    }

    @Given("sifre gir")
    public void sifre_gir() {
        System.out.println("şifre girildi");
    }

    @When("submit butonuna tıkladıgımda")
    public void submit_butonuna_tıkladıgımda() {
        System.out.println("submit tıklandı");
    }

    @Then("success mesajini verify et")
    public void success_mesajini_verify_et() {
        System.out.println("succes verify edildi");
    }


}
