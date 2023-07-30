package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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







}
