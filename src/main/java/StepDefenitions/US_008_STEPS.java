package StepDefenitions;

import Pages.HomePage;
import Pages.US006_CoursePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.Driver;

public class US_008_STEPS {
    HomePage homePage=new HomePage();
    US006_CoursePage us_006_coursePage=new US006_CoursePage();
    private WebDriver driver;


    @Then("Ana sayfadaki Acheivements bölümü görüntülendigi doğrulanır")
    public void ana_sayfadaki_acheivements_bölümü_görüntülendigi_doğrulanır() {
        System.out.println("---------Acheivements sayfası bilgileri asagi yazdirilacak-----------");
        Assert.assertTrue(homePage.acheivementsTitle.isDisplayed());
        System.out.println("acheivementsTitleText = " + homePage.acheivementsTitle.getText());
    }

    @Given("GRADUATES sayisi görüntülenir")
    public void graduates_sayisi_görüntülenir() {
        Assert.assertTrue(homePage.GRADUATES_sayisi.isDisplayed());
        System.out.println("GRADUATES_sayisi = " + homePage.GRADUATES_sayisi.getText());
    }

    @Given("CERTIFIED TEACHERS sayisi görüntülenir")
    public void certified_teachers_sayisi_görüntülenir() {
        Assert.assertTrue(homePage.CERTIFIED_TEACHERS_sayisi.isDisplayed());
        System.out.println("CERTIFIED_TEACHERS_sayisi = " + homePage.CERTIFIED_TEACHERS_sayisi.getText());
    }

    @Given("STUDENT CAMPUSES sayisi görüntülenir")
    public void student_campuses_sayisi_görüntülenir() {
        Assert.assertTrue(homePage.STUDENT_CAMPUSES_sayisi.isDisplayed());
        System.out.println("STUDENT_CAMPUSES_sayisi = " + homePage.STUDENT_CAMPUSES_sayisi.getText());
    }

    @Given("STUDENTS sayisi görüntülenir")
    public void students_sayisi_görüntülenir() {
        Assert.assertTrue(homePage.STUDENTS_sayisi.isDisplayed());
        System.out.println("STUDENTS_sayisi = " + homePage.STUDENTS_sayisi.getText());
    }

    @Then("Browser sayfa kapanir")
    public void browser_sayfa_kapanir() {
        Driver.closeDriver();
    }




}
