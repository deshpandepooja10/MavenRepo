package firsttest; //MAVEN PROJECT

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class test1 {
	public static void main(String[] args)
	{
	
     RestAssured.baseURI="http://216.10.245.166";
     given()
     .body("{\n" +
              "\"name\":\"3 thousand stiches\",\n"+
    	      " \"isbn\":\"TF203\",\n"+
    	      " \"aisle\":\"86065647\",\n"+
    	      "\"author\":\"Sudha-Murthy\"\n"+

     
     
	"}\n")
     .header("Content-Type","application/json")
     .when().post("/Library/Addbook.php").then().log().all();
    
}
}



