package fr.softway.medical.services;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.ws.rs.BadRequestException;

@QuarkusTest
public class ValidationUtilsTest {

    @Test
    public void lorsqueIndexNumeriquedoitRemonterIndex() {
        Assertions.assertEquals(ValidationUtils.validerIndex("3"), 3);
    }
    @Test
    public void lorsqueIndexNestPasNumeriquedoitRemonterException() {
        Assertions.assertThrows(BadRequestException.class, () -> {
            ValidationUtils.validerIndex("a");
        });
    }

}
