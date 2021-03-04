package com.fudianbank.base;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author FUDIAN
 * @date 2020-12-25
 */
@Path("hello")
//@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
//@Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
public interface HelloService {
    @GET
    @Path("/{name}")
    String hello(@PathParam("name") String name);

    @GET
    @Path("/exception/test")
    void exception();
}
