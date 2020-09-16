package automaterest;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class proj_two extends setupurl {
      @Test
	 public static void  createpayload() {
		 given()
		 .contentType(ContentType.JSON)
		 .header("Authorization","Bearer QHg-NmZ6J2N6ipPyo_e0csmZkBDimy567wdX")
		 .body(projtwo_create.payload)
		 .log().all()
		 .when().post("/Library/Addbook.php")
		 .then().log().all();
	
	 }
      @Test
      public static void getIdpayload() {
    	  
         int TF20386065647 = 0;
		int ID=TF20386065647;
    	  given()
    	  .contentType(ContentType.JSON)
    	  .header("Authorization","Bearer QHg-NmZ6J2N6ipPyo_e0csmZkBDimy567wdX")
    	  .body(projtwo_create.getId)
    	  .log().all()
    	  .when().get("/Library/GetBook.php")
    	  .then().log().all();
    	  if(ID==TF20386065647)
    	  {
    	      Assert.assertTrue(true);
          }
		
      }

	

	 
}
