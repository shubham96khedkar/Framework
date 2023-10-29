package Api.ApiAutomation;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class TestRestGetMethod {

	public static void main(String[] args) {
		
		
	RestAssured.baseURI="https://restful-booker.herokuapp.com";
	String res=given().header("Content-Type","application/json").when().get("booking").
	  then().statusCode(200).extract().response().asString();
    System.out.println(res);
	}

}
