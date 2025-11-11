package API;

import io.restassured.response.Response;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class ApiHandler {

    public static Response sendGetRequest(String url) {
        return given()
                .when()
                .get(url)
                .then()
                .extract().response();
    }

    public static Response sendPostRequest(String url, String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(url)
                .then()
                .extract().response();
    }

    public static Response sendPutRequest(String url, String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .put(url)
                .then()
                .extract().response();
    }

    public static Response sendPostFormRequest(String url, String key, String value) {
        return given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .formParam(key, value)
                .when()
                .post(url)
                .then()
                .extract().response();
    }

    public static Response sendPostFormRequest(String url, Map<String, String> params) {
        return given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .formParams(params)
                .when()
                .post(url)
                .then()
                .extract().response();
    }

    public static Response sendDeleteRequest(String url) {
        return given()
                .when()
                .delete(url)
                .then()
                .extract().response();
    }

    public static Response sendDeleteRequest(String url, Map<String, String> params) {
        return given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .formParams(params)
                .when()
                .delete(url)
                .then()
                .extract().response();
    }
}
