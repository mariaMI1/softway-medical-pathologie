package fr.softway.medical;

import fr.softway.medical.services.PathologieService;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PathologieServicesTest {

    @Test
    public void etantDonneeIndexMultipeTroisDoitRetournerCardiologue() {
        Assertions.assertEquals(PathologieService.pathologieDepuisIndex(33), "Cardiologie");
    }

    @Test
    public void etantDonneeIndexMultipeCinqDoitRetournerTraumatologie() {
        Assertions.assertEquals(PathologieService.pathologieDepuisIndex(55), "Traumatologie");
    }

    @Test
    public void etantDonneeIndexMultipeTroisEtCinqDoitRetournerTraumatologie() {
        Assertions.assertEquals(PathologieService.pathologieDepuisIndex(15), "Cardiologie, Traumatologie");
    }

}
