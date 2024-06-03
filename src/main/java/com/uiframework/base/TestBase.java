package com.uiframework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    //maximiseWindow()
    //pageLoadTimeout()
    //implicitWait()
    //deleteAllCookies()
    //getUrl()
    static WebDriver driver;
    static Properties prop;
    public TestBase(){
        try{
            prop=new Properties();
            FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/Users/administrator/IdeaProjects/Demo/src/main/java/com/uiframework/config/testConfig.properties");
            prop.load(fis);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void initialization(){
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "");
            driver=new ChromeDriver();
        }else if (browserName.equals("edge")){
            System.setProperty("webdriver.edge.driver", "");
            driver=new EdgeDriver();
        }
    }

}
