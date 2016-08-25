package org.eatbacon.apis.impl;

import org.eatbacon.apis.*;
import org.eatbacon.models.*;

import org.eatbacon.models.MyModel;

import java.util.List;
import org.eatbacon.apis.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public class FooApiServiceImpl extends FooApiService {
    @Override
    public Response fooGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
