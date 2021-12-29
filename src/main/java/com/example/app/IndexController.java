package com.example.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1")
public class IndexController {

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "Quarkus Native App";
    }
}
