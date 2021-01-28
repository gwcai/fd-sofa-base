package com.fudianbank.base;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @author FUDIAN
 * @date 2020-12-25
 */
@Path("hello")
//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
//@Produces(MediaType.APPLICATION_FORM_URLENCODED)
public interface HelloService {
    @GET
    @Path("/{name}")
    String hello(@PathParam("name") String name);

    @GET
    @Path("/exception/test")
    void exception();
}
