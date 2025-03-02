import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLogic {
     WebDriver driver;
    By usernameField = By.id("i0116");
    By passwordField = By.id("i0118");
    By loginByEmailFPT = By.cssSelector("#root > div.ant-pro-page-container > div.ant-pro-grid-content > div > div > div > div > div.content___17R68 > div.button___c6S79 > button:nth-child(1)");
    By loginButton = By.id("idSIButton9");
    public LoginLogic(WebDriver driver) {
        this.driver = driver;
        System.out.println("1111");
    }

    public void setLoginByEmailFPT() throws InterruptedException {
        WebElement loginFPTBtn = driver.findElement(loginByEmailFPT);
        loginFPTBtn.click();
        Thread.sleep(2000);
        System.out.println("--------");
    }

    public void enterUsername(String username)  {
        WebElement usernameElement = driver.findElement(usernameField);
        usernameElement.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
    }

    public void clickLogin() {
        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();
    }

    public void login(String username, String password) throws InterruptedException {
        enterUsername(username);
        clickLogin();
        Thread.sleep(2000);
        enterPassword(password);
        clickLogin();
        Thread.sleep(15000);
        clickLogin();

    }
}
