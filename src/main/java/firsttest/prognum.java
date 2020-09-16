package firsttest;

import io.restassured.path.json.JsonPath;

public class prognum {

	public static void main(String[] args) {
		String s="{\"dashboard\":{\"purchaseAmount\":\"38000\",\"website\":\"testingshastra.com\"},\"courses\""
				+ ":[{\"title\":\"Selenium\",\"price\":9000},{\"title\":\"Python Selenium\",\"price\":1000},"
				+ "{\"title\":\"Headless Testing \",\"price\":4000},{\"title\":\"Rest API\",\"price\":6000},"
				+ "{\"title\":\"Postman\",\"price\":2000},{\"title\":\"Postman\",\"price\":1000},{\"title\":\"C-Test\",\"price\":8000}]}";

				
		JsonPath jsonPath=new JsonPath(s);
		int sizes=jsonPath.getInt("courses.size()");
		System.out.println(sizes);
		
		  for(int i=0;i<=sizes;i++) {
		   System.out.println(jsonPath.getString("courses["+i+"].
		  }
		 
		

	}

}
