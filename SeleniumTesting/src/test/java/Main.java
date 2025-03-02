import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Browser browserType = new Browser();
       
        try {
            
            String browser = "chrome";
           WebDriver driver = browserType.pickBrowser(browser);
            driver.get("http://portal-sop-stg.fpt.vn");
            // phóng to màn hình
            driver.manage().window().maximize();
            Thread.sleep(5000);
            LoginLogic loginLogic = new LoginLogic(driver);
            loginLogic.setLoginByEmailFPT();
            loginLogic.login("huynq250@fpt.com", "Check@140903");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
