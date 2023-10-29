package Api.ApiAutomation;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class UpdateRecord {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		//Post Method
		String res=given().header("Content-Type","application/json").body("{\r\n"
				+ "    \"firstname\" : \"James\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}").when().post("booking").then().extract().response().asString();
		System.out.println(res);
		JsonPath js=new JsonPath(res);
		int i=js.getInt("bookingid");
		System.out.println(i);
		
		//Updating Record
		String res1=given().header("Content-Type","application/json").header("Cookie","token=8b90c48388c731b")
		.body("{\r\n"
				+ "    \"firstname\" : \"Jamesyyyy\",\r\n"
				+ "    \"lastname\" : \"Brownieeee\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}").when().put("booking/"+i).then().extract().response().asString();
		System.out.println(res1);
		
		

	}

}
