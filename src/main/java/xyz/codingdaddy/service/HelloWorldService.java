package xyz.codingdaddy.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorldService {

    @GET
    public String helloWorld() {
        return "Hello World!";
    }
}
