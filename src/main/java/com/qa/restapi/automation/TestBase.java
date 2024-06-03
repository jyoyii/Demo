package com.qa.restapi.automation;



import io.restassured.RestAssured;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public static Properties prop;
    public TestBase() {


        RestAssured.baseURI="https://reqres.in/";
        try{
            prop =new Properties();
            FileInputStream fp=new FileInputStream("src/main/java/com/qa/config/config.properties");
            prop.load(fp);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
