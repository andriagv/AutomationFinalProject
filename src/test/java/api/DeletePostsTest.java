package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeletePostsTest {

    @Test
    public void deletePost_shouldReturn200or204() {
        Response response = RestAssured.delete("https://jsonplaceholder.typicode.com/posts/1");

        int status = response.statusCode();
        Assert.assertTrue(status == 200 || status == 204, "Unexpected status code: " + status);
    }
}
