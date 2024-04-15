package day2;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class CreatePostRequestBody_JSON_Object {
	
	
	@Test
	void method() {
		
		JSONObject data= new JSONObject();
		data.put("name", "Scott");
		data.put("location", "France");
		data.put("phone_number", "48975873");
		
		String courseArr[] = {"C" ,"C++"};
		data.put("courses", courseArr);
		
		given()
		.contentType("application/json")
		 .body(data.toString())
		
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
