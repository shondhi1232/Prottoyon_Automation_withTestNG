package TestRunner;

import Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.Setup;

public class FirstPageTestRunner extends Setup {

    HomePage firstPage;
    @Test(priority = 1,description = "visit the prottoyon site")
    public void VisitPage(){
            driver.get("https://prottoyon.gov.bd/");
            firstPage = new HomePage(driver);

            String linkActual = driver.getCurrentUrl();
            String linkExpected = "prottoyon";
            Assert.assertTrue(linkActual.contains(linkExpected));
    }/*
    @Test(priority = 2)
    public void checkLoginLabel() throws InterruptedException {
        firstPage = new HomePage(driver);
        Thread.sleep(2000);
        WebElement modalLogin = firstPage.labelLogin.get(0);
        modalLogin.click();
        /*
        Thread.sleep(2000);
        String modalLoginActual = modalLogin.getText();
        String modalLoginExpected = "লগইন";
        Assert.assertTrue(modalLoginActual.contains(modalLoginExpected));
         
        Thread.sleep(2000);
        firstPage.CancelLoginModal.get(0).click();
    }
    */
    @Test(priority = 3,description = "signUp as a nagorik")
    public void signUp() throws InterruptedException {
        firstPage.signUp.click();
        firstPage.signUpAsNagorik.get(0).click();
        driver.navigate().back();
        Thread.sleep(2000);
        firstPage.click_homePage_btn();
    }


}
