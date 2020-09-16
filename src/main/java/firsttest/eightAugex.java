package firsttest;
import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
public class eightAugex {
	public static void main(String[] args) throws IOException
	{
	
		
			
	
		String path="src\\main\\resources\\userbody.json";
		String read=generateStringFromResource(path);
		System.out.println("Output"+read);
		String updatepayload=String.format(read,"Priyanka","Dikshit","priyu@gmail.com");
		System.out.println(read);
		System.out.println(updatepayload);
		//return new String(Files.readAllBytes(Paths.get(path)));
	}
		 public static String generateStringFromResource(String path) throws IOException {
	        return new String(Files.readAllBytes(Paths.get(path)));
	}
public static void user() throws IOException{
	String path="src\\test\\resources\\userbody.json";
	String read=generateStringFromResource(path);
		        
		 RestAssured.baseURI="https://gorest.co.in/public-api"; 
		given()
		.relaxedHTTPSValidation()
		.body(read)
		.header("Authorization","Bearer QHg-NmZ6J2N6ipPyo_e0csmZkBDimy567wdX")
		.header("Content-Type","application/json")
		.log().all()
		.when().post("/users")
		.then().log().all();
}
		

		 }  
		    
		
	

//application/json
/* public static String generateStringFromResource(String path) throws IOException {
return new String(Files.readAllBytes(Paths.get(path)));
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;*/