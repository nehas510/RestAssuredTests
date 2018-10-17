package TestFramework;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import Model.OlxAPI;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class sampleApiTestOlx {

	@Test
	public void getIDAPIOlx()
	{
		//Creating Issue/Defect
		
		RestAssured.baseURI= "https://api.github.com";
		Response resp=given().header("Content-Type", "application/json").
		when().
		get("/users/dubizzle").then().statusCode(200).extract().response();
		 JsonPath js= ReusableMethods.rawToJson(resp);
		   int id=js.get("id");
		   System.out.println("The id is : " + id);
		     
		   
		  		
	}
	
/*
 * This function will set the complete JSon data to object which can be used for validating the data 	
 */
	void setDatatoObject(JsonPath js) {
		
		
		   OlxAPI object = new OlxAPI();
		   
		   object.setLogin((String) js.get("login"));
		   object.setId((Integer) js.get("id"));
		   object.setNodeId((String) js.get("node_id"));
		   object.setAvatarUrl((String) js.get("avatar_url"));
		   object.setGravatarId((String) js.get("gravatar_id"));
		   object.setUrl((String) js.get("followers_url"));
		   object.setHtmlUrl((String) js.get("following_url"));
		   object.setFollowersUrl((String) js.get("gists_url"));
		   object.setFollowingUrl((String) js.get("starred_url"));
		   object.setGistsUrl((String) js.get("subscriptions_url"));
		   object.setStarredUrl((String) js.get("organizations_url"));
		   object.setSubscriptionsUrl((String) js.get("repos_url"));
		   object.setOrganizationsUrl((String) js.get("events_url"));
		   object.setReposUrl((String) js.get("received_events_url"));
		   object.setEventsUrl((String) js.get("type"));
		   object.setReceivedEventsUrl((String) js.get("site_admin"));
		   object.setType((String) js.get("name"));
		   object.setSiteAdmin( (Boolean) js.get("company"));
		   object.setBlog((String) js.get("blog"));
		   object.setLocation((String) js.get("location"));
		   object.setEmail((String) js.get("email"));
		   object.setHireable((String) js.get("hireable"));
		   object.setBio((String) js.get("bio"));
		   object.setPublicRepos( (Integer) js.get("public_repos"));
		   object.setPublicGists((Integer) js.get("public_gists"));
		   object.setFollowers((Integer) js.get("followers"));
		   object.setFollowing((Integer) js.get("following"));
		   object.setCreatedAt((String) js.get("created_at"));
		   object.setUpdatedAt((String) js.get("updated_at"));
		  
	}
	
	
	
}
