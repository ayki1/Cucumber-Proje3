package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_006_CoursePage {

    //WebDriver driver;

    public US_006_CoursePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //English and Literature text locator
    @FindBy(xpath ="//*[text()='English and Literature']")
    public WebElement englishandLiteratureText;

    //Mathematics text locator
    @FindBy(xpath ="//*[text()='Mathematics']")
    public WebElement mathematicsText;

    //Sciences text locator
    @FindBy(xpath ="//*[text()='Sciences']")
    public WebElement sciencesText;

    //Social Sciences text locator
    @FindBy(xpath ="//*[text()='Social Sciences']")
    public WebElement socialSciencesText;

    //History text locator
    @FindBy(xpath = "//*[text()='History']")
    public WebElement historyText;

    //Arts and Music text locator
    @FindBy(xpath = "//*[text()='Social Sciences']")
    public WebElement artandMusicText;

    //Health and Exercise Sciences text locator
    @FindBy (xpath = "//*[text()='Health and Exercise Sciences']")
    public WebElement healthandExercicesSciencesText;

    //Foreign Language text locator
    @FindBy (xpath = "//*[text()='Foreign Language`]")
    public WebElement foreignLanguageText;

    //Computer Science text locator
    @FindBy (xpath = "//*[text()='Computer Science`]")
    public WebElement computerScienceText;


}
