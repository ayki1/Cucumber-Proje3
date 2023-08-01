package StepDefenitions;

import Pages.HomePage;
import Pages.US006_CoursePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class US_006_STEPS {

    HomePage homePage=new HomePage();
    US006_CoursePage us_006_coursePage=new US006_CoursePage();
    private WebDriver driver;

    @Given("Browser acilir.")
    public void browser_acilir() {
        driver= Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
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
        Thread.sleep(1000);
    }

    @Then("Course sayfasına yönlendirildiği doğrulanır")
    public void course_sayfasına_yönlendirildiği_doğrulanır() throws InterruptedException {

        String expectedTitle = "Course";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
        Thread.sleep(1000);
    }

    @Given("kullanıcı Course sayfasinda  English and Literature başlığını görür")
    public void kullanıcı_course_sayfasinda_english_and_literature_başlığını_görür() {
        System.out.println("---------Course sayfasında  Bolum başlıklar asagi yazdirilacak-----------");
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


    @Given("kullanıcı Course sayfasinda  English and Literature DETAILS Butonunu görür")
    public void kullanıcı_course_sayfasinda_english_and_literature_details_butonunu_görür() {
        System.out.println("---------Course sayfasında  Bolum DETAILS BUTON başlıklari asagi yazdirilacak-----------");
        Assert.assertTrue(us_006_coursePage.englishandLiteratureDetailsBtn.isDisplayed());
        System.out.println("englishandLiteratureDetailsBtntext = " + us_006_coursePage.englishandLiteratureDetailsBtn.getText());
    }

    @Given("kullanıcı Mathematics DETAILS Butonunu görür")
    public void kullanıcı_mathematics_details_butonunu_görür() {
        Assert.assertTrue(us_006_coursePage.mathematicsDetailsBtn.isDisplayed());
        System.out.println("mathematicsDetailsBtntext = " + us_006_coursePage.mathematicsDetailsBtn.getText());
    }

    @Given("kullanıcı Sciences DETAILS Butonunu görür")
    public void kullanıcı_sciences_details_butonunu_görür() {
        Assert.assertTrue(us_006_coursePage.sciencesDetailsBtn.isDisplayed());
        System.out.println("sciencesDetailsBtntxt = " + us_006_coursePage.sciencesDetailsBtn.getText());

    }

    @Given("kullanıcı Social Sciences DETAILS Butonunu görür")
    public void kullanıcı_social_sciences_details_butonunu_görür() {
        Assert.assertTrue(us_006_coursePage.socialSciencesDetailsBtn.isDisplayed());
        System.out.println("socialSciencesDetailsBtntxt = " + us_006_coursePage.socialSciencesDetailsBtn.getText());

    }
    @Given("kullanıcı History DETAILS Butonunu görür")
    public void kullanıcı_history_details_butonunu_görür() {
        Assert.assertTrue(us_006_coursePage.historyDetailsBtn.isDisplayed());
        System.out.println("historyDetailsBtntxt = " + us_006_coursePage.historyDetailsBtn.getText());

    }

    @Given("kullanıcı Arts and Music DETAILS Butonunu görür")
    public void kullanıcı_arts_and_music_details_butonunu_görür() {
        Assert.assertTrue(us_006_coursePage.artandMusicDetailsBtn.isDisplayed());
        System.out.println("artandMusicDetailsBtntxt = " + us_006_coursePage.artandMusicDetailsBtn.getText());

    }

    @Given("kullanıcı Health and Exercise Sciences DETAILS Butonunu görür")
    public void kullanıcı_health_and_exercise_sciences_details_butonunu_görür() {
        Assert.assertTrue(us_006_coursePage.healthandExercicesSciencesBtn.isDisplayed());
        System.out.println("healthandExercicesSciencesBtnTxt = " + us_006_coursePage.healthandExercicesSciencesBtn.getText());
    }

    @Given("kullanıcı Foreign Language DETAILS Butonunu görür")
    public void kullanıcı_foreign_language_details_butonunu_görür() {
        Assert.assertTrue(us_006_coursePage.foreignLanguageDetailsBtn.isDisplayed());
        System.out.println("foreignLanguageDetailsBtnTxt = " + us_006_coursePage.foreignLanguageDetailsBtn.getText());
    }

    @Then("kullanıcı Computer Science DETAILS Butonunu görür")
    public void kullanıcı_computer_science_details_butonunu_görür() {
        Assert.assertTrue(us_006_coursePage.computerScienceDetailsBtn.isDisplayed());
        System.out.println("computerScienceDetailsBtnTxt = " + us_006_coursePage.computerScienceDetailsBtn.getText());
    }

    @Given("kullanıcı Course sayfasinda English and Literature detay sayfasına erişilebildiği doğrulanır.")
    public void kullanıcı_course_sayfasinda_english_and_literature_detay_sayfasına_erişilebildiği_doğrulanır() throws InterruptedException {
        System.out.println("---------Course sayfasında details butonuna tıklanınca ilgili kursun detay sayfasında Kurs başlıklari asagi yazdirilacak-----------");
        us_006_coursePage.englishandLiteratureDetailsBtn.click();
        Assert.assertTrue(us_006_coursePage.englishandLiteratureTitle.isDisplayed());
        System.out.println("englishandLiteratureTitle = " + us_006_coursePage.englishandLiteratureTitle.getText());
        homePage.courseButton.click();
        Thread.sleep(2000);
    }

    @Given("kullanıcı Mathematics detay sayfasına erişilebildiği doğrulanır.")
    public void kullanıcı_mathematics_detay_sayfasına_erişilebildiği_doğrulanır() throws InterruptedException {
        us_006_coursePage.mathematicsDetailsBtn.click();
        Assert.assertTrue(us_006_coursePage.mathematicsTitle.isDisplayed());
        System.out.println("mathematicsTitle = " + us_006_coursePage.mathematicsTitle.getText());
        homePage.courseButton.click();
        Thread.sleep(2000);
    }

    @Given("kullanıcı Sciences detay sayfasına erişilebildiği doğrulanır.")
    public void kullanıcı_sciences_detay_sayfasına_erişilebildiği_doğrulanır() throws InterruptedException {
        us_006_coursePage.sciencesDetailsBtn.click();
        Assert.assertTrue(us_006_coursePage.sciencesTitle.isDisplayed());
        System.out.println("sciencesTitle = " + us_006_coursePage.sciencesTitle.getText());
        homePage.courseButton.click();
        Thread.sleep(2000);
    }

    @Given("kullanıcı Social Sciences detay sayfasına erişilebildiği doğrulanır.")
    public void kullanıcı_social_sciences_detay_sayfasına_erişilebildiği_doğrulanır() throws InterruptedException {
        us_006_coursePage.socialSciencesDetailsBtn.click();
        Assert.assertTrue(us_006_coursePage.socialSciencesTitle.isDisplayed());
        System.out.println("socialSciencesTitle = " + us_006_coursePage.socialSciencesTitle.getText());
        homePage.courseButton.click();
        Thread.sleep(2000);
    }

    @Given("kullanıcı History detay sayfasına erişilebildiği doğrulanır.")
    public void kullanıcı_history_detay_sayfasına_erişilebildiği_doğrulanır() throws InterruptedException {
        us_006_coursePage.historyDetailsBtn.click();
        Assert.assertTrue(us_006_coursePage.historyTitle.isDisplayed());
        System.out.println("historyTitle = " + us_006_coursePage.historyTitle.getText());
        homePage.courseButton.click();
        Thread.sleep(2000);
    }

    @Given("kullanıcı Arts and Music detay sayfasına erişilebildiği doğrulanır.")
    public void kullanıcı_arts_and_music_detay_sayfasına_erişilebildiği_doğrulanır() throws InterruptedException {
        us_006_coursePage.artandMusicDetailsBtn.click();
        Assert.assertTrue(us_006_coursePage.artandMusicTitle.isDisplayed());
        System.out.println("artandMusicTitle = " + us_006_coursePage.artandMusicTitle.getText());
        homePage.courseButton.click();
        Thread.sleep(2000);
    }

    @Given("kullanıcı Health and Exercise Sciences detay sayfasına erişilebildiği doğrulanır.")
    public void kullanıcı_health_and_exercise_sciences_detay_sayfasına_erişilebildiği_doğrulanır() throws InterruptedException {
        us_006_coursePage.healthandExercicesSciencesBtn.click();
        Assert.assertTrue(us_006_coursePage.healthandExercicesSciencesTitle.isDisplayed());
        System.out.println("healthandExercicesSciencesTitle = " + us_006_coursePage.healthandExercicesSciencesTitle.getText());
        homePage.courseButton.click();
        Thread.sleep(2000);
    }

    @Given("kullanıcı Foreign Language detay sayfasına erişilebildiği doğrulanır.")
    public void kullanıcı_foreign_language_detay_sayfasına_erişilebildiği_doğrulanır() throws InterruptedException {
        us_006_coursePage.foreignLanguageDetailsBtn.click();
        Assert.assertTrue(us_006_coursePage.foreignLanguageTitle.isDisplayed());
        System.out.println("foreignLanguageTitle = " + us_006_coursePage.foreignLanguageTitle.getText());
        homePage.courseButton.click();
        Thread.sleep(2000);
    }

    @Then("kullanıcı Computer Science detay sayfasına erişilebildiği doğrulanır.")
    public void kullanıcı_computer_science_detay_sayfasına_erişilebildiği_doğrulanır() throws InterruptedException {
        us_006_coursePage.computerScienceDetailsBtn.click();
        Assert.assertTrue(us_006_coursePage.computerScienceTitle.isDisplayed());
        System.out.println("computerScienceTitle = " + us_006_coursePage.computerScienceTitle.getText());
    }

    @Then("Browser Sayfa kapanir")
    public void browser_sayfa_kapanir() {
        Driver.closeDriver();
    }


}
