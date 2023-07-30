package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US006_CoursePage {

    //WebDriver driver;

    public US006_CoursePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //English and Literature text and Buton locator
    @FindBy(xpath ="//*[text()='English and Literature']")
    public WebElement englishandLiteratureText;
    @FindBy(xpath ="/html/body/div[5]/div/div/div[1]/div/div[1]/div/div[2]/a")
    public WebElement englishandLiteratureDetailsBtn;
    @FindBy(xpath ="/html/body/div[5]/div/div/section/div/div/div/div[2]/h2")
    public WebElement englishandLiteratureTitle;



    //Mathematics text and btn locator
    @FindBy(xpath ="//*[text()='Mathematics']")
    public WebElement mathematicsText;
    @FindBy(xpath ="/html/body/div[5]/div/div/div[1]/div/div[2]/div/div[2]/a")
    public WebElement mathematicsDetailsBtn;

    //Sciences text and btn locator
    @FindBy(xpath ="//*[text()='Sciences']")
    public WebElement sciencesText;
    @FindBy(xpath ="/html/body/div[5]/div/div/div[1]/div/div[3]/div/div[2]/a")
    public WebElement sciencesDetailsBtn;

    //Social Sciences text and btn locator
    @FindBy(xpath ="//*[text()='Social Sciences']")
    public WebElement socialSciencesText;
    @FindBy(xpath ="/html/body/div[5]/div/div/div[1]/div/div[4]/div/div[2]/a")
    public WebElement socialSciencesDetailsBtn;

    //History text and btn locator
    @FindBy(xpath = "//*[text()='History']")
    public WebElement historyText;
    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[5]/div/div[2]/a")
    public WebElement historyDetailsBtn;

    //Arts and Music text and btn locator
    @FindBy(xpath = "//*[text()='Arts and Music']")
    public WebElement artandMusicText;
    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[6]/div/div[2]/a")
    public WebElement artandMusicDetailsBtn;

    //Health and Exercise Sciences text and btn locator
    @FindBy (xpath = "//*[text()='Health and Exercise Sciences']")
    public WebElement healthandExercicesSciencesText;
    @FindBy (xpath = "/html/body/div[5]/div/div/div[1]/div/div[7]/div/div[2]/a")
    public WebElement healthandExercicesSciencesBtn;

    //Foreign Language text and btn locator
    @FindBy (xpath = "//*[text()='Foreign Language']")
    public WebElement foreignLanguageText;
    @FindBy (xpath = "/html/body/div[5]/div/div/div[1]/div/div[8]/div/div[2]/a")
    public WebElement foreignLanguageDetailsBtn;

    //Computer Science text and btn locator
    @FindBy (xpath = "//*[text()='Computer Science']")
    public WebElement computerScienceText;
    @FindBy (xpath = "/html/body/div[5]/div/div/div[1]/div/div[9]/div/div[2]/a")
    public WebElement computerScienceDetailsBtn;



}
