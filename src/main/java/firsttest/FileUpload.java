package firsttest;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.http.ContentType;

public class FileUpload {
	public static final String sessionTic= "rest/auth/1/session";
	public static final String UploadFile= "rest/api/2/issue/DR-6/attachments";
	//CREATE SESSION
	public static void  createSession() {

		SessionFilter filter=new SessionFilter();
		RestAssured.baseURI="http://localhost:8080/";
		given()
		.contentType(ContentType.JSON)
		.body(ticketcreate.payload)
		.log().all()
		.filter(filter)
		.when()
		.post(sessionTic)
		.then()
		
		.assertThat()
		.statusCode(200);
		
		
		
		//UPLOAD THE FILE
		given()
		.header("X-Atlassian-Token","nocheck")
		.header("Content-Type", "multipart/form-data")
		.filter(filter)
		.multiPart("file",new File("C:\\Users\\shailesh deshpande\\Desktop\\Doc1.docx"))
	    .when().post(UploadFile)
	    .then()
	    .log().all()
	    .assertThat().statusCode(200);
	    
	}
	public static void main(String[] args)
	{
		FileUpload.createSession();
	}

}
