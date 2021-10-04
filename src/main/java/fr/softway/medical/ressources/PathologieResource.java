package fr.softway.medical.ressources;

import fr.softway.medical.services.PathologieService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import fr.softway.medical.services.ValidationUtils;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/pathologie")
public class PathologieResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{index}")
    @APIResponses(
            value = {
                    @APIResponse(
                            responseCode = "200",
                            description = "Reponse Ok lorsque l'index est valide",
                            content = @Content(mediaType = MediaType.TEXT_PLAIN)),
                    @APIResponse(
                            responseCode = "400",
                            description = "l'index n'est valide",
                            content = @Content(mediaType = MediaType.TEXT_PLAIN))
            }
    )
    public String pathologie(@PathParam String index) {
        int indexParse = ValidationUtils.validerIndex(index);
        return PathologieService.pathologiesDepuisIndex(indexParse);
    }
}
