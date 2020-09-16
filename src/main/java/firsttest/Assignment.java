package firsttest;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class Assignment {

		public static void main(String[] args) throws IOException {
			String path="src\\main\\resources\\userbody.json";
			String read=generateStringFromResource(path);
			System.out.println("Output"+read);
			//String updatepayload=String.format(read,"TF20","20","Survi");
			System.out.println(read);
			//System.out.println(updatepayload);
			//return new String(Files.readAllBytes(Paths.get(path)));
		}
			 public static String generateStringFromResource(String path) throws IOException {
		        return new String(Files.readAllBytes(Paths.get(path)));
			 }
			 public static void user() throws IOException {
				 
		String path="src/main/resources/userbody.json";
		String load=generateStringFromResource(path);
		RestAssured.baseURI="https://gorest.co.in/public-api";
		given()
		.relaxedHTTPSValidation()
	     .body(load)
		.log().all()
		
		
	
		.header("Authorization","Bearer KxH5L7KnBoBeWPmtpuvoNpWPgRamDNNMEEYy")
		.header("Content-Type","application/json")
		.when().get("/users")
		
	
	    
	    .then().assertThat().statusCode(200)
	    
	    .
		
		
	}
	

}
