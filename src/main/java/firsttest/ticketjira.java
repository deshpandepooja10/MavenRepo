package firsttest;
import static io.restassured.RestAssured.given;



import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.http.ContentType;

public class ticketjira {
	public static final String sessionTic= "rest/auth/1/session";
	public static final String createTic= "rest/api/2/issue";
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
		.statusCode(200)
	
		.log().all();
		//CREATE A NEW TICKET
		given()
		.contentType(ContentType.JSON)
		.body(ticketcreate.createLoad)
		.log().all()
		.filter(filter)
		
		.when().post(createTic)
		
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
		
	
		

		
	}
	public static void main(String[] args)
	{
		ticketjira.createSession();
	}

}
