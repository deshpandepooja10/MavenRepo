package firsttest;

import static io.restassured.RestAssured.given;

public class delete {

	public static void main(String[] args) {
		//RestAssured.baseURI="http://dummy.restapiexample.com/";
      String delete="http://dummy.restapiexample.com/api/v1/delete/{id}";
      String id="2245";
      String end=delete+id;
     given()
     .log().all()
        .pathParam("id",id)
      .when()
      .delete(delete)
     .then()
     .log().all();
        
     
      
     
      
       
      
      
      		
	}

	
}
