package automaterest;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class setupurl {
	   @BeforeTest
	public void launchurl() {
	RestAssured.baseURI="http://216.10.245.166";

}
}
