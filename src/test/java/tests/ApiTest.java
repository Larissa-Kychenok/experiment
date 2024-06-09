package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTest {

    @Test
    public void testGetRequest() {
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");

        // Verify the status code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200, "Status code is not 200");

        // Verify the content type
        String contentType = response.getContentType();
        Assert.assertTrue(contentType.contains("application/json"), "Content type is not application/json");

        // Verify a specific field in the response body
        String title = response.jsonPath().getString("title");
        Assert.assertEquals(title, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "Title does not match");
    }
}
