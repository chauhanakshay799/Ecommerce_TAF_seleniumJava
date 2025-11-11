package pagesStep;

import API.ApiHandler;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.junit.Assert;
import java.util.Map;

public class APIStepDefs {

    Response response;

    @Given("User sends a GET request to {string}")
    public void user_sends_get_request(String url) {
        response = ApiHandler.sendGetRequest(url);
    }

    @Given("User sends a POST request to {string}")
    public void user_sends_post_request(String url) {
        response = ApiHandler.sendPostRequest(url, "{}");
    }

    @Given("User sends a PUT request to {string}")
    public void user_sends_put_request(String url) {
        response = ApiHandler.sendPutRequest(url, "{}");
    }

    @Given("User sends a POST request to {string} with parameter {string} as {string}")
    public void user_sends_post_request_with_parameter(String url, String param, String value) {
        response = ApiHandler.sendPostFormRequest(url, param, value);
    }

    @Given("User sends a POST request to {string} with parameters")
    public void user_sends_post_request_with_parameters(String url, io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> params = dataTable.asMap(String.class, String.class);
        response = ApiHandler.sendPostFormRequest(url, params);
    }

    @Given("User sends a DELETE request to {string}")
    public void user_sends_delete_request(String url) {
        response = ApiHandler.sendDeleteRequest(url);
    }

    @Given("User sends a DELETE request to {string} with parameters")
    public void user_sends_delete_request_with_parameters(String url, io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> params = dataTable.asMap(String.class, String.class);
        response = ApiHandler.sendDeleteRequest(url, params);
    }

    @Then("The response status code should be {int}")
    public void verify_status_code(int expectedCode) {
        Assert.assertEquals("Unexpected status code!", expectedCode, response.statusCode());
    }

    @And("The response should contain {string}")
    public void verify_response_contains(String keyword) {
        Assert.assertTrue(
                "Response does not contain expected text: " + keyword,
                response.asString().contains(keyword)
        );
    }

    @And("Print the response body")
    public void print_response_body() {
        System.out.println("=== API Response ===");
        System.out.println(response.asPrettyString());
    }
}
