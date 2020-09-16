package pojo;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.http.ContentType;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * CourseDetailsone dashboard=new CourseDetailsone();
		 * dashboard.setpurchaseamount(15000);
		 * dashboard.setwebsite("testingshastra.com");
		 */
		CourseDetailsone seldet=new CourseDetailsone();
		seldet.settitle("Selenium");
		seldet.setprice(5000);
		CourseDetailsone cypressdet=new CourseDetailsone();
		cypressdet.settitle("Cypress");
		cypressdet.setprice(6000);
		
		CourseDetailsone Protractordet=new CourseDetailsone();
		Protractordet.settitle("Protractor");
		Protractordet.setprice(6000);
		
		CourseDetailsone Restdet=new CourseDetailsone();
		Restdet.settitle("Rest");
		Restdet.setprice(6000);
		
		CourseDetailsone Soapdet=new CourseDetailsone();
		Soapdet.settitle("Soap");
		Soapdet.setprice(6000);
		
		CourseDetailsone Cdet=new CourseDetailsone();
		Cdet.settitle("C");
		Cdet.setprice(5000);
		
		CourseDetailsone Appiumdet=new CourseDetailsone();
		Appiumdet.settitle("Appium");
		Appiumdet.setprice(6000);
		
		
		
		List<CourseDetailsone> weblist=new ArrayList();
		weblist.add(seldet);
		weblist.add(cypressdet);
		
		
		List<CourseDetailsone> apilist=new ArrayList();
		apilist.add(Soapdet);
		apilist.add(Restdet);
		apilist.add(Protractordet);
	
		
		List<CourseDetailsone>  mobilelist=new ArrayList();
		mobilelist.add(Appiumdet);
		mobilelist.add(Cdet);
		
		DashboardRun  dash=new DashboardRun();
		dash.setpurchaseamount(15000);
		dash.setwebsite("testingshastra.com");
		Courses courses=new Courses();

		courses.setwebautomation(weblist);
	
		
		courses.setapi(apilist);
		courses.setmobileautomation(mobilelist);
		
		
		Tution t=new Tution();
		t.setcourses(courses);
		t.setdashboard(dash);
	    given()
		.log().all()
		.contentType(ContentType.JSON)
		.body(t)
	     .when()
		.post("http://216.10.245.166/Library/Addbook.php")
		.then()
		.log().all();

	}

}
