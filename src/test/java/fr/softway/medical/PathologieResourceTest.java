package fr.softway.medical;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PathologieResourceTest {

    @Test
    public void testPathologieRessource() {
        given()
          .when().get("/pathologie/33")
          .then()
             .statusCode(200)
             .body(is("Cardiologie"));
    }

}
