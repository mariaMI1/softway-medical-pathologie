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
        Assertions.assertEquals(PathologieService.pathologiesDepuisIndex(33), "Cardiologie");
    }

    @Test
    public void etantDonneeIndexMultipeCinqDoitRetournerTraumatologie() {
        Assertions.assertEquals(PathologieService.pathologiesDepuisIndex(55), "Traumatologie");
    }

    @Test
    public void etantDonneeIndexMultipeTroisEtCinqDoitRetournerCardiologieTraumatologie() {
        Assertions.assertEquals(PathologieService.pathologiesDepuisIndex(15), "Cardiologie, Traumatologie");
    }

    @Test
    public void etantDonneeIndexNonMultipleDoitRetournerAucunePathologieConnue() {
        Assertions.assertEquals(PathologieService.pathologiesDepuisIndex(17), "Aucune pathologie connue");
    }

    @Test
    public void etantDonneeIndexZeroDoitRetournerAucunePathologieConnue() {
        Assertions.assertEquals(PathologieService.pathologiesDepuisIndex(0), "Aucune pathologie connue");
    }
}
