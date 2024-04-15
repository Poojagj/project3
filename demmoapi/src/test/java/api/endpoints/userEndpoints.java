package api.endpoints;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

// created to perform  crud operations 

public class userEndpoints {
	
	public static Response createUser(User payload)
	{
	Response response =given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		
	.when()
	     .post(Routes.post_url);
	
	return response;
	
		
		
	}

}
