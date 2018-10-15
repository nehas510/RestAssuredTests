package TestFramework;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class sampleApiTestOlxRepo {
	
	
	@Test
	public void testGetSizeAPIOlxRepo()
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
	
	@Test
	public void testGetNamesAPIOlxRepo()
	{
		//Creating Issue/Defect
		
		RestAssured.baseURI= "https://api.github.com";
		Response resp=given().header("Content-Type", "application/json").
		when().
		get("/users/dubizzle/repos").then().statusCode(200).extract().response();
		   
		   List<String> jsonResponse = resp.jsonPath().getList("$");	        
	        String name = resp.jsonPath().getString("name");
	        System.out.println(name);
		  		
	}
}
