package fr.softway.medical.ressources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PathologieResourceTest {

    @Test
    public void testPathologieRessourceAvecIndexValide() {
        given()
          .when().get("/pathologie/33")
          .then()
             .statusCode(200)
             .body(is("Cardiologie"));
    }

    @Test
    public void testPathologieRessourceAvecIndexNonValide() {
        given()
                .when().get("/pathologie/a")
                .then()
                .statusCode(400);
    }
    @Test
    public void testPathologieRessourceSansIndex() {
        given()
                .when().get("/pathologie/")
                .then()
                .statusCode(404);
    }
}
