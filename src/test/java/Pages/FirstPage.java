package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FirstPage {
    @FindBy(className="badge")
    public List<WebElement> labelLogin;
    @FindBy(className = "close")
    public List<WebElement> CancelLoginModal;
    @FindBy(id = "testCorner")
    public WebElement signUp;
    @FindBy(className = "fa-users")
    public List<WebElement> signUpAsNagorik;
    public FirstPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
