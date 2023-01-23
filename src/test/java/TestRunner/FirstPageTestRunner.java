package TestRunner;

import Pages.FirstPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v105.page.model.BackForwardCacheNotRestoredReason;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.Setup;

public class FirstPageTestRunner extends Setup {

    FirstPage firstPage;
    @Test(priority = 1,description = "visit the prottoyon site")
    public void VisitPage(){
            driver.get("https://prottoyon.gov.bd/");
            firstPage = new FirstPage(driver);

            String linkActual = driver.getCurrentUrl();
            String linkExpected = "prottoyon";
            Assert.assertTrue(linkActual.contains(linkExpected));
    }
    @Test(priority = 1)
    public void checkLoginLabel() throws InterruptedException {
        firstPage = new FirstPage(driver);
        WebElement modalLogin = firstPage.labelLogin.get(0);
        modalLogin.click();
        /*
        Thread.sleep(2000);
        String modalLoginActual = modalLogin.getText();
        String modalLoginExpected = "লগইন";
        Assert.assertTrue(modalLoginActual.contains(modalLoginExpected));
         */
        Thread.sleep(2000);
        firstPage.CancelLoginModal.get(0).click();
    }
    @Test(priority = 2,description = "signUp as a nagorik")
    public void signUp(){
        firstPage.signUp.click();
        firstPage.signUpAsNagorik.get(0).click();
        driver.navigate().back();

        //if I want refresh current page then below script is the one
        //driver.navigate().refresh();

        //if once I go previous page, and then I want to back then below script is the one
        //driver.navigate().forward();
    }


}
