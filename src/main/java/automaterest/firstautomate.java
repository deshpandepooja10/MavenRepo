package automaterest;
import firsttest.ticketcreate;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import firsttest.ticketcreate;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.http.ContentType;

public class firstautomate {
	public final String createSession="rest/auth/1/session";
	public final String createIssue="rest/api/2/issue";
	public final String createComment="rest/api/2/issue/DR-6/comment";
	SessionFilter filter;	
    @BeforeTest
	public  void launchURL() {
		
		RestAssured.baseURI="http://localhost:8080/";
	}
    @Test
    public void createSessions() {
    	filter=new SessionFilter();
    	 given().log().all()
    	.contentType(ContentType.JSON)
    	.body(ticketcreate.payload)
    	.filter(filter)
    	.log().all()
    	.when()
    	.post("createSession")
    	.then().log().all()
    	.assertThat().statusCode(200);
    	
    }
    @Test
    public void createIssues() {
     	filter=new SessionFilter();
    	given().log().all()
    	.contentType(ContentType.JSON)
    	.body(ticketcreate.createLoad).log().all()
    	.filter(filter)
    	.when().post(createIssue)
    	.then()
    	.assertThat().statusCode(201).log().all();
    	
    	
    }
    @Test
    public void createComments() {
     	filter=new SessionFilter();
     	given().log().all()
     	.contentType(ContentType.JSON)
     	.body(ticketcreate.comments)
     	.filter(filter)
     	.when().post(createComment)
     	.then().log().all();
    }
    

}

