package firsttest;
import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.hamcrest.Matchers;

import com.github.fge.jsonschema.library.Library;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class sizteenaug {

	public static void main(String[] args)  throws IOException{
		
		RestAssured.baseURI="http://216.10.245.166";
	     given()
	     .body("{\n" +
	              "\"name\":\"do\",\n"+
	    	      " \"isbn\":\"TF103\",\n"+
	    	      " \"aisle\":\"865647\",\n"+
	    	      "\"author\":\"Sudha-Murthy\"\n"+
	    		 "}\n")
	        .header("Content-Type","application/json")
	        	
	    
	        	.log().all()
	        	.when()
	        	.post("/Library/Addbook.php")
	        	.then().log().all()
	        	.assertThat()
	        	.statusCode(200)
	        	
	        	// .body("ID",Matchers.equalTo("isbn+aisle"))
	        	.body("Msg", Matchers.equalTo("successfully added"));
	        	
	        	
	  }

	private static RequestSpecification header(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
