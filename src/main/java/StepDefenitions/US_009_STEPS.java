package StepDefenitions;

import Pages.HomePage;
import Pages.US009_ContactPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.Driver;

public class US_009_STEPS {

    HomePage homePage=new HomePage();
    US009_ContactPage us009_contactPage=new US009_ContactPage();
    private WebDriver driver;

    @Given("Ana sayfada bulunan üst menüde Contact \\(İletişim) bağlantısına tıklanır")
    public void ana_sayfada_bulunan_üst_menüde_contact_i̇letişim_bağlantısına_tıklanır() throws InterruptedException {
        us009_contactPage.contactPageBtn.click();
        Thread.sleep(1000);
    }

    @Then("Contact sayfasınin acildigi dogrulanir")
    public void contact_sayfasınin_acildigi_dogrulanir() {
        System.out.println("---------Contact sayfası bilgileri asagi yazdirilacak-----------");
        Assert.assertTrue(us009_contactPage.sendInYourQueryTxt.isDisplayed());
        System.out.println("Contact Page sendInYourQueryTxt = " + us009_contactPage.sendInYourQueryTxt.getText());
    }

    @Given("Contact sayfada \"Name \\(Ad), \"Email\" \\(E-posta), \"Subject\" \\(Konu) ve \"Description\" \\(Açıklama) gibi metin kutularının bulunduğu dogrular")
    public void contact_sayfada_name_ad_email_e_posta_subject_konu_ve_description_açıklama_gibi_metin_kutularının_bulunduğu_dogrular() {
        // baslik txt leri dogrulama
        Assert.assertTrue(us009_contactPage.nameTxt.isDisplayed());
        System.out.println("nameTxt = " + us009_contactPage.nameTxt.getText());

        Assert.assertTrue(us009_contactPage.emailTxt.isDisplayed());
        System.out.println("emailTxt = " + us009_contactPage.emailTxt.getText());

        Assert.assertTrue(us009_contactPage.subjectTxt.isDisplayed());
        System.out.println("subjectTxt = " + us009_contactPage.subjectTxt.getText());

        Assert.assertTrue(us009_contactPage.descriptionTxt.isDisplayed());
        System.out.println("descriptionTxt = " + us009_contactPage.descriptionTxt.getText());

    }
    @Then("Bu metin kutularına veri girilebildiğini \\(yazı yazılabildiğini) doğrular")
    public void bu_metin_kutularına_veri_girilebildiğini_yazı_yazılabildiğini_doğrular() {

        // txtbox isimlerini dogrulama
        Assert.assertTrue(us009_contactPage.nameTxtBox.isDisplayed());
        System.out.println("nameTxtBox = " + us009_contactPage.nameTxt.getText());

        Assert.assertTrue(us009_contactPage.emailTxtBox.isDisplayed());
        System.out.println("emailTxtBox = " + us009_contactPage.emailTxtBox.getText());

        Assert.assertTrue(us009_contactPage.subjectTxtBox.isDisplayed());
        System.out.println("subjectTxtBox = " + us009_contactPage.subjectTxtBox.getText());

        Assert.assertTrue(us009_contactPage.descriptionTextBox.isDisplayed());
        System.out.println("descriptionTextBox = " + us009_contactPage.descriptionTextBox.getText());
    }

    @Given("Contact sayfada her bir metin kutusuna uygun verileri girin \\(Ad, E-posta, Konu ve Açıklama).")
    public void contact_sayfada_her_bir_metin_kutusuna_uygun_verileri_girin_ad_e_posta_konu_ve_açıklama() throws InterruptedException {

        us009_contactPage.nameTxtBox.sendKeys(us009_contactPage.contactName);
        us009_contactPage.emailTxtBox.sendKeys(us009_contactPage.contactEmail);
        us009_contactPage.subjectTxtBox.sendKeys(us009_contactPage.contactSubject);
        us009_contactPage.descriptionTextBox.sendKeys(us009_contactPage.contactDescription);

    }
    @Given("Submit \\(Gönder) butonuna tıklayın.")
    public void submit_gönder_butonuna_tıklayın() throws InterruptedException {
        us009_contactPage.contactSubmitBtn.click();
        Thread.sleep(2000);
    }

    @When("Sorgunun başarıyla gönderildiğini doğrulayın.")
    public void sorgunun_başarıyla_gönderildiğini_doğrulayın() {
        Assert.assertTrue(us009_contactPage.submitDogrulamaMesaji.isDisplayed());
        System.out.println("submitDogrulamaMesaji = " + us009_contactPage.submitDogrulamaMesaji.getText());
    }
    @Given("Sayfanın içeriğinde \"Our Location \\(Konumumuz), \"Call Us\" \\(Bizi Ara) ve \"Working Hours\" \\(Çalışma Saatleri) bilgilerin görünür olduğunu doğrulayın.")
    public void sayfanın_içeriğinde_our_location_konumumuz_call_us_bizi_ara_ve_working_hours_çalışma_saatleri_bilgilerin_görünür_olduğunu_doğrulayın() {
        Assert.assertTrue(us009_contactPage.ourLocationTxt.isDisplayed());
        System.out.println("ourLocationTxt = " + us009_contactPage.ourLocationTxt.getText());

        Assert.assertTrue(us009_contactPage.callUsEmail.isDisplayed());
        System.out.println("callUsEmail = " + us009_contactPage.callUsEmail.getText());

        Assert.assertTrue(us009_contactPage.callUsMobile.isDisplayed());
        System.out.println("callUsMobile = " + us009_contactPage.callUsMobile.getText());

        Assert.assertTrue(us009_contactPage.workingHours1.isDisplayed());
        System.out.println("workingHoursTxt = " + us009_contactPage.workingHours1.getText());

        Assert.assertTrue(us009_contactPage.workingHours2.isDisplayed());
        System.out.println(" " + us009_contactPage.workingHours2.getText());

    }
    @Then("Browser sayfa kapatilir")
    public void browser_sayfa_kapatilir() {
        Driver.closeDriver();
    }

}
