package firsttest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import io.restassured.RestAssured;

public class Keyvalue {

	public static void main(String[] args) {
	   HashMap map=new HashMap();
	   map.put("10", "Shaila");
	   given()
	   .header("Content-Type","application/json").log().all()
	   
	.queryParams(map)
	.when()
	 .get("/Library/Addbook.php")
	.then().log().all();
	   
	   
	     
	}

}
