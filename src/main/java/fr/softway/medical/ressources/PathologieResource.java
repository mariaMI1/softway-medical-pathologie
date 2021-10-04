package fr.softway.medical.ressources;

import fr.softway.medical.services.PathologieService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/pathologie")
public class PathologieResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{index}")
    public String pathologie(@PathParam int index) {
        //TODO validation index
        return PathologieService.pathologiesDepuisIndex(index);
    }
}
