package day2;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class CreatePostRequestBody_POJO {
	
	@Test
	void method() {
	Pojo data = new Pojo();
	data.setName("John");
	data.setLocation("France");
	data.setPhone_number("12345");

	String courseArr[] = {"C" ,"C++"};
	data.setCourseArr(courseArr);
	
	given()
	.contentType("application/json")
	 .body(data)
	
	 
	 .when()
	     .post("http://localhost:3000/Students")
	     
	 .then()
	     .statusCode(201)
	     .body("name",equalTo("John"))
	     .body("location", equalTo("France"))
	     .body("phone_number",equalTo("12345"))
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
