package firsttest;

import io.restassured.path.json.JsonPath;

public class Augsixteen {

	public static void main(String[] args) {
		String st="{\"dashboard\":{\"purchaseAmount\":\"38000\",\"website\":"
				+ "\"testingshastra.com\"},\"courses\":[{\"title\":\"Selenium\",\"price\":9000},"
				+ "{\"title\":\"Python Selenium\",\"price\":1000},{\"title\":\"Headless Testing \","
				+ "\"price\":4000},{\"title\":\"Rest API\",\"price\":6000},{\"title\":\"Postman\",\"price\":2000},"
				+ "{\"title\":\"Postman\",\"price\":1000},{\"title\":\"C-Test\",\"price\":8000}]}";
             int i;
		      JsonPath j=new JsonPath(st);
		      int s=j.getInt("courses.size()");
		      for(i=0;i<s;i++)
		     {
			System.out.println(j.getString("courses["+i+"].title"));
		      }
		      int tot=0;
		      for(i=0;i<s;i++)
		      {
		    	  tot=tot+j.getInt("courses["+i+"].price");
		    	  
		      }
		       
		      System.out.println(tot);
		     int totamt=j.getInt("dashboard.purchaseAmount");
		     
		     if(totamt==tot)
		     {
		    	 System.out.println("The price is matched");
		     }
		     else
		     {
		    	 System.out.println("The price is not matched");
		     }
		      
		         
		        
		      
	}

	}

	


