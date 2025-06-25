package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetPostsTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test(priority = 1)
    public void testGetAllPosts() {
        given()
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .body("size()", greaterThanOrEqualTo(100));
    }

    @Test(priority = 2)
    public void testGetSinglePost() {
        given()
                .when()
                .get("/posts/1")
                .then()
                .statusCode(200)
                .body("userId", equalTo(1))
                .body("id", equalTo(1));
    }

    @Test(priority = 3)
    public void testCreatePost() {
        String requestBody = "{\n" +
                "  \"title\": \"Test Title\",\n" +
                "  \"body\": \"Test Body\",\n" +
                "  \"userId\": 1\n" +
                "}";

        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .body("title", equalTo("Test Title"))
                .body("body", equalTo("Test Body"))
                .body("userId", equalTo(1));
    }

    @Test(priority = 4)
    public void testUpdatePost() {
        String requestBody = "{\n" +
                "  \"id\": 1,\n" +
                "  \"title\": \"Updated Title\",\n" +
                "  \"body\": \"Updated Body\",\n" +
                "  \"userId\": 1\n" +
                "}";

        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/posts/1")
                .then()
                .statusCode(200)
                .body("title", equalTo("Updated Title"));
    }

    @Test(priority = 5)
    public void testDeletePost() {
        given()
                .when()
                .delete("/posts/1")
                .then()
                .statusCode(anyOf(equalTo(200), equalTo(204)));
    }
}