package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    //WebDriver driver;

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Main page link
    @FindBy(linkText = "https://qa.wonderworldcollege.com/")
    public WebElement mainPageLink;

    //Main page Course Buton
    @FindBy(xpath ="//*[@id=\"navbar-collapse-3\"]/ul/li[6]/a")
    public WebElement courseButton;

    //Course page link
    @FindBy(linkText ="https://qa.wonderworldcollege.com/page/course")
    public WebElement coursePagelink;

    //Course page Title
    public String coursePageTitle="Course";

    //ACHEIVEMENTS bilgileri locater
    @FindBy(xpath = "/html/body/div[6]/div/div/section[4]/div/div/div[1]/div/h2")
    public WebElement acheivementsTitle;

    // GRADUATES sayisi locater
    @FindBy(className = "counter-value")
    public WebElement GRADUATES_sayisi;

    // CERTIFIED TEACHERS sayisi locater
    @FindBy(xpath = "/html/body/div[6]/div/div/section[4]/div/div/div[2]/div/div[2]/div/h3")
    public WebElement CERTIFIED_TEACHERS_sayisi;

    // STUDENT CAMPUSES sayisi locat
    @FindBy (xpath = "/html/body/div[6]/div/div/section[4]/div/div/div[2]/div/div[3]/div/h3")
    public WebElement STUDENT_CAMPUSES_sayisi;

    // STUDENTS sayisi locat
    @FindBy (xpath = "/html/body/div[6]/div/div/section[4]/div/div/div[2]/div/div[4]/div/h3")
    public WebElement STUDENTS_sayisi;





}
