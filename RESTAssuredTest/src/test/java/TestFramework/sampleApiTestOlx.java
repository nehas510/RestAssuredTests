package TestFramework;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class sampleApiTestOlx {

	@Test
	public void testAPIOlx()
	{
		//Creating Issue/Defect
		
		RestAssured.baseURI= "https://api.github.com";
		Response resp=given().header("Content-Type", "application/json").
		when().
		get("/users/dubizzle").then().statusCode(200).extract().response();
		 JsonPath js= ReusableMethods.rawToJson(resp);
		   int id=js.get("id");
		   System.out.println(id);
		  		
	}
	
	
	@Test
	public void testAPIOlxRepo()
	{
		//Creating Issue/Defect
		
		RestAssured.baseURI= "https://api.github.com";
		Response resp=given().header("Content-Type", "application/json").
		when().
		get("/users/dubizzle/repos").then().statusCode(200).extract().response();
		// JsonPath js= ReusableMethods.rawToJson(resp);
		   
		   List<String> jsonResponse = resp.jsonPath().getList("$");
	        System.out.println(jsonResponse.size());
		  		
	}
}
