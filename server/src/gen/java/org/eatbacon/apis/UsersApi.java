package org.eatbacon.apis;

import org.eatbacon.models.*;
import org.eatbacon.apis.UsersApiService;
import org.eatbacon.apis.factories.UsersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.eatbacon.models.Users;

import java.util.List;
import org.eatbacon.apis.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/users")


@io.swagger.annotations.Api(description = "the users API")

public class UsersApi  {
   private final UsersApiService delegate = UsersApiServiceFactory.getUsersApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Users.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Users.class) })
    public Response usersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersGet(securityContext);
    }
}
