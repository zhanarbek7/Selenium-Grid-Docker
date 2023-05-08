package docker;


import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest2 {

    @Test
    public void test() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        URL url = new URL("http://localhost:4444/");
        RemoteWebDriver driver = new RemoteWebDriver(url, chromeOptions);
        driver.get("https://github.com");
        System.out.println("ChromeTest2 "+driver.getTitle());
        driver.quit();
    }

}
