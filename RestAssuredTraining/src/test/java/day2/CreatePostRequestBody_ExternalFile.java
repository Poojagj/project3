package day2;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class CreatePostRequestBody_ExternalFile {
	
	@Test
	void method() throws FileNotFoundException {
		
	
		
		File f = new File("C:\\Users\\PGJadhav\\OneDrive - WebMD Health Corp\\ExcelR_updated\\testng2\\RestAssuredTraining\\src\\test\\resources\\studentsdata.json");
		
		FileReader fr = new FileReader(f);
		
		JSONTokener jt = new JSONTokener(fr);
		
		JSONObject data= new JSONObject();
		
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

}
