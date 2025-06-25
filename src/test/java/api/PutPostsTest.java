package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PutPostsTest {

    @Test
    public void updatePost_shouldChangeTitleField() {
        String updatedBody = """
                {
                  "id": 1,
                  "title": "updated title",
                  "body": "bar",
                  "userId": 1
                }
                """;

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(updatedBody)
                .put("https://jsonplaceholder.typicode.com/posts/1");

        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("title"), "updated title");
    }
}
