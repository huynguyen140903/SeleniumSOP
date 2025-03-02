import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.SQLOutput;

public class Browser {
    public WebDriver pickBrowser(String browser) {
        WebDriver driver = null;
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            System.out.println("Khởi tạo chrome");
        } else if (browser.equalsIgnoreCase("firefox")) {
             driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Trình duyệt không hợp lệ! Vui lòng thử lại!!");
        }

        return driver;
    }

}
