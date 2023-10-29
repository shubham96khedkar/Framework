package Api.ApiAutomation;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class AssignmentCompleteChain {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		// Create a record
		String postres = given().header("Content-Type", "application/json")
				.body("{\r\n" + "    \"firstname\" : \"Jim\",\r\n" + "    \"lastname\" : \"Brown\",\r\n"
						+ "    \"totalprice\" : 111,\r\n" + "    \"depositpaid\" : true,\r\n"
						+ "    \"bookingdates\" : {\r\n" + "        \"checkin\" : \"2018-01-01\",\r\n"
						+ "        \"checkout\" : \"2019-01-01\"\r\n" + "    },\r\n"
						+ "    \"additionalneeds\" : \"Breakfast\"\r\n" + "}")
				.when().post("booking").then().statusCode(200).extract().response().asString();
		JsonPath js1 = new JsonPath(postres);
		int i = js1.getInt("bookingid");
		System.out.println(postres);
		System.out.println(i);
		System.out.println("===============Get record================");

		// Get Record
		String getres = given().header("Content-Type", "application/json").when().get("booking").then().statusCode(200)
				.extract().response().asString();
		System.out.println(getres);
		System.out.println("================Create token==============");

		// Generate token
		String tokenres = given().header("Content-Type", "application/json")
				.body("{\r\n" + "    \"username\" : \"admin\",\r\n" + "    \"password\" : \"password123\"\r\n" + "}")
				.when().post("auth").then().statusCode(200).extract().response().asString();
		JsonPath js2 = new JsonPath(tokenres);
		String token = js2.getString("token");
		System.out.println(token);
		System.out.println("=================Update record=============");
		
		//Update record
		String putres=given().header("Content-Type","application/json").header("Cookie","token="+token).body("{\r\n"
				+ "    \"firstname\" : \"Jamesaaaaabbb\",\r\n"
				+ "    \"lastname\" : \"Brownrrrsssss\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}").when().put("booking/"+i).then().extract().response().asString();
		System.out.println(putres);
		System.out.println("=================Get record==============");
		
		// Get Record
				String getres1 = given().header("Content-Type", "application/json").when().get("booking").then().statusCode(200)
						.extract().response().asString();
				System.out.println(getres1);
				System.out.println("============Patch record============ ");
				
				
		//Patch Record
				String res1=given().header("Content-Type","application/json").header("Cookie","token="+token)
				.body("{\r\n"
						+ "    \"firstname\" : \"James\",\r\n"
						+ "    \"lastname\" : \"Brown\"\r\n"
						+ "}").when().patch("booking/"+i).then().extract().response().asString();
				System.out.println(res1);
				System.out.println("==============Delete record============");
				
				
				//Delete record
				given().header("Content-Type","application/json").header("Cookie","token="+token)
				.when().delete("booking/"+i).then().statusCode(201);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}