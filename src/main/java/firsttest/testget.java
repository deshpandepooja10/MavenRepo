package firsttest;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class testget {

	public static void main(String[] args) {
		 RestAssured.baseURI="http://216.10.245.166";
	     given()
	     .body("{\n"+
	    		 "\"name\":\"3 thousand stiches\",\n"+
	   	         " \"isbn\":\"TF203\",\n"+
	   	         " \"aisle\":\"86065647\",\n"+
	   	         "\"author\":\"Sudha-Murthy\"\n"+
	             "}\n")
	     .header("Content-Type","application/json").log().all()
	     .when().get("Library/GetBook.php")
	     .then().log().all();
	     
	  
	     
	   

	}

}
