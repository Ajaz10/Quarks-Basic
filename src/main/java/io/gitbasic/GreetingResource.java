package io.gitbasic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/basic")
public class GreetingResource {

    @GET
	@Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
	
	@GET
	@Path("/api1")
    @Produces(MediaType.TEXT_PLAIN)
    public String apiOne() {
        return "This is ApiOne";
    }
	
	@GET
	@Path("/api2")
    @Produces(MediaType.TEXT_PLAIN)
    public String apiTwo() {
        return "This is ApiTwo";
}