package com.qa.testapi;


import com.qa.restapi.automation.TestBase;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class TestAPI  extends TestBase {
    TestBase testBase;
    @BeforeSuite
    public void setup(){
        System.out.println("Setup");
    }
    static RequestSpecification reqspec(){
        RequestSpecBuilder speci=new RequestSpecBuilder();
        speci.setBaseUri("https://reqres.in/");
        speci.setBasePath("api/users");
        RequestSpecification req=speci.build();
        return req;
    }
    public void uploadFile(){
        File file=new File("");
        Response response=given().multiPart("file","multipart/form-data").when().post().thenReturn();
        System.out.println(response.prettyPrint());
    }
    public void downloadFile() throws IOException {
        Response response=given().when().get().andReturn();
        byte[] bytes=response.getBody().asByteArray();
        File file=new File("path/users.json");
        Files.write(file.toPath(),bytes);

    }

    @Test
    public void getMethod(){

        RestAssured.basePath="api/unknown";
        given().spec(reqspec()).queryParam("page","2")
                .when().get().then().log().all().extract().response().prettyPrint();
    }
    @Test
    public void postMethod(){
        RestAssured.basePath="api/login";
        String resbody="{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"cityslicka\"\n" +
                "}";
        int statuscode=RestAssured.given().contentType(ContentType.JSON).body(resbody).when().post().then().extract().statusCode();
        System.out.println(statuscode);
    }

    @Test
    public void deleteMethod(){
        basePath="api/users/2";
        int statusCode=given().when().delete().then().extract().statusCode();
        System.out.println(statusCode);
    }



        @AfterSuite
    public void teardown(){
        System.out.println("tear down");
    }
}
