package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US009_ContactPage {
    public US009_ContactPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Contact Page link
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[9]/a")
    public WebElement contactPageBtn;

    //Contact page "Send In Your Query" text link
    @FindBy (xpath = "//*[text()='Send In Your Query']")
    public WebElement sendInYourQueryTxt;

    //contact name txt and txtbox locater
    @FindBy (xpath = "//*[@id=\"open\"]/div[1]/label")
    public WebElement nameTxt;
    @FindBy (xpath = "//input[@placeholder='Enter Your Name']")
    public WebElement nameTxtBox;

    //contact email txt and txtbox locater
    @FindBy (xpath = "//*[@id=\"open\"]/div[2]/label")
    public WebElement emailTxt;
    @FindBy (xpath = "//input[@placeholder='Enter Your Email']")
    public WebElement emailTxtBox;

    //contact subject txt and txtbox locater
    @FindBy (xpath = "//*[@id=\"open\"]/div[3]/label")
    public WebElement subjectTxt;
    @FindBy (xpath = "//input[@placeholder='Enter Subject']")
    public WebElement subjectTxtBox;

    //contact Description txt and txtbox locater
    @FindBy (xpath = "//*[@id=\"open\"]/div[4]/label")
    public WebElement descriptionTxt;
    @FindBy (xpath = "//textarea[@placeholder='Enter Description']")
    public WebElement descriptionTextBox;

    //Contact page Girilecek Veriler;
    public String contactName="Burcu Sari";
    public String contactEmail="abc@gmail.com";
    public String contactSubject="Ders programi";
    public String contactDescription="Ders programini istiyorum.";

    //contact page submit btn ve dogrulama txt(Record Saved Successfully)
    @FindBy (name = "submit")
    public WebElement contactSubmitBtn;

    @FindBy (xpath = "/html/body/div[5]/div/div/div[1]")
    public WebElement submitDogrulamaMesaji;

    //CONTACT PAGE "OUR LOCATION, CALL US, WORKING HOURS locater
    @FindBy (xpath = "/html/body/div[5]/div/div/div[2]/div/p")
    public WebElement ourLocationTxt;
    @FindBy(xpath = "/html/body/div[5]/div/div/div[3]/div/p[1]")
    public WebElement callUsEmail;
    @FindBy(xpath = "/html/body/div[5]/div/div/div[3]/div/p[2]")
    public WebElement callUsMobile;
    @FindBy(xpath = "/html/body/div[5]/div/div/div[4]/div/p[1]")
    public WebElement workingHours1;
    @FindBy(xpath = "/html/body/div[5]/div/div/div[4]/div/p[2]")
    public WebElement workingHours2;


}
