import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


public class Redirect {
    @Test
    public void testRestAssured(){
//        Map<String, String> headers = new HashMap<>();
//       headers.put("myHeader1","myValue1");
//        headers.put("myHeader2","myValue2");

        Response response = RestAssured
                .given()
                .redirects()
                .follow(false)
                .when()
                .get("https://playground.learnqa.ru/api/long_redirect")
                .andReturn();

        response.prettyPrint();

        String localionHeader = response.getHeader("Location");
        System.out.println(localionHeader);

//       int statusCode = response.getStatusCode();
//       System.out.println(statusCode);

    }
}
