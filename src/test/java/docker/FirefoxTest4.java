package docker;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;

public class FirefoxTest4 {

    @Test
    public void test() throws MalformedURLException {
        System.out.println(LocalDateTime.now());
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        URL url = new URL("http://localhost:4444/");
        RemoteWebDriver driver = new RemoteWebDriver(url, firefoxOptions);
        driver.get("https://github.com");
        System.out.println("FirefoxTest "+driver.getTitle());
        driver.quit();
    }

}
