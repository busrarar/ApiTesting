import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class ApiMethods {
    private final RequestSpecification spec;

    public ApiMethods(String baseUrl) {
        this.spec = new RequestSpecBuilder().setBaseUri(baseUrl).build();
    }

    public Response postRequest(JSONObject jsonObject, String endpoint){

        Response response = given()
                .spec(spec)
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .post(endpoint)
                .then()
                .extract().response();
        return response;
    }

    public Response postRequest(String endpoint){

        Response response = given()
                .spec(spec)
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .post(endpoint)
                .then()
                .extract().response();
        return response;
    }

}

