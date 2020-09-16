package firsttest;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;

public class create {

	public static void main(String[] args) throws IOException {
		String path="src\\main\\resources\\create1.json";
		String read=generateStringFromResource(path);
		System.out.println("Output"+read);
		String updatepayload=String.format(read,"TF20","20","Survi");
		System.out.println(read);
		System.out.println(updatepayload);
		//return new String(Files.readAllBytes(Paths.get(path)));
	}
		 public static String generateStringFromResource(String path) throws IOException {
	        return new String(Files.readAllBytes(Paths.get(path)));
	}
public static void user() throws IOException{
	String path="src\\test\\resources\\create1.json";
	String read=generateStringFromResource(path);
		        
		 RestAssured.baseURI="https://216.10.245.166/Library/Addbook.php"; 
		given()
		.relaxedHTTPSValidation()
		.body(read)
		.header("Authorization","Bearer QHg-NmZ6J2N6ipPyo_e0csmZkBDimy567wdX")
		.header("Content-Type","application/json")
		.log().all()
		.when().post("/Addbook.php")
		.then().log().all();
}

	}


