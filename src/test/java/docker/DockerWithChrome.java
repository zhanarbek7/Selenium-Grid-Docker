package docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerWithChrome {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");

        URL url = new URL("http://localhost:4444/");

        RemoteWebDriver driver = new RemoteWebDriver(url, dc);
        driver.get("https://google.com");
        System.out.println("Title of the page: "+driver.getTitle());
        driver.quit();
    }
}
