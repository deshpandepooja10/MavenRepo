package pojo;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
public class FridgeRun {

	public static void main(String[] args) {
		
		  Fridge obj=new Fridge(); 
		  obj.setBrand("snumsung"); 
		  obj.setCapacity("10LTR");
		  obj.setrating(10);
		  Hall halls=new Hall(); 
		  halls.sethall("TV");
		  halls.setsofa("homedecor");
		  pojofridge frige=new pojofridge();
		  frige.setfridge(obj);
		  frige.sethall(halls);
		  frige.setaddress("c-12,Palak-Avenue,Karvenagar");
						
		given()
		.log().all()
		.contentType(ContentType.JSON)
	
		.body(frige)
		.when()
		.post("http://216.10.245.166/Library/Addbook.php")
		.then()
		.log().all();
	}

}
