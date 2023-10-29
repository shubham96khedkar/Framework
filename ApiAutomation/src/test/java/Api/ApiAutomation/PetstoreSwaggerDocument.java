package Api.ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class PetstoreSwaggerDocument {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://petstore.swagger.io/v2/pet";
		/*String s=given().header("Content-Type","application/json").queryParam("status","available")
		  .when().get("findByStatus").then().statusCode(200).extract().response().asString();
		
		System.out.println(s);*/
	    String s=given().header("Content-Type","application/json").when().get("13").then().statusCode(200)
		  .extract().response().asString();
		System.out.println(s);
		JsonPath js=new JsonPath(s);
		String str=js.getString("id");
		System.out.println(str);
		
	    String p=js.getString("name");
	    System.out.println(p);
		
	    String q=js.getString("category.name");
	    System.out.println(q);
	    
	   String r=js.getString("photoUrls[0]");
	   System.out.println(r);
	   
	   String a=js.getString("photoUrls[1]");
	   System.out.println(a);
	   
	  String t=js.getString("tags[0]");
	   System.out.println(t);
	   
	   String y=js.getString("tags[0].name");
	   System.out.println(y);
	   
	   String z=js.getString("status");
	    System.out.println(z);
	   
	   String x=js.getString("category.id");
	    System.out.println(x);
		
		
	}

}
