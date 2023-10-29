package Api.ApiAutomation;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class ParticularwordIsThereOrNotInoutput {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		String res=given().header("Content-Type","application/json").body("{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}").when().post("booking").then().body(containsString("Jim")).
				statusCode(200).extract().response().asString();
		System.out.println(res);
	}

}
