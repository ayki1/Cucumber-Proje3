package StepDefenitions;

import PageObjectModel.HomePage;
import PageObjectModel.US_006_CoursePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class US_006_STEPS {

    HomePage homePage=new HomePage();
    US_006_CoursePage us_006_coursePage=new US_006_CoursePage();
    private WebDriver driver;

    @Given("Browser acilir.")
    public void browser_acilir() {
        driver= Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Given("URLe gidilir.")
    public void ur_le_gidilir() throws InterruptedException {
        driver.get("https://qa.wonderworldcollege.com/");
        Thread.sleep(3000);
    }

    @When("Ana sayfadaki üst menüde Course başlığına tıklanır")
    public void ana_sayfadaki_üst_menüde_course_başlığına_tıklanır() throws InterruptedException {
        homePage.courseButton.click();
        Thread.sleep(2000);
    }

    @Then("Course sayfasına yönlendirildiği doğrulanır")
    public void course_sayfasına_yönlendirildiği_doğrulanır() throws InterruptedException {

        String expectedTitle = "Course";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
        Thread.sleep(2000);
    }

    @Given("kullanıcı Course sayfasinda  English and Literature başlığını görür")
    public void kullanıcı_course_sayfasinda_english_and_literature_başlığını_görür() {

        Assert.assertTrue(us_006_coursePage.englishandLiteratureText.isDisplayed());
        System.out.println("englishandLiteratureText = " + us_006_coursePage.englishandLiteratureText.getText());
    }

    @Given("kullanıcı Mathematics başlığını görür")
    public void kullanıcı_mathematics_başlığını_görür() {
        Assert.assertTrue(us_006_coursePage.mathematicsText.isDisplayed());
        System.out.println("mathematicsText = " + us_006_coursePage.mathematicsText.getText());
    }

    @Given("kullanıcı Sciences başlığını görür")
    public void kullanıcı_sciences_başlığını_görür() {
        Assert.assertTrue(us_006_coursePage.sciencesText.isDisplayed());
        System.out.println("sciencesText = " + us_006_coursePage.sciencesText.getText());
    }

    @Given("kullanıcı Social Sciences başlığını görür")
    public void kullanıcı_social_sciences_başlığını_görür() {
        Assert.assertTrue(us_006_coursePage.socialSciencesText.isDisplayed());
        System.out.println("socialSciencesText = " + us_006_coursePage.socialSciencesText.getText());
    }

    @Given("kullanıcı History başlığını görür")
    public void kullanıcı_history_başlığını_görür() {
        Assert.assertTrue(us_006_coursePage.historyText.isDisplayed());
        System.out.println("historyText = " + us_006_coursePage.historyText.getText());
    }

    @Given("kullanıcı Arts and Music başlığını görür")
    public void kullanıcı_arts_and_music_başlığını_görür() {
        Assert.assertTrue(us_006_coursePage.artandMusicText.isDisplayed());
        System.out.println("artandMusicText = " + us_006_coursePage.artandMusicText.getText());
    }

    @Given("kullanıcı Health and Exercise Sciences başlığını görür")
    public void kullanıcı_health_and_exercise_sciences_başlığını_görür() {
        Assert.assertTrue(us_006_coursePage.healthandExercicesSciencesText.isDisplayed());
        System.out.println("healthandExercicesSciencesText = " + us_006_coursePage.healthandExercicesSciencesText.getText());
    }

    @Given("kullanıcı Foreign Language başlığını görür")
    public void kullanıcı_foreign_language_başlığını_görür() {
        Assert.assertTrue(us_006_coursePage.foreignLanguageText.isDisplayed());
        System.out.println("foreignLanguageText = " + us_006_coursePage.foreignLanguageText.getText());
    }

    @Then("kullanıcı Computer Science başlığını görür")
    public void kullanıcı_computer_science_başlığını_görür() {
        Assert.assertTrue(us_006_coursePage.computerScienceText.isDisplayed());
        System.out.println("computerScienceText = " + us_006_coursePage.computerScienceText.getText());
    }

    @Given("kullanıcı Course   görür")
    public void kullanıcı_course_görür() {

    }

    @Given("kullanıcı   görür")
    public void kullanıcı_görür() {

    }

    @Given("Course detail  görür")
    public void course_detail_görür() {

    }

    @Given("kullanıcı  başlığını görür")
    public void kullanıcı_başlığını_görür() {

    }

    @Given("Sayfa kapanir")
    public void sayfa_kapanir() {
        Driver.closeDriver();
    }



}
