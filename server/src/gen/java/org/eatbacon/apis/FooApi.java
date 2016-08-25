package org.eatbacon.apis;

import org.eatbacon.models.*;
import org.eatbacon.apis.FooApiService;
import org.eatbacon.apis.factories.FooApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.eatbacon.models.MyModel;

import java.util.List;
import org.eatbacon.apis.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/foo")


@io.swagger.annotations.Api(description = "the foo API")

public class FooApi  {
   private final FooApiService delegate = FooApiServiceFactory.getFooApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = MyModel.class, tags={ "Foo", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "it works", response = MyModel.class) })
    public Response fooGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.fooGet(securityContext);
    }
}
