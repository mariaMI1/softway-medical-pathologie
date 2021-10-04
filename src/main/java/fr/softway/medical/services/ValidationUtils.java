package fr.softway.medical.services;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;

public class ValidationUtils {
    private static String ERREUR_VALIDATION ="l'index doit être numérique";

    public static int validerIndex(String index) {
        try {
            return Integer.parseInt(index);
        } catch (NumberFormatException e) {
            throw new BadRequestException(Response.status(Response.Status.BAD_REQUEST)
                    .entity(ERREUR_VALIDATION).build());
        }
    }

}
