package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
