package day2;

import java.util.HashMap;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class CreatePostRequestBody_HashMap {
	
	//1.Post request body using HashMap
	
	@Test
	void testPostUsingHashMap() {
		
		HashMap data = new HashMap();
		data.put("name", "Scott");
		data.put("location", "France");
		data.put("phone_number", "48975873");
		
		String courseArr[] = {"C" ,"C++"};
		data.put("courses", courseArr);
		
		given()
		.contentType("application/json")
		 .body(data)
		
		 
		 .when()
		     .post("http://localhost:3000/Students")
		     
		 .then()
		     .statusCode(201)
		     .body("name",equalTo("Scott"))
		     .body("location", equalTo("France"))
		     .body("phone_number",equalTo("48975873"))
		     .body("courses[0]",equalTo("C"))
		     .body("courses[1]",equalTo("C++"))
		     .header("Content-Type","application/json")
		     .log().all();     
		
	}
	
	void testDelete() {
		
		given()
		
		.when()
		       .delete("http://localhost:3000/Students/41c7")
		.then()
		     .statusCode(204)
		     .log().all();
		
	}

}
