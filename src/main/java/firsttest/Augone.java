package firsttest;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

import io.restassured.RestAssured;

public class Augone {

	public static void main(String[] args) {
		RestAssured.baseURI="https://gorest.co.in/public-api";
		given()
		.header("Authorization","Bearer QHg-NmZ6J2N6ipPyo_e0csmZkBDimy567wdX")
		.log().all()
		.body("{\n"+
				
		        "   \"first_name\":\"Sonu\",\n"+
		         "  \"last_name\":\"Sona\",\n"+
		        "    \"gender\":\"male\",\n"+
		         "   \"email\":\"female\",\n"+
		          "  \"status\":\"active\"\n"+
				
				"}")
		.when()
	    .get("https://gorest.co.in/public-api")
	    .then()
	    .assertThat()
	    .statusCode(200)
	    .log().all();
		
		
		

	}

}
