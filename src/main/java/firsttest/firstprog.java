package firsttest;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class firstprog {

	public static void main(String[] args) {
		
		RestAssured.baseURI="http://dummy.restapiexample.com";
	     given()
	     .body("{\n" +
	    		  "\"name\":\"Samu\",\n"+
	    		  "\"salary\":\"20000\",\n"+
	    		   "\"age\":\"28\"\n"+
	    		"}\n")
	    	
	.headers("Content-Type","application/json").log().all()
	.when().post("/api/v1/create")
	.then().log().all();

	}
}
