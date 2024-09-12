import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiTesting {
	@Test
	public void validatingResponseCode() {
		String url = "http://localhost:12082/medicare_new/";
		String endPoint = "show/all/products";
		RestAssured.baseURI=url;
		RequestSpecification rq = RestAssured.given();
		Response res = rq.log().all().get(endPoint);
		int expectedCode=200;
		Assert.assertEquals(res.getStatusCode(),expectedCode,"Response code validated successfully");
	}
	@Test
	public void validateResponseContent() {
		String url ="http://localhost:12082/medicare_new";
		String endPoint = "/show/category/2/products";
		RestAssured.baseURI=url;
		RequestSpecification req = RestAssured.given().contentType(ContentType.TEXT);
		Response res = req.log().all().get(endPoint);
		//System.out.println(res.asPrettyString());
		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertTrue(res.asString().contains("Analgesics"));
		
		
	}

}
