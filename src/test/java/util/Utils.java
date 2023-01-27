package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utils {

    private static Object certificate;

    protected static void setDriverByOS(){
        String driverPath = "src/test/resources/drivers/";
        if(System.getProperty("os.name").contains("Windows")){
            driverPath = driverPath + "chromedriver.exe";
        }else{
            driverPath = driverPath + "chromedriver";
        }
        System.setProperty("webdriver.chrome.driver", driverPath);
    }

}
